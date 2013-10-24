package gui;

import java.awt.BorderLayout;
import java.awt.CardLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTable;

import MyTableModel.MyTableModel;
import javax.swing.ListSelectionModel;

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
		add(BorderLayout.CENTER, table);
		table.setFillsViewportHeight(true);
	}

}
