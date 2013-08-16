package bd;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.mysql.jdbc.Statement;
/**
 *     Classe pronta para realizar a conex�o, consulta, atualiza��o e remo��o de valores nos bancos
 * de dados <>MySQL<> e PostgreSQL.
 * 
 *     <b>Sobre as vers�es:</b>
 *         <b>1.0</b>
 *             <i>- � poss�vel realizar a conex�o com um banco de dados que j� est� configurado nos atributos
 *               locais da classe.
 *             - � poss�vel se desconectar do banco de dados.
 *             - � poss�vel realizar a consulta, por meio do m�todo <b>consultar()</b>, e atualiza��o e remo��o 
 *               de qualquer SQL utilizando o m�todo <b>atualizar()</b>.</i>
 *         <b>1.1</b>
 *             <i>- Adicionados os atributos: <b>IP_LOCALHOST</b>, <b>MYSQL</b> e <b>POSTGRESQL</b>.
 *             - Adicionados os seguintes m�todos: <b>reconectar()</b>,<b>remover(string sql)</b> e
 *               <b>inserir(string sql)
 *             - Ap�s a primeira conex�o, os dados de login e a url ficar�o guardados na classe e para reconectar
 *               ao banco, apenas utilize o m�todo <b>reconectar()</b>.</i>
 *          <b>1.2</b>
 *             <i>- Boas pr�ticas de programa��o foram implementadas, como os padr�es de projeto Singleton.
 *             - Os m�todos principais como: conectar(), reconectar(), desconectar(), consultar(), remover(), 
 *             inserir() e atualizar(), agora pertencem a interface <b>MyConnection</b>.
 *             - Os seguintes atributos agora pertencem a esta classe: login, senha, ip, porta, banco e dbUrl.
 *             - Os seguintes m�todos foram implantados: setUserAccount(), gerarUrl() e os getters e setters
 *             para os atributos de classe.
 *            <b>Pr�xima vers�o (1.3)</b>
 *             - Padr�o de projeto Singleton ser� utilizado.
 *             - Os m�todos poder�o trabalhar em v�rias Threads com a adi��o da palavra <b>synchronized</b></i>
 * @author �ndrei d'Oliveira Mesquita Schuch
 * @version 1.2
 */
/**
 *     Classe pronta para realizar a conex�o, consulta, atualiza��o e remo��o de valores nos bancos
 * de dados <>MySQL<> e PostgreSQL.
 * 
 *     <b>Sobre as vers�es:</b>
 *         <b>1.0</b>
 *             <i>- � poss�vel realizar a conex�o com um banco de dados que j� est� configurado nos atributos
 *               locais da classe.
 *             - � poss�vel se desconectar do banco de dados.
 *             - � poss�vel realizar a consulta, por meio do m�todo <b>consultar()</b>, e atualiza��o e remo��o 
 *               de qualquer SQL utilizando o m�todo <b>atualizar()</b>.</i>
 *         <b>1.1</b>
 *             <i>- Adicionados os atributos: <b>IP_LOCALHOST</b>, <b>MYSQL</b> e <b>POSTGRESQL</b>.
 *             - Adicionados os seguintes m�todos: <b>reconectar()</b>,<b>remover(string sql)</b> e
 *               <b>inserir(string sql)
 *             - Ap�s a primeira conex�o, os dados de login e a url ficar�o guardados na classe e para reconectar
 *               ao banco, apenas utilize o m�todo <b>reconectar()</b>.</i>
 *          <b>1.2</b>
 *             <i>- Boas pr�ticas de programa��o foram implementadas, como os padr�es de projeto Singleton.
 *             - Os m�todos principais como: conectar(), reconectar(), desconectar(), consultar(), remover(), 
 *             inserir() e atualizar(), agora pertencem a interface <b>MyConnection</b>.
 *             - Os seguintes atributos agora pertencem a esta classe: login, senha, ip, porta, banco e dbUrl.
 *             - Os seguintes m�todos foram implantados: setUserAccount(), gerarUrl() e os getters e setters
 *             para os atributos de classe.
 *            <b>Pr�xima vers�o (1.3)</b>
 *             - Padr�o de projeto Singleton est� sendo utilizado.
 *             - Os m�todos poder�o trabalhar em v�rias Threads com a adi��o da palavra <b>synchronized</b></i>
 * @author �ndrei d'Oliveira Mesquita Schuch
 * @version 1.3
 */
public class ConfigConnection implements MyConnection
{
	
	private static ConfigConnection cc;
	/** Respons�vel por realizar a conex�o com o servidor. */
	private static Connection con;
	/** Login de usu�rio do banco de dados. */
	private String login;
	/** Senha de usu�rio do banco de dados. */
	private String senha;
	/** N�mero do IP onde o banco de dados se encontra. */
	private String ip;
	/** N�mero da porta de acesso ao banco de dados. */
	private Object porta;
	/** Nome da base de dados que ser� acessada. */
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
	 * Teste com o padr�o de projeto Singleton
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
	 * Inicializa a conex�o no banco mysql. A URL gerada � a seguinte:
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
	 * Retorna <b>TRUE</b> se a conex�o for bem sucedida.
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
	 * M�todo que realiza a conex�o com o banco de dados a partir das informa��es enviadas como par�metro para o m�todo
	 * <i>getConnection(url,login,senha)</i>.
	 * @throws SQLException Este m�todo lan�a a excess�o <n>SQLException</n>.
	 */	
	public void conectar() throws SQLException
	{
		con = DriverManager.getConnection(this.url,login,senha);
	}
	/** 
	 * @deprecated
	 * Conecta ao banco de dados que j� foi pr�viamente conectado anteriormente com o m�todo
	 * <b>conectar(...)</b>.
	 *     <b>N�o utilize este m�todo se ainda n�o tiver chamado o m�todo de conex�o padr�o (conectar(...)).</b>
	 * @throws SQLException Este m�todo lan�a a excess�o <n>SQLException</n>.
	 */
	public void reconectar() throws SQLException
	{
		con = DriverManager.getConnection(url,login,senha);
	}
	/**
	 * Este m�todo fecha a conex�o com o banco de dados. <n>Voc� deve chamar o m�todo <i>conectar()</i> novamente se quiser 
	 * realizar novas consultas ou atualiza��es no banco de dados.</n>
	 * @throws SQLException Este m�todo lan�a a excess�o <n>SQLException</n>.
	 */
	public synchronized void desconectar() throws SQLException
	{
		con.close();
	}
	/**
	 *     Este m�todo realiza a opera��o de <b>consulta</b> no o banco de dados, retornando um objeto
	 * do tipo ResultSet.
	 * Este m�todo recupera um objeto do tipo <n>ResultSet</n>, representando a tabela da consulta feita.
	 * @param sql A sql definida que queremos executar.
	 * @return Retorna um objeto do tipo <n>ResultSet</n> com os valores da consulta.
	 * @throws SQLException Este m�todo lan�a a excess�o <n>SQLException</n>.
	 */
	public synchronized ResultSet consultar(String sql) throws SQLException
	{
		PreparedStatement ps = con.prepareStatement(sql);
		ResultSet rs = ps.executeQuery();
		return rs;
	}
	/**
	 * Este m�todo realiza a opera��o de <b>remo��o</b> com o banco de dados. 
	 * Obs.: Este m�todo executa exatamente a mesmo que os m�todos <b>atualizar(String sql)</b> e
	 * <b>inserir(String sql)</b>. Foram mantidos ester m�todos para melhor entendimento durante
	 * o uso da aplica��o.
	 * @param sql
	 * @throws SQLException Este m�todo lan�a a excess�o <n>SQLException</n>.
	 */
	public synchronized void remover(String sql) throws SQLException 
	{
		con.prepareStatement(sql).executeUpdate();
	}
	/**
	 * Realiza a opera��o de <b>inser��o</b> com o banco de dados.
	 * Obs.: Este m�todo executa exatamente a mesmo que os m�todos <b>remover(String sql)</b> e
	 * <b>atualizar(String sql)</b>. Foram mantidos ester m�todos para melhor entendimento durante
	 * o uso da aplica��o.
	 * @param sql
	 * @throws SQLException Este m�todo lan�a a excess�o <n>SQLException</n>.
	 */
	public synchronized void inserir(String sql) throws SQLException 
	{
		con.prepareStatement(sql).executeUpdate();
	}
	/**
	 * Realiza a opera��o de <b>atualiza��o</b> com o banco de dados.
	 * Obs.: Este m�todo executa exatamente a mesmo que os m�todos <b>remover(String sql)</b> e
	 * <b>inserir(String sql)</b>. Foram mantidos ester m�todos para melhor entendimento durante
	 * o uso da aplica��o.
	 * @param sql A sql definida que queremos executar.
	 * @throws SQLException Este m�todo lan�a a excess�o <n>SQLException</n>. 
	 */
	public synchronized void atualizar(String sql) throws SQLException
	{
		con.prepareStatement(sql).executeUpdate();
	}
	/**
	 * Gera a url com as informa��es definidas durante a inicializa��o da classe e ap�s cada
	 * modifica��o dos atributos da classe.
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
	 * Modifique manualmente a URL da classe, mas cuidado, este m�todo gera consequ�ncias.
	 * <b>Da pr�xima vez que voc� chamar algum m�todo <i>set</i> as informa��es na classe
	 * ser�o usadas para a cria��o de uma nova URL. Esta � uma funcionalidade padr�o deste 
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