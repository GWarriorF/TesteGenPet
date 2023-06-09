package cadastro.modelo;

public class CadastroAnimal {
	private String nomeAnimal;
	private String cor;
	private String sexo;
	private int idade;
	private float peso;
	
	public CadastroAnimal(String nomeAnimal, String cor, String sexo,int idade, float peso) 
	{
		this.nomeAnimal = nomeAnimal;
		this.cor = cor;
		this.sexo = sexo;
		this.idade = idade;
		this.peso = peso;
	}

	public String getNomeAnimal() {
		return nomeAnimal;
	}

	public void setNomeAnimal(String nomeAnimal) {
		this.nomeAnimal = nomeAnimal;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
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
