package dao;

import java.sql.SQLException;

import pojo.modelo.Cliente;
import pojo.repositorio.RepositorioClientesDE;

public interface ClienteDAO {
	String TUDO = "SELECT * FROM cliente";
	String POR_CODIGO = "SELECT * FROM cliente WHERE cod = ?";
	String POR_NOME = "SELECT * FROM cliente WHERE nome = '?'";
	String POR_NOME_PARECIDO = "SELECT * FROM cliente WHERE nome LIKE '%?%'";
	String INSERIR = "INSERT INTO cliente(nome,cpf,rg,sexo,data_nascimento,data_cadastro,email,telefone_fixo,"
			+ "telefone_celular,cep,cidade_cod,bairro_cod,logradouro,numero,UF) VALUES(?,?,?,?,?,?,?,"
			+ "?,?,?,?,?,?,?,?)";
	RepositorioClientesDE getTodosOsClientes() throws SQLException;
	Cliente getClientePorCodigo(int codigo) throws SQLException;
	Cliente getClientePorNome(String nome) throws SQLException;
	Cliente getClientePorNomeParecidoCom(String nome) throws SQLException;
}