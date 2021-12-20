package Projeto;

	public class Pet4U {


	    private String nome;
	    private String genero;
	    private int idade;

	    public Pet4U  (String nome,String genero,int idade)

	    {
	        this.nome = nome;
	        this.genero = genero;
	        this.idade = idade;

	    }

	       public void imprimirInfo()
	    {
	              System.out.println("O cachorro se chama "+nome+" seu gênero é "+genero+" e tem "+idade+" anos de idade.");

	    }

	    public String getNome() {
	        return nome;
	    }

	    public void setNome(String nome) {
	        nome = nome;
	    }

	    public String getGenero() {
	        return genero;
	    }

	    public void setGenero(String genero) {
	        genero = genero;
	    }

	    public int getIdade() {
	        return idade;
	    }

	    public void setIdade(int idade) {
	        idade = idade;
	    }

	}
	