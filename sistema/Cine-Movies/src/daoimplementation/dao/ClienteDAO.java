package daoimplementation.dao;

import java.util.List;

import bd.ErroDeConexao;
import modelo.Cliente;

public interface ClienteDAO {
	/** Retorna uma lista contendo todos os clientes. */
	List getTodosOsClientes() throws ErroDeConexao;
	/** Retorna uma lista contendo o cliente que tem o nome enviado como par�metro. */
	Cliente getClientePeloNome(String nome) throws ErroDeConexao;
	/** Retorna uma lista contendo o cliente que tem o cpf enviado como par�metro. */
	Cliente getClientePeloCPF(String cpf) throws ErroDeConexao;
}