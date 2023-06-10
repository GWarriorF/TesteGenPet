package cadastro.menu;

import java.io.IOException;
import java.util.List;
import java.util.Scanner;

import cadastro.modelo.CadastroAnimal;
import cadastro.modelo.CadastroAnimalGato;

public class MenuTestes {

	public static void main(String[] args) {
		
		int opcao;
		MetodosMenu ficha = new MetodosMenu();
		Scanner ler = new Scanner(System.in);
		
	
		System.out.println("Menu Teste: \n\n1. Cadastrar \n2. Consulta \n3. Castração \n4. Saida Pet");
		System.out.println("\nBem vinde a GenPet, ficamos felizes por escolher nossos serviços");
		
		while (true) 
		{ 
			System.out.print("\nDigite a opção Desejada: ");
			opcao = ler.nextInt();
	
			
			switch(opcao) 
			{
				case 1 ->
				{
					ficha.cadastrar();
					
					KeyPress();
				}
				case 2 ->
				{
					ficha.consulta();
					
					KeyPress();
				}
				case 3 ->
				{
					ficha.castrar();
					
					KeyPress();
				}
				case 4 -> 
				{
					ficha.saidaAnimal();
				}
				default ->
				{
					System.exit(0);
				}
				
			}
		}

		// teste do gatinho raça
		/*List<String> racas = CadastroAnimalGato.getRacas();
		System.out.println("Raças de Gatos:");
		for (int conta = 0; conta < racas.size(); conta++) {
			int numero = conta + 1;
			String raca = racas.get(conta);
			System.out.println(numero + " - " + raca);
		}

		System.out.println("\nDIGITE O NUMERO DO GATO PLMDS: ");
		int escolheRaca = ler.nextInt();
		if (escolheRaca >= 1 && escolheRaca <= racas.size()) {
			String racaSelecionada = racas.get(escolheRaca - 1);
			System.out.println("Raça selecionada: " + racaSelecionada + "\n");
		
		}
		
		// teste de gatinho pelo
		List<String> tipoPelo = CadastroAnimalGato.getTipoPelo();
		System.out.println("Escolha o tipo de pelo:");
        for (int conta = 0; conta < tipoPelo.size(); conta++) 
        {
            System.out.println((conta + 1) + " - " + tipoPelo.get(conta));
        }
            int escolhaTipoPelo = ler.nextInt();
            if (escolhaTipoPelo >= 1 && escolhaTipoPelo <= tipoPelo.size()) 
            {
                String tipoPeloEscolhido = tipoPelo.get(escolhaTipoPelo - 1);
                System.out.println("Tipo de pelo escolhida: " + tipoPeloEscolhido + "\n");
            }*/
            
	}
	
	public static void KeyPress() {
        try {
            System.out.println("\n\nPressione Enter para Continuar ...");
            System.in.read();
        } catch (IOException e) {
            System.out.println("Você pressionou uma tecla diferente de enter!");
        }
    }
}
	
