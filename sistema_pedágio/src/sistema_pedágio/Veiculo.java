package sistema_pedágio;

public class Veiculo {
	public String placa;
	public String Modelo;
	public int VelocidadeAtual;

	public Veiculo(String placa, String Moedelo, int VelocidadeAtual) throws velocidadeExcedidaException {

		// Atributos [cite: 46]
		if (VelocidadeAtual > 100) {
			throw new velocidadeExcedidaException("Veiculo de placaa" + placa + "exedeu o limite de 100km/h");
		}
		// Construtor: Lança exceção se velocidade > 100
		this.placa = placa;
		this.Modelo = Modelo;
		this.VelocidadeAtual = VelocidadeAtual;
	}

	// Método Concreto: Exibe informações [cite: 48]
	public void exibirInformacoes() {
		System.out.println("Placa: " + this.placa + ", Modelo: " + this.Modelo);
	}

	// Getters para uso em outras classes (opcional, mas recomendado)
	public String getPlaca() {
		return placa;
	}

	public String getModelo() {
		return Modelo;
	}

	public int getVelocidadeAtual() {
		return VelocidadeAtual;
	}

}
