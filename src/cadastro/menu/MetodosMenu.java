package cadastro.menu;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import cadastro.AnimalModelo.CadastroAnimal;
import cadastro.AnimalModelo.CadastroAnimalCachorro;
import cadastro.AnimalModelo.CadastroAnimalGato;

public class MetodosMenu extends CadastroAnimal
{
	String lerString;
	int lerInteiro;
	float lerFloat;
	List<String> racas = CadastroAnimalGato.getRacas();
	ArrayList<CadastroAnimal> listaCadastro = new ArrayList<CadastroAnimal>();
	
	public MetodosMenu(String nomeAnimal, String nomeDono, String cor, String sexo, String especie, String endereco,
			int idade, String cpf, float peso) {
		super(nomeAnimal, nomeDono, cor, sexo, especie, endereco, idade, cpf, peso);
		// TODO Auto-generated constructor stub
	} 

		
	public void cadastrarAnimal() 
	{
		Scanner leia = new Scanner(System.in);
		System.out.print("\nNome da(o) Dona(o): ");
		leia.skip("\\R");
		lerString = leia.nextLine();
		setNomeDono(lerString);
		
		System.out.print("\nNumero do CPF: ");
		leia.skip("\\R");
		lerInteiro = leia.nextInt();
		setCpf(lerString);
		
		System.out.print("\nEndereço: ");
		leia.skip("\\R");
		lerString = leia.nextLine();
		setEndereco(lerString);
		
		System.out.print("\nNome do animal: ");
		leia.skip("\\R");
		lerString = leia.nextLine();
		setNomeAnimal(lerString);
		
		System.out.print("\nCor do animal: ");
		leia.skip("\\R");
		lerString = leia.nextLine();
		setCor(lerString);
		
		System.out.print("\nSexo do animal: ");
		leia.skip("\\R");
		lerString = leia.nextLine();
		setSexo(lerString);
		
		System.out.print("\nEspecie do animal: ");
		leia.skip("\\R");
		lerString = leia.nextLine();
		setEspecie(lerString);
		
		System.out.print("\nIdade do animal: ");
		leia.skip("\\R");
		lerInteiro = leia.nextInt();
		setIdade(lerInteiro);
		
		System.out.print("\nPeso do animal: ");
		leia.skip("\\R");
		lerFloat = leia.nextFloat();
		setPeso(lerFloat);
		
		leia.close();

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
