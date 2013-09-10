package dao;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import pojo.Cliente;

public class ClienteDAOImpl implements ClienteDAO {

	@Override
	public List<Cliente> getTodosOsClientes() throws SQLException {
		
		List<Cliente> lc = new ArrayList<>();
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;

		try {
			Properties p = new Properties();
			p.load(new FileInputStream("conexao.properties"));
			String url = p.getProperty("url");
			
			con = DriverManager.getConnection(url, p);
			
			ps = con.prepareStatement(ClienteDAO.PESQUISAR_TUDO);
			rs = ps.executeQuery();

			while (rs.next()) {
				int codigo = rs.getInt("cod");
				String nome = rs.getString("nome");
				String cpf = rs.getString("cpf");
				String rg = rs.getString("rg");
				String sexo = rs.getString("sexo");
				Date data_nascimento = rs.getDate("data_nascimento");
			    Date data_cadastro = rs.getDate("data_cadastro");
			    String telefone_fixo = rs.getString("telefone_fixo");
			    String telefone_celular = rs.getString("telefone_celular");
			    String  cep = rs.getString("cep");
			    String logradouro = rs.getString("logradouro");
			    int numero = rs.getInt("numero");
			    String complemento = rs.getString("complemento");

				lc.add(
					new Cliente (
						codigo, nome, cpf, rg, sexo, data_nascimento, data_cadastro, telefone_fixo, 
						telefone_celular, cep, logradouro, numero, complemento)
					);
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (rs != null) {
					rs.close();
				}
				if (ps != null) {
					ps.close();
				}
				if (con != null) {
					con.close();
				}
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		return lc;
	}

	@Override
	public Cliente getClientePorCodigo(int codigo) throws SQLException {
		Cliente c = null;
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;

		try {
			Properties p = new Properties();
			p.load(new FileInputStream("conexao.properties"));
			String url = p.getProperty("url");
			
			con = DriverManager.getConnection(url, p);
			
			ps = con.prepareStatement(ClienteDAO.PESQUISA_POR_CODIGO);
			ps.setInt(1,codigo);
			
			rs = ps.executeQuery();

			while (rs.next()) {
				int cod = rs.getInt("cod");
				String nome = rs.getString("nome");
				String cpf = rs.getString("cpf");
				String rg = rs.getString("rg");
				String sexo = rs.getString("sexo");
				Date data_nascimento = rs.getDate("data_nascimento");
			    Date data_cadastro = rs.getDate("data_cadastro");
			    String telefone_fixo = rs.getString("telefone_fixo");
			    String telefone_celular = rs.getString("telefone_celular");
			    String  cep = rs.getString("cep");
			    String logradouro = rs.getString("logradouro");
			    int numero = rs.getInt("numero");
			    String complemento = rs.getString("complemento");

				c = new Cliente (cod, nome, cpf, rg, sexo, data_nascimento, data_cadastro, 
						telefone_fixo,telefone_celular, cep, logradouro, numero, complemento);
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (rs != null) {
					rs.close();
				}
				if (ps != null) {
					ps.close();
				}
				if (con != null) {
					con.close();
				}
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		return c;
	}

	@Override
	public Cliente getClientePorNome(String nome) throws SQLException {
		Cliente c = null;
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;

		try {
			Properties p = new Properties();
			p.load(new FileInputStream("conexao.properties"));
			String url = p.getProperty("url");
			
			con = DriverManager.getConnection(url, p);
			
			ps = con.prepareStatement(ClienteDAO.PESQUISA_POR_NOME);
			ps.setString(1,nome);
			
			rs = ps.executeQuery();

			while (rs.next()) {
				int codigo = rs.getInt("cod");
				String n = rs.getString("nome");
				String cpf = rs.getString("cpf");
				String rg = rs.getString("rg");
				String sexo = rs.getString("sexo");
				Date data_nascimento = rs.getDate("data_nascimento");
			    Date data_cadastro = rs.getDate("data_cadastro");
			    String telefone_fixo = rs.getString("telefone_fixo");
			    String telefone_celular = rs.getString("telefone_celular");
			    String  cep = rs.getString("cep");
			    String logradouro = rs.getString("logradouro");
			    int numero = rs.getInt("numero");
			    String complemento = rs.getString("complemento");

				c = new Cliente (codigo, n, cpf, rg, sexo, data_nascimento, data_cadastro, 
						telefone_fixo,telefone_celular, cep, logradouro, numero, complemento);
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (rs != null) {
					rs.close();
				}
				if (ps != null) {
					ps.close();
				}
				if (con != null) {
					con.close();
				}
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		return c;
	}

	@Override
	public void inserirCliente(Cliente cliente) throws SQLException {
		Connection db = null;
		PreparedStatement st = null;

		try {
			Properties props = new Properties();
			props.load(new FileInputStream("conexao.properties"));
			String url = props.getProperty("url");

			db = DriverManager.getConnection(url, props);

			st = db.prepareStatement(ClienteDAO.INSERIR);
			st.setString(1, cliente.getNome());
			st.setString(2, cliente.getCpf());
			st.setString(3, cliente.getRg());
			st.setString(4, cliente.getSexo());
			st.setDate(5, cliente.getData_nascimento());
			st.setDate(6, cliente.getData_cadastro());
			st.setString(7, cliente.getTelefone_fixo());
			st.setString(8, cliente.getTelefone_celular());
			st.setString(9, cliente.getCep());
			st.setString(10, cliente.getLogradouro());
			st.setInt(11, cliente.getNumero());
			st.setString(12, cliente.getComplemento());
			
			int r = st.executeUpdate();

			if (r != 1) {
				throw new RuntimeException("Erro ao inserir um novo cliente!");
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (st != null) {
					st.close();
				}
				if (db != null) {
					db.close();
				}
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
	}
}