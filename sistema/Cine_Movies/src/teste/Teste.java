package teste;

import java.sql.SQLException;

import pojo.modelo.Cliente;
import pojo.repositorio.RepositorioClientesDE;
import dao.ClienteDAOImpl;

public class Teste {

	public static void main(String[] args) {
		ClienteDAOImpl cd = new ClienteDAOImpl();
		try {
			RepositorioClientesDE rc = cd.getTodosOsClientes();
			for (int x = 0; x < rc.getTamanho(); x++)
			{
				Cliente cli = rc.get(x);
				System.out.println
				( 
				   "Cliente " + x + ":\n" + 
				   "Código: " + cli.getCodigo() +
				   "CPF: " + cli.getNome() +
				   "RG: " + cli.getNome() +
				   "Sexo: " + cli.getNome() +
				   "data_nascimento: " + cli.getNome() +
				   "data_cadastro: " + cli.getNome() +
				   "tel_fixo: " + cli.getNome() +
				   "tel_celular: " + cli.getNome() +
				   "cep: " + cli.getNome() +
				   "cidade_cod_fk: " + cli.getNome() +
				   "bairro_cod_fk: " + cli.getNome() +
				   "logradouro: " + cli.getNome() +
				   "número: " + cli.getNome() +
				   "complemento: " + cli.getNome() +
				   "UF: " + cli.getNome()
				);
			}
		} catch (NullPointerException | SQLException e) {
			System.out.println(e.getMessage());
		}
	}

}
