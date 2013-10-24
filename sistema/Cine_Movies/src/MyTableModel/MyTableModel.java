package MyTableModel;

import java.sql.SQLException;
import java.util.List;

import javax.swing.JOptionPane;
import javax.swing.table.AbstractTableModel;

import pojo.Cliente;
import dao.ClienteDAO;
import dao.ClienteDAOImpl;

public class MyTableModel extends AbstractTableModel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private ClienteDAO cdi = new ClienteDAOImpl();
	private List<Cliente> lista;
	private String[] colunas = {"codigo","cpf","rg","tipo","Nome","data do cadastro"};
	
	public MyTableModel() {
		cdi = new ClienteDAOImpl();
		try {
			lista = cdi.getTodosOsClientes();
		} catch (SQLException e) {
			JOptionPane.showMessageDialog(null, "Não foi possível retornar a lista de clientes.");
		}
	}
	
	/** As colunas não serão editáveis. */
	@Override
	public boolean isCellEditable(int rowIndex, int columnIndex) {
		return false;
	}
	
	@Override
	public int getColumnCount() {
		return colunas.length;
	}

	@Override
	public int getRowCount() {
		return lista.size();
	}
	
	public Object[] getColunas() {
		return colunas;
	}
	
	@Override
	public String getColumnName(int column) {
		return colunas[column];
	}
	
	@Override
	public Object getValueAt(int lin, int col) {
		Cliente c = lista.get(lin);
		switch (col) {
		case 0:
			return c.getCodigo();
		case 1:
			return c.getCpf();
		case 2:
			return c.getRg();
		case 3:
			return c.getTipo();
		case 4:
			return c.getNome();
		case 5:	
		    return c.getData_cadastro();
		default:
			throw new IllegalAccessError("Coluna inexistente.");
		}
	}
}