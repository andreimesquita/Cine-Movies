package gui.cliente;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.ComponentOrientation;
import java.awt.Container;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.ParseException;
import java.util.Date;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.text.MaskFormatter;

import com.toedter.calendar.JDateChooser;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;

public class AdministrarClientes extends JDialog {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/** Este é o ContentPane da janela. */
	private Container cp;
	private JTextField tfCodigo;
	private JTextField tfEmitente;
	private JFormattedTextField tfDataNasc;
	private JTextField tfTipo;
	private JFormattedTextField tfCpf;
	private JFormattedTextField tfRg;
	private JTextField tfEndereco;
	private JFormattedTextField tfNumero;
	private JTextField tfUf;
	private JFormattedTextField tfCep;
	private JTextField tfEmail;
	private JFormattedTextField tfTelResidencial;
	private JFormattedTextField tfTelCelular;
	private Formatacoes mascara;
	private JTextField tfPesquisar;
	private JTable table;
	private JDateChooser dcNascimento;
	private JFormattedTextField tfDataCadastro;
	/** Construtor da classe para fins de teste. */
	public AdministrarClientes(JFrame janela)
	{
		super(janela, "Administrar Clientes", false);
		setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
		setMinimumSize(new Dimension(876, 572));
		setPreferredSize(new Dimension(876, 572));
		setSize(new Dimension(876, 572));
		setMaximumSize(new Dimension(876, 572));
		getContentPane().setFont(new Font("Dialog", Font.PLAIN, 20));
		setResizable(false);
		setFont(new Font("Dialog", Font.PLAIN, 20));
		cp = getContentPane();
		
		mascara = new Formatacoes();
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setFocusable(false);
		tabbedPane.setFont(new Font("Dialog", Font.PLAIN, 16));
		getContentPane().add(tabbedPane, BorderLayout.CENTER);
		
		JPanel painelAdministrar = new JPanel();
		painelAdministrar.setFocusable(false);
		painelAdministrar.setFont(new Font("Dialog", Font.PLAIN, 18));
		tabbedPane.addTab("Administrar", null, painelAdministrar, null);
		painelAdministrar.setLayout(null);
		
		JLabel lblCdigo = new JLabel("C\u00F3digo:");
		lblCdigo.setHorizontalAlignment(SwingConstants.RIGHT);
		lblCdigo.setFont(new Font("Dialog", Font.PLAIN, 18));
		lblCdigo.setBounds(12, 26, 131, 34);
		painelAdministrar.add(lblCdigo);
		
		JLabel lblEmitente = new JLabel("Emitente:");
		lblEmitente.setHorizontalAlignment(SwingConstants.RIGHT);
		lblEmitente.setFont(new Font("Dialog", Font.PLAIN, 18));
		lblEmitente.setBounds(12, 72, 131, 34);
		painelAdministrar.add(lblEmitente);
		
		JLabel lblTipocfa = new JLabel("Tipo (C/F/A):");
		lblTipocfa.setHorizontalAlignment(SwingConstants.RIGHT);
		lblTipocfa.setFont(new Font("Dialog", Font.PLAIN, 18));
		lblTipocfa.setBounds(12, 118, 131, 34);
		painelAdministrar.add(lblTipocfa);
		
		JLabel lblDataNasc = new JLabel("Dt Nasc.:");
		lblDataNasc.setHorizontalAlignment(SwingConstants.RIGHT);
		lblDataNasc.setFont(new Font("Dialog", Font.PLAIN, 18));
		lblDataNasc.setBounds(195, 118, 83, 34);
		painelAdministrar.add(lblDataNasc);
		
		JLabel lblDataCadastro = new JLabel("Dt Cad.:");
		lblDataCadastro.setToolTipText("Data do cadastro.");
		lblDataCadastro.setHorizontalAlignment(SwingConstants.RIGHT);
		lblDataCadastro.setFont(new Font("Dialog", Font.PLAIN, 18));
		lblDataCadastro.setBounds(456, 118, 71, 34);
		painelAdministrar.add(lblDataCadastro);
		
		JLabel lblCpf = new JLabel("CPF:");
		lblCpf.setHorizontalAlignment(SwingConstants.RIGHT);
		lblCpf.setFont(new Font("Dialog", Font.PLAIN, 18));
		lblCpf.setBounds(12, 164, 131, 34);
		painelAdministrar.add(lblCpf);
		
		JLabel lblEndereo = new JLabel("Endere\u00E7o:");
		lblEndereo.setHorizontalAlignment(SwingConstants.RIGHT);
		lblEndereo.setFont(new Font("Dialog", Font.PLAIN, 18));
		lblEndereo.setBounds(12, 210, 131, 34);
		painelAdministrar.add(lblEndereo);
		
		JLabel lblCidade = new JLabel("Cidade:");
		lblCidade.setHorizontalAlignment(SwingConstants.RIGHT);
		lblCidade.setFont(new Font("Dialog", Font.PLAIN, 18));
		lblCidade.setBounds(12, 256, 131, 34);
		painelAdministrar.add(lblCidade);
		
		JLabel lblBairro = new JLabel("Bairro:");
		lblBairro.setHorizontalAlignment(SwingConstants.RIGHT);
		lblBairro.setFont(new Font("Dialog", Font.PLAIN, 18));
		lblBairro.setBounds(12, 302, 131, 34);
		painelAdministrar.add(lblBairro);
		
		JLabel lblUf = new JLabel("UF:");
		lblUf.setHorizontalAlignment(SwingConstants.RIGHT);
		lblUf.setFont(new Font("Dialog", Font.PLAIN, 18));
		lblUf.setBounds(12, 348, 131, 34);
		painelAdministrar.add(lblUf);
		
		JLabel lblCep = new JLabel("CEP:");
		lblCep.setHorizontalAlignment(SwingConstants.RIGHT);
		lblCep.setFont(new Font("Dialog", Font.PLAIN, 18));
		lblCep.setBounds(263, 348, 71, 34);
		painelAdministrar.add(lblCep);
		
		JLabel lblEmail = new JLabel("Email:");
		lblEmail.setHorizontalAlignment(SwingConstants.RIGHT);
		lblEmail.setFont(new Font("Dialog", Font.PLAIN, 18));
		lblEmail.setBounds(12, 394, 131, 34);
		painelAdministrar.add(lblEmail);
		
		JLabel lblTelResidencial = new JLabel("Tel. Residencial:");
		lblTelResidencial.setHorizontalAlignment(SwingConstants.RIGHT);
		lblTelResidencial.setFont(new Font("Dialog", Font.PLAIN, 18));
		lblTelResidencial.setBounds(12, 440, 134, 34);
		painelAdministrar.add(lblTelResidencial);
		
		JLabel lblTelCelular = new JLabel("Tel. Celular:");
		lblTelCelular.setHorizontalAlignment(SwingConstants.RIGHT);
		lblTelCelular.setFont(new Font("Dialog", Font.PLAIN, 18));
		lblTelCelular.setBounds(369, 440, 101, 34);
		painelAdministrar.add(lblTelCelular);
		
		JPanel painelBotoes = new JPanel();
		painelBotoes.setFont(new Font("Dialog", Font.PLAIN, 15));
		painelBotoes.setBorder(new TitledBorder(new LineBorder(new Color(128, 124, 112), 1, true), "Configura\u00E7\u00F5es", TitledBorder.LEFT, TitledBorder.TOP, null, null));
		painelBotoes.setBounds(693, 12, 162, 409);
		painelAdministrar.add(painelBotoes);
		painelBotoes.setLayout(new GridLayout(7, 1, 0, 3));
		
		JButton btnInserir = new JButton("Inserir");
		btnInserir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				// Adiciona uma nova janela
			}
		});
		btnInserir.setFocusable(false);
		btnInserir.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnInserir.setFont(new Font("Dialog", Font.PLAIN, 16));
		painelBotoes.add(btnInserir);
		
		JButton btnGravar = new JButton("Gravar");
		btnGravar.setFocusable(false);
		btnGravar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnGravar.setFont(new Font("Dialog", Font.PLAIN, 16));
		btnGravar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		painelBotoes.add(btnGravar);
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.setFocusable(false);
		btnCancelar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnCancelar.setFont(new Font("Dialog", Font.PLAIN, 16));
		painelBotoes.add(btnCancelar);
		
		JButton btnAlterar = new JButton("Alterar");
		btnAlterar.setFocusable(false);
		btnAlterar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnAlterar.setFont(new Font("Dialog", Font.PLAIN, 16));
		painelBotoes.add(btnAlterar);
		
		JButton btnExcluir = new JButton("Excluir");
		btnExcluir.setFocusable(false);
		btnExcluir.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnExcluir.setFont(new Font("Dialog", Font.PLAIN, 16));
		painelBotoes.add(btnExcluir);
		
		JButton btnAutorizados = new JButton("Autorizados");
		btnAutorizados.setFocusable(false);
		btnAutorizados.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnAutorizados.setFont(new Font("Dialog", Font.PLAIN, 16));
		painelBotoes.add(btnAutorizados);
		
		JButton btnFechar = new JButton("Fechar");
		btnFechar.setFocusable(false);
		btnFechar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnFechar.setFont(new Font("Dialog", Font.PLAIN, 16));
		painelBotoes.add(btnFechar);
		
		JButton button_2 = new JButton("");
		button_2.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		button_2.setBackground(new Color(0, 255, 0, 0));
		button_2.setBounds(381, 26, 34, 34);
		painelAdministrar.add(button_2);
		
		tfCodigo = new JTextField();
		tfCodigo.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
		tfCodigo.setEditable(false);
		tfCodigo.setFont(new Font("Dialog", Font.PLAIN, 21));
		tfCodigo.setHorizontalAlignment(SwingConstants.RIGHT);
		tfCodigo.setText("0001");
		tfCodigo.setBounds(161, 26, 171, 34);
		painelAdministrar.add(tfCodigo);
		tfCodigo.setColumns(10);
		
		tfEmitente = new JTextField();
		tfEmitente.setHorizontalAlignment(SwingConstants.LEFT);
		tfEmitente.setFont(new Font("Dialog", Font.PLAIN, 21));
		tfEmitente.setColumns(10);
		tfEmitente.setBounds(161, 71, 520, 34);
		painelAdministrar.add(tfEmitente);
		
		dcNascimento = new JDateChooser(new Date());
		dcNascimento.getCalendarButton().setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
		dcNascimento.getCalendarButton().setHorizontalTextPosition(SwingConstants.RIGHT);
		dcNascimento.getCalendarButton().setHorizontalAlignment(SwingConstants.RIGHT);
		Date max = new Date();
		max.setYear(new Date().getYear() + 1);
		dcNascimento.setMaxSelectableDate(max);
		dcNascimento.setMinSelectableDate(new Date());
		dcNascimento.setFont(new Font("Dialog", Font.PLAIN, 21));
		dcNascimento.setBounds(284, 118, 154, 34);
		painelAdministrar.add(dcNascimento);
		/*
		tfDataNasc = new JFormattedTextField(mascara.getData());
		tfDataNasc.setFocusLostBehavior(JFormattedTextField.COMMIT);
		tfDataNasc.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
		tfDataNasc.setHorizontalAlignment(SwingConstants.LEFT);
		tfDataNasc.setFont(new Font("Dialog", Font.PLAIN, 21));
		tfDataNasc.setColumns(10);
		tfDataNasc.setBounds(307, 117, 115, 34);
		painelAdministrar.add(tfDataNasc);
		*/
		
		tfTipo = new JTextField();
		tfTipo.setHorizontalAlignment(SwingConstants.LEFT);
		tfTipo.setFont(new Font("Dialog", Font.PLAIN, 21));
		tfTipo.setColumns(10);
		tfTipo.setBounds(161, 117, 30, 34);
		painelAdministrar.add(tfTipo);
		
		JButton button = new JButton("");
		button.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		button.setBackground(new Color(0, 255, 0, 0));
		button.setBounds(343, 26, 34, 34);
		painelAdministrar.add(button);
		
		tfCpf = new JFormattedTextField(mascara.getCpf());
		tfCpf.setFocusLostBehavior(JFormattedTextField.COMMIT);
		tfCpf.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
		tfCpf.setHorizontalAlignment(SwingConstants.LEFT);
		tfCpf.setFont(new Font("Dialog", Font.PLAIN, 21));
		tfCpf.setColumns(10);
		tfCpf.setBounds(161, 164, 162, 34);
		painelAdministrar.add(tfCpf);
		
		JLabel lblRg = new JLabel("RG:");
		lblRg.setHorizontalAlignment(SwingConstants.RIGHT);
		lblRg.setFont(new Font("Dialog", Font.PLAIN, 18));
		lblRg.setBounds(411, 164, 34, 34);
		painelAdministrar.add(lblRg);
		
		tfRg = new JFormattedTextField(mascara.getRg());
		tfRg.setFocusLostBehavior(JFormattedTextField.COMMIT);
		tfRg.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
		tfRg.setHorizontalAlignment(SwingConstants.LEFT);
		tfRg.setFont(new Font("Dialog", Font.PLAIN, 21));
		tfRg.setColumns(10);
		tfRg.setBounds(463, 164, 143, 34);
		painelAdministrar.add(tfRg);
		
		tfEndereco = new JTextField();
		tfEndereco.setHorizontalAlignment(SwingConstants.LEFT);
		tfEndereco.setFont(new Font("Dialog", Font.PLAIN, 21));
		tfEndereco.setColumns(10);
		tfEndereco.setBounds(161, 210, 314, 34);
		painelAdministrar.add(tfEndereco);
		
		JLabel lblNmero = new JLabel("N\u00FAmero:");
		lblNmero.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNmero.setFont(new Font("Dialog", Font.PLAIN, 18));
		lblNmero.setBounds(493, 210, 71, 34);
		painelAdministrar.add(lblNmero);
		
		tfNumero = new JFormattedTextField(mascara.getNumero());
		tfNumero.setFocusLostBehavior(JFormattedTextField.COMMIT);
		tfNumero.setHorizontalAlignment(SwingConstants.LEFT);
		tfNumero.setFont(new Font("Dialog", Font.PLAIN, 21));
		tfNumero.setColumns(10);
		tfNumero.setBounds(582, 209, 99, 34);
		painelAdministrar.add(tfNumero);
		
		JComboBox cbCidade = new JComboBox();
		cbCidade.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		cbCidade.setMaximumRowCount(99);
		cbCidade.setFont(new Font("Dialog", Font.PLAIN, 21));
		cbCidade.setBounds(161, 256, 520, 34);
		painelAdministrar.add(cbCidade);
		
		JComboBox cbBairro = new JComboBox();
		cbBairro.setEnabled(false);
		cbBairro.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		cbBairro.setMaximumRowCount(99);
		cbBairro.setFont(new Font("Dialog", Font.PLAIN, 21));
		cbBairro.setBounds(161, 302, 520, 34);
		painelAdministrar.add(cbBairro);
		
		tfUf = new JTextField();
		tfUf.setEditable(false);
		tfUf.setText("RS");
		tfUf.setHorizontalAlignment(SwingConstants.LEFT);
		tfUf.setFont(new Font("Dialog", Font.PLAIN, 21));
		tfUf.setColumns(10);
		tfUf.setBounds(161, 348, 39, 34);
		painelAdministrar.add(tfUf);
		
		tfCep = new JFormattedTextField(mascara.getCep());
		tfCep.setFocusLostBehavior(JFormattedTextField.COMMIT);
		tfCep.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
		tfCep.setHorizontalAlignment(SwingConstants.LEFT);
		tfCep.setFont(new Font("Dialog", Font.PLAIN, 21));
		tfCep.setColumns(10);
		tfCep.setBounds(352, 348, 118, 34);
		painelAdministrar.add(tfCep);
		
		tfEmail = new JTextField();
		tfEmail.setHorizontalAlignment(SwingConstants.LEFT);
		tfEmail.setFont(new Font("Dialog", Font.PLAIN, 21));
		tfEmail.setColumns(10);
		tfEmail.setBounds(161, 394, 314, 34);
		painelAdministrar.add(tfEmail);
		
		tfTelResidencial = new JFormattedTextField(mascara.getTelefone());
		tfTelResidencial.setFocusLostBehavior(JFormattedTextField.COMMIT);
		tfTelResidencial.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
		tfTelResidencial.setHorizontalAlignment(SwingConstants.LEFT);
		tfTelResidencial.setFont(new Font("Dialog", Font.PLAIN, 21));
		tfTelResidencial.setColumns(10);
		tfTelResidencial.setBounds(161, 440, 173, 34);
		painelAdministrar.add(tfTelResidencial);
		
		tfTelCelular = new JFormattedTextField(mascara.getTelefone());
		tfTelCelular.setFocusLostBehavior(JFormattedTextField.COMMIT);
		tfTelCelular.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
		tfTelCelular.setHorizontalAlignment(SwingConstants.LEFT);
		tfTelCelular.setFont(new Font("Dialog", Font.PLAIN, 21));
		tfTelCelular.setColumns(10);
		tfTelCelular.setBounds(488, 440, 173, 34);
		painelAdministrar.add(tfTelCelular);
		
		tfDataCadastro = new JFormattedTextField(mascara.getData());
		tfDataCadastro.setEditable(false);
		tfDataCadastro.setFocusable(false);
		tfDataCadastro.setHorizontalAlignment(SwingConstants.LEFT);
		tfDataCadastro.setFont(new Font("Dialog", Font.PLAIN, 21));
		tfDataCadastro.setFocusLostBehavior(JFormattedTextField.COMMIT);
		tfDataCadastro.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
		tfDataCadastro.setColumns(10);
		tfDataCadastro.setBounds(538, 118, 143, 34);
		painelAdministrar.add(tfDataCadastro);
		
		JPanel painelConsultar = new JPanel();
		painelConsultar.setFocusable(false);
		painelConsultar.setFont(new Font("Dialog", Font.PLAIN, 18));
		tabbedPane.addTab("Consultar", null, painelConsultar, null);
		painelConsultar.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(12, 60, 846, 436);
		painelConsultar.add(scrollPane);
		
		table = new JTable();
		table.setFont(new Font("Dialog", Font.PLAIN, 17));
		table.setFillsViewportHeight(true);
		scrollPane.setViewportView(table);
		
		JLabel lblPesquisar = new JLabel("Pesquisar por nome:");
		lblPesquisar.setHorizontalAlignment(SwingConstants.RIGHT);
		lblPesquisar.setFont(new Font("Dialog", Font.PLAIN, 18));
		lblPesquisar.setBounds(12, 12, 165, 34);
		painelConsultar.add(lblPesquisar);
		
		tfPesquisar = new JTextField();
		tfPesquisar.getDocument().addDocumentListener(new DocumentListener() {
			
			@Override
			public void removeUpdate(DocumentEvent arg0) {
				atualizar();
			}
			
			@Override
			public void insertUpdate(DocumentEvent arg0) {
				atualizar();
			}
			
			@Override
			public void changedUpdate(DocumentEvent arg0) {
				
			}
			
			private void atualizar()
			{
				JOptionPane.showMessageDialog(AdministrarClientes.this, "Enter!");
			}
		});
		tfPesquisar.setHorizontalAlignment(SwingConstants.LEFT);
		tfPesquisar.setFont(new Font("Dialog", Font.PLAIN, 21));
		tfPesquisar.setColumns(10);
		tfPesquisar.setBounds(195, 14, 663, 34);
		painelConsultar.add(tfPesquisar);
		
		setLocationRelativeTo(janela);
		setVisible(true);
	}

	public static void main(String[] args) {
		try {
			UIManager.setLookAndFeel("com.jtattoo.plaf.mcwin.McWinLookAndFeel");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (UnsupportedLookAndFeelException e) {
			e.printStackTrace();
		}
		SwingUtilities.invokeLater
		(
			new Runnable() {
				@Override
				public void run() {
					new AdministrarClientes(null);
				}
			}
		);
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
	    /** Inicializa os campos */
		protected Formatacoes()
		{
			try {
				cpf = new MaskFormatter("###.###.###-##");
				cpf.setPlaceholderCharacter('_');
				rg = new MaskFormatter("#########");
				rg.setPlaceholderCharacter('_');
				telefone = new MaskFormatter("(51)####-####");
				telefone.setPlaceholderCharacter('_');
				data = new MaskFormatter("##/##/####");
				data.setPlaceholderCharacter('_');
				cep = new MaskFormatter("#####-###");
				cep.setPlaceholderCharacter('_');
			} catch (ParseException e) {
				JOptionPane.showMessageDialog(AdministrarClientes.this,"ERRO: Não foi possível "
						+ "criar as máscaras dos campos da janela.");
			}
		}
		/**
		 * @return the cpf
		 */
		protected MaskFormatter getCpf() {
			return cpf;
		}
		/**
		 * @return the rg
		 */
		protected MaskFormatter getRg() {
			return rg;
		}
		/**
		 * @return the telefone
		 */
		protected MaskFormatter getTelefone() {
			return telefone;
		}
		/**
		 * @return the data
		 */
		protected MaskFormatter getData() {
			return data;
		}
		/**
		 * @return the cep
		 */
		protected MaskFormatter getCep() {
			return cep;
		}
		/**
		 * @return the numero
		 */
		protected MaskFormatter getNumero() {
			return numero;
		}
	}
}