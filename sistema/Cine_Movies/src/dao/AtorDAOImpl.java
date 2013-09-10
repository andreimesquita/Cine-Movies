package dao;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import pojo.Ator;

public class AtorDAOImpl implements AtorDAO {

	@Override
	public List<Ator> getTodosOsAtores() throws SQLException {
		
		List<Ator> la = new ArrayList<>();
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;

		try {
			Properties p = new Properties();
			p.load(new FileInputStream("conexao.properties"));
			String url = p.getProperty("url");
			
			con = DriverManager.getConnection(url, p);
			
			ps = con.prepareStatement(AtorDAO.PESQUISAR_TUDO);
			rs = ps.executeQuery();

			while (rs.next()) {
				int codigo = rs.getInt("cod");
				String nome = rs.getString("nome");
				la.add(new Ator (codigo, nome));
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
		return la;
	}

	@Override
	public Ator getAtorPorCodigo(int codigo) throws SQLException {
		Ator a = null;
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;

		try {
			Properties p = new Properties();
			p.load(new FileInputStream("conexao.properties"));
			String url = p.getProperty("url");
			
			con = DriverManager.getConnection(url, p);
			
			ps = con.prepareStatement(AtorDAO.PESQUISA_POR_CODIGO);
			ps.setInt(1,codigo);
			
			rs = ps.executeQuery();

			while (rs.next()) {
				int cod = rs.getInt("cod");
				String nome = rs.getString("nome");
				a = new Ator (cod, nome);
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
		return a;
	}

	@Override
	public Ator getAtorPorNome(String nome) throws SQLException {
		Ator a = null;
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;

		try {
			Properties p = new Properties();
			p.load(new FileInputStream("conexao.properties"));
			String url = p.getProperty("url");
			
			con = DriverManager.getConnection(url, p);
			
			ps = con.prepareStatement(AtorDAO.PESQUISA_POR_CODIGO);
			ps.setString(1,nome);
			
			rs = ps.executeQuery();

			while (rs.next()) {
				int codigo = rs.getInt("cod");
				String n = rs.getString("nome");
				a = new Ator (codigo, n);
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
		return a;
	}

	@Override
	public void inserirAtor(Ator ator) throws SQLException {
		Connection db = null;
		PreparedStatement st = null;

		try {
			Properties props = new Properties();
			props.load(new FileInputStream("conexao.properties"));
			String url = props.getProperty("url");

			db = DriverManager.getConnection(url, props);

			st = db.prepareStatement(AtorDAO.INSERIR);
			st.setString(1, ator.getNome());
			
			int r = st.executeUpdate();

			if (r != 1) {
				throw new RuntimeException("Erro ao inserir um novo Ator!");
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