package dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import pojo.modelo.Cliente;
import pojo.repositorio.RepositorioClientesDE;
import bd.ConfigConnection;

public class ClienteDAOImpl implements ClienteDAO {

	private RepositorioClientesDE clientes;
	private ConfigConnection cc;
	
	public ClienteDAOImpl()
	{
		cc = ConfigConnection.getConfigConnection();
		clientes = new RepositorioClientesDE();
	}

	@Override
	public RepositorioClientesDE getTodosOsClientes() throws SQLException {
		cc.conectar();
		ResultSet rs = cc.consultar(ClienteDAO.TUDO);
		if (rs == null) throw new NullPointerException("A lista de clientes está vazia."); 		
		clientes = new RepositorioClientesDE();
		while (rs.next())
		{
			Cliente cli = new Cliente 
			(
				rs.getInt("cod"),
				rs.getString("nome"),
				rs.getString("cpf"),
				rs.getString("rg"),
				rs.getString("sexo"),
				rs.getDate("data_nascimento"),
				rs.getDate("data_cadastro"),
				rs.getString("telefone_fixo"),
				rs.getString("telefone_celular"),
				rs.getString("cep"),
				rs.getInt("cidade_cod"),
				rs.getInt("bairro_cod"),
				rs.getString("logradouro"),
				rs.getInt("numero"),
				rs.getString("complemento"),
				rs.getString("UF") 
			);
			clientes.add(cli);
		}
		cc.desconectar();
		return this.clientes;
	}

	@Override
	public Cliente getClientePorCodigo(int codigo) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Cliente getClientePorNome(String nome) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Cliente getClientePorNomeParecidoCom(String nome)
			throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}
	/**
	 * Recebe novamente a lista de clientes do DB.
	 */
	public void receber()
	{
		
		
	}
	/**
	 * Atualiza as informações no DB.
	 */
	public void enviar()
	{
		
	}
}