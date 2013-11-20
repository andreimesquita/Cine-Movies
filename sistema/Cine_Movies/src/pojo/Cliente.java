package pojo;

import javax.persistence.Table;

import org.hibernate.annotations.Columns;


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
	/** Tipo do cliente (A = autorizado; F = Funcionário; C = Cliente) */
	private char tipo;
	/** Telefone fixo do Cliente. */
	private String tel_fixo;
	/** Telefone celular do Cliente. */
	private String tel_celular;
	/** CEP do Cliente. */
	private String cep;
	/** Logradouro do Cliente. */
	private String logradouro;
	/** Número na Rua, Avenida, etc. */
	private String numero;
	/** Complemento do Logradouro. */
	private String complemento;
	private String cidade;
	private String bairro;
	private String email;
	private int cliente_sup;
	/** Para a inicialização de um novo cliente vindo do banco de dados. */
	public Cliente(int codigo, String nome, String cpf, String rg,
			 String tel_fixo, String telefone_celular, String cep, String logradouro,
			 String numero, String complemento,String cidade,String bairro,
			 char tipo,String email) {
		this.codigo = codigo;
		this.nome = nome;
		this.cpf = cpf;
		this.rg = rg;
		this.tel_fixo = tel_fixo;
		this.tel_celular = telefone_celular;
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
	public Cliente(String nome, String cpf, String rg,
			String tel_fixo,String telefone_celular, 
			String cep, String logradouro, String numero,
			String complemento,String cidade,String bairro,char tipo,
			String email) {
		this.nome = nome;
		this.cpf = cpf;
		this.rg = rg;
		this.email = email;
		this.tel_fixo = tel_fixo;
		this.tel_celular = telefone_celular;
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
	public String getNumero() {
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
	public char getTipo() {
		return tipo;
	}
	/**
	 * @param tipo the tipo to set
	 */
	public void setTipo(char tipo) {
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
	/**
	 * @return the cliente_sup
	 */
	public int getCliente_sup() {
		return cliente_sup;
	}
	/**
	 * @param cliente_sup the cliente_sup to set
	 */
	public void setCliente_sup(int cliente_sup) {
		this.cliente_sup = cliente_sup;
	}
	/**
	 * @return the tel_fixo
	 */
	public String getTel_fixo() {
		return tel_fixo;
	}
	/**
	 * @param tel_fixo the tel_fixo to set
	 */
	public void setTel_fixo(String tel_fixo) {
		this.tel_fixo = tel_fixo;
	}
	/**
	 * @return the tel_celular
	 */
	public String getTel_celular() {
		return tel_celular;
	}
	/**
	 * @param tel_celular the tel_celular to set
	 */
	public void setTel_celular(String tel_celular) {
		this.tel_celular = tel_celular;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("[codigo =" + codigo + ", nome =" + nome + " cpf=" + 
		cpf + " rg=" + rg + " cep=" + cep + " logradouro="
		+ logradouro + " numero=" + numero + " complemento=" + 
		complemento + " telefone_fixo=" + tel_fixo + " telefone_celular=" 
		+ tel_celular + "]"
		);
		return sb.toString();
	}
}