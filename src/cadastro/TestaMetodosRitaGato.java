package cadastro;


import java.util.InputMismatchException;
import java.util.Scanner;
import cadastro.MetodosRitaGato;
import cadastro.MenuPet;
import java.util.List;

public class TestaMetodosRitaGato {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int opcao, numero ;
		String titular, nomeGato, nomeCachorro, nomeDono;
		float valor;
		
		
while (true){
			
			System.out.println("\n\n*******************************************************************");
			System.out.println("                                                                   ");
			System.out.println("                               GENPET                              ");
			System.out.println("                                                                   ");
			System.out.println("*******************************************************************");
			System.out.println("                                                                   ");
			System.out.println("                   1 - Criar Cadastro                              ");
			System.out.println("                   2 - Listar todas os Cadastros                   ");
			System.out.println("                   4 - Atualizar Dados do Cadastro                 ");
			System.out.println("                   5 - Apagar Cadastro                             ");
			System.out.println("                   6 - Procedimentos                               ");
			System.out.println("                   7 -                                             ");
			System.out.println("                   8 -                                             ");
			System.out.println("                   9 - Sair                                        ");
			System.out.println("                                                                   ");
			System.out.println("*******************************************************************");
			System.out.println("Entre com a opção desejada:                                        ");
			System.out.println("                                                                   ");
			
			
			
			try
			{
				opcao = leia.nextInt();
			}
			catch (InputMismatchException e) {
				System.out.println("\nDigite valores inteiros!");
				leia.nextLine();
				opcao = 0;
			}
			
			if(opcao == 9)
			{
				System.out.println("\nBanco do Brazil com Z - O seu futuro começa aqui!");
				leia.close();
				System.exit(0);
			}
			
			
}
	}
}
