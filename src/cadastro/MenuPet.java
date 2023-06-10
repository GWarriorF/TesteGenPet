package cadastro;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

import cadastro.menu.MetodosMenu;
import util.Cores;
public class MenuPet {

	public static void main(String[] args) {

		boolean exibir = true;
		int exibicao = 0;
		Scanner ler = new Scanner(System.in);
		MetodosMenu ficha = new MetodosMenu();

/*		System.out.println(Cores.TEXT_WHITE_BRIGHT + "Bem Vindes a GenPet! \nPressione " + Cores.TEXT_GREEN_BRIGHT + "\"ENTER\""
				+ Cores.TEXT_WHITE_BRIGHT + " para começar!\n");
		ler.skip("\\R");*/
    

		while (exibir) {
			System.out.println("\n   *--------*--------*-------*-----*");
			System.out.println("  *                                 *");
			System.out.println(" *        "+ Cores.TEXT_YELLOW_BRIGHT + "Bem Vinde a " + Cores.TEXT_PURPLE_BOLD_BRIGHT +"GenPet"+ Cores.TEXT_RESET+"!        *");
			System.out.println("  *                                 *");
			System.out.println("   *-------*-------*-------*-------*");
			System.out.println("                                       ");
			System.out.println("  *--------*--------*--------*-------*");
			System.out.println("|                                      |");
			System.out.println(
					"*    1 - " + Cores.TEXT_YELLOW_BRIGHT + "Cadastrar Novo Pet        " + Cores.TEXT_RESET + "    *");
			System.out.println(
					"*    2 - " + Cores.TEXT_YELLOW_BRIGHT + "Listar Todos os Cadastros" + Cores.TEXT_RESET + "     *");
			System.out.println(
					"*    3 - " + Cores.TEXT_YELLOW_BRIGHT  + "Buscar Cadastro" + Cores.TEXT_RESET + "               *");
			System.out.println(
					"*    4 - " + Cores.TEXT_YELLOW_BRIGHT  + "Atualizar Cadastro" + Cores.TEXT_RESET + "            *");
			System.out.println(
					"*    5 - " + Cores.TEXT_YELLOW_BRIGHT  + "Remover Cadastro" + Cores.TEXT_RESET + "              *");
			System.out.println(
					"*    6 - " + Cores.TEXT_YELLOW_BRIGHT  + "Agendar Consulta" + Cores.TEXT_RESET + "              *");
			System.out.println(
					"*    7 - " + Cores.TEXT_YELLOW_BRIGHT  + "Agendar Vacinas" + Cores.TEXT_RESET + "               *");
			System.out.println(
					"*    8 - " + Cores.TEXT_YELLOW_BRIGHT  + "Agendar Banho e Tosa" + Cores.TEXT_RESET + "          *");
			System.out.println(
					"*    9 - " + Cores.TEXT_YELLOW_BRIGHT  + "Agendar Castração" + Cores.TEXT_RESET + "             *");
			System.out.println(
					"*    10 - " + Cores.TEXT_RED_BOLD_BRIGHT + "Sair" + Cores.TEXT_RESET + "                          *");
			System.out.println("|                                      |");
			System.out.println("  *--------*--------*--------*-------*");
			System.out.println("                                       ");
			System.out.println("Digite o número da opção desejada: ");

		    try {
		        exibicao = ler.nextInt();
		    } catch (InputMismatchException e) {
		        System.out.println("Erro: O valor digitado não é um número inteiro válido. \nDigite um número válido.");
		        ler.nextLine(); // Limpa o buffer do scanner após o erro
		        continue; // Volta ao início do loop
		    }

			if (exibicao == 10) {
				System.out.println("\nObrigado pela confiança. Volte sempre!");
				ler.close();
				System.exit(0);
			}

			switch (exibicao) {
			case 1:
				System.out.println("Cadastrar Novo Animal: ");
				ficha.cadastrar();
				System.out.println("Animal cadastrado com sucesso!");
				break;
			case 2:
			    System.out.println("Lista de Pets Cadastrados:");
                break;
			case 3:
				System.out.println("Busca Animal");
				break;
			case 4:
				System.out.println("para finalizar pagamento");
				ficha.castrar();
				System.out.println("Atualizar animal");
				break;
			case 5:
				System.out.println("Remover animal");
				break;
			case 6:
				System.out.println("Consulta");
				break;
			case 7:
				System.out.println("Vacinas");
				break;
			case 8:
				System.out.println("Banho e Tosa");
				break;
			case 9:
				System.out.println("Castração");
				break;
			case 10:
				System.out.println("\n Finalizando Cadastro.");
				exibir = false;
			default:
				System.out.println("Opção Inválida. Tente Novamente.");
				break;
			}
		}
	}
	}
