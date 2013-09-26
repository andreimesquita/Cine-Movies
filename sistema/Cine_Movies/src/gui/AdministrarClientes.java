package gui;

import java.awt.ComponentOrientation;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.text.ParseException;
import java.util.Calendar;
import java.util.Date;

import javax.swing.JButton;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.text.MaskFormatter;

import org.omg.CORBA.CharSeqHolder;

import pojo.Cliente;

import com.toedter.calendar.JDateChooser;

import dao.ClienteDAOImpl;

public class AdministrarClientes extends JPanel {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private MenuPrincipal mp;
	private JFrame janela;
	
	private Formatacoes mascara;
	private JTextField tfLogradouro;
	private JTextField tfCidade;
	private JTextField tfBairro;
	private JTextField tfEmail;
	private JFormattedTextField ftfRg;
	private JTextField tfEmitente;
	private JFormattedTextField ftfCpf;
	private JFormattedTextField ftfTipo;
	private JDateChooser dateChooser;
	private JFormattedTextField ftfNumero;
	private JFormattedTextField ftfTelResidencial;
	private JFormattedTextField ftfCep;
	private JFormattedTextField ftfTelCelular;
	private JFormattedTextField ftfDataCadastro;
	private JTextField tfComplemento;
	
	private ClienteDAOImpl bd_cliente;
	/** Construtor da classe para fins de teste. */
	public AdministrarClientes(JFrame janela, MenuPrincipal mp)
	{
		this.mp = mp;
		this.janela = janela;
				
		setPreferredSize(new Dimension(875, 439));
		setFont(new Font("Dialog", Font.PLAIN, 20));
		setFont(new Font("Dialog", Font.PLAIN, 20));
		setLayout(null);
		
		mascara = new Formatacoes();
		bd_cliente = new ClienteDAOImpl();
		
		JLabel label_1 = new JLabel("Emitente:");
		label_1.setHorizontalAlignment(SwingConstants.RIGHT);
		label_1.setFont(new Font("Dialog", Font.PLAIN, 18));
		label_1.setBounds(12, 14, 131, 34);
		add(label_1);
		
		JLabel label_2 = new JLabel("Tipo (C/F/A):");
		label_2.setHorizontalAlignment(SwingConstants.RIGHT);
		label_2.setFont(new Font("Dialog", Font.PLAIN, 18));
		label_2.setBounds(12, 62, 131, 34);
		add(label_2);
		
		JLabel label_3 = new JLabel("Dt Nasc.:");
		label_3.setHorizontalAlignment(SwingConstants.RIGHT);
		label_3.setFont(new Font("Dialog", Font.PLAIN, 18));
		label_3.setBounds(72, 109, 83, 34);
		add(label_3);
		
		JLabel label_4 = new JLabel("Dt Cad.:");
		label_4.setToolTipText("Data do cadastro.");
		label_4.setHorizontalAlignment(SwingConstants.RIGHT);
		label_4.setFont(new Font("Dialog", Font.PLAIN, 18));
		label_4.setBounds(385, 109, 71, 34);
		add(label_4);
		
		JLabel label_5 = new JLabel("CPF:");
		label_5.setHorizontalAlignment(SwingConstants.RIGHT);
		label_5.setFont(new Font("Dialog", Font.PLAIN, 18));
		label_5.setBounds(243, 60, 47, 34);
		add(label_5);
		
		JLabel label_6 = new JLabel("Logradouro:");
		label_6.setHorizontalAlignment(SwingConstants.RIGHT);
		label_6.setFont(new Font("Dialog", Font.PLAIN, 18));
		label_6.setBounds(12, 250, 131, 34);
		add(label_6);
		
		JLabel label_7 = new JLabel("Cidade:");
		label_7.setHorizontalAlignment(SwingConstants.RIGHT);
		label_7.setFont(new Font("Dialog", Font.PLAIN, 18));
		label_7.setBounds(12, 156, 131, 34);
		add(label_7);
		
		JLabel label_8 = new JLabel("Bairro:");
		label_8.setHorizontalAlignment(SwingConstants.RIGHT);
		label_8.setFont(new Font("Dialog", Font.PLAIN, 18));
		label_8.setBounds(12, 202, 131, 34);
		add(label_8);
		
		JLabel lblCep = new JLabel("CEP:");
		lblCep.setHorizontalAlignment(SwingConstants.RIGHT);
		lblCep.setFont(new Font("Dialog", Font.PLAIN, 18));
		lblCep.setBounds(686, 298, 43, 34);
		add(lblCep);
		
		JLabel label_10 = new JLabel("Email:");
		label_10.setHorizontalAlignment(SwingConstants.RIGHT);
		label_10.setFont(new Font("Dialog", Font.PLAIN, 18));
		label_10.setBounds(12, 345, 131, 34);
		add(label_10);
		
		JLabel label_11 = new JLabel("Tel. Residencial:");
		label_11.setHorizontalAlignment(SwingConstants.RIGHT);
		label_11.setFont(new Font("Dialog", Font.PLAIN, 18));
		label_11.setBounds(12, 391, 134, 34);
		add(label_11);
		
		JLabel label_12 = new JLabel("Tel. Celular:");
		label_12.setHorizontalAlignment(SwingConstants.RIGHT);
		label_12.setFont(new Font("Dialog", Font.PLAIN, 18));
		label_12.setBounds(389, 391, 101, 34);
		add(label_12);
		
		tfEmitente = new JTextField();
		tfEmitente.setHorizontalAlignment(SwingConstants.LEFT);
		tfEmitente.setFont(new Font("Dialog", Font.PLAIN, 21));
		tfEmitente.setColumns(10);
		tfEmitente.setBounds(161, 13, 520, 34);
		add(tfEmitente);
		
		dateChooser = new JDateChooser();
		dateChooser.getCalendarButton().setHorizontalTextPosition(SwingConstants.RIGHT);
		dateChooser.getCalendarButton().setHorizontalAlignment(SwingConstants.RIGHT);
		dateChooser.getCalendarButton().setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
		dateChooser.setFont(new Font("Dialog", Font.PLAIN, 21));
		dateChooser.setBounds(161, 109, 154, 34);
		add(dateChooser);
		
		ftfTipo = new JFormattedTextField(mascara.tipo);
		ftfTipo.setHorizontalAlignment(SwingConstants.LEFT);
		ftfTipo.setFont(new Font("Dialog", Font.PLAIN, 21));
		ftfTipo.setColumns(10);
		ftfTipo.setBounds(161, 61, 30, 34);
		add(ftfTipo);
		
		ftfCpf = new JFormattedTextField(mascara.cpf);
		ftfCpf.setHorizontalAlignment(SwingConstants.LEFT);
		ftfCpf.setFont(new Font("Dialog", Font.PLAIN, 21));
		ftfCpf.setFocusLostBehavior(JFormattedTextField.COMMIT);
		ftfCpf.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
		ftfCpf.setColumns(10);
		ftfCpf.setBounds(308, 60, 162, 34);
		add(ftfCpf);
		
		JLabel label_13 = new JLabel("RG:");
		label_13.setHorizontalAlignment(SwingConstants.RIGHT);
		label_13.setFont(new Font("Dialog", Font.PLAIN, 18));
		label_13.setBounds(486, 61, 34, 34);
		add(label_13);
		
		ftfRg = new JFormattedTextField(mascara.rg);
		ftfRg.setHorizontalAlignment(SwingConstants.LEFT);
		ftfRg.setFont(new Font("Dialog", Font.PLAIN, 21));
		ftfRg.setFocusLostBehavior(JFormattedTextField.COMMIT);
		ftfRg.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
		ftfRg.setColumns(10);
		ftfRg.setBounds(538, 61, 143, 34);
		add(ftfRg);
		
		tfLogradouro = new JTextField();
		tfLogradouro.setHorizontalAlignment(SwingConstants.LEFT);
		tfLogradouro.setFont(new Font("Dialog", Font.PLAIN, 21));
		tfLogradouro.setColumns(10);
		tfLogradouro.setBounds(161, 250, 503, 34);
		add(tfLogradouro);
		
		JLabel label_14 = new JLabel("N\u00FAmero:");
		label_14.setHorizontalAlignment(SwingConstants.RIGHT);
		label_14.setFont(new Font("Dialog", Font.PLAIN, 18));
		label_14.setBounds(676, 250, 71, 34);
		add(label_14);
		
		ftfNumero = new JFormattedTextField(mascara.numero);
		ftfNumero.setHorizontalAlignment(SwingConstants.LEFT);
		ftfNumero.setFont(new Font("Dialog", Font.PLAIN, 21));
		ftfNumero.setFocusLostBehavior(JFormattedTextField.COMMIT);
		ftfNumero.setColumns(10);
		ftfNumero.setBounds(765, 249, 99, 34);
		add(ftfNumero);
		
		tfCidade = new JTextField();
		tfCidade.setFont(new Font("Dialog", Font.PLAIN, 21));
		tfCidade.setBounds(161, 156, 520, 34);
		add(tfCidade);
		
		tfBairro = new JTextField();
		tfBairro.setFont(new Font("Dialog", Font.PLAIN, 21));
		tfBairro.setBounds(161, 202, 520, 34);
		add(tfBairro);
		
		ftfCep = new JFormattedTextField(mascara.cep);
		ftfCep.setHorizontalAlignment(SwingConstants.LEFT);
		ftfCep.setFont(new Font("Dialog", Font.PLAIN, 21));
		ftfCep.setFocusLostBehavior(JFormattedTextField.COMMIT);
		ftfCep.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
		ftfCep.setColumns(10);
		ftfCep.setBounds(746, 297, 118, 34);
		add(ftfCep);
		
		tfEmail = new JTextField();
		tfEmail.setHorizontalAlignment(SwingConstants.LEFT);
		tfEmail.setFont(new Font("Dialog", Font.PLAIN, 21));
		tfEmail.setColumns(10);
		tfEmail.setBounds(161, 345, 520, 34);
		add(tfEmail);
		
		ftfTelResidencial = new JFormattedTextField(mascara.telefone);
		ftfTelResidencial.setHorizontalAlignment(SwingConstants.LEFT);
		ftfTelResidencial.setFont(new Font("Dialog", Font.PLAIN, 21));
		ftfTelResidencial.setFocusLostBehavior(JFormattedTextField.COMMIT);
		ftfTelResidencial.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
		ftfTelResidencial.setColumns(10);
		ftfTelResidencial.setBounds(161, 391, 173, 34);
		add(ftfTelResidencial);
		
		ftfTelCelular = new JFormattedTextField(mascara.telefone);
		ftfTelCelular.setHorizontalAlignment(SwingConstants.LEFT);
		ftfTelCelular.setFont(new Font("Dialog", Font.PLAIN, 21));
		ftfTelCelular.setFocusLostBehavior(JFormattedTextField.COMMIT);
		ftfTelCelular.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
		ftfTelCelular.setColumns(10);
		ftfTelCelular.setBounds(508, 391, 173, 34);
		add(ftfTelCelular);
		
		ftfDataCadastro = new JFormattedTextField(mascara.data);
		ftfDataCadastro.setHorizontalAlignment(SwingConstants.LEFT);
		ftfDataCadastro.setFont(new Font("Dialog", Font.PLAIN, 21));
		ftfDataCadastro.setFocusable(false);
		ftfDataCadastro.setFocusLostBehavior(JFormattedTextField.COMMIT);
		ftfDataCadastro.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
		ftfDataCadastro.setColumns(10);
		ftfDataCadastro.setBounds(467, 109, 143, 34);
		ftfDataCadastro.setText(getDataAtual());
		add(ftfDataCadastro);
		
		JButton button_1 = new JButton("Gravar");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String nome = tfEmitente.getText();
				System.out.println("nome:"+nome);
				// Erro
				String cpf = ftfCpf.getText();
				
				cpf = cpf.replace('-',' ');
				cpf = cpf.replace('.',' ');
				cpf = cpf.trim();
				String rg = ftfRg.getText();
				System.out.println("rg:"+rg);
				Date d = dateChooser.getDate();
				String data_nascimento = d.getDay() + "" + d.getMonth() + "" + d.getYear();
				String data_cadastro = getDataAtual();
				String email = tfEmail.getText();
				String tel_fixo = ftfTelResidencial.getText();
				tel_fixo = tel_fixo.replaceAll("-","");
				String telefone_celular = ftfTelCelular.getText();
				telefone_celular = telefone_celular.replaceAll("-","");
				String cep = ftfCep.getText();
				cep = cep.replaceAll("-","");
				String logradouro = tfLogradouro.getText();
				int numero = Integer.parseInt(ftfNumero.getText());
				String complemento = tfComplemento.getText();
				String cidade = tfCidade.getText();
				String bairro = tfBairro.getText();
				String tipo = ftfTipo.getText();
				
				Cliente cli = new Cliente(
						nome, cpf, rg,data_nascimento, data_cadastro,
						tel_fixo, telefone_celular, cep, 
						logradouro, numero, complemento,cidade,bairro,tipo,email);
				
				try {
					bd_cliente.inserirCliente(cli);
					JOptionPane.showMessageDialog(AdministrarClientes.this.janela,"Cliente adicionado na base de dados com sucesso!");
				} catch (Exception e1) {
					JOptionPane.showMessageDialog(AdministrarClientes.this.janela,e1.getMessage());
				};
			}
		});
		button_1.setBounds(712, 13, 152, 61);
		add(button_1);
		button_1.setFont(new Font("Dialog", Font.PLAIN, 16));
		
		JButton button_5 = new JButton("Voltar");
		button_5.setBounds(712, 80, 152, 61);
		add(button_5);
		button_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		button_5.setFont(new Font("Dialog", Font.PLAIN, 16));
		button_5.setFocusable(false);
		
		JLabel lblComplemento = new JLabel("Complemento:");
		lblComplemento.setHorizontalAlignment(SwingConstants.RIGHT);
		lblComplemento.setFont(new Font("Dialog", Font.PLAIN, 18));
		lblComplemento.setBounds(12, 297, 131, 34);
		add(lblComplemento);
		
		tfComplemento = new JTextField();
		tfComplemento.setHorizontalAlignment(SwingConstants.LEFT);
		tfComplemento.setFont(new Font("Dialog", Font.PLAIN, 21));
		tfComplemento.setColumns(10);
		tfComplemento.setBounds(161, 297, 503, 34);
		add(tfComplemento);
		
		Calendar c = Calendar.getInstance();
		c.setTime(new Date());
		c.add(Calendar.YEAR, -100);
	}
	/**
	 * Este método foi padronizado para que seja chamado em conjunto com o método setText() dos campos de texto <b>JFormattedField<b>.
	 */
	private String getDataAtual() {
		StringBuilder sb = new StringBuilder();
		Calendar calendar = Calendar.getInstance();
		sb.append(calendar.get(Calendar.DAY_OF_MONTH));
		int mes = calendar.get(Calendar.MONTH);
		if (mes < 10) {
			sb.append(0 + "" + mes);
		} else {
			sb.append(mes);
		}
		sb.append(calendar.get(Calendar.YEAR));
		return sb.toString();
	}
	/**
	 * Classe responsável pelas máscaras dos campos na janela.
	 * @author Ândrei
	 */
	private class Formatacoes {
		
	    private MaskFormatter cpf;
	    private MaskFormatter rg;
	    private MaskFormatter telefone;
	    private MaskFormatter data;
	    private MaskFormatter cep;
	    private MaskFormatter numero;
	    private MaskFormatter tipo;
	    //private MaskFormatter 
	    /** Inicializa os campos */
		protected Formatacoes()
		{
			try {
				cpf = new MaskFormatter("###.###.###-##");
				cpf.setPlaceholderCharacter('_');
				rg = new MaskFormatter("#########");
				rg.setPlaceholderCharacter('_');
				telefone = new MaskFormatter("####-####");
				telefone.setPlaceholderCharacter('_');
				data = new MaskFormatter("##/##/####");
				data.setPlaceholderCharacter('_');
				cep = new MaskFormatter("#####-###");
				cep.setPlaceholderCharacter('_');
				tipo = new MaskFormatter("U");
				tipo.setPlaceholder(" ");
				tipo.setValidCharacters("CFA");
			} catch (ParseException e) {
				JOptionPane.showMessageDialog(AdministrarClientes.this,"ERRO: Não foi possível "
						+ "criar as máscaras dos campos da janela.");
			}
		}
	}
}