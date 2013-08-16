package off_topic;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;

import bd.ConfigConnection;

public class test_Recebendo_Enviando_Date {

	public static void main(String[] args) {
		ConfigConnection cc = ConfigConnection.getConfigConnection();
		try
		{
			cc.conectar();
			cc.atualizar("INSERT INTO teste(data) VALUES (" + new Date() + ")");
			System.out.println("Sucesso!");
			ResultSet rs = cc.consultar("SELECT * FROM teste");
			while(rs.next())
			{
				System.out.println("DATA: " + rs.getDate(2));
			}
			cc.desconectar();
		} catch (SQLException e) 
		{
			System.out.println("Ocorreu um erro na chamada do método 'atualizar'.");
		}
	}
}