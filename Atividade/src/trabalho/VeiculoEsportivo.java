package trabalho;

public class VeiculoEsportivo extends Veiculo {
	
	  private boolean turbo;

			public VeiculoEsportivo(String cor, String ano, String modelo, double tanqueGasolina, Proprietario proprietario) {
				super(cor, ano, modelo, tanqueGasolina, proprietario);
			}

			public boolean getTurbo() {
				return turbo;
			}

			public void setTurbo(boolean turbo) {
				this.turbo = turbo;
			}

			public void updateGastoTotal() {
		    double gasto = this.getViagem().getGastoCombustivel();
		    double tanque = Math.round(this.getTanqueGasolina() * 100) / 100;

		    if (tanque == 5) {
		      this.setTanqueGasolina(45);
		      this.setAbastecido(true);
		    }

		    if (this.getVelocidadeAtual() <= 80) {
		      //turbo esteja ligado, o gasto de combust�vel � dobrado!
		      double valor = this.getTurbo() ? (0.4 * 2) : 0.4;

		      this.setTanqueGasolina(this.getTanqueGasolina() - 0.4);
		      this.getViagem().setGastoCombustivel(gasto + valor);
		    } else if (this.getVelocidadeAtual() > 80 && this.getVelocidadeAtual() <= 120) {
		      double valor = this.getTurbo() ? (0.3 * 2) : 0.3;

		      this.setTanqueGasolina(this.getTanqueGasolina() - 0.3);
		      this.getViagem().setGastoCombustivel(gasto + valor);
		    } else {
		      double valor = this.getTurbo() ? (0.6 * 2) : 0.6;

		      this.setTanqueGasolina(this.getTanqueGasolina() - 0.6);
		      this.getViagem().setGastoCombustivel(gasto + valor);
		    }
		  }

}
