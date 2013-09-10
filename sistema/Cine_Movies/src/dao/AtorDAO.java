package dao;

import java.sql.SQLException;
import java.util.List;

import pojo.Ator;

public interface AtorDAO {
	/**
		 * Comando SQL necessário para retornar todos os atores que estão na tabela <b>Ator</b>.
		 *     <i>"SELECT * FROM ator"</i>
		 */
		String PESQUISAR_TUDO = "SELECT * FROM ator";
		/**
		 * Comando SQL necessário para retornar o ator referente ao <b>cod</b> enviado.
		 *     <i>"SELECT * FROM ator WHERE cod = ?"</i>
		 */
		String PESQUISA_POR_CODIGO = "SELECT * FROM ator WHERE cod = ?";
		/**
		 * Comando SQL necessário para retornar o ator referente ao <b>nome</b> enviado.
		 *     <i>"SELECT * FROM cliente WHERE nome = ?"</i>
		 */
		String PESQUISA_POR_NOME = "SELECT * FROM ator WHERE nome = '?'";
		/**
		 * Comando SQL necessário para inserir um novo ator no db.
		 *     <i>"INSERT INTO ator(nome) VALUES ('?')"</i>
		 */
		String INSERIR = "INSERT INTO cliente(nome) VALUES ('?')";
		/**
		 * Retorna um objeto do tipo List contendo os atores na tabela <b>ator</b>.
		 * @return List dos atores no db.
		 * @throws SQLException
		 */
		List<Ator> getTodosOsAtores() throws SQLException;
		Ator getAtorPorCodigo(int codigo) throws SQLException;
		Ator getAtorPorNome(String nome) throws SQLException;
		void inserirAtor(Ator ator) throws SQLException;
}

