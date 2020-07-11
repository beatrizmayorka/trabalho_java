package trabalho;

public class ViagemCarro {
	
	  // VIAGEM
	  private String destino;
	  private String origem;
	  private int distanciaTotal = 0;
	  private int distanciaPercorrida = 0;
	  private double gastoCombustivel = 0;

	  public ViagemCarro(String destino, String origem, int distanciaTotal) {
		// VIAGEM
	    this.setOrigem(origem);
	    this.setDestino(destino);
	    this.setDistanciaTotal(distanciaTotal);
	  }

	  // SETES
	  public double getGastoCombustivel()
	  {
	    return gastoCombustivel;
	  }

	  public void setGastoCombustivel(double gastoCombustivel)
	  {
	    this.gastoCombustivel = gastoCombustivel;
	  }

	  public int getDistanciaPercorrida()
	  {
	    return distanciaPercorrida;
	  }

	  public void setDistanciaPercorrida(int distanciaPercorrida)
	  {
	    this.distanciaPercorrida = distanciaPercorrida;
	  }

	  public int getDistanciaTotal()
	  {
	    return distanciaTotal;
	  }

	  public void setDistanciaTotal(int distanciaTotal)
	  {
	    this.distanciaTotal = distanciaTotal;
	  }

	  public String getOrigem()
	  {
	    return origem;
	  }

	  public void setOrigem(String origem)
	  {
	    this.origem = origem;
	  }

	  public String getDestino()
	  {
	    return destino;
	  }

	  public void setDestino(String destino)
	  {
	    this.destino = destino;
	  }

}