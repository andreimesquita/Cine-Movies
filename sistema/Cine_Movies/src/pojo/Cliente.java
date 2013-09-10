package pojo;

import java.sql.Date;
/** Representa um registro na tabela 'Cliente' no banco de dados. */
public class Cliente {
	/** Código do Cliente. */
	private int codigo;
	/** Nome do Cliente. */
	private String nome;
	/** CPF do Cliente. */
	private String cpf;
	/** RG do Cliente. */
	private String rg;
	/** Sexo do Cliente. */
	private String sexo;
	/** Data de nascimento do Cliente. */
	private Date data_nascimento;
	/** Data de cadastro do Cliente. */
	private Date data_cadastro;
	/** Telefone fixo do Cliente. */
	private String telefone_fixo;
	/** Telefone celular do Cliente. */
	private String telefone_celular;
	/** CEP do Cliente. */
	private String cep;
	/** Logradouro do Cliente. */
	private String logradouro;
	/** Número na Rua, Avenida, etc. */
	private int numero;
	/** Complemento do Logradouro. */
	private String complemento;
	/** Para a inicialização de um novo cliente vindo do banco de dados. */
	public Cliente(int codigo, String nome, String cpf, String rg, String sexo,
			Date data_nascimento, Date data_cadastro, String tel_fixo,
			String telefone_celular, String cep, String logradouro, int numero,
			String complemento) {
		this.codigo = codigo;
		this.nome = nome;
		this.cpf = cpf;
		this.rg = rg;
		this.sexo = sexo;
		this.data_nascimento = data_nascimento;
		this.data_cadastro = data_cadastro;
		this.telefone_fixo = tel_fixo;
		this.telefone_celular = telefone_celular;
		this.cep = cep;
		this.logradouro = logradouro;
		this.numero = numero;
		this.complemento = complemento;
	}
	/** Para a criação de um novo cliente. */
	public Cliente(String nome, String cpf, String rg, String sexo,
			Date data_nascimento, Date data_cadastro, String tel_fixo,
			String telefone_celular, String cep, String logradouro, int numero,
			String complemento, String UF) {
		this.nome = nome;
		this.cpf = cpf;
		this.rg = rg;
		this.sexo = sexo;
		this.data_nascimento = data_nascimento;
		this.data_cadastro = data_cadastro;
		this.telefone_fixo = tel_fixo;
		this.telefone_celular = telefone_celular;
		this.cep = cep;
		this.logradouro = logradouro;
		this.numero = numero;
		this.complemento = complemento;
	}

	/**
	 * @return the codigo
	 */
	public int getCodigo() {
		return codigo;
	}

	/**
	 * @return the nome
	 */
	public String getNome() {
		return nome;
	}

	/**
	 * @return the cpf
	 */
	public String getCpf() {
		return cpf;
	}

	/**
	 * @return the rg
	 */
	public String getRg() {
		return rg;
	}

	/**
	 * @return the sexo
	 */
	public String getSexo() {
		return sexo;
	}

	/**
	 * @return the data_nascimento
	 */
	public Date getData_nascimento() {
		return data_nascimento;
	}

	/**
	 * @return the data_cadastro
	 */
	public Date getData_cadastro() {
		return data_cadastro;
	}

	/**
	 * @return the telefone_fixo
	 */
	public String getTelefone_fixo() {
		return telefone_fixo;
	}

	/**
	 * @return the telefone_celular
	 */
	public String getTelefone_celular() {
		return telefone_celular;
	}

	/**
	 * @return the cep
	 */
	public String getCep() {
		return cep;
	}

	/**
	 * @return the logradouro
	 */
	public String getLogradouro() {
		return logradouro;
	}

	/**
	 * @return the numero
	 */
	public int getNumero() {
		return numero;
	}

	/**
	 * @return the complemento
	 */
	public String getComplemento() {
		return complemento;
	}
}