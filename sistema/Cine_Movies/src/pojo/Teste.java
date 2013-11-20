package pojo;

import dao.ClienteDAO;

public class Teste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClienteDAO cdao = new ClienteDAO();
		Cliente c = new Cliente("Ândrei", "85159265458", "8105547458", "5132484125", "5181859532", 
			"91751831", "Avenida da Cavalhada", "5250", "Bloco Itapoã, Ap. 318", "Porto Alegre", 
			"Cavalhada", 'F', "andreirs@outlook.com");
		cdao.inserirCliente(c);
	}

}
