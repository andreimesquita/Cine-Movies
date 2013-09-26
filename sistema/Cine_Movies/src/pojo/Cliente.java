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
	private String tipo;
	/** Data de nascimento do Cliente. */
	private String data_nascimento;
	/** Data de cadastro do Cliente. */
	private String data_cadastro;
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
	private String cidade;
	private String bairro;
	private String email;
	/** Para a inicialização de um novo cliente vindo do banco de dados. */
	public Cliente(int codigo, String nome, String cpf, String rg,
			String data_nascimento, String data_cadastro, String tel_fixo,
			String telefone_celular, String cep, String logradouro, int numero,
			String complemento,String cidade,String bairro,String tipo,String email) {
		this.codigo = codigo;
		this.nome = nome;
		this.cpf = cpf;
		this.rg = rg;
		this.data_nascimento = data_nascimento;
		this.data_cadastro = data_cadastro;
		this.telefone_fixo = tel_fixo;
		this.telefone_celular = telefone_celular;
		this.cep = cep;
		this.email = email;
		this.logradouro = logradouro;
		this.numero = numero;
		this.complemento = complemento;
		this.cidade = cidade;
		this.bairro = bairro;
		this.tipo = tipo;
	}
	/** Para a criação de um novo cliente. */
	public Cliente(String nome, String cpf, String rg,String data_nascimento,
			String data_cadastro, String tel_fixo,String telefone_celular, 
			String cep, String logradouro, int numero,
			String complemento,String cidade,String bairro,String tipo,String email) {
		this.nome = nome;
		this.cpf = cpf;
		this.rg = rg;
		this.data_nascimento = data_nascimento;
		this.data_cadastro = data_cadastro;
		this.email = email;
		this.telefone_fixo = tel_fixo;
		this.telefone_celular = telefone_celular;
		this.cep = cep;
		this.logradouro = logradouro;
		this.numero = numero;
		this.complemento = complemento;
		this.cidade = cidade;
		this.bairro = bairro;
		this.tipo = tipo;
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
	 * @return the data_nascimento
	 */
	public String getData_nascimento() {
		return data_nascimento;
	}

	/**
	 * @return the data_cadastro
	 */
	public String getData_cadastro() {
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
	
	/**
	 * @return the cidade
	 */
	public String getCidade() {
		return cidade;
	}
	/**
	 * @param cidade the cidade to set
	 */
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	/**
	 * @return the bairro
	 */
	public String getBairro() {
		return bairro;
	}
	/**
	 * @param bairro the bairro to set
	 */
	public void setBairro(String bairro) {
		this.bairro = bairro;
	}
	/**
	 * @return the tipo
	 */
	public String getTipo() {
		return tipo;
	}
	/**
	 * @param tipo the tipo to set
	 */
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}
	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("[codigo =" + codigo + ", nome =" + nome + " cpf=" + cpf + " rg=" + rg + " cep=" + cep + " logradouro="
		+ logradouro + " numero=" + numero + " complemento=" + complemento + " telefone_fixo=" + telefone_fixo + " telefone_celular=" 
		+ telefone_celular + "]"
		);
		return sb.toString();
	}
}