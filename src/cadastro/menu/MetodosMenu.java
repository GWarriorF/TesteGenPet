package cadastro.menu;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import cadastro.modelo.CadastroAnimal;
import cadastro.modelo.CadastroAnimalCachorro;
import cadastro.modelo.CadastroAnimalGato;
import procedimentos.Vacina;

public class MetodosMenu implements MenuRepositorio {
	// variaveis Uteis
	Scanner leia = new Scanner(System.in);
	int indiceCadastro = -1;
	float lerFloat, valorTotalDia, valorTotal, valor;
	String lerString;

	// Variaveis do Cadastro
	String nomeTutor, cpf, endereco, nomeAnimal, cor, sexo, idade, especie, pelo, raca;
	int lerInteiro, numero;
	float peso;

	// Listas para guardar os Objetos
	ArrayList<CadastroAnimalCachorro> listaCadastroCachorro = new ArrayList<CadastroAnimalCachorro>();
	ArrayList<CadastroAnimalGato> listaCadastroGato = new ArrayList<CadastroAnimalGato>();

	// Cadastro Animal Geral
	@Override
	public void cadastrar() {
		System.out.println("*--------*--------*-------*-----*");
		System.out.println("         Cadastrar Pet:          ");
		System.out.println("*--------*--------*-------*-----*");
		System.out.print("\nNome do Tutor: ");
		nomeTutor = leia.nextLine();

		System.out.print("Número do CPF: ");
		cpf = leia.nextLine();

		System.out.print("Endereço: ");
		endereco = leia.nextLine();

		System.out.print("Nome do Pet: ");
		nomeAnimal = leia.nextLine();

		System.out.print("Cor do Pet: ");
		cor = leia.nextLine();

		System.out.print("Sexo do Pet: ");
		sexo = leia.nextLine();

		System.out.print("Idade do Pet: ");
		idade = leia.nextLine();

		System.out.print("Peso do Pet: ");
		peso = leia.nextFloat();

		System.out.print("Especie do Pet [Felino] ou [Canina]: ");
		leia.nextLine();
		especie = leia.nextLine();
	}

	// Cadastro Animal Gato
	@Override
	public void cadastrarGato() {
		if (especie.equalsIgnoreCase("Felino")) {
			List<String> racas = CadastroAnimalGato.getRacas();
			List<String> tipoPelo = CadastroAnimalGato.getTipoPelo();

			System.out.println("\n*--------*--------*-------*-----*");
			System.out.println("\tTipos de Pelo: ");
			System.out.println("*--------*--------*-------*-----*");

			for (int indice = 0; indice < tipoPelo.size(); indice++) {
				System.out.println((indice + 1) + " - " + tipoPelo.get(indice));
			}

			System.out.print("\nEscolha o tipo de pelo: ");
			lerInteiro = leia.nextInt();
			pelo = tipoPelo.get(lerInteiro - 1);

			System.out.println("\n*--------*--------*-------*-----*");
			System.out.println("\tTipos de Raças: ");
			System.out.println("*--------*--------*-------*-----*");

			for (int indice = 0; indice < racas.size(); indice++) {
				int numero = indice + 1;
				String raca = racas.get(indice);
				System.out.println(numero + " - " + raca);
			}

			System.out.print("\nEscolha o tipo de Raça: ");
			lerInteiro = leia.nextInt();
			raca = racas.get(lerInteiro - 1);

			CadastroAnimalGato animalGato = new CadastroAnimalGato(nomeTutor, endereco, cpf, especie, nomeAnimal, cor,
					sexo, idade, peso, pelo, raca);

			listaCadastroGato.add(animalGato);
			indiceCadastro += 1;
		}
	}

	// Cadastro Animal Cachorro
	@Override
	public void cadastrarCachorro() {
		if (especie.equalsIgnoreCase("Canina")) {
			ArrayList<String> racasCachorro = CadastroAnimalCachorro.getRacaCachorros();
			ArrayList<String> pelosCachorro = CadastroAnimalCachorro.getTipoPeloCachorros();

			System.out.println("\n*--------*--------*-------*-----*");
			System.out.println("\tTipos de Raças: ");
			System.out.println("*--------*--------*-------*-----*");

			for (int indice1 = 0; indice1 < racasCachorro.size(); indice1++) {
				String racaCachorro = racasCachorro.get(indice1);
				System.out.println("\t" + (indice1 + 1) + " - " + racaCachorro);
			}

			System.out.print("Escolha o tipo de raça: ");
			lerInteiro = leia.nextInt();
			raca = racasCachorro.get(lerInteiro - 1);

			System.out.println("\n*--------*--------*-------*-----*");
			System.out.println("\tTipos de Pelo: ");
			System.out.println("*--------*--------*-------*-----*");

			for (int indice2 = 0; indice2 < pelosCachorro.size(); indice2++) {
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

	// Listar Gato
	@Override
	public void listarGato() {
		for (CadastroAnimalGato listarGato : listaCadastroGato) {
			System.out.println("\n*--------*--------*-------*-----*");
			System.out.println("     Lista de Cadastro Gatos:      ");
			System.out.println("*--------*--------*-------*-----*");
			System.out.println("\tNome do Tutor: " + listarGato.getNomeDono());
			System.out.println("\tCPF: " + listarGato.getCpf());
			System.out.println("\tEndereço: " + listarGato.getEndereco());
			System.out.println("\tNome do Pet :" + listarGato.getNomeAnimal());
			System.out.println("\tIdade: " + listarGato.getIdade());
			System.out.println("\tSexo: " + listarGato.getSexo());
			System.out.println("\tPeso: " + listarGato.getPeso());
			System.out.println("\tCor: " + listarGato.getCor());
			System.out.println("\tTipo de Pelo " + listarGato.getPelo());
			System.out.println("\tEspecie: " + listarGato.getEspecie());
			System.out.println("\tRaça:" + listarGato.getRaca());
		}
	}

	// Listar Gato
	@Override
	public void listarCachorro() {
		for (CadastroAnimalCachorro listarCachorro : listaCadastroCachorro) {
			System.out.println("\n*--------*--------*-------*-----*");
			System.out.println("     Lista Cadastro Cachorros:    ");
			System.out.println("*--------*--------*-------*-----*");
			System.out.println("\tNome do Tutor: " + listarCachorro.getNomeDono());
			System.out.println("\tCPF: " + listarCachorro.getCpf());
			System.out.println("\tEndereço: " + listarCachorro.getEndereco());
			System.out.println("\tNome do Pet: " + listarCachorro.getNomeAnimal());
			System.out.println("\tIdade: " + listarCachorro.getIdade());
			System.out.println("\tSexo: " + listarCachorro.getSexo());
			System.out.println("\tPeso: " + listarCachorro.getPeso());
			System.out.println("\tTipo de Pelo " + listarCachorro.getTipoPeloCachorro());
			System.out.println("\tCor: " + listarCachorro.getCor());
			System.out.println("\tEspecie:" + listarCachorro.getEspecie());
			System.out.println("\tRaça:" + listarCachorro.getRacaCachorro());
		}
	}
	@Override
	public void listarPets() {
		listarGato();
		listarCachorro();
	}

	// Print Gato
	@Override
	public void printCadastroGato() {
		Iterator<CadastroAnimalGato> iFichaGato = listaCadastroGato.iterator();

		if (especie.equals("Felina")) {

			if (iFichaGato.hasNext()) {
				CadastroAnimalGato fichaGato = iFichaGato.next();
				System.out.println("\n*--------*--------*-------*-----*");
				System.out.println("\tDados do seu Pet ");
				System.out.println("*--------*--------*-------*-----*");
				System.out.println("\tPeso: " + fichaGato.getPeso());
				System.out.println("\tNome do Tutor: " + fichaGato.getNomeDono());
				System.out.println("\tCor: " + fichaGato.getCor());
				System.out.println("\tSexo: " + fichaGato.getSexo());
				System.out.println("\tEspecie:" + fichaGato.getEspecie());
				System.out.println("\tEndereço:" + fichaGato.getEndereco());
				System.out.println("\tIdade: " + fichaGato.getIdade());
				System.out.println("\tCPF: " + fichaGato.getCpf());
				System.out.println("\tNome Animal:" + fichaGato.getNomeAnimal());
				System.out.println("\tTipo de Pelo " + fichaGato.getPelo());
				System.out.println("\tRaça:" + fichaGato.getRaca());
			}
		}
	}

	// Print Cachorro
	@Override
	public void printCadastroCachorro() {

		Iterator<CadastroAnimalCachorro> iFichaCachorro = listaCadastroCachorro.iterator();

		if (especie.equalsIgnoreCase("Canina")) {
			if (iFichaCachorro.hasNext()) {
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
	@Override
	public void atualizarCadastro() {
		listarPets();
		System.out.print("\nDigite o nome do pet que deseja atualizar o cadastro: ");
		String nomePet = leia.nextLine();

		boolean encontrado = false;

		for (CadastroAnimalGato felino : listaCadastroGato) {
			if (felino.getNomeAnimal().equalsIgnoreCase(nomePet)) {
				encontrado = true;
				System.out.print("\nDigite o novo endereço do pet: ");
				String novoEndereco = leia.nextLine();
				felino.setEndereco(novoEndereco);
				System.out.println("Cadastro atualizado com sucesso!");
				break;
			}
		}

		if (!encontrado) {
			for (CadastroAnimalCachorro cachorro : listaCadastroCachorro) {
				if (cachorro.getNomeAnimal().equalsIgnoreCase(nomePet)) {
					encontrado = true;
					System.out.print("\nDigite o novo endereço do pet: ");
					String novoEndereco = leia.nextLine();
					cachorro.setEndereco(novoEndereco);
					System.out.println("Cadastro atualizado com sucesso!");
					break;
				}
			}
		}

		if (!encontrado) {
			System.out.println("Pet não encontrado.");
		}
	}
	@Override
	public void removerCadastro() {
		listarPets();
		System.out.print("\nDigite o nome do pet que deseja remover o cadastro: ");
		String nomePet = leia.nextLine();

		boolean removido = false;

		Iterator<CadastroAnimalGato> iteratorGato = listaCadastroGato.iterator();
		while (iteratorGato.hasNext()) {
			CadastroAnimalGato gato = iteratorGato.next();
			if (gato.getNomeAnimal().equalsIgnoreCase(nomePet)) {
				iteratorGato.remove();
				removido = true;
				System.out.println("Cadastro removido com sucesso!");
				break;
			}
		}

		if (!removido) {
			Iterator<CadastroAnimalCachorro> iteratorCachorro = listaCadastroCachorro.iterator();
			while (iteratorCachorro.hasNext()) {
				CadastroAnimalCachorro cachorro = iteratorCachorro.next();
				if (cachorro.getNomeAnimal().equalsIgnoreCase(nomePet)) {
					iteratorCachorro.remove();
					removido = true;
					System.out.println("Cadastro removido com sucesso!");
					break;
				}
			}
		}

		if (!removido) {
			System.out.println("Pet não encontrado.");
		}
	}
	
	/*                                                             >> OUTRA LOGICA PARA ATUALIZAR CADASTRO
	public void atualizarCadastro() {
	    System.out.println("Escolha um cadastro para atualizar:");
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
	    Scanner ler = new Scanner(System.in);

	    System.out.println("Atualize os dados do pet: \n");
	    System.out.println("Peso: ");
	    cadastroAnimal.setPeso(ler.nextFloat());

	    System.out.println("Nome Dono: ");
	    cadastroAnimal.setNomeDono(ler.nextLine());

	    // precisa por o resto do cad

	    System.out.println("Cadastro atualizado com sucesso!");
	}
*/
	// Banho Gato Rita
	@Override
	public void banhoGato() {
		if (especie.equalsIgnoreCase("Felino")) {
			if (pelo.equalsIgnoreCase("Curto")) {
				valor = 30;
				valorTotal += valor;
				valorTotalDia = valorTotal;
			} else if (pelo.equalsIgnoreCase("Médio")) {
				valor = 40;
				valorTotal += valor;
				valorTotalDia = valorTotal;
			} else if (pelo.equalsIgnoreCase("Longo")) {
				valor = 50;
				valorTotal += valor;
				valorTotalDia = valorTotal;
			} else if (pelo.equalsIgnoreCase("Sem pelos")) {
				valor = 80;
				valorTotal += valor;
				valorTotalDia = valorTotal;
			} else {
				System.out.println("Tipo de Pelo inválido!");
			}

		}
	}

	// Banho Cachorro Rita
	@Override
	public void banhoCachorro() {
		if (especie.equalsIgnoreCase("Canina")) {
			if (pelo.equalsIgnoreCase("Curto")) {
				valor = 120;
				valorTotal += valor;
				valorTotalDia = valorTotal;
			} else if (pelo.equalsIgnoreCase("Médio")) {
				valor = 150;
				valorTotal += valor;
				valorTotalDia = valorTotal;
			} else if (pelo.equalsIgnoreCase("Longo")) {
				valor = 270;
				valorTotal += valor;
				valorTotalDia = valorTotal;
			} else if (pelo.equalsIgnoreCase("Sem pelos")) {
				valor = 150;
				valorTotal += valor;
				valorTotalDia = valorTotal;
			} else if (pelo.equalsIgnoreCase("Pelagem Dupla")) {
				valor = 180;
				valorTotal += valor;
				valorTotalDia = valorTotal;
			} else if (pelo.equalsIgnoreCase("Pelo Encaracolado")) {
				valor = 130;
				valorTotal += valor;
				valorTotalDia = valorTotal;
			}

			{
				System.out.println("Tipo de Pelo inválido!");
			}

		}
	}

	// Tosa Gato Rita
	@Override
	public void tosaGato() {
		if (especie.equalsIgnoreCase("Felino")) {
			if (pelo.equalsIgnoreCase("Curto")) {
				valor = 50;
				valorTotal += valor;
				valorTotalDia = valorTotal;
			} else if (pelo.equalsIgnoreCase("Médio")) {
				valor = 60;
				valorTotal += valor;
				valorTotalDia = valorTotal;
			} else if (pelo.equalsIgnoreCase("Longo")) {
				valor = 75;
				valorTotal += valor;
				valorTotalDia = valorTotal;
			} else {
				System.out.println("Tipo de Pelo inválido!");
			}

		}

	}

	// Vacinar Gato Rita
	@Override
	public void vacinarGato() {
		int tipoVacina;
		ArrayList<String> VacinasGato = Vacina.getVacinaGato();
		if (especie.equalsIgnoreCase("Felino")) {
			System.out.println("\n*--------*--------*-------*-----*");
			System.out.println("\tGato Vacinas ");
			System.out.println("*--------*--------*-------*-----*");

			for (int indice = 0; indice < VacinasGato.size(); indice++) {
				String vacinaGato = VacinasGato.get(indice + 1);
				System.out.println((indice + 1) + " - " + vacinaGato);
			}
			System.out.print("\nInforme o tipo de vacina: ");
			tipoVacina = leia.nextInt();

			switch (tipoVacina) {
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

	// Vacinar Cachorro Rita
	@Override
	public void vacinarCachorro() {
		int tipoVacina;
		ArrayList<String> VacinasCachorro = Vacina.getVacinaCachorro();

		if (especie.equalsIgnoreCase("Canina")) {
			System.out.println("\n*--------*--------*-------*-----*");
			System.out.println("\tCachorro Vacinas ");
			System.out.println("*--------*--------*-------*-----*");

			for (int indice = 0; indice < VacinasCachorro.size(); indice++) {
				String vacinaCachorro = VacinasCachorro.get(indice + 1);
				System.out.println((indice + 1) + " - " + vacinaCachorro);
			}
			System.out.print("\nInforme o tipo de vacina: ");
			tipoVacina = leia.nextInt();

			switch (tipoVacina) {
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

	// Tosa Cachorro
	@Override
	public void tosaCachorro() {

		if (especie.equalsIgnoreCase("Canina")) {
			if (pelo.equalsIgnoreCase("Curto")) {
				valor = 120;
				valorTotal += valor;
				valorTotalDia = valorTotal;
			} else if (pelo.equalsIgnoreCase("Médio")) {
				valor = 180;
				valorTotal += valor;
				valorTotalDia = valorTotal;
			} else if (pelo.equalsIgnoreCase("Longo")) {
				valor = 270;
				valorTotal += valor;
				valorTotalDia = valorTotal;
			} else if (pelo.equalsIgnoreCase("Pelagem Dupla")) {
				valor = 130;
				valorTotal += valor;
				valorTotalDia = valorTotal;
			} else if (pelo.equalsIgnoreCase("Pelo Encaracolado")) {
				valor = 150;
				valorTotal += valor;
				valorTotalDia = valorTotal;
			} else {
				System.out.println("Tipo de Pelo inválido!");
			}

		}
	}

	// Castrar Gato Gabi
	@Override
	public void castrarGato() {
		Iterator<CadastroAnimalGato> iFichaGato = listaCadastroGato.iterator();

		if (especie.equalsIgnoreCase("Felino")) {
			if (iFichaGato.hasNext()) {
				CadastroAnimalGato fichaGato = iFichaGato.next();
				if (fichaGato.getEspecie().equalsIgnoreCase("Gato")) {
					valor = 400.00f;
					valorTotal += valor;
					valorTotalDia += valorTotal;
				} else {
					System.out.println("Não tratamos essa especie de animal");
				}
			}
		}
	}

	// Castrar Cachorro Gabi
	@Override
	public void castrarCachorro() {
		Iterator<CadastroAnimalCachorro> iFichaCachorro = listaCadastroCachorro.iterator();
		if (especie.equalsIgnoreCase("Canina")) {
			if (iFichaCachorro.hasNext()) {
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
	}

	// Consulta Gabi
	@Override
	public void consulta() {
		valor = 200.00f;
		valorTotal += valor;
		valorTotalDia += valorTotal;
	}

	// Saída Gabi
	@Override
	public void saidaAnimal() {
		printCadastroGato();
		printCadastroCachorro();
		System.out.println("\tValor total: " + valorTotal);
		valorTotal = 0.0f;
		especie = "";
	}

}