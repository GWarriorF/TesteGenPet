package cadastro.menu;

import java.util.List;
import java.util.Scanner;

import cadastro.modelo.CadastroAnimalGato;

public class MenuTestes {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);

		// teste do gatinho raça
		List<String> racas = CadastroAnimalGato.getRacas();
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
        for (int conta = 0; conta < tipoPelo.size(); conta++) {
            System.out.println((conta + 1) + " - " + tipoPelo.get(conta));
        }
            int escolhaTipoPelo = ler.nextInt();
            if (escolhaTipoPelo >= 1 && escolhaTipoPelo <= tipoPelo.size()) {
                String tipoPeloEscolhido = tipoPelo.get(escolhaTipoPelo - 1);
                System.out.println("Tipo de pelo escolhida: " + tipoPeloEscolhido + "\n");
                
    }
	
            

}
	}
