package bd;

public class ErroDeConexao extends Exception {
	public ErroDeConexao()
	{
		super("N�o foi poss�vel conectar-se ao servidor!");
	}
}
