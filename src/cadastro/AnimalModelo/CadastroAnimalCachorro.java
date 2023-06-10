package cadastro.AnimalModelo;

import java.util.ArrayList;

import cadastro.modelo.CadastroAnimal;

public class CadastroAnimalCachorro extends CadastroAnimal{

private int tipoPeloCachorro;
private String racaCachorro;
private static ArrayList <String> racaCachorros;
private static ArrayList <String> tipoPeloCachorros;

public CadastroAnimalCachorro(String nomeDono, String endereco, String cpf, String especie, String nomeAnimal,
		String cor, String sexo, String idade, float peso, int tipoPeloCachorro, String racaCachorro) {
	super(nomeDono, endereco, cpf, especie, nomeAnimal, cor, sexo, idade, peso);
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
     
public static ArrayList <String> getRacaCachorros(){ 
     ArrayList <String> racaCachorros = new ArrayList <String>();
     racaCachorros.add("Labrador");
     racaCachorros.add("Golden Retriever");
     racaCachorros.add("Bulldog Francês");
     racaCachorros.add("Poodle");
     racaCachorros.add("Pintcher");
     racaCachorros.add("Shih-Tzu");
     racaCachorros.add("Pastor Alemão");
     racaCachorros.add("Maltês");
     return racaCachorros;
}

public static void setRacaCachorro (ArrayList <String> racaCachorros) {
	 CadastroAnimalCachorro.racaCachorros = racaCachorros;
}
public static ArrayList <String> getTipoPeloCachorros(){ 
	ArrayList <String> tipoPeloCachorros = new ArrayList <String>();
	tipoPeloCachorros.add("Pelo longo");
    tipoPeloCachorros.add("Pelo curto");
    tipoPeloCachorros.add("Pelo Médio");
    tipoPeloCachorros.add("Pelagem Dupla");
    tipoPeloCachorros.add("Pelo Encaracolado");
    tipoPeloCachorros.add("Sem pelo");
    return tipoPeloCachorros;

}
public static void setTipoPeloCachorro(ArrayList <String> tipoPeloCachorros) {
	CadastroAnimalCachorro.tipoPeloCachorros = tipoPeloCachorros;
}

}


