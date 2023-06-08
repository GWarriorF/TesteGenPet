package cadastro.AnimalModelo;

public abstract class CadastroAnimal {
	private String nome;
	private String raca;
	private String cor;
	private String porte;
	private int idade;
	private float peso;
	
	public CadastroAnimal(String nome, String raca, String cor, String porte, int idade, float peso) 
	{
		this.nome = nome;
		this.raca = raca;
		this.cor = cor;
		this.porte = porte;
		this.idade = idade;
		this.peso = peso;
		
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getRaca() {
		return raca;
	}

	public void setRaca(String raca) {
		this.raca = raca;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public String getPorte() {
		return porte;
	}

	public void setPorte(String porte) {
		this.porte = porte;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public float getPeso() {
		return peso;
	}

	public void setPeso(float peso) {
		this.peso = peso;
	}
	
}
