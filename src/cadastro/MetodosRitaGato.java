package cadastro;

import java.util.ArrayList;
import java.util.List;

import cadastro.modelo.CadastroAnimalGato;

public class MetodosRitaGato extends CadastroAnimalGato {
	
	public MetodosRitaGato(String nomeAnimal, String nomeDono, String cor, String sexo, String especie, String endereco,
			int idade, String cpf, float peso, int pelo, String raca) {
		super(nomeAnimal, nomeDono, cor, sexo, especie, endereco, idade, cpf, peso, pelo, raca);
		// TODO Auto-generated constructor stub
	}
	
	float valor, valorTotal;
	
	public void banhoGato()
	{
		if(getPelo() == 1)
		{
			valor = 30;
			valorTotal += valor;
		}
		else if(getPelo() == 2)
		{
			valor = 40;
			valorTotal += valor;
		}
		else if(getPelo() == 3)
		{
			valor = 50;
			valorTotal += valor;
		}
	}
	
    
	/*public MetodosRitaGato(float banhoGatoPeloCurto, float banhoGatoPeloLongo, float tosaGatoMaquina,
			float tosaGatoTesoura, float vacinarGatoV5, float vacinarGatoV3, float vacinarGatoRaiva) 
	{
		this.banhoGatoPeloCurto = banhoGatoPeloCurto;
		this.banhoGatoPeloLongo = banhoGatoPeloLongo;
		this.tosaGatoMaquina = tosaGatoMaquina;
		this.tosaGatoTesoura = tosaGatoTesoura;
		this.vacinarGatoV5 = vacinarGatoV5;
		this.vacinarGatoV3 = vacinarGatoV3;
		this.vacinarGatoRaiva = vacinarGatoRaiva;
	}*/


}
