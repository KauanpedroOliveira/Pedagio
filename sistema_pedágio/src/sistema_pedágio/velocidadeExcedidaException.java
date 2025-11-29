package sistema_pedágio;

@SuppressWarnings("serial")
public class velocidadeExcedidaException extends Exception {

	// Construtor que aceita uma mensagem (opcional)
	public velocidadeExcedidaException(String mensagem) {
		super(mensagem);

	}

	// construtor padrão
	public velocidadeExcedidaException() {
		super("A velocidade e permitida até 100km/h foi estendida");
	}

}
