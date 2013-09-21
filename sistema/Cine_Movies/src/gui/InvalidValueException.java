package gui;

public class InvalidValueException extends Error {

	/**
	 * 
	 */
	private static final long serialVersionUID = -5393532446410556187L;

	public InvalidValueException() {
		super("Os seguintes campos são obrigatórios:\n- Emitente\n- CPF\n- Tipo\n- Dat. Nasc.\n- CPF\n- RG\n- Endereço\n- Número\n- Cidade\n-"
				+ "Bairro\n- CEP");		
	}
}