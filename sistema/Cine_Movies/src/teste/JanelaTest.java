package teste;

import java.awt.BorderLayout;
import java.awt.Container;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.table.DefaultTableModel;

public class JanelaTest extends JFrame {

	private Container c;
	private JTextField tf;
	private JTable t;
	private JScrollPane sp;
	private ArrayList<String> nomes;
	
	public JanelaTest() {
		super("Teste - matches()");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		c = getContentPane();
		c.setLayout(new BorderLayout());
		tf = new JTextField();
		tf.getDocument().addDocumentListener(new DocumentListener() {
			@Override
			public void removeUpdate(DocumentEvent arg0) {att();}
			@Override
			public void insertUpdate(DocumentEvent arg0) {att();}
			@Override
			public void changedUpdate(DocumentEvent arg0) {}
			
			private void att() {
				attTabela();
			}
		});
		c.add(BorderLayout.NORTH,tf);
		t = new JTable();
		t.setFillsViewportHeight(true);
		sp = new JScrollPane(t);
		c.add(BorderLayout.CENTER,sp);
		initClientes();
		initTabela();
		pack();
		setLocationRelativeTo(null);
		setVisible(true);
	}
	/** */
	private void initClientes() {
		nomes = new ArrayList<>();
		nomes.add("Andrei Schuch");
		nomes.add("Augusto Schuch");
		nomes.add("Cristina Mesquita");
		nomes.add("Vera Cabrera");
	}
	
	private void initTabela() {
		DefaultTableModel dtm = new DefaultTableModel() {
			@Override
			public boolean isCellEditable(int row, int column) {
				return false;
			}
		};
		dtm.addColumn("Nome");
		Object[] obj = nomes.toArray();
		dtm.addRow(obj);
		this.t.setModel(dtm);
	}
	
	/** */
	private void attTabela() {
		String nomeProcurado = tf.getText();
		ArrayList<String> al = null;
		if (nomeProcurado == "") {
			al = getLista();
		} else {
			al = getLista(nomeProcurado);
		}
		DefaultTableModel dtm = new DefaultTableModel();
		ArrayList<String> nomes = new ArrayList<>();
		for (String nome : al) {
			nomes.add(nome);
		}
		dtm.addRow(nomes.toArray());
		this.t.setModel(dtm);
		this.t.updateUI();
	}
	/** */
	private ArrayList<String> getLista(String nome) {
		ArrayList<String> nomes = new ArrayList<>();
		for (String n : this.nomes) {
			String nM = n.toUpperCase();
			nM.concat("(.*)");
			nome = nome.toUpperCase();
			if (nome.matches(nM)) nomes.add(n);
		}
		return nomes;
	}
	/** Retorna a lista completa. */
	private ArrayList<String> getLista() {
		return this.nomes;
	}
	
	public static void main(String[] args) {

		SwingUtilities.invokeLater(new Runnable() {
			@Override
			public void run() {
				new JanelaTest();
			}
		});
	}
}