package trabalho;

public class Proprietario {
	  private int idade;
	  private String nome;

	  public Proprietario(int idade, String nome)
	  {
	    this.idade = idade;
	    this.nome = nome;
	  }

	  public int getIdade()
	  {
	    return idade;
	  }

	  public void setIdade(int idade)
	  {
	    this.idade = idade;
	  }

	  public String getNome()
	  {
	    return nome;
	  }

	  public void setNome(String nome)
	  {
	    this.nome = nome;
	  }
}