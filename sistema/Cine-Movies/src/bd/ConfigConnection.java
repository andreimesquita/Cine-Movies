package bd;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.mysql.jdbc.Statement;
/**
 *     Classe pronta para realizar a conexão, consulta, atualização e remoção de valores nos bancos
 * de dados <>MySQL<> e PostgreSQL.
 * 
 *     <b>Sobre as versões:</b>
 *         <b>1.0</b>
 *             <i>- É possível realizar a conexão com um banco de dados que já está configurado nos atributos
 *               locais da classe.
 *             - É possível se desconectar do banco de dados.
 *             - É possível realizar a consulta, por meio do método <b>consultar()</b>, e atualização e remoção 
 *               de qualquer SQL utilizando o método <b>atualizar()</b>.</i>
 *         <b>1.1</b>
 *             <i>- Adicionados os atributos: <b>IP_LOCALHOST</b>, <b>MYSQL</b> e <b>POSTGRESQL</b>.
 *             - Adicionados os seguintes métodos: <b>reconectar()</b>,<b>remover(string sql)</b> e
 *               <b>inserir(string sql)
 *             - Após a primeira conexão, os dados de login e a url ficarão guardados na classe e para reconectar
 *               ao banco, apenas utilize o método <b>reconectar()</b>.</i>
 *          <b>1.2</b>
 *             <i>- Boas práticas de programação foram implementadas, como os padrões de projeto Singleton.
 *             - Os métodos principais como: conectar(), reconectar(), desconectar(), consultar(), remover(), 
 *             inserir() e atualizar(), agora pertencem a interface <b>MyConnection</b>.
 *             - Os seguintes atributos agora pertencem a esta classe: login, senha, ip, porta, banco e dbUrl.
 *             - Os seguintes métodos foram implantados: setUserAccount(), gerarUrl() e os getters e setters
 *             para os atributos de classe.
 *            <b>Próxima versão (1.3)</b>
 *             - Padrão de projeto Singleton será utilizado.
 *             - Os métodos poderão trabalhar em várias Threads com a adição da palavra <b>synchronized</b></i>
 * @author Ândrei d'Oliveira Mesquita Schuch
 * @version 1.2
 */
/**
 *     Classe pronta para realizar a conexão, consulta, atualização e remoção de valores nos bancos
 * de dados <>MySQL<> e PostgreSQL.
 * 
 *     <b>Sobre as versões:</b>
 *         <b>1.0</b>
 *             <i>- É possível realizar a conexão com um banco de dados que já está configurado nos atributos
 *               locais da classe.
 *             - É possível se desconectar do banco de dados.
 *             - É possível realizar a consulta, por meio do método <b>consultar()</b>, e atualização e remoção 
 *               de qualquer SQL utilizando o método <b>atualizar()</b>.</i>
 *         <b>1.1</b>
 *             <i>- Adicionados os atributos: <b>IP_LOCALHOST</b>, <b>MYSQL</b> e <b>POSTGRESQL</b>.
 *             - Adicionados os seguintes métodos: <b>reconectar()</b>,<b>remover(string sql)</b> e
 *               <b>inserir(string sql)
 *             - Após a primeira conexão, os dados de login e a url ficarão guardados na classe e para reconectar
 *               ao banco, apenas utilize o método <b>reconectar()</b>.</i>
 *          <b>1.2</b>
 *             <i>- Boas práticas de programação foram implementadas, como os padrões de projeto Singleton.
 *             - Os métodos principais como: conectar(), reconectar(), desconectar(), consultar(), remover(), 
 *             inserir() e atualizar(), agora pertencem a interface <b>MyConnection</b>.
 *             - Os seguintes atributos agora pertencem a esta classe: login, senha, ip, porta, banco e dbUrl.
 *             - Os seguintes métodos foram implantados: setUserAccount(), gerarUrl() e os getters e setters
 *             para os atributos de classe.
 *            <b>Próxima versão (1.3)</b>
 *             - Padrão de projeto Singleton está sendo utilizado.
 *             - Os métodos poderão trabalhar em várias Threads com a adição da palavra <b>synchronized</b></i>
 * @author Ândrei d'Oliveira Mesquita Schuch
 * @version 1.3
 */
public class ConfigConnection implements MyConnection
{
	
	private static ConfigConnection cc;
	/** Responsável por realizar a conexão com o servidor. */
	private static Connection con;
	/** Login de usuário do banco de dados. */
	private String login;
	/** Senha de usuário do banco de dados. */
	private String senha;
	/** Número do IP onde o banco de dados se encontra. */
	private String ip;
	/** Número da porta de acesso ao banco de dados. */
	private Object porta;
	/** Nome da base de dados que será acessada. */
	private Object banco;
	/** ############### */
	private String dbUrl;
	/** ############### */
	private Statement stm;
	/**
	 * Caminho para o banco de dados.
	 *     <i>tipo + ip + ou porta + ou nome do banco</i>
	 */
	private String url;
	/**
	 * Teste com o padrão de projeto Singleton
	 */
	private ConfigConnection(boolean t)
	{
		
	}
	
	public static ConfigConnection getConfigConnection()
	{
		if (cc == null)
		{
			cc = new ConfigConnection();
		}
		return cc;
	}
	/**
	 * Inicializa a conexão no banco mysql. A URL gerada é a seguinte:
	 * 		URL: <i>jdbc:mysql://localhost:3306/cinevideos</i>
	 *      LOGIN: <i>root</i>
	 *      SENHA: senha em branco.
	 */
	public ConfigConnection()
	{
		this.login = "root";
		this.senha = "";
		this.dbUrl = "jdbc:mysql://";
		this.ip = "localhost";
		this.porta = "3306";
		this.banco = "test";
		this.gerarUrl();
	}
	/**
	 * @deprecated
	 * ###############
	 * @param dbUrl
	 * @param ip
	 * @param porta
	 * @param banco
	 */
	public ConfigConnection(String dbUrl, String ip, Object porta, Object banco)
	{
		this.dbUrl = dbUrl;
		this.ip = ip;
		this.porta = porta;
		this.banco = banco;
		this.gerarUrl();
	}
	/**
	 * @deprecated
	 * #################
	 * @param login
	 * @param senha
	 * @param dbUrl
	 * @param ip
	 * @param porta
	 * @param banco
	 */
	public ConfigConnection(String login, String senha,String dbUrl, String ip, Object porta, Object banco)
	{
		this.login = login;
		this.senha = senha;
		this.dbUrl = dbUrl;
		this.ip = ip;
		this.porta = porta;
		this.banco = banco;
		this.gerarUrl();
	}
	/**
	 * Retorna <b>TRUE</b> se a conexão for bem sucedida.
	 * @return
	 */
	public synchronized boolean podeConectar()
    {
    	try
    	{
    		conectar();
    		desconectar();
    		return true;
    	} catch (Exception e)
    	{
    		e.printStackTrace();
    	}
    	return false;
    }
	/**
	 * @deprecated
	 * Define o <i>login</i> e <i>senha</i> de acesso ao banco.
	 * @param login
	 * @param senha
	 */
	public void setUserAccount(String login, String senha)
	{
		this.login = login;
		this.senha = senha;
	}	
	/**
	 * Método que realiza a conexão com o banco de dados a partir das informações enviadas como parâmetro para o método
	 * <i>getConnection(url,login,senha)</i>.
	 * @throws SQLException Este método lança a excessão <n>SQLException</n>.
	 */	
	public void conectar() throws SQLException
	{
		con = DriverManager.getConnection(this.url,login,senha);
	}
	/** 
	 * @deprecated
	 * Conecta ao banco de dados que já foi préviamente conectado anteriormente com o método
	 * <b>conectar(...)</b>.
	 *     <b>Não utilize este método se ainda não tiver chamado o método de conexão padrão (conectar(...)).</b>
	 * @throws SQLException Este método lança a excessão <n>SQLException</n>.
	 */
	public void reconectar() throws SQLException
	{
		con = DriverManager.getConnection(url,login,senha);
	}
	/**
	 * Este método fecha a conexão com o banco de dados. <n>Você deve chamar o método <i>conectar()</i> novamente se quiser 
	 * realizar novas consultas ou atualizações no banco de dados.</n>
	 * @throws SQLException Este método lança a excessão <n>SQLException</n>.
	 */
	public synchronized void desconectar() throws SQLException
	{
		con.close();
	}
	/**
	 *     Este método realiza a operação de <b>consulta</b> no o banco de dados, retornando um objeto
	 * do tipo ResultSet.
	 * Este método recupera um objeto do tipo <n>ResultSet</n>, representando a tabela da consulta feita.
	 * @param sql A sql definida que queremos executar.
	 * @return Retorna um objeto do tipo <n>ResultSet</n> com os valores da consulta.
	 * @throws SQLException Este método lança a excessão <n>SQLException</n>.
	 */
	public synchronized ResultSet consultar(String sql) throws SQLException
	{
		PreparedStatement ps = con.prepareStatement(sql);
		ResultSet rs = ps.executeQuery();
		return rs;
	}
	/**
	 * Este método realiza a operação de <b>remoção</b> com o banco de dados. 
	 * Obs.: Este método executa exatamente a mesmo que os métodos <b>atualizar(String sql)</b> e
	 * <b>inserir(String sql)</b>. Foram mantidos ester métodos para melhor entendimento durante
	 * o uso da aplicação.
	 * @param sql
	 * @throws SQLException Este método lança a excessão <n>SQLException</n>.
	 */
	public synchronized void remover(String sql) throws SQLException 
	{
		con.prepareStatement(sql).executeUpdate();
	}
	/**
	 * Realiza a operação de <b>inserção</b> com o banco de dados.
	 * Obs.: Este método executa exatamente a mesmo que os métodos <b>remover(String sql)</b> e
	 * <b>atualizar(String sql)</b>. Foram mantidos ester métodos para melhor entendimento durante
	 * o uso da aplicação.
	 * @param sql
	 * @throws SQLException Este método lança a excessão <n>SQLException</n>.
	 */
	public synchronized void inserir(String sql) throws SQLException 
	{
		con.prepareStatement(sql).executeUpdate();
	}
	/**
	 * Realiza a operação de <b>atualização</b> com o banco de dados.
	 * Obs.: Este método executa exatamente a mesmo que os métodos <b>remover(String sql)</b> e
	 * <b>inserir(String sql)</b>. Foram mantidos ester métodos para melhor entendimento durante
	 * o uso da aplicação.
	 * @param sql A sql definida que queremos executar.
	 * @throws SQLException Este método lança a excessão <n>SQLException</n>. 
	 */
	public synchronized void atualizar(String sql) throws SQLException
	{
		con.prepareStatement(sql).executeUpdate();
	}
	/**
	 * Gera a url com as informações definidas durante a inicialização da classe e após cada
	 * modificação dos atributos da classe.
	 */
	private synchronized void gerarUrl()
	{
		StringBuilder completarUrl = new StringBuilder(dbUrl + ip);
		if (porta != null)
		{
			completarUrl.append(":" + porta);
		}
		if (banco != null)
		{
			completarUrl.append("/" + banco);
		}
		this.url = completarUrl.toString();
	}
	/**
	 * Retorna o ip.
	 * @return the ip
	 */
	public String getIp() {
		return ip;
	}
	/**
	 * Modifica o ip e atualiza a url.
	 * @param ip the ip to set
	 */
	public void setIp(String ip) {
		this.ip = ip;
		gerarUrl();
	}
	/**
	 * Retorna a porta.
	 * @return the porta
	 */
	public Object getPorta() {
		return porta;
	}
	/**
	 * Modifica a porta e atualiza a url.
	 * @param porta the porta to set
	 */
	public void setPorta(Object porta) {
		this.porta = porta;
		gerarUrl();
	}
	/**
	 * Retorna o banco (nome da base de dados).
	 * @return the banco
	 */
	public Object getBanco() {
		return banco;
	}
	/**
	 * Modifica o banco (nome da base de dados) e atualiza a url.
	 * @param banco the banco to set
	 */
	public void setBanco(Object banco) {
		this.banco = banco;
		gerarUrl();
	}
	/**
	 * Retorna o login.
	 * @return the login
	 */
	public String getLogin() {
		return login;
	}
	/**
	 * Modifica o login e atualiza a url.
	 * @param login the login to set
	 */
	public void setLogin(String login) {
		this.login = login;
		gerarUrl();
	}
	/**
	 * Retorna a senha.
	 * @return the senha
	 */
	public String getSenha() {
		return senha;
	}
	/**
	 * Modifica a senha e atualiza a url.
	 * @param senha the senha to set
	 */
	public void setSenha(String senha) {
		this.senha = senha;
		gerarUrl();
	}
	/**
	 * Retorna a URL.
	 * @return the url
	 */
	public String getUrl() {
		return url;
	}
	/**
	 * Modifique manualmente a URL da classe, mas cuidado, este método gera consequências.
	 * <b>Da próxima vez que você chamar algum método <i>set</i> as informações na classe
	 * serão usadas para a criação de uma nova URL. Esta é uma funcionalidade padrão deste 
	 * objeto.</b>
	 * @param url the url to set
	 */
	public void setUrl(String url) 
	{
		this.url = url;
	}
	/**
	 * Retorna a URL do banco de dados.
	 * @return the dbUrl
	 */
	public String getDbUrl() {
		return dbUrl;
	}
	/**
	 * Modifica a URL do banco de dados.
	 * @param dbUrl the dbUrl to set
	 */
	public void setDbUrl(String dbUrl) {
		this.dbUrl = dbUrl;
		gerarUrl();
	}
}