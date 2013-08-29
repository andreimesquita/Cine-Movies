package bd;

import java.sql.ResultSet;
import java.sql.SQLException;

public class TesteH2 {
	public static void main(String[] args) {
		ConfigConnection cc = ConfigConnection.getConfigConnection();
		try
		{
			cc.conectar();
			long inicio = System.currentTimeMillis();
			ResultSet rs = cc.consultar("SELECT * FROM test");
			long fim = System.currentTimeMillis();
			while (rs.next())
			{
				System.out.println("Código: " + rs.getInt("codigo") + "    Nome: " + rs.getString("nome"));
			}
			cc.desconectar();
			System.out.println("A execução durou " + (fim - inicio) + "ms");
		} catch (SQLException sqle) {
			System.out.println("Ocorreu um erro durante a execução do programa.");
		}
	}
}
