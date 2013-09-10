package pojo;
/** Representa uma conta de um cliente. */
public class Conta {
	/** Código da conta. */
	int cod;
	/** Código do cliente a qual esta conta pertence. */
	int codigo_cliente;
	/** Saldo na conta. */
	double saldo;
	/** Inicializa uma nova conta apartir do bd. */
	public Conta(int cod, int codigo_cliente, double saldo) {
		this.cod = cod;
		this.codigo_cliente = codigo_cliente;
		this.saldo = saldo;
	}
	/** Inicializa uma nova conta. */
	public Conta(int codigo_cliente,double saldo) {
		this.saldo = saldo;
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
	 * @return the codigo_cliente
	 */
	public int getCodigo_cliente() {
		return codigo_cliente;
	}
	/**
	 * @param codigo_cliente the codigo_cliente to set
	 */
	public void setCodigo_cliente(int codigo_cliente) {
		this.codigo_cliente = codigo_cliente;
	}
	/**
	 * @return the saldo
	 */
	public double getSaldo() {
		return saldo;
	}
	/**
	 * @param saldo the saldo to set
	 */
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
}