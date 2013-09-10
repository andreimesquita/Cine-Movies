package pojo;
/** Representa um registro na tabela 'Ator' no banco de dados. */
public class Ator {
	/** C�digo do Ator */
	int cod;
	/** Nome do Ator. */
	String nome;
	/** Para inicializa��o dos dados recebidos do banco. */
	public Ator(int cod, String nome) {
		this.cod = cod;
		this.nome = nome;
	}
	/** Para inicializa��o de um novo cliente. */
	public Ator(String nome) {
		this.nome = nome;
	}
	/**
	 * @return the cod
	 */
	public int getCod() {
		return cod;
	}
	/**
	 * @param cod the cod to set
	 */
	public void setCod(int cod) {
		this.cod = cod;
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
}