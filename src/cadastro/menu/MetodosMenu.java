package cadastro.menu;

import java.util.ArrayList; 
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import cadastro.modelo.CadastroAnimal;
import cadastro.modelo.CadastroAnimalCachorro;
import cadastro.modelo.CadastroAnimalGato;
import procedimentos.Vacina;

public class MetodosMenu 
{	
	//variaveis Uteis
	Scanner leia = new Scanner(System.in);
	int indiceCadastro = -1;
	float lerFloat, valorTotalDia, valorTotal, valor; 
	String lerString;
	
	//Variaveis do Cadastro 
	String nomeTutor, cpf, endereco, nomeAnimal, cor, sexo, idade, especie, pelo, raca; 
	int lerInteiro, numero;
	float peso;
	
	//Listas para guardar os Objetos 
	ArrayList<CadastroAnimalCachorro> listaCadastroCachorro = new ArrayList<CadastroAnimalCachorro>();
	ArrayList<CadastroAnimalGato> listaCadastroGato = new ArrayList<CadastroAnimalGato>();
	
	//Cadastro Animal Geral
	public void cadastrar()
	{
		System.out.println("*--------*--------*-------*-----*");
		System.out.println("       Cadastro do seu pet: ");
		System.out.println("*--------*--------*-------*-----*");
		System.out.print("\nNome tutor: ");
		nomeTutor = leia.nextLine();
		
		System.out.print("Numero do CPF: ");
		cpf = leia.nextLine();
		
		System.out.print("Endereço: ");
		endereco = leia.nextLine();
		
		System.out.print("Nome do animal: ");
		nomeAnimal = leia.nextLine();
		
		System.out.print("Cor do animal: ");
		cor = leia.nextLine();
		
		System.out.print("Sexo do animal: ");
		sexo = leia.nextLine();
		
		System.out.print("Idade do animal: ");
		idade = leia.nextLine();
		
		System.out.print("Peso do animal: ");
		peso = leia.nextFloat();
		
		System.out.print("Especie do animal: ");
		leia.skip("//R?");
		especie = leia.nextLine();
	}
	
	//Cadastro Animal Gato
	public void cadastrarGato() 
	{
			if(especie.equalsIgnoreCase("Gato")) 
			{
				List<String> racas = CadastroAnimalGato.getRacas();
				List<String> tipoPelo = CadastroAnimalGato.getTipoPelo();
				
				System.out.println("\n*--------*--------*-------*-----*");
				System.out.println("\tTipos de Pelo: ");
				System.out.println("*--------*--------*-------*-----*");
				
				for (int indice = 0; indice < tipoPelo.size(); indice++) 
				{
					System.out.println((indice + 1) + " - " + tipoPelo.get(indice));
				}
	        
				System.out.print("\nEscolha o tipo de pelo: ");
				lerInteiro = leia.nextInt();
				pelo = tipoPelo.get(lerInteiro-1);
				
				System.out.println("\n*--------*--------*-------*-----*");
				System.out.println("\tTipos de Raças: ");
				System.out.println("*--------*--------*-------*-----*");
				
				for (int indice = 0; indice < racas.size(); indice++) 
				{
					int numero = indice + 1;
					String raca = racas.get(indice);
					System.out.println(numero + " - " + raca);
				}
				
				System.out.print("\nEscolha o tipo de Raça: ");
				lerInteiro = leia.nextInt();
				raca = racas.get(lerInteiro-1);
			
				CadastroAnimalGato animalGato = new CadastroAnimalGato(nomeTutor, endereco, cpf, especie, nomeAnimal
																	 	,cor, sexo, idade, peso, pelo, raca);
			
			listaCadastroGato.add(animalGato);
			indiceCadastro += 1;
		}
	}
	
	//Cadastro Animal Cachorro
	public void cadastrarCachorro()
{
		if (especie.equalsIgnoreCase("Cachorro")) 
		{
			ArrayList<String> racasCachorro = CadastroAnimalCachorro.getRacaCachorros();
			ArrayList<String> pelosCachorro = CadastroAnimalCachorro.getTipoPeloCachorros();
			
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
			raca = racasCachorro.get(lerInteiro - 1);
			
			System.out.println("\n*--------*--------*-------*-----*");
			System.out.println("\tTipos de Pelo: ");
			System.out.println("*--------*--------*-------*-----*");
			
			for(int indice2 = 0; indice2 < pelosCachorro.size(); indice2++) 
			{
				String peloCachorro = pelosCachorro.get(indice2);
				System.out.println("\t" + (indice2 + 1) + " - " + peloCachorro);
			}
			
			System.out.println("Escolha o tipo de pelo: ");
			lerInteiro = leia.nextInt();
			pelo = pelosCachorro.get(lerInteiro - 1);
			
			CadastroAnimalCachorro animalCachorro = new CadastroAnimalCachorro(nomeTutor, endereco, cpf, especie, 
																	nomeAnimal, cor, sexo, idade, peso, pelo, raca);
			
			listaCadastroCachorro.add(animalCachorro);
			indiceCadastro += 1;
		}
	}
	
	//Print Gato
	public void printCadastroGato() 
	{
		Iterator<CadastroAnimalGato> iFichaGato = listaCadastroGato.iterator();
		
		if(especie.equals("Gato"))
		{
			
			if(iFichaGato.hasNext()) 
			{
				CadastroAnimalGato fichaGato = iFichaGato.next();
				System.out.println("\n*--------*--------*-------*-----*");
				System.out.println("\tDados do seu Pet ");
				System.out.println("*--------*--------*-------*-----*");
				System.out.println("\tPeso: " + fichaGato.getPeso());
				System.out.println("\tNome Tutor: " + fichaGato.getNomeDono());
				System.out.println("\tCor: " + fichaGato.getCor());
				System.out.println("\tSexo: " + fichaGato.getSexo());
				System.out.println("\tEspecie:" + fichaGato.getEspecie());
				System.out.println("\tEndereço:" + fichaGato.getEndereco());
				System.out.println("\tIdade: " + fichaGato.getIdade());
				System.out.println("\tDono Cpf: " + fichaGato.getCpf());
				System.out.println("\tNome Animal:" + fichaGato.getNomeAnimal());
				System.out.println("\tTipo de Pelo " + fichaGato.getPelo());
				System.out.println("\tRaça:" + fichaGato.getRaca());
			}
		}
	}
	
	//Print Cachorro
	public void printCadastroCachorro(){
		
		Iterator<CadastroAnimalCachorro> iFichaCachorro = listaCadastroCachorro.iterator();
		
		if(especie.equalsIgnoreCase("Cachorro")) 
		{	
			if (iFichaCachorro.hasNext()) 
			{
				CadastroAnimalCachorro fichaCachorro = iFichaCachorro.next();
				System.out.println("\n*--------*--------*-------*-----*");
				System.out.println("\tDados do seu Pet ");
				System.out.println("*--------*--------*-------*-----*");
				System.out.println("\nPeso: " + fichaCachorro.getPeso());
				System.out.println("\nNome Dono: " + fichaCachorro.getNomeDono());
				System.out.println("\nCor: " + fichaCachorro.getCor());
				System.out.println("\nSexo: " + fichaCachorro.getSexo());
				System.out.println("\nEspecie:" + fichaCachorro.getEspecie());
				System.out.println("\nEndereço:" + fichaCachorro.getEndereco());
				System.out.println("\nIdade: " + fichaCachorro.getIdade());
				System.out.println("\nDono Cpf: " + fichaCachorro.getCpf());
				System.out.println("\nNome Animal:" + fichaCachorro.getNomeAnimal());
				System.out.println("\nTipo de Pelo " + fichaCachorro.getTipoPeloCachorro());
				System.out.println("\nRaça:" + fichaCachorro.getRacaCachorro());
			}
		}
	}
	
	//Banho Gato Rita
	public void banhoGato()
	{	
		if(especie.equalsIgnoreCase("Gato")) 
		{	
			if(pelo.equalsIgnoreCase("Curto")) 
			{
					valor = 30;
					valorTotal += valor;
					valorTotalDia = valorTotal;
			}else if (pelo.equalsIgnoreCase("Médio"))
			{
					valor = 40;
					valorTotal += valor;
					valorTotalDia = valorTotal;
			}else if (pelo.equalsIgnoreCase("Longo")) {
					valor = 50;
					valorTotal += valor;
					valorTotalDia = valorTotal;
			} else if(pelo.equalsIgnoreCase("Sem pelos")){
					valor = 80;
					valorTotal += valor;
					valorTotalDia = valorTotal;
			}else 
			{
				System.out.println("Tipo de Pelo inválido!");
			}		
			
		}
	}
	
	//Banho Cachorro Rita
	public void banhoCachorro() 
	{
		if(especie.equalsIgnoreCase("Cachorro")) 
		{	
			if(pelo.equalsIgnoreCase("Curto")) 
			{
					valor = 120;
					valorTotal += valor;
					valorTotalDia = valorTotal;
			}else if (pelo.equalsIgnoreCase("Médio"))
			{
					valor = 150;
					valorTotal += valor;
					valorTotalDia = valorTotal;
			}else if (pelo.equalsIgnoreCase("Longo")) {
					valor = 270;
					valorTotal += valor;
					valorTotalDia = valorTotal;
			} else if(pelo.equalsIgnoreCase("Sem pelos"))
			{
					valor = 150;
					valorTotal += valor;
					valorTotalDia = valorTotal;
			}else if(pelo.equalsIgnoreCase("Pelagem Dupla"))
			{
					valor = 180;
					valorTotal += valor;
					valorTotalDia = valorTotal;
			}else if(pelo.equalsIgnoreCase("Pelo Encaracolado"))
			{
					valor = 130;
					valorTotal += valor;
					valorTotalDia = valorTotal;
			}
			
			{
				System.out.println("Tipo de Pelo inválido!");
			}		
			
		}
	}
	
	//Tosa Gato Rita 
	public void tosaGato()
	{
		if(especie.equalsIgnoreCase("Gato")) 
		{	
			if(pelo.equalsIgnoreCase("Curto")) 
			{
					valor = 50;
					valorTotal += valor;
					valorTotalDia = valorTotal;
			}else if (pelo.equalsIgnoreCase("Médio"))
			{
					valor = 60;
					valorTotal += valor;
					valorTotalDia = valorTotal;
			}else if (pelo.equalsIgnoreCase("Longo")) 
			{
					valor = 75;
					valorTotal += valor;
					valorTotalDia = valorTotal;
			}else 
			{
				System.out.println("Tipo de Pelo inválido!");
			}		
			
		}
		
	}
	
	//Vacinar Gato Rita 
	public void vacinarGato() 
	{
		int tipoVacina;
		ArrayList<String> VacinasGato = Vacina.getVacinaGato();
		if(especie.equalsIgnoreCase("Gato")) 
		{
			System.out.println("\n*--------*--------*-------*-----*");
			System.out.println("\tGato Vacinas ");
			System.out.println("*--------*--------*-------*-----*");
			
			for(int indice = 0; indice < VacinasGato.size(); indice++) 
			{
				String vacinaGato = VacinasGato.get(indice + 1);
				System.out.println((indice + 1) + " - " + vacinaGato);
			}
			System.out.print("\nInforme o tipo de vacina: ");
			tipoVacina = leia.nextInt();
			
			switch(tipoVacina){
				case 1:
					valor = 150;
					valorTotal += valor;
					valorTotalDia = valorTotal;
					break;
					
				case 2:
					valor = 100;
					valorTotal += valor;
					valorTotalDia = valorTotal;
					break;
					
				case 3:
					valor = 80;
					valorTotal += valor;
					valorTotalDia = valorTotal;
					break;
					
				case 4:
					valor = 60;
					valorTotal += valor;
					valorTotalDia = valorTotal;
					break;
					
				default: 
					System.out.println("Não trabalhamos com este tipo de vacina!");
					break;
			}
		}
	}
	
	//Vacinar Cachorro Rita 
	public void vacinarCachorro() 
	{
		int tipoVacina;
		ArrayList<String> VacinasCachorro = Vacina.getVacinaCachorro();
		
		 if(especie.equalsIgnoreCase("Cachorro")) 
		 {
			System.out.println("\n*--------*--------*-------*-----*");
			System.out.println("\tCachorro Vacinas ");
			System.out.println("*--------*--------*-------*-----*"); 
			
			for(int indice = 0; indice < VacinasCachorro.size(); indice++) 
			{
				String vacinaCachorro = VacinasCachorro.get(indice + 1);
				System.out.println((indice + 1) + " - " + vacinaCachorro);
			}
			System.out.print("\nInforme o tipo de vacina: ");
			tipoVacina = leia.nextInt();
			
			switch(tipoVacina)
			{
				case 1:
					valor = 150;
					valorTotal += valor;
					valorTotalDia = valorTotal;
					break;
					
				case 2:
					valor = 100;
					valorTotal += valor;
					valorTotalDia = valorTotal;
					break;
						
				case 3:
					valor = 60;
					valorTotal += valor;
					valorTotalDia = valorTotal;
					break;
					
				default: 
					System.out.println("Não trabalhamos com este tipo de vacina!");
					break;
			}
		}
	}
	
	//Tosa Cachorro
 	public void tosaCachorro() 
	{

		if(especie.equalsIgnoreCase("Cachorro")) 
		{	
			if(pelo.equalsIgnoreCase("Curto")) 
			{
					valor = 120;
					valorTotal += valor;
					valorTotalDia = valorTotal;
			}else if (pelo.equalsIgnoreCase("Médio"))
			{
					valor = 180;
					valorTotal += valor;
					valorTotalDia = valorTotal;
			}else if (pelo.equalsIgnoreCase("Longo")) {
					valor = 270;
					valorTotal += valor;
					valorTotalDia = valorTotal;
			}else if(pelo.equalsIgnoreCase("Pelagem Dupla"))
			{
					valor = 130;
					valorTotal += valor;
					valorTotalDia = valorTotal;
			}else if(pelo.equalsIgnoreCase("Pelo Encaracolado"))
			{
					valor = 150;
					valorTotal += valor;
					valorTotalDia = valorTotal;
			}else
			{
				System.out.println("Tipo de Pelo inválido!");
			}		
			
		}
	}
	
	//Castrar Gato Gabi
	public void castrarGato() 
	{
		Iterator<CadastroAnimalGato> iFichaGato = listaCadastroGato.iterator();
			
		if(especie.equalsIgnoreCase("Gato")) 
		{
			if(iFichaGato.hasNext()) 
			{
				CadastroAnimalGato fichaGato = iFichaGato.next();
				if(fichaGato.getEspecie().equalsIgnoreCase("Gato")) 
				{
					valor = 400.00f;
					valorTotal += valor;
					valorTotalDia += valorTotal;
				}else 
				{
				System.out.println("Não tratamos essa especie de animal");
				}
			}
		}
	}
	
	//Castrar Cachorro Gabi
	public void castrarCachorro() 
	{
		Iterator<CadastroAnimalCachorro> iFichaCachorro = listaCadastroCachorro.iterator();
		if (especie.equalsIgnoreCase("Cachorro")) 
		{
			if (iFichaCachorro.hasNext()) 
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
	}
		
	//Consulta Gabi
	public void consulta() 
	{
		valor = 200.00f;
		valorTotal += valor; 
		valorTotalDia += valorTotal;
	}
	
	//Saída Gabi
	public void saidaAnimal() 
	{
		printCadastroGato();
		printCadastroCachorro();
		System.out.println("\tValor total: " + valorTotal); 
		valorTotal = 0.0f; 
		especie = "";
	}
	
}