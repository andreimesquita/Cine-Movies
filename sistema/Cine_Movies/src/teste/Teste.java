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
				if (cli.hasPrevious())
				{
					System.out.println("TEM ANTERIOR!");
				} else {
					System.out.println("NÃO TEM ANTERIOR!");
				}
				System.out.println();
				System.out.println
				( 
				   "Cliente " + x + ":\n" + 
				   "Código: " + cli.getCodigo() + "\n" +
				   "Nome: " + cli.getNome() + "\n" +
				   "CPF: " + cli.getCpf() + "\n" +
				   "RG: " + cli.getRg() + "\n" +
				   "Sexo: " + cli.getSexo() + "\n" +
				   "data_nascimento: " + cli.getData_nascimento() + "\n" +
				   "data_cadastro: " + cli.getData_cadastro() + "\n" +
				   "tel_fixo: " + cli.getTel_fixo() + "\n" + 
				   "tel_celular: " + cli.getTel_celular() + "\n" +
				   "cep: " + cli.getCep() + "\n" +
				   "cidade_cod_fk: " + cli.getCidade_cod_fk() + "\n" +
				   "bairro_cod_fk: " + cli.getBairro_cod_fk() + "\n" +
				   "logradouro: " + cli.getLogradouro() + "\n" +
				   "número: " + cli.getNumero() + "\n" +
				   "complemento: " + cli.getComplemento() + "\n" +
				   "UF: " + cli.getUF() + "\n"
				);
				System.out.println();
				if (cli.hasNext())
				{
					System.out.println("TEM PRÓXIMO!");
				} else {
					System.out.println("NÃO TEM PRÓXIMO!");
				}
				System.out.println();
			}
		} catch (NullPointerException | SQLException e) {
			System.out.println(e.getMessage());
		}
	}

}
