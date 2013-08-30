package teste;

import java.sql.SQLException;
import java.util.List;

import pojo.Cliente;
import dao.ClienteDAOImpl;

public class Teste {

	public static void main(String[] args) {
		ClienteDAOImpl cd = new ClienteDAOImpl();
		try {
			Cliente c = cd.getClientePorCodigo(4);			
			System.out.println("Cliente recuperado \'" + c.getNome() + "\'");
			c = cd.getClientePorNome("Ândrei");
			System.out.println("Cliente recuperado \'" + c.getNome() + "\'");
			List<Cliente> rc = cd.getTodosOsClientes();
			for (int x = 0; x < rc.size(); x++)
			{
				Cliente cli = rc.get(x);
				
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
				   "tel_fixo: " + cli.getTelefone_fixo() + "\n" + 
				   "tel_celular: " + cli.getTelefone_celular() + "\n" +
				   "cep: " + cli.getCep() + "\n" +
				   "logradouro: " + cli.getLogradouro() + "\n" +
				   "número: " + cli.getNumero() + "\n" +
				   "complemento: " + cli.getComplemento() + "\n" +
				   "UF: " + cli.getUF() + "\n"
				);
				System.out.println();
			}
		} catch (NullPointerException | SQLException e) {
			System.out.println(e.getMessage());
		}
	}

}
