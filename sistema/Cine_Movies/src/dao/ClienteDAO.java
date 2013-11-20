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

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import pojo.Cliente;

public class ClienteDAO {
	
	private SessionFactory factory;
	
	/**
	 * Comando SQL necessário para retornar todos os clientes que estão na tabela <b>cliente</b>.
	 *     <i>"SELECT * FROM cliente"</i>
	 */
	private final String PESQUISAR_TUDO = "SELECT * FROM cliente";
	/**
	 * Comando SQL necessário para retornar o cliente referente ao <b>código</b> enviado.
	 *     <i>"SELECT * FROM cliente WHERE cod = ?"</i>
	 */
	private final String PESQUISA_POR_CODIGO = "SELECT * FROM cliente WHERE cod = ?";
	/**
	 * Comando SQL necessário para retornar o cliente referente ao <b>nome</b> enviado.
	 *     <i>"SELECT * FROM cliente WHERE nome = ?"</i>
	 */
	private final String PESQUISA_POR_NOME = "SELECT * FROM cliente WHERE nome LIKE ?";
	/**
	 * Comando SQL necessário para inserir um novo cliente no db.
	 *     <i>"INSERT INTO cliente (codigo,cpf,rg,nome,cep,bairro,cidade,"
			+ "logradouro,numero,tel_fixo,tel_celular,email,tipo,cliente_sup) VALUES (?,?,"
			+ "?,?,?,?,?,?,?,?,?,?,?,?);"</i>
	 */
	private final String INSERIR = "INSERT INTO cliente (cpf,rg,nome,cep,bairro,cidade,"
			+ "logradouro,numero,tel_fixo,tel_celular,email,tipo,cliente_sup) VALUES (?,"
			+ "?,?,?,?,?,?,?,?,?,?,?,?);";
	/** Adiciona a classe Cliente ao objeto de configuração e cria uma nova fábrica. */
	public ClienteDAO() {
		Configuration c = new Configuration();
	    c.addClass(Cliente.class);
	    
        factory = c.buildSessionFactory();
	}
	/**
	 * Retorna um objeto do tipo List contendo os clientes na tabela <b>cliente</b>, no db.
	 * @return List dos clientes no db.
	 * @throws SQLException 
	 */
	public List<Cliente> getTodosOsClientes(String condicao) throws SQLException {
		Session session = factory.openSession();
       List<Cliente> c = session.createQuery(condicao).list();
       session.flush();
	   session.close();
	   return c;
	}
	/** Retorna o cliente pelo código. */
	public Cliente getCliente(Integer codigo) {
		Session session = factory.openSession();
	       Cliente c = (Cliente) session.load(Cliente.class, codigo);
	       session.flush();
	       session.close();
	       return c;
	}
	/** Inserir um novo cliente na base de dados. */
	public void inserirCliente(Cliente c) {
		try {
		   Session session = factory.openSession();
	       Transaction t = session.beginTransaction();
	       session.save(c);
	       t.commit();
	       session.flush();
	       session.close();
		} catch (Exception e) {
			throw new RuntimeException("Erro ao inserir um novo cliente!");
		}
	}
}