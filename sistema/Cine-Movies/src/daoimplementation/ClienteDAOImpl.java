package daoimplementation;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import modelo.Cliente;
import bd.ConfigConnection;
import bd.ErroDeConexao;
import daoimplementation.dao.ClienteDAO;

public class ClienteDAOImpl implements ClienteDAO {

	private List clientes;
	private ConfigConnection cc;
	
	public ClienteDAOImpl()
	{
		cc = ConfigConnection.getConfigConnection();
		clientes = new ArrayList<Cliente>();
	}
	
	@Override
	public List getTodosOsClientes() throws ErroDeConexao {
		if (!cc.podeConectar())
		{
			throw new ErroDeConexao();
		} else {
			try
			{
				cc.conectar();
				
				cc.desconectar();
				return clientes;
			} catch (SQLException e) {
				return null;
			}
		}
	}

	@Override
	public Cliente getClientePeloNome(String nome) throws ErroDeConexao {
		
		return null;
	}

	@Override
	public Cliente getClientePeloCPF(String cpf) throws ErroDeConexao {
		
		return null;
	}	
}