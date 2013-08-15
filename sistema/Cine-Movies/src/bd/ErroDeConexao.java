package bd;

public class ErroDeConexao extends Exception {
	public ErroDeConexao()
	{
		super("Não foi possível conectar-se ao servidor!");
	}
}
