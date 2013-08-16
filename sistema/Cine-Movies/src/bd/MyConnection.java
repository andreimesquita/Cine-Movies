package bd;

import java.sql.ResultSet;
import java.sql.SQLException;

interface MyConnection
{
	/** 
	 * @deprecated
	 * Variável estática que contém o valor <i>"localhost"</i> que serve de apoio durante 
	 * a chamada do método <b>conectar(...)</b>. Para isso, envie-o como parâmetro "<b>ip</b>".
	 */
	String IP_LOCALHOST = "localhost";
	/**  
	 * @deprecated
	 * Variável estática que contém o valor <i>"jdbc:mysql://"</i> que serve de apoio durante 
	 * a chamada do método <b>conectar(...)</b>.
	 */
	String MYSQL = "jdbc:mysql://";
	/**
	 * @deprecated
	 * Variável estática que contém o valor <i>"jdbc:postgresql://"</i> que serve de apoio durante 
	 * a chamada do método <b>conectar(...)</b>.
	 */
	String POSTGRESQL = "jdbc:postgresql://";
	/**
	 * @deprecated NÃO SEI SE ESTA É A URL CORRETA PARA REALIZAR A CONEXÃO COM O BANCO DE DADOS ORACLE.
	 */
	String ORACLE = "jdbc:oracle:thin://";
	/** 
	 * Conecta ao banco de dados que já foi préviamente conectado anteriormente com o método
	 * <b>conectar(...)</b>.
	 *     <b>Não utilize este método se ainda não tiver chamado o método de conexão padrão (conectar(...)).</b>
	 * @throws SQLException Este método lança a excessão <n>SQLException</n>.
	 */
	public void reconectar() throws SQLException;
	/**
	 *     Este método realiza a operação de <b>consulta</b> no o banco de dados, retornando um objeto
	 * do tipo ResultSet.
	 * Este método recupera um objeto do tipo <n>ResultSet</n>, representando a tabela da consulta feita.
	 * @param sql A sql definida que queremos executar.
	 * @return Retorna um objeto do tipo <n>ResultSet</n> com os valores da consulta.
	 * @throws SQLException Este método lança a excessão <n>SQLException</n>.
	 */
	public ResultSet consultar(String sql) throws SQLException;
	/**
	 *     Este método realiza a operação de <b>remoção</b> com o banco de dados. 
	 * Obs.: Este método executa exatamente a mesmo que os métodos <b>atualizar(String sql)</b> e
	 * <b>inserir(String sql)</b>. Foram mantidos ester métodos para melhor entendimento durante
	 * o uso da aplicação.
	 * @param sql
	 * @throws SQLException Este método lança a excessão <n>SQLException</n>.
	 */
	public void remover(String sql) throws SQLException;
	/**
	 *     Realiza a operação de <b>inserção</b> com o banco de dados.
	 * Obs.: Este método executa exatamente a mesmo que os métodos <b>remover(String sql)</b> e
	 * <b>atualizar(String sql)</b>. Foram mantidos ester métodos para melhor entendimento durante
	 * o uso da aplicação.
	 * @param sql
	 * @throws SQLException Este método lança a excessão <n>SQLException</n>.
	 */
	public void inserir(String sql) throws SQLException;
	/**
	 *     Realiza a operação de <b>atualização</b> com o banco de dados.
	 * Obs.: Este método executa exatamente a mesmo que os métodos <b>remover(String sql)</b> e
	 * <b>inserir(String sql)</b>. Foram mantidos ester métodos para melhor entendimento durante
	 * o uso da aplicação.
	 * @param sql A sql definida que queremos executar.
	 * @throws SQLException Este método lança a excessão <n>SQLException</n>. 
	 */
	public void atualizar(String sql) throws SQLException;
}