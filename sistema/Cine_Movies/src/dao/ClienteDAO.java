package dao;

import java.sql.SQLException;
import java.util.List;

import pojo.Cliente;

public interface ClienteDAO {
	/**
	 * Comando SQL necessário para retornar todos os clientes que estão na tabela <b>cliente</b>.
	 *     <i>"SELECT * FROM cliente"</i>
	 */
	String PESQUISAR_TUDO = "SELECT * FROM cliente";
	/**
	 * Comando SQL necessário para retornar o cliente referente ao <b>código</b> enviado.
	 *     <i>"SELECT * FROM cliente WHERE cod = ?"</i>
	 */
	String PESQUISA_POR_CODIGO = "SELECT * FROM cliente WHERE cod = ?";
	/**
	 * Comando SQL necessário para retornar o cliente referente ao <b>nome</b> enviado.
	 *     <i>"SELECT * FROM cliente WHERE nome = ?"</i>
	 */
	String PESQUISA_POR_NOME = "SELECT * FROM cliente WHERE nome LIKE ?";
	/**
	 * Comando SQL necessário para inserir um novo cliente no db.
	 *     <i>"INSERT INTO cliente(nome,cpf,rg,sexo,data_nascimento,data_cadastro,email,
	 *     telefone_fixo,telefone_celular,cep,logradouro,numero) VALUES
	 *     ('?','?','?','?','?','?','?','?','?','?','?','?','?','?')"</i>
	 */
	String INSERIR = "INSERT INTO cliente(nome,cpf,rg,sexo,data_nascimento,data_cadastro,"
		+ "email,telefone_fixo,telefone_celular,cep,logradouro,numero) "
		+ "VALUES('?','?','?','?','?','?','?','?','?','?','?','?','?','?')";
	/**
	 * Retorna um objeto do tipo List contendo os clientes na tabela <b>cliente</b>, no db.
	 * @return List dos clientes no db.
	 * @throws SQLException 
	 */
	List<Cliente> getTodosOsClientes() throws SQLException;
	Cliente getClientePorCodigo(int codigo) throws SQLException;
	Cliente getClientePorNome(String nome) throws SQLException;
	void inserirCliente(Cliente cliente) throws SQLException;
}