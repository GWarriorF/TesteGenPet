package cadastro.AnimalModelo;


public abstract class CadastroAnimal {
	private String nomeAnimal;
	private String nomeDono;
	private String cor;
	private String sexo;
	private String especie;
	private String endereco;
	private int idade;
	private String cpf;
	private float peso;
	
	public CadastroAnimal(String nomeAnimal, String nomeDono, String cor, String sexo, String especie, String endereco,
			int idade, String cpf, float peso) {
		this.nomeAnimal = nomeAnimal;
		this.nomeDono = nomeDono;
		this.cor = cor;
		this.sexo = sexo;
		this.especie = especie;
		this.endereco = endereco;
		this.idade = idade;
		this.cpf = cpf;
		this.peso = peso;
	}

	public String getNomeAnimal() {
		return nomeAnimal;
	}

	public void setNomeAnimal(String nomeAnimal) {
		this.nomeAnimal = nomeAnimal;
	}

	public String getNomeDono() {
		return nomeDono;
	}

	public void setNomeDono(String nomeDono) {
		this.nomeDono = nomeDono;
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

	public String getEspecie() {
		return especie;
	}

	public void setEspecie(String especie) {
		this.especie = especie;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public float getPeso() {
		return peso;
	}

	public void setPeso(float peso) {
		this.peso = peso;
	}
	
}
