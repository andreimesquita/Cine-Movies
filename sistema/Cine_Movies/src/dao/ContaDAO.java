package dao;

import java.sql.SQLException;
import java.util.List;

import pojo.Conta;

public interface ContaDAO {
	/**
		 * Comando SQL necess�rio para retornar todas as contas na tabela <b>conta</b>.
		 *     <i>"SELECT * FROM conta"</i>
		 */
		String PESQUISAR_TUDO = "SELECT * FROM conta";
		/**
		 * Comando SQL necess�rio para retornar a conta referente ao c�digo enviado.
		 *     <i>"SELECT * FROM conta WHERE cod = ?"</i>
		 */
		String PESQUISA_POR_CODIGO = "SELECT * FROM conta WHERE cod = ?";
		/**
		 * Comando SQL necess�rio para retornar a conta referente ao c�digo do cliente enviado.
		 *     <i>"SELECT * FROM conta WHERE codigo_cliente = ?"</i>
		 */
		String PESQUISA_POR_CODIGO_CLIENTE = "SELECT * FROM conta WHERE codigo_cliente = ?";
		/**
		 * Comando SQL necess�rio para inserir uma nova conta.
		 *     <i>"INSERT INTO conta(codigo_cliente,saldo) VALUES (?,?)"</i>
		 */
		String INSERIR = "INSERT INTO conta(codigo_cliente,saldo) VALUES (?,?)";
		/**
		 * Retorna um objeto do tipo List contendo as conats na tabela <b>conta</b>.
		 * @return List dos contas no db.
		 * @throws SQLException
		 */
		List<Conta> getTodasOsContas() throws SQLException;
		Conta getContaPorCodigo(int codigo) throws SQLException;
		Conta getContaPorCodigoCliente(int codigo) throws SQLException;
		void inserirConta(Conta conta) throws SQLException;
}

