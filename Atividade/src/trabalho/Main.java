package trabalho;

public class Main {
	
	//DADOS!
	public static void main(String[] args) throws Exception {
		
		// CARRO E DONO
		Proprietario proprietarioJoao = new Proprietario(20, "Joao");
		Proprietario proprietarioPedro = new Proprietario(40, "Pedro");
		Veiculo veiculoJoao = new Veiculo("Branco", "2002", "GOL", 45, proprietarioJoao);
		VeiculoEsportivo veiculoPedro = new VeiculoEsportivo("Vermelho", "2018", "GOLF", 35, proprietarioPedro);
		
		// ROTA
		veiculoJoao.initializeViagem("Florianopolis", "Joinville", 250);
		veiculoPedro.initializeViagem("Florianopolis", "Joinville", 250);

		while (veiculoJoao.getViagem().getDistanciaPercorrida() < veiculoJoao.getViagem().getDistanciaTotal()) {
			int distanciaPercorria = veiculoJoao.getViagem().getDistanciaPercorrida();

			if (distanciaPercorria <= 50) {
				veiculoJoao.setVelocidadeAtual(80);
			} else if (distanciaPercorria > 80 && distanciaPercorria <= 150) {
				veiculoJoao.setVelocidadeAtual(130);
			} else {
				veiculoJoao.setVelocidadeAtual(100);
			}
			
			// UPDATE VEICULO DO JOAO
			veiculoJoao.updateGastoTotal();
			veiculoJoao.getViagem().setDistanciaPercorrida(distanciaPercorria + 1);
		}

		while (veiculoPedro.getViagem().getDistanciaPercorrida() < veiculoPedro.getViagem().getDistanciaTotal()) {
			int distanciaPercorria = veiculoPedro.getViagem().getDistanciaPercorrida();

			if (distanciaPercorria <= 50) {
				veiculoPedro.setVelocidadeAtual(80);
			} else if (distanciaPercorria > 80 && distanciaPercorria <= 150) {
				veiculoPedro.setVelocidadeAtual(150);
			} else {
				veiculoPedro.setVelocidadeAtual(110);
			}

			if (distanciaPercorria >= 100) {
				veiculoPedro.setTurbo(true);
			}

			veiculoPedro.updateGastoTotal();
			veiculoPedro.getViagem().setDistanciaPercorrida(distanciaPercorria + 1);
		}

		veiculoJoao.printDados();
		veiculoPedro.printDados();
	}

}
