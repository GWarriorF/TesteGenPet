package cadastro;

import procedimentos.VacinasAbstract;
import cadastro.modelo.CadastroAnimalGato;

public class MetodosRitaGato extends CadastroAnimalGato {
	
	public MetodosRitaGato(String nomeAnimal, String nomeDono, String cor, String sexo, String especie, String endereco,
			int idade, String cpf, float peso, int pelo, String raca) {
		super(nomeAnimal, nomeDono, cor, sexo, especie, endereco, idade, cpf, peso, pelo, raca);
		
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
		else if(getPelo() == 4)
		{
			valor = 80;
			valorTotal += valor;
		}
		else
		{
			System.out.println("Tipo de Pelo inválido!");
		}
	}
	
	public void tosaGato()
	{
		if(getPelo() == 1)
		{
			valor = 50;
			valorTotal += valor;
		}
		else if(getPelo() == 2)
		{
			valor = 60;
			valorTotal += valor;
		}
		else if(getPelo() == 3)
		{
			valor = 75;
			valorTotal += valor;
		}
		else
		{
			System.out.println("Tipo de Pelo inválido!");
		}
	}
	
	public void vacinaGato()
	{
		
	}

	
}