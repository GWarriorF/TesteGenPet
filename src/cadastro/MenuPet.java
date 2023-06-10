package cadastro;

import java.util.InputMismatchException; 
import java.util.Scanner;
import cadastro.menu.MetodosMenu;
import util.Cores;

public class MenuPet {

	public static void main(String[] args) {

		boolean exibir = true;
		int exibicao = 0;
		Scanner ler = new Scanner(System.in);
		MetodosMenu ficha = new MetodosMenu();

		System.out.println(Cores.TEXT_WHITE_BRIGHT + "Pressione " + Cores.TEXT_GREEN_BRIGHT + "\"ENTER\""
				+ Cores.TEXT_WHITE_BRIGHT + " para começar!\n");
		ler.skip("\\R");

		while (exibir) {
			System.out.println("\n  *---------*---------*--------*-----*");
			System.out.println("|                                      |");
			System.out.println(
					"*    1 - " + Cores.TEXT_CYAN_BRIGHT + "Cadastrar Novo Animal        " + Cores.TEXT_RESET + " *");
			System.out.println(
					"*    2 - " + Cores.TEXT_CYAN_BRIGHT + "Listar Animais" + Cores.TEXT_RESET + "                *");
			System.out.println(
					"*    3 - " + Cores.TEXT_CYAN_BRIGHT + "Consultas" + Cores.TEXT_RESET + "                     *");
			System.out.println(
					"*    4 - " + Cores.TEXT_CYAN_BRIGHT + "Castrações" + Cores.TEXT_RESET + "                    *");
			System.out.println(
					"*    5 - " + Cores.TEXT_CYAN_BRIGHT + "Banho e Tosa" + Cores.TEXT_RESET + "                  *");
			System.out.println(
					"*    6 - " + Cores.TEXT_CYAN_BRIGHT + "Sair" + Cores.TEXT_RESET + "                          *");
			System.out.println("|                                      |");
			System.out.println("  *---------*---------*--------*-----*");
			System.out.println("Digite o número da opção desejada: ");
			exibicao = ler.nextInt();

			try {
				
			} catch (InputMismatchException e) {
				System.out.println("\nDigite apenas números inteiros.");
				ler.nextLine();
				exibicao = 0;
			}

			if (exibicao == 6) {
				System.out.println("\nObrigado pela confiança. Volte sempre!");
				ler.close();
				System.exit(0);
			}

			switch (exibicao) {
			case 1:
				System.out.println("Cadastrar Novo Animal: ");
				ficha.cadastrar();
				System.out.println("Animal cadastrado com sucesso!");
				keyPress();
				break;
			case 2:
				System.out.println("para remover");
				keyPress();
				break;
			case 3:
				System.out.println("para listar");
				keyPress();
				break;
			case 4:
				System.out.println("para finalizar pagamento");
				ficha.castrar();
				keyPress();
				break;
			case 5:
				System.out.println("\n exibir extrato/recibo ");
				keyPress();
				break;
			case 6:
				System.out.println("\n Finalizando AutoAtendimento...");
				keyPress();
				exibir = false;
			default:
				System.out.println("Opção Inválida. Tente Novamente.");
				keyPress();
				break;
			}
		}
	}

	public static void keyPress() {
		try {
			System.out.println(Cores.TEXT_WHITE_BRIGHT + "Pressione " + Cores.TEXT_GREEN_BRIGHT + "\"ENTER\""
					+ Cores.TEXT_WHITE_BRIGHT + " para continuar!\n" + Cores.TEXT_RESET);
			System.in.read();

		} catch (Exception a) {
			System.out.println(Cores.TEXT_WHITE_BRIGHT + "Você pressionou uma tecla diferente de "
					+ Cores.TEXT_GREEN_BRIGHT + "\"ENTER\"" + Cores.TEXT_WHITE_BRIGHT + Cores.TEXT_RESET);
		}
	}
}
