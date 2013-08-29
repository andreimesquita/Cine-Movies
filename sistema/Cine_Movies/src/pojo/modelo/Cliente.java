package pojo.modelo;

import java.sql.Date;

public class Cliente {
	private int codigo;
	private String nome;
	private String cpf;
	private String rg;
	private String sexo;
	private Date data_nascimento;
	private Date data_cadastro;
	private String tel_fixo;
	private String tel_celular;
	private String  cep;
	private int cidade_cod_fk;
	private int bairro_cod_fk;
	private String logradouro;
	private int numero;
	private String complemento;
	private String UF;

	private Cliente proximo;
	private Cliente anterior;
	
	public Cliente(int codigo,String nome,String cpf,String rg,String sexo,Date data_nascimento,
			       Date data_cadastro,String tel_fixo,String tel_celular,String  cep,int cidade_cod_fk,
			       int bairro_cod_fk,String logradouro,int numero,String complemento,String UF) {
		this.codigo = codigo;
		this.nome = nome;
		this.cpf = cpf;
		this.rg = rg;
		this.sexo = sexo;
		this.data_nascimento = data_nascimento;
		this.data_cadastro = data_cadastro;
		this.tel_fixo = tel_fixo;
		this.tel_celular = tel_celular;
		this.cep = cep;
		this.cidade_cod_fk = cidade_cod_fk;
		this.bairro_cod_fk = bairro_cod_fk;
		this.logradouro = logradouro;
		this.numero = numero;
		this.complemento = complemento;
		this.UF = UF;
	}
	/** Construct a new client. */
	public Cliente() {
		
	}
	/**
	 * @return the codigo
	 */
	public int getCodigo() {
		return codigo;
	}

	/**
	 * @param codigo the codigo to set
	 */
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	/**
	 * @return the nome
	 */
	public String getNome() {
		return nome;
	}

	/**
	 * @param nome the nome to set
	 */
	public void setNome(String nome) {
		this.nome = nome;
	}

	/**
	 * @return the cpf
	 */
	public String getCpf() {
		return cpf;
	}

	/**
	 * @param cpf the cpf to set
	 */
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	/**
	 * @return the rg
	 */
	public String getRg() {
		return rg;
	}

	/**
	 * @param rg the rg to set
	 */
	public void setRg(String rg) {
		this.rg = rg;
	}

	/**
	 * @return the sexo
	 */
	public String getSexo() {
		return sexo;
	}

	/**
	 * @param sexo the sexo to set
	 */
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	/**
	 * @return the data_nascimento
	 */
	public Date getData_nascimento() {
		return data_nascimento;
	}

	/**
	 * @param data_nascimento the data_nascimento to set
	 */
	public void setData_nascimento(Date data_nascimento) {
		this.data_nascimento = data_nascimento;
	}

	/**
	 * @return the data_cadastro
	 */
	public Date getData_cadastro() {
		return data_cadastro;
	}

	/**
	 * @param data_cadastro the data_cadastro to set
	 */
	public void setData_cadastro(Date data_cadastro) {
		this.data_cadastro = data_cadastro;
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

	/**
	 * @return the cep
	 */
	public String getCep() {
		return cep;
	}

	/**
	 * @param cep the cep to set
	 */
	public void setCep(String cep) {
		this.cep = cep;
	}

	/**
	 * @return the cidade_cod_fk
	 */
	public int getCidade_cod_fk() {
		return cidade_cod_fk;
	}

	/**
	 * @param cidade_cod_fk the cidade_cod_fk to set
	 */
	public void setCidade_cod_fk(int cidade_cod_fk) {
		this.cidade_cod_fk = cidade_cod_fk;
	}

	/**
	 * @return the bairro_cod_fk
	 */
	public int getBairro_cod_fk() {
		return bairro_cod_fk;
	}

	/**
	 * @param bairro_cod_fk the bairro_cod_fk to set
	 */
	public void setBairro_cod_fk(int bairro_cod_fk) {
		this.bairro_cod_fk = bairro_cod_fk;
	}

	/**
	 * @return the logradouro
	 */
	public String getLogradouro() {
		return logradouro;
	}

	/**
	 * @param logradouro the logradouro to set
	 */
	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}

	/**
	 * @return the numero
	 */
	public int getNumero() {
		return numero;
	}

	/**
	 * @param numero the numero to set
	 */
	public void setNumero(int numero) {
		this.numero = numero;
	}

	/**
	 * @return the complemento
	 */
	public String getComplemento() {
		return complemento;
	}

	/**
	 * @param complemento the complemento to set
	 */
	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}

	/**
	 * @return the proximo
	 */
	public Cliente getProximo() {
		return proximo;
	}
	/**
	 * @param proximo the proximo to set
	 */
	public void setProximo(Cliente proximo) {
		this.proximo = proximo;
	}
	/**
	 * @return the anterior
	 */
	public Cliente getAnterior() {
		return anterior;
	}
	/**
	 * @param anterior the anterior to set
	 */
	public void setAnterior(Cliente anterior) {
		this.anterior = anterior;
	}
	/**
	 * @return the uF
	 */
	public String getUF() {
		return UF;
	}
	/**
	 * @param uF the uF to set
	 */
	public void setUF(String uF) {
		UF = uF;
	}
	/** Retorna true se há algum cliente após este. */
	public boolean hasNext()
	{
		if (proximo == null) return false;
		return true;
	}
	/** Retorna true se há algum cliente antes deste. */
	public boolean hasPrevious()
	{
		if (anterior == null) return false;
		return true;
	}
}