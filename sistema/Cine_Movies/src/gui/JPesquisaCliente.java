package gui;

import java.awt.BorderLayout;
import java.awt.CardLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;

import MyTableModel.MyTableModel;

public class JPesquisaCliente extends JPanel {

	private JTable table;
	private JFrame frame;
	private CardLayout card;
	
	public JPesquisaCliente(JFrame frame, CardLayout card) {
		this.frame = frame;
		this.card = card;
		
		setLayout(new BorderLayout());
		
		table = new JTable(new MyTableModel());
		table.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		
		JScrollPane scroll = new JScrollPane(table);
		//table.getTableHeader();
		add(BorderLayout.CENTER, scroll);
		table.setFillsViewportHeight(true);
	}
}