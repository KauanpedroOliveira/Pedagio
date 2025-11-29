package sistema_pedágio;

public class caminhao extends Veiculo implements pagavel {

	// Atributo extra [cite: 55]
	private int numeroEixos;

	// Implementação da tarifa: R$ 7,00 por eixo [cite: 56]
	public caminhao(String placa, String Modelo, int VelocidadeAtual, int numeroEixos)
			throws velocidadeExcedidaException {
		super(placa, Modelo, VelocidadeAtual);
		this.numeroEixos = numeroEixos;
	}

	public double calcularTarifa() {
		return 7.00 * numeroEixos;
	}

	// Opcional: Getter
	public int getNumeroEixos() {
		return numeroEixos;
	}
}
