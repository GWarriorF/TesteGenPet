package cadastro.menu;

import java.util.ArrayList;
import java.util.Scanner;

import cadastro.modelo.CadastroAnimal;

public class MetodosMenu 
{	
	float saldoTotal, saldo; 
	String lerString;
	int lerInteiro;
	float lerFloat;
	ArrayList<CadastroAnimal> listaCadastro = new ArrayList<CadastroAnimal>();
	
	
	public void cadastrar()
	{
		Scanner leia = new Scanner(System.in);
		CadastroAnimal ficha = new CadastroAnimal(null, null, null, null, null, null, null, null, 0.0f);
		
		System.out.print("\nNome da(o) Dona(o): ");
		lerString = leia.nextLine();
		ficha.setNomeDono(lerString);
		
		System.out.print("\nNumero do CPF: ");
		lerString = leia.nextLine();
		ficha.setCpf(lerString);
		
		System.out.print("\nEndereço: ");
		lerString = leia.nextLine();
		ficha.setEndereco(lerString);
		
		System.out.print("\nNome do animal: ");
		lerString = leia.nextLine();
		ficha.setNomeAnimal(lerString);
		
		System.out.print("\nCor do animal: ");
		lerString = leia.nextLine();
		ficha.setCor(lerString);
		
		System.out.print("\nSexo do animal: ");
		lerString = leia.nextLine();
		ficha.setSexo(lerString);
		
		System.out.print("\nEspecie do animal: ");
		lerString = leia.nextLine();
		ficha.setEspecie(lerString);
		
		System.out.print("\nIdade do animal: ");
		lerString = leia.nextLine();
		ficha.setIdade(lerString);
		
		System.out.print("\nPeso do animal: ");
		lerFloat = leia.nextFloat();
		ficha.setPeso(lerFloat);
		
		CadastroAnimal animalLista = new CadastroAnimal(ficha.getNomeAnimal(), ficha.getNomeDono(), ficha.getCor(), 
				ficha.getSexo(), ficha.getEspecie(),ficha.getEndereco(), ficha.getIdade(), ficha.getCpf(), ficha.getPeso());
		
		listaCadastro.add(animalLista);
		
		leia.close();
	}
	
	//Rrumando os erros
	/*public void castrar()
	{
		if(getEspecie().equalsIgnoreCase("Gato")) 
		{
			saldo = 400.00f;
			saldoTotal += saldo;
		} else if (getEspecie().equalsIgnoreCase("Cachorro")) 
		{
			saldo = 900.00f;
			saldoTotal += saldo;
		}else 
		{
			System.out.println("Não tratamos essa especie de animal");
		}	
	
	}
	
	public void consulta() 
	{
		saldo = 200.00f;
		saldoTotal += saldo; 
	}
	
	public void saidaAnimal() 
	{
		System.out.println("Valor total: " + saldoTotal); 
	}

	
	
	/*public void tiposEspecie(CadastroAnimal animal) 
	{
		Scanner leia = new Scanner(System.in);
		if (getEspecie().equalsIgnoreCase("Cachorro")) 
		{
			
			animal = CadastroAnimalCachorro();
			listaCadastro.add(animal);
		}
		
		if (getEspecie().equalsIgnoreCase("Gato"))
		{
			System.out.println("Raças de Gatos:");
			for (int conta = 0; conta < racas.size(); conta++) 
			{
				int numero = conta + 1;
				String raca = racas.get(conta);
				System.out.println(numero + " - " + raca);
			}
			
			System.out.print("\nRaça do gato: ");
			leia.skip("\\R");
			lerString = leia.next();
			lerInteiro -= 1;
			setRaca(LerString);
			
			animal = CadastroAnimalGato("", "", "", "", "", "", 5, "", 20, "", "" );
			listaCadastro.add(animal);
		}
		
	}*/
	
	
}
