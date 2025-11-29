package sistema_pedágio;

import java.util.ArrayList;
import java.util.List;

public class simulador_paga {

	public static void main(String[] args) {

		// 1. Cria a lista de Veiculos [cite: 62]
		List<Veiculo> filaPedagio = new ArrayList<>();
		double totalArrecado = 0.0;

		// 2. Adiciona veículos à fila (Bloco try-catch para lidar com a Exceção)
		try {
			filaPedagio.add(new carro("AAA-1111", "Fiat Uno", 80));
			filaPedagio.add(new caminhao("BBB-2222", "Volvo FH16", 95, 4));
			filaPedagio.add(new viatura("CCC-3333", "Renault Duster", 100, "Polícia"));
			filaPedagio.add(new caminhao("DDD-4444", "Scania R620", 85, 6));

			// Este deve LANÇAR a exceção!
			// filaPedagio.add(new Carro("EEE-5555", "Ferrari F40", 110));

		} catch (velocidadeExcedidaException e) {
			System.err.println("Alerta de Velocidade! " + e.getMessage());
		}
		System.out.println("=== Inicio da Cobrança de Pedágio ===");

		// 3. Percorre a lista para cobrar o pedágio [cite: 63]
		for (Veiculo veiculo : filaPedagio) {

			System.out.print("Processando Veiculo (" + veiculo.getPlaca() + "," + veiculo.getModelo() + "):");

			// Verifica se o veículo implementa a interface Pagavel
			if (veiculo instanceof pagavel) {

				// Faz o casting seguro para a interface Pagavel
				pagavel pagavel = (pagavel) veiculo;

				double tarifa = pagavel.calcularTarifa();
				totalArrecado += tarifa;

				System.out.printf("Tarifa cobrada: R$ %.2f\n", tarifa);
			} else {
				// Se não implementa Pagavel, é isento (ex: Viatura)
				System.out.println("Insento de Tarifa");
			}
		}
		System.out.println("--------------");
		System.out.printf("Total Arrecado: R$ d%.2f\n", totalArrecado);
		System.out.println("=== Fim da Cobrança ===");
	}
}
