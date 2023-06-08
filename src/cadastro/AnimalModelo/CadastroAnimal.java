package cadastro.AnimalModelo;

public abstract class CadastroAnimal {
	private String nomeAnimal;
	private String nomeDono;
	private String raca;
	private String cor;
	private String sexo;
	private String genero;
	private String endereço;
	private int idade;
	private int cpf;
	private float peso;
	
	public CadastroAnimal(String nomeAnimal, String nomeDono, String raca, String cor, String sexo, String genero, int idade, int cpf, float peso) 
	{
		this.nomeAnimal = nomeAnimal;
		this.nomeDono = nomeDono;
		this.raca = raca;
		this.cor = cor;
		this.sexo = sexo;
		this.genero = genero;
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
		return endereço;
	}

	public void setEndereço(String endereço) {
		this.endereço = endereço;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public int getCpf() {
		return cpf;
	}

	public void setCpf(int cpf) {
		this.cpf = cpf;
	}

	public float getPeso() {
		return peso;
	}

	public void setPeso(float peso) {
		this.peso = peso;
	}

	
	
}
