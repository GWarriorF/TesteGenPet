package cadastro.modelo;

import java.util.ArrayList;
import java.util.Scanner;

public class CadastroAnimalCachorro extends CadastroAnimal
{
	
	private String tipoPeloCachorro;
	private String racaCachorro;
	private static ArrayList <String> racaCachorros;
	private static ArrayList <String> tipoPeloCachorros;
	
	public CadastroAnimalCachorro(String nomeDono, String endereco, String cpf, String especie, String nomeAnimal,
					String cor, String sexo, String idade, float peso, String tipoPeloCachorro, String racaCachorro) 
	{
		super(nomeDono, endereco, cpf, especie, nomeAnimal, cor, sexo, idade, peso);
		this.tipoPeloCachorro = tipoPeloCachorro;
		this.racaCachorro = racaCachorro;
	}
	public String getTipoPeloCachorro() 
	{
		return tipoPeloCachorro;
	}
	public void setTipoPeloCachorro(String tipoPeloCachorro) 
	{
		this.tipoPeloCachorro = tipoPeloCachorro;
	}
	
	public String getRacaCachorro() 
	{
		return racaCachorro;
	}
	
	public void setRacaCachorro(String racaCachorro) 
	{
		this.racaCachorro = racaCachorro;
	}
     
	public static ArrayList <String> getRacaCachorros()
	{ 
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

	public static void setRacaCachorro (ArrayList <String> racaCachorros) 
	{
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
	public static void setTipoPeloCachorro(ArrayList <String> tipoPeloCachorros) 
	{
		CadastroAnimalCachorro.tipoPeloCachorros = tipoPeloCachorros;
	}
	
	/*//Metodos Feitos pela Gabi
	public int escolherTipoPelosCachorro()
	{
		Scanner leia = new Scanner(System.in);
		int iCachorro, posicaoCachorro = 0;
		ArrayList<String> pelosCachorro = CadastroAnimalCachorro.getTipoPeloCachorros();
		int lerInteiro; 
		
		System.out.println("\n*--------*--------*-------*-----*");
		System.out.println("\tTipos de Pelo: ");
		System.out.println("*--------*--------*-------*-----*");
		
		for(iCachorro = 0; iCachorro < pelosCachorro.size(); iCachorro++ ) 
		{
			posicaoCachorro = iCachorro + 1;
			String peloCachorro = pelosCachorro.get(posicaoCachorro);
			System.out.println("\t" + posicaoCachorro + " - " + peloCachorro);
		}
		System.out.println("Escolha o tipo de pelo: ");
		lerInteiro = leia.nextInt();
		return lerInteiro;
	}
	
	public String escolherRacasCachorro() 
	{
		Scanner leia = new Scanner(System.in);
		int lerInteiro;
		String lerString; 
		int iCachorro, posicaoCachorro = 0;
		ArrayList<String> racasCachorro = CadastroAnimalCachorro.getRacaCachorros();
		
		System.out.println("\n*--------*--------*-------*-----*");
		System.out.println("\tTipos de Raças: ");
		System.out.println("*--------*--------*-------*-----*");
		
		for(iCachorro = 0; iCachorro < racasCachorro.size(); iCachorro++ ) 
		{
			posicaoCachorro = iCachorro + 1;
			String racaCachorro = racasCachorro.get(posicaoCachorro);
			System.out.println("\t" + posicaoCachorro + " - " + racasCachorro);
		}
		System.out.println("Escolha o tipo de raça: ");
		lerInteiro = leia.nextInt();
		lerString = racasCachorro.get(lerInteiro);
		return lerString;
		
	}*/

}
