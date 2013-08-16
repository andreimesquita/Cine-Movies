package bd;

import java.sql.ResultSet;
import java.sql.SQLException;

interface MyConnection
{
	/** 
	 * @deprecated
	 * Vari�vel est�tica que cont�m o valor <i>"localhost"</i> que serve de apoio durante 
	 * a chamada do m�todo <b>conectar(...)</b>. Para isso, envie-o como par�metro "<b>ip</b>".
	 */
	String IP_LOCALHOST = "localhost";
	/**  
	 * @deprecated
	 * Vari�vel est�tica que cont�m o valor <i>"jdbc:mysql://"</i> que serve de apoio durante 
	 * a chamada do m�todo <b>conectar(...)</b>.
	 */
	String MYSQL = "jdbc:mysql://";
	/**
	 * @deprecated
	 * Vari�vel est�tica que cont�m o valor <i>"jdbc:postgresql://"</i> que serve de apoio durante 
	 * a chamada do m�todo <b>conectar(...)</b>.
	 */
	String POSTGRESQL = "jdbc:postgresql://";
	/**
	 * @deprecated N�O SEI SE ESTA � A URL CORRETA PARA REALIZAR A CONEX�O COM O BANCO DE DADOS ORACLE.
	 */
	String ORACLE = "jdbc:oracle:thin://";
	/** 
	 * Conecta ao banco de dados que j� foi pr�viamente conectado anteriormente com o m�todo
	 * <b>conectar(...)</b>.
	 *     <b>N�o utilize este m�todo se ainda n�o tiver chamado o m�todo de conex�o padr�o (conectar(...)).</b>
	 * @throws SQLException Este m�todo lan�a a excess�o <n>SQLException</n>.
	 */
	public void reconectar() throws SQLException;
	/**
	 *     Este m�todo realiza a opera��o de <b>consulta</b> no o banco de dados, retornando um objeto
	 * do tipo ResultSet.
	 * Este m�todo recupera um objeto do tipo <n>ResultSet</n>, representando a tabela da consulta feita.
	 * @param sql A sql definida que queremos executar.
	 * @return Retorna um objeto do tipo <n>ResultSet</n> com os valores da consulta.
	 * @throws SQLException Este m�todo lan�a a excess�o <n>SQLException</n>.
	 */
	public ResultSet consultar(String sql) throws SQLException;
	/**
	 *     Este m�todo realiza a opera��o de <b>remo��o</b> com o banco de dados. 
	 * Obs.: Este m�todo executa exatamente a mesmo que os m�todos <b>atualizar(String sql)</b> e
	 * <b>inserir(String sql)</b>. Foram mantidos ester m�todos para melhor entendimento durante
	 * o uso da aplica��o.
	 * @param sql
	 * @throws SQLException Este m�todo lan�a a excess�o <n>SQLException</n>.
	 */
	public void remover(String sql) throws SQLException;
	/**
	 *     Realiza a opera��o de <b>inser��o</b> com o banco de dados.
	 * Obs.: Este m�todo executa exatamente a mesmo que os m�todos <b>remover(String sql)</b> e
	 * <b>atualizar(String sql)</b>. Foram mantidos ester m�todos para melhor entendimento durante
	 * o uso da aplica��o.
	 * @param sql
	 * @throws SQLException Este m�todo lan�a a excess�o <n>SQLException</n>.
	 */
	public void inserir(String sql) throws SQLException;
	/**
	 *     Realiza a opera��o de <b>atualiza��o</b> com o banco de dados.
	 * Obs.: Este m�todo executa exatamente a mesmo que os m�todos <b>remover(String sql)</b> e
	 * <b>inserir(String sql)</b>. Foram mantidos ester m�todos para melhor entendimento durante
	 * o uso da aplica��o.
	 * @param sql A sql definida que queremos executar.
	 * @throws SQLException Este m�todo lan�a a excess�o <n>SQLException</n>. 
	 */
	public void atualizar(String sql) throws SQLException;
}