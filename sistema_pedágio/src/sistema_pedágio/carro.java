package sistema_pedágio;

public class carro extends Veiculo implements pagavel {

	// Carro não tem atributos extras além dos de Veiculo
	public carro(String placa, String Modelo, int VelocidadeAtual) throws velocidadeExcedidaException {

		super(placa, Modelo, VelocidadeAtual);
	}

	// Implementação da tarifa [cite: 52]
	public double calcularTarifa() {
		return 7.00;
	}
}
