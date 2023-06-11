package cadastro.menu;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import cadastro.modelo.CadastroAnimal;
import cadastro.modelo.CadastroAnimalCachorro;
import cadastro.modelo.CadastroAnimalGato;

public class metodosThayron implements MenuRepositorio {
	int indiceCadastro = -1;
	float lerFloat, valorTotalDia, valorTotal, valor;
	String lerString;
	int lerInteiro, numero;
	ArrayList<CadastroAnimalCachorro> listaCadastroCachorro = new ArrayList<CadastroAnimalCachorro>();
	ArrayList<CadastroAnimalGato> listaCadastroGato = new ArrayList<CadastroAnimalGato>();

	@Override
	public void cadastrar() {
		Scanner leia = new Scanner(System.in);
		CadastroAnimal ficha = new CadastroAnimal(null, null, null, null, null, null, null, null, 0.0f);

		System.out.print("\nNome Tutor: ");
		lerString = leia.nextLine();
		ficha.setNomeDono(lerString);

		System.out.print("Número do CPF: ");
		lerString = leia.nextLine();
		ficha.setCpf(lerString);

		System.out.print("Endereço: ");
		lerString = leia.nextLine();
		ficha.setEndereco(lerString);

		System.out.print("Nome do Pet: ");
		lerString = leia.nextLine();
		ficha.setNomeAnimal(lerString);

		System.out.print("Cor do Pet: ");
		lerString = leia.nextLine();
		ficha.setCor(lerString);

		System.out.print("Sexo do Pet: ");
		lerString = leia.nextLine();
		ficha.setSexo(lerString);

		System.out.print("Idade do Pet: ");
		lerString = leia.nextLine();
		ficha.setIdade(lerString);

		System.out.print("Peso do Pet: ");
		lerFloat = leia.nextFloat();
		ficha.setPeso(lerFloat);

		System.out.print("Especie do Pet - [Felino] ou [Canino]: ");
		leia.skip("\\R?");
		lerString = leia.nextLine();
		ficha.setEspecie(lerString);

		if (ficha.getEspecie().equalsIgnoreCase("Felino")) {
			CadastroAnimalGato fichaGato = new CadastroAnimalGato(null, null, null, null, null, null, null, null, 0.0f,
					null, null);

			List<String> tipoPelo = CadastroAnimalGato.getTipoPelo();
			System.out.println("\nEscolha o tipo de pelo: \n");
			for (int indice = 0; indice < tipoPelo.size(); indice++) {
				System.out.println((indice + 1) + " - " + tipoPelo.get(indice));
			}

			System.out.print("Escolha o tipo de pelo:");
			lerInteiro = leia.nextInt();
			lerString = tipoPelo.get(lerInteiro - 1);
			fichaGato.setPelo(lerString);

			List<String> racas = CadastroAnimalGato.getRacas();
			System.out.println("\n\t\tRaças de Gatos: \n");
			for (int indice = 0; indice < racas.size(); indice++) {
				int numero = indice + 1;
				String raca = racas.get(indice);
				System.out.println(numero + " - " + raca);
			}

			System.out.print("Escolha o tipo de raça: ");
			lerInteiro = leia.nextInt();
			lerString = racas.get(lerInteiro - 1);
			fichaGato.setRaca(lerString);

			CadastroAnimalGato animalGato = new CadastroAnimalGato(ficha.getNomeDono(), ficha.getEndereco(),
					ficha.getCpf(), ficha.getEspecie(), ficha.getNomeAnimal(), ficha.getCor(), ficha.getSexo(),
					ficha.getIdade(), ficha.getPeso(), fichaGato.getPelo(), fichaGato.getRaca());

			listaCadastroGato.add(animalGato);
			indiceCadastro += 1;
		}

		if (ficha.getEspecie().equalsIgnoreCase("Cachorro")) {
			ArrayList<String> racasCachorro = CadastroAnimalCachorro.getRacaCachorros();
			ArrayList<String> pelosCachorro = CadastroAnimalCachorro.getTipoPeloCachorros();
			CadastroAnimalCachorro fichaCachorro = new CadastroAnimalCachorro(null, null, null, null, null, null, null,
					null, 0.0f, null, null);

			System.out.println("\n*--------*--------*-------*-----*");
			System.out.println("\tTipos de Raças: ");
			System.out.println("*--------*--------*-------*-----*");

			for (int indice1 = 0; indice1 < racasCachorro.size(); indice1++) {
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

			for (int indice2 = 0; indice2 <= pelosCachorro.size(); indice2++) {
				String peloCachorro = pelosCachorro.get(indice2);
				System.out.println("\t" + (indice2 + 1) + " - " + peloCachorro);
			}

			System.out.println("Escolha o tipo de pelo: ");
			lerInteiro = leia.nextInt();
			lerString = pelosCachorro.get(lerInteiro - 1);
			fichaCachorro.setTipoPeloCachorro(lerString);

			CadastroAnimalCachorro animalCachorro = new CadastroAnimalCachorro(ficha.getNomeDono(), ficha.getEndereco(),
					ficha.getCpf(), ficha.getEspecie(), ficha.getNomeAnimal(), ficha.getCor(), ficha.getSexo(),
					ficha.getIdade(), ficha.getPeso(), fichaCachorro.getTipoPeloCachorro(),
					fichaCachorro.getRacaCachorro());

			listaCadastroCachorro.add(animalCachorro);
			indiceCadastro += 1;
		}
	}

	public void printCadastro() {
		Iterator<CadastroAnimalGato> iFichaGato = listaCadastroGato.iterator();
		Iterator<CadastroAnimalCachorro> iFichaCachorro = listaCadastroCachorro.iterator();

		if (iFichaGato.hasNext()) {
			CadastroAnimalGato fichaGato = iFichaGato.next();
			System.out.println("Nome Tutor: " + fichaGato.getNomeDono());
			System.out.println("Cor: " + fichaGato.getCor());
			System.out.println("Sexo: " + fichaGato.getSexo());
			System.out.println("Peso: " + fichaGato.getPeso());
			System.out.println("Espécie: " + fichaGato.getEspecie());
			System.out.println("Endereço: " + fichaGato.getEndereco());
			System.out.println("Idade: " + fichaGato.getIdade());
			System.out.println("Dono CPF: " + fichaGato.getCpf());
			System.out.println("Nome Animal: " + fichaGato.getNomeAnimal());
			System.out.println("Tipo de Pelo: " + fichaGato.getPelo());
			System.out.println("Raça: " + fichaGato.getRaca());
		} else if (iFichaCachorro.hasNext()) {
			CadastroAnimalCachorro fichaCachorro = iFichaCachorro.next();
			System.out.println("Nome Dono: " + fichaCachorro.getNomeDono());
			System.out.println("Cor: " + fichaCachorro.getCor());
			System.out.println("Sexo: " + fichaCachorro.getSexo());
			System.out.println("Peso: " + fichaCachorro.getPeso());
			System.out.println("Espécie: " + fichaCachorro.getEspecie());
			System.out.println("Endereço: " + fichaCachorro.getEndereco());
			System.out.println("Idade: " + fichaCachorro.getIdade());
			System.out.println("Dono CPF: " + fichaCachorro.getCpf());
			System.out.println("Nome Animal: " + fichaCachorro.getNomeAnimal());
			System.out.println("Raça: " + fichaCachorro.getRacaCachorro());
		}
	}

	@Override
	public void listarCadastros() {
		System.out.println("Lista de Cadastros:\n");

		// Listar cadastros de gatos
		System.out.println("-----------------------------");
		System.out.println("         [ Gatos: ]");
		System.out.println("-----------------------------");
		for (CadastroAnimalGato fichaGato : listaCadastroGato) {
			System.out.println("Nome Dono: " + fichaGato.getNomeDono());
			System.out.println("Cor: " + fichaGato.getCor());
			System.out.println("Sexo: " + fichaGato.getSexo());
			System.out.println("Espécie: " + fichaGato.getEspecie());
			System.out.println("Endereço: " + fichaGato.getEndereco());
			System.out.println("Idade: " + fichaGato.getIdade());
			System.out.println("Dono CPF: " + fichaGato.getCpf());
			System.out.println("Nome Animal: " + fichaGato.getNomeAnimal());
			System.out.println("Tipo de Pelo: " + fichaGato.getPelo());
			System.out.println("Peso: " + fichaGato.getPeso());
			System.out.println("Raça: " + fichaGato.getRaca());
			System.out.println("-----------------------------");
		}

		/*
		 * >>>>>>>>>>>> QUANDO O CACHORRO ESTIVER PRONTO <<<<<<<<<<<<<<<<<<<<< // Listar
		 * cadastros de cachorros System.out.println("Cachorros:"); for (CadastroAnimal
		 * ficha : listaCadastro) { System.out.println("Nome Dono: " +
		 * ficha.getNomeDono()); System.out.println("Cor: " + ficha.getCor());
		 * System.out.println("Sexo: " + ficha.getSexo());
		 * System.out.println("Espécie: " + ficha.getEspecie());
		 * System.out.println("Endereço: " + ficha.getEndereco());
		 * System.out.println("Idade: " + ficha.getIdade());
		 * System.out.println("Dono CPF: " + ficha.getCpf());
		 * System.out.println("Nome Animal: " + ficha.getNomeAnimal());
		 * System.out.println("Peso: " + ficha.getPeso());
		 * System.out.println("-----------------------------"); }
		 */
	}

	public void atualizarCadastro() {
	    System.out.println("Escolha um cadastro para tualizar:");
	    System.out.println("----------------------------------");

	    Iterator<CadastroAnimalGato> iFichaGato = listaCadastroGato.iterator();
	    Iterator<CadastroAnimalCachorro> iFichaCachorro = listaCadastroCachorro.iterator();
	    int contador = 1;

	    while (iFichaGato.hasNext()) {
	        System.out.println(contador + ". Pet Gato");
	        CadastroAnimalGato fichaGato = iFichaGato.next();
	        imprimirDadosPet(fichaGato);
	        System.out.println("---------------------");
	        contador++;
	    }

	    while (iFichaCachorro.hasNext()) {
	        System.out.println(contador + ". Pet Cachorro");
	        CadastroAnimalCachorro fichaCachorro = iFichaCachorro.next();
	        imprimirDadosPet(fichaCachorro);
	        System.out.println("---------------------");
	        contador++;
	    }

	    System.out.println("Selecione o número correspondente ao pet que deseja atualizar:");
	    Scanner ler = new Scanner(System.in);
	    int opcao = ler.nextInt();

	    if (opcao >= 1 && opcao <= contador - 1) {
	        int indice = opcao - 1;

	        if (indice < listaCadastroGato.size()) {
	            // Atualizar cadastro de gato
	            CadastroAnimalGato fichaGato = listaCadastroGato.get(indice);
	            atualizarDadosPet(fichaGato);
	        } else {
	            // Atualizar cadastro de cachorro
	            CadastroAnimalCachorro fichaCachorro = listaCadastroCachorro.get(indice - listaCadastroGato.size());
	            atualizarDadosPet(fichaCachorro);
	        }
	    } else {
	        System.out.println("Opção inválida.");
	    }
	}

	public void imprimirDadosPet(CadastroAnimal cadastroAnimal) {
	    System.out.println("Nome Animal: " + cadastroAnimal.getNomeAnimal());
	    System.out.println("Peso: " + cadastroAnimal.getPeso());
	    System.out.println("Nome Dono: " + cadastroAnimal.getNomeDono());
	    System.out.println("Cor: " + cadastroAnimal.getCor());
	    System.out.println("Sexo: " + cadastroAnimal.getSexo());
	    System.out.println("Espécie: " + cadastroAnimal.getEspecie());
	    System.out.println("Endereço: " + cadastroAnimal.getEndereco());
	    System.out.println("Idade: " + cadastroAnimal.getIdade());
	    System.out.println("Dono CPF: " + cadastroAnimal.getCpf());
	    System.out.println("Raça: " + cadastroAnimal.getPeso());
	}

	public void atualizarDadosPet(CadastroAnimal cadastroAnimal) {
	    Scanner scanner = new Scanner(System.in);

	    System.out.println("Atualize os dados do pet: \n");
	    System.out.println("Peso: ");
	    cadastroAnimal.setPeso(scanner.nextFloat());

	    System.out.println("Nome Dono: ");
	    cadastroAnimal.setNomeDono(scanner.nextLine());

	    // Atualize os outros atributos conforme necessário

	    System.out.println("Cadastro atualizado com sucesso!");
	}

	// Método Castrar
	public void castrar() {
		Iterator<CadastroAnimalGato> iFichaGato = listaCadastroGato.iterator();
		Iterator<CadastroAnimalCachorro> iFichaCachorro = listaCadastroCachorro.iterator();

		if (iFichaGato.hasNext()) {
			CadastroAnimalGato fichaGato = iFichaGato.next();
			if (fichaGato.getEspecie().equalsIgnoreCase("Gato")) {
				valor = 400.00f;
				valorTotal += valor;
				valorTotalDia += valorTotal;
			}
		} else if (iFichaCachorro.hasNext()) {
			CadastroAnimal fichaCachorro = iFichaCachorro.next();
			if (fichaCachorro.getEspecie().equalsIgnoreCase("Cachorro")) {
				valor = 900.00f;
				valorTotal += valor;
				valorTotalDia += valorTotal;
			}
		} else {
			System.out.println("Não tratamos essa especie de animal");
		}

	}

	// Método consulta
	@Override
	public void consulta() {
		valor = 200.00f;
		valorTotal += valor;
		valorTotalDia += valorTotal;
	}

	// Método Metodo saída (Adaptar conforme o necessário)
	public void saidaAnimal() {
		System.out.println("Valor total: " + valorTotal);
		valorTotal = 0.0f;
	}

}