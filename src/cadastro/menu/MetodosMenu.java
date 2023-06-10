package cadastro.menu;

import java.util.ArrayList; 
import java.util.Iterator;
import java.util.Scanner;
import java.util.List;

import cadastro.modelo.CadastroAnimal;
import cadastro.modelo.CadastroAnimalCachorro;
import cadastro.modelo.CadastroAnimalGato;

public class MetodosMenu 
{	
	int indiceCadastro = -1;
	float lerFloat, valorTotalDia, valorTotal, valor; 
	String lerString;
	int lerInteiro, numero;
	ArrayList<CadastroAnimalCachorro> listaCadastroCachorro = new ArrayList<CadastroAnimalCachorro>();
	ArrayList<CadastroAnimalGato> listaCadastroGato = new ArrayList<CadastroAnimalGato>();
	
	public void cadastrar()
	{
		Scanner leia = new Scanner(System.in);
		CadastroAnimal ficha = new CadastroAnimal(null, null, null, null, null, null, null, null, 0.0f);
			
		System.out.print("\nNome tutor: ");
		lerString = leia.nextLine();
		ficha.setNomeDono(lerString);
		
		System.out.print("Numero do CPF: ");
		lerString = leia.nextLine();
		ficha.setCpf(lerString);
		
		System.out.print("Endereço: ");
		lerString = leia.nextLine();
		ficha.setEndereco(lerString);
		
		System.out.print("Nome do animal: ");
		lerString = leia.nextLine();
		ficha.setNomeAnimal(lerString);
		
		System.out.print("Cor do animal: ");
		lerString = leia.nextLine();
		ficha.setCor(lerString);
		
		System.out.print("Sexo do animal: ");
		lerString = leia.nextLine();
		ficha.setSexo(lerString);
		
		System.out.print("Idade do animal: ");
		lerString = leia.nextLine();
		ficha.setIdade(lerString);
		
		System.out.print("Peso do animal: ");
		lerFloat = leia.nextFloat();
		ficha.setPeso(lerFloat);
	
		System.out.print("Especie do animal: ");
		leia.skip("\\R?");
		lerString = leia.nextLine();
		ficha.setEspecie(lerString);
		
		if (ficha.getEspecie().equalsIgnoreCase("Gato")) 
		{
			CadastroAnimalGato fichaGato = new CadastroAnimalGato(null, null, null, null, null, 
					null, null, null, 0.0f, null, null);
			
			List<String> tipoPelo = CadastroAnimalGato.getTipoPelo();
			System.out.println("\nEscolha o tipo de pelo: \n");
	        for (int indice = 0; indice < tipoPelo.size(); indice++) 
	        {
	            System.out.println((indice + 1) + " - " + tipoPelo.get(indice));
	        }
	        
	        System.out.print("Escolha o tipo de pelo:");
			lerInteiro = leia.nextInt();
			lerString = tipoPelo.get(lerInteiro-1);
			fichaGato.setPelo(lerString);
			
			List<String> racas = CadastroAnimalGato.getRacas();
			System.out.println("\n\t\tRaças de Gatos: \n");
			for (int indice = 0; indice < racas.size(); indice++) 
			{
				int numero = indice + 1;
				String raca = racas.get(indice);
				System.out.println(numero + " - " + raca);
			}
		
			System.out.print("Escolha o tipo de raça: ");
			lerInteiro = leia.nextInt();
			lerString = racas.get(lerInteiro-1);
			fichaGato.setRaca(lerString);
			
			CadastroAnimalGato animalGato = new CadastroAnimalGato(ficha.getNomeDono(), ficha.getEndereco(),
					ficha.getCpf(), ficha.getEspecie(), ficha.getNomeAnimal(), ficha.getCor(),
					ficha.getSexo(), ficha.getIdade(), ficha.getPeso(), fichaGato.getPelo(), 
					fichaGato.getRaca());	
			
			listaCadastroGato.add(animalGato);
			indiceCadastro += 1;
		}
		
		if (ficha.getEspecie().equalsIgnoreCase("Cachorro")) 
		{
			ArrayList<String> racasCachorro = CadastroAnimalCachorro.getRacaCachorros();
			ArrayList<String> pelosCachorro = CadastroAnimalCachorro.getTipoPeloCachorros();
			CadastroAnimalCachorro fichaCachorro = new CadastroAnimalCachorro(null, null, null, null, 
																			null, null, null, null, 0.0f, null, null);
			
			
			System.out.println("\n*--------*--------*-------*-----*");
			System.out.println("\tTipos de Raças: ");
			System.out.println("*--------*--------*-------*-----*");
			
			for(int indice1 = 0; indice1 < racasCachorro.size(); indice1++ ) 
			{
				String racaCachorro = racasCachorro.get(indice1);
				System.out.println("\t" + (indice1 + 1) + " - " + racaCachorro); 
			}
			
			System.out.print("Escolha o tipo de raça: ");
			lerInteiro = leia.nextInt();
			lerString = racasCachorro.get(lerInteiro - 1);
			fichaCachorro.setTipoPeloCachorro(lerString);
			
			
			System.out.println("\n*--------*--------*-------*-----*");
			System.out.println("\tTipos de Pelo: ");
			System.out.println("*--------*--------*-------*-----*");
			
			for(int indice2 = 0; indice2 <= pelosCachorro.size(); indice2++) 
			{
				String peloCachorro = pelosCachorro.get(indice2);
				System.out.println("\t" + (indice2 + 1) + " - " + peloCachorro);
			}
			
			System.out.println("Escolha o tipo de pelo: ");
			lerInteiro = leia.nextInt();
			lerString = pelosCachorro.get(lerInteiro - 1);
			fichaCachorro.setTipoPeloCachorro(lerString);
			
			CadastroAnimalCachorro animalCachorro = new CadastroAnimalCachorro(ficha.getNomeDono(), ficha.getEndereco(),
															ficha.getCpf(), ficha.getEspecie(), ficha.getNomeAnimal(),
															ficha.getCor(),ficha.getSexo(), ficha.getIdade(),
															ficha.getPeso(), fichaCachorro.getTipoPeloCachorro(),
															fichaCachorro.getRacaCachorro());
			
			listaCadastroCachorro.add(animalCachorro);
			indiceCadastro += 1;
		}
	}
	
	//Print feito para testar se está puxando os dados do ultimo cadastro ou não
	public void printCadastro() 
	{
		Iterator<CadastroAnimalGato> iFichaGato = listaCadastroGato.iterator();
		Iterator<CadastroAnimalCachorro> iFichaCachorro = listaCadastroCachorro.iterator();
		
		if(iFichaGato.hasNext()) {
			CadastroAnimalGato fichaGato = iFichaGato.next();
			System.out.println("Peso: " + fichaGato.getPeso());
			System.out.println("Nome Tutor: " + fichaGato.getNomeDono());
			System.out.println("Cor: " + fichaGato.getCor());
			System.out.println("Sexo: " + fichaGato.getSexo());
			System.out.println("Especie:" + fichaGato.getEspecie());
			System.out.println("Endereço:" + fichaGato.getEndereco());
			System.out.println("Idade: " + fichaGato.getIdade());
			System.out.println("Dono Cpf: " + fichaGato.getCpf());
			System.out.println("Nome Animal:" + fichaGato.getNomeAnimal());
			System.out.println("Tipo de Pelo " + fichaGato.getPelo());
			System.out.println("Raça:" + fichaGato.getRaca());
		}else if (iFichaCachorro.hasNext()) 
		{
			CadastroAnimalGato fichaGato = iFichaGato.next();
			System.out.println("Peso: " + fichaGato.getPeso());
			System.out.println("Nome Dono: " + fichaGato.getNomeDono());
			System.out.println("Cor: " + fichaGato.getCor());
			System.out.println("Sexo: " + fichaGato.getSexo());
			System.out.println("Especie:" + fichaGato.getEspecie());
			System.out.println("Endereço:" + fichaGato.getEndereco());
			System.out.println("Idade: " + fichaGato.getIdade());
			System.out.println("Dono Cpf: " + fichaGato.getCpf());
			System.out.println("Nome Animal:" + fichaGato.getNomeAnimal());
			System.out.println("Tipo de Pelo " + fichaGato.getPelo());
			System.out.println("Raça:" + fichaGato.getRaca());
		}
	}
	
	//Método Castrar 
	public void castrar() 
	{
		Iterator<CadastroAnimalGato> iFichaGato = listaCadastroGato.iterator();
		Iterator<CadastroAnimalCachorro> iFichaCachorro = listaCadastroCachorro.iterator();
			
		if(iFichaGato.hasNext()) 
		{
			CadastroAnimalGato fichaGato = iFichaGato.next();
			if(fichaGato.getEspecie().equalsIgnoreCase("Gato")) 
			{
				valor = 400.00f;
				valorTotal += valor;
				valorTotalDia += valorTotal;
			}
		}else if (iFichaCachorro.hasNext()) 
		{
			CadastroAnimal fichaCachorro = iFichaCachorro.next();
			if(fichaCachorro.getEspecie().equalsIgnoreCase("Cachorro")) 
			{
				valor = 900.00f;
				valorTotal += valor;
				valorTotalDia += valorTotal;
			}
		}else 
		{
			System.out.println("Não tratamos essa especie de animal");
		}
			
	}
		
	//Método consulta
	public void consulta() 
	{
		valor = 200.00f;
		valorTotal += valor; 
		valorTotalDia += valorTotal;
	}
	
	//Método Metodo saída (Adaptar conforme o necessário)
	public void saidaAnimal() 
	{
		printCadastro();
		System.out.println("Valor total: " + valorTotal); 
		valorTotal = 0.0f; 
	}
	
}
