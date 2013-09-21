package gui;

public class InvalidValueException extends Error {

	/**
	 * 
	 */
	private static final long serialVersionUID = -5393532446410556187L;

	public InvalidValueException() {
		super("Os seguintes campos s�o obrigat�rios:\n- Emitente\n- CPF\n- Tipo\n- Dat. Nasc.\n- CPF\n- RG\n- Endere�o\n- N�mero\n- Cidade\n-"
				+ "Bairro\n- CEP");		
	}
}