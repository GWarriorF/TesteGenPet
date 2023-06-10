package cadastro.AnimalModelo;

public class CadastroAnimalCachorro extends CadastroAnimal{

private int tipoPeloCachorro;
private String racaCachorro;
public CadastroAnimalCachorro(String nomeAnimal, String nomeDono, String cor, String sexo, String especie,
		String endereco, int idade, String cpf, float peso, int tipoPeloCachorro, String racaCachorro) {
	super(nomeAnimal, nomeDono, cor, sexo, especie, endereco, idade, cpf, peso);
	this.tipoPeloCachorro = tipoPeloCachorro;
	this.racaCachorro = racaCachorro;
}
public int getTipoPeloCachorro() {
	return tipoPeloCachorro;
}
public void setTipoPeloCachorro(int tipoPeloCachorro) {
	this.tipoPeloCachorro = tipoPeloCachorro;
}
public String getRacaCachorro() {
	return racaCachorro;
}
public void setRacaCachorro(String racaCachorro) {
	this.racaCachorro = racaCachorro;
}


}



