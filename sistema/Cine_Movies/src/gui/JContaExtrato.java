package gui;

import javax.swing.JPanel;
import javax.swing.JTable;

import pojo.Cliente;
import MyTableModel.MyTableModel;

public class JContaExtrato extends JPanel {

	private JTable table;
	private Cliente c;
	
	public JContaExtrato(Cliente c) {
		this.c = c;
		
		table = new JTable(new MyTableModel());
		add(table);
		//table.setFillsViewportHeight(true);
	}

}
