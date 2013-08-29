package dao;

import java.sql.SQLException;

import pojo.repositorio.RepositorioClientesDE;
import pojo.repositorio.modelo.Cliente;

public interface ClienteDAO {
	String TUDO = "SELECT * FROM cliente";
	String POR_CODIGO = "SELECT * FROM cliente WHERE cod = ?";
	String POR_NOME = "SELECT * FROM cliente WHERE nome = '?'";
	String POR_NOME_PARECIDO = "SELECT * FROM cliente WHERE nome LIKE '%?%'";
	String INSERIR = "INSERT INTO cliente(nome,cpf,rg,sexo,data_nascimento,data_cadastro,tel_fixo,"
			+ "tel_celular,cep,cidade_cod_fk,bairro_cod_fk,logradouro,numero,UF) VALUES(?,?,?,?,?,?,"
			+ "?,?,?,?,?,?,?,?)";
	RepositorioClientesDE getTodosOsClientes() throws SQLException;
	Cliente getClientePorCodigo(int codigo) throws SQLException;
	Cliente getClientePorNome(String nome) throws SQLException;
	Cliente getClientePorNomeParecidoCom(String nome) throws SQLException;
}