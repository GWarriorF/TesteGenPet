package cadastro.AnimalModelo;

import java.util.List;

public abstract class CadastroAnimal {
	private String nomeAnimal;
	private String nomeDono;
	private String cor;
	private String sexo;
	private String genero;
	private String endereco;
	private int idade;
	private String cpf;
	private float peso;
	
<<<<<<< HEAD
	public CadastroAnimal(String nomeAnimal, String nomeDono, String cor, String sexo, String genero, String endereco, int idade, String cpf, float peso) 
=======
	public CadastroAnimal(String nomeAnimal, String nomeDono, String cor, String sexo, String genero, int idade, String cpf, float peso) 
>>>>>>> 4b2536d82884b1fae46e245331fd22e119d7c1f9
	{
		this.nomeAnimal = nomeAnimal;
		this.nomeDono = nomeDono;
		this.cor = cor;
		this.sexo = sexo;
		this.genero = genero;
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

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public String getEndereço() {
		return endereco;
	}

	public void setEndereço(String endereço) {
		this.endereco = endereço;
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
