package sistema_pedágio;

public class viatura extends Veiculo {

	// Atributo extra [cite: 60]
	private String tipo; // Ex: "Polícia", "Bombeiro", "Ambulância"

	public viatura(String placa, String Modelo, int VelocidadeAtual, String tipo) throws velocidadeExcedidaException {
		super(placa, Modelo, VelocidadeAtual);
		this.tipo = tipo;
	}

	// Opcional: Getter
	public String getTipo() {
		return tipo;
	}
}
