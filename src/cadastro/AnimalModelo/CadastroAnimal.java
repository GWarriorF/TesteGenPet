package cadastro.AnimalModelo;

public abstract class CadastroAnimal {
	private String nomeAnimal;
	private String nomeDono;
	private String cor;
	private String sexo;
	private String especie;
<<<<<<< HEAD
	private String endereço;
=======
	private String endereco;
>>>>>>> a3d6455116d61c1662bdbd06d58ae251532b366a
	private int idade;
	private String cpf;
	private float peso;
	
<<<<<<< HEAD
	public CadastroAnimal(String nomeAnimal, String nomeDono, String cor, String sexo, String especie, int idade, String cpf, float peso) 
	{
=======
	public CadastroAnimal(String nomeAnimal, String nomeDono, String cor, String sexo, String especie, String endereco,
			int idade, String cpf, float peso) {
>>>>>>> a3d6455116d61c1662bdbd06d58ae251532b366a
		this.nomeAnimal = nomeAnimal;
		this.nomeDono = nomeDono;
		this.cor = cor;
		this.sexo = sexo;
		this.especie = especie;
<<<<<<< HEAD
=======
		this.endereco = endereco;
>>>>>>> a3d6455116d61c1662bdbd06d58ae251532b366a
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

<<<<<<< HEAD
	public String getEndereço() {
		return endereço;
	}

	public void setEndereço(String endereço) {
		this.endereço = endereço;
=======
	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
>>>>>>> a3d6455116d61c1662bdbd06d58ae251532b366a
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
