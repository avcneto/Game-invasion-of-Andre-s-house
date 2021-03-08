/*AUTOR:Aderson neto
 * NOME DO JOGO:Invasion of Andre's house
 * Atividade realizada no módulo de lógica de programação da imersão Java xpert
 */

import java.util.Scanner;

public class GameInvasionOfAndresHouse {

	public static void main(String[] args) {
		String nomeUltraSecreto, participarDaMisao, comadoDaCasa, senhaDoCofre;
		int localDaInvasao;
		boolean exibeMensagem = true;

		System.out.println("       _..._");
		System.out.println("      .'     '.      _");
		System.out.println("     /    .-\"\"-\\   _/ \\");
		System.out.println("   .-|   /:.   |  |   |");
		System.out.println("   |  \\  |:.   /.-'-.//");
		System.out.println("   | .-'-;:__.'    =/");
		System.out.println("   .'=  *=|NASA _.='");
		System.out.println("  /   _.  |    ;");
		System.out.println(" ;-.-'|    \\   |");
		System.out.println("//   | \\    _\\  _\\");
		System.out.println("\\__//'._;.  ==' ==\\");
		System.out.println("         \\    \\   |\\");
		System.out.println("         /    /   /");
		System.out.println("         /-._/-._/");
		System.out.println("         \\   `\\  \\");
		System.out.println("          `-._/._/");
		System.out.println("\nOlá tudo bem? \nEsperamos que você esteja incrivelmente bem porque,"
				+ "\nacabamos de te convocar para uma missao ultra secreta da NASA..."
				+ "\nprimeiramente gostariamos que você nos informa-se se tem interese em participar...");

		Scanner leitor = new Scanner(System.in);
		System.out.println("\nVocê gostaria de ser um agente ultra secreto?"
				+ "\nDigite SIM para participar da missão ultra secreta."
				+ "\nDigite NÃO para não participar da missão ultra secreta."
				+ "\nPor favor nos informae sua escolha agora!!!");
		participarDaMisao = leitor.nextLine();

		if (participarDaMisao.equalsIgnoreCase("sim")) {
			System.out.println("Muito obrigado por aceitar o grande desafio."
					+ "\nPor favor, digite como você gostaria de ser chamado?");
			nomeUltraSecreto = leitor.nextLine();

			System.out.println("Bem vindo agente " + nomeUltraSecreto + "\n");
			System.out.println("Sua missão é invadir a casa do professor de logica de programação"
					+ "\ne descobrir o que ele esconde no seu cofre ultra secreto, precisamos"
					+ "\nda sua ajuda porque acreditamos que ele esconde codigos ultras secretos.");

			System.out.println("   -           __");
			System.out.println("  --          ~( @\\   \\");
			System.out.println(" ---   _________]_[__/_>________");
			System.out.println("      /  ____ \\ <>     |  ____  \\");
			System.out.println("     =\\_/ __ \\_\\_______|_/ __ \\__D");
			System.out.println(" ________(__)_____________(__)____");

			System.out.println("Você chegou a casa do professor de logica de programação as 02:30 da manhã."
					+ "\nVocê gostaria de invadir a casa pelas portas, janelas, telhado ou a garagem?"
					+ "\n1 - Porta da frente." + "\n2 - Porta dos fundos." + "\n3 - janela da cozinha."
					+ "\n4 - janela do quarto." + "\n5 - telhado." + "\n6 - garagem.");

			localDaInvasao = leitor.nextInt();
			while (localDaInvasao != 4) {

				if (localDaInvasao == 1) {
					System.out.println("Infelismente a porta da frente está trancada. Tente novamente!");
				} else if (localDaInvasao == 2) {
					System.out.println(
							"Não existe uma porta dos fundos na casa do professor de logica. Tente novamente!");
				} else if (localDaInvasao == 3) {
					System.out.println("A janela da cozinha está trancada por dentro. Tente novamente! ");
				} else if (localDaInvasao == 4) {
					System.out.println("A janela do quarto esta aberta. \\o/");

				} else if (localDaInvasao == 5) {
					System.out.println("Você não pode invadir pelo telhado, porque os vizinhos vão chamar a policia!");
				} else if (localDaInvasao == 6) {
					System.out.println("A garagem só abre com o controle. tente novamente!");
				} else {
					System.out.println("Você foi por um lugar diferente e não encontrou nada. tente novamente!");

				}

				localDaInvasao = leitor.nextInt();
			}

			System.out.println("Parabéns você invadiu a casa do professor Andre pela janela do quarto!\n");
			System.out.println("Você precisa encontrar o confre sem acordar nenhuma pessoa..."
					+ "\nPor favor, escreva qual comado você gostaria de procurar o cofre?");
			leitor.nextLine();
			comadoDaCasa = leitor.nextLine();

			while (comadoDaCasa != "escritorio") {
				if (comadoDaCasa.equalsIgnoreCase("quarto")) {
					System.out.println(
							"Você quase acordou o professo de logica de programação. tome cuidado! digte o proximo comado: ");
				} else if (comadoDaCasa.equalsIgnoreCase("escritorio")) {
					System.out.println("Parabéns você encontrou o cofre.");
					System.out.println("Você tem 5 tentativa para abrir o cofre.");
					System.out.println("Para cada tentativa incorreta o cofre disponibiliza uma dica.");
					System.out.println("Por favor digite a senha: ");
					for (int i = 1; i <= 5; i++) {
						senhaDoCofre = leitor.nextLine();
						System.out.println("Tentativa número: " + i);
						if (i == 1) {
							System.out.println(
									"Dica número " + i + ": esta relacionado a máteria de logica de programação...\n");
						} else if (i == 2) {
							System.out.println("Dica número " + i + ": Contém a letra \"a\"\\n");
						} else if (i == 3) {
							System.out.println("Ultima dica: é uma linguagem de programação\n\\n");
						} else if (i == 4) {
							System.out.println("Não foi dessa vez!");
						} else {
							if (i >= 5) {
								System.out.println("Você bloqueou o cofre!" + "\n GAMER OVER!!!");
								exibeMensagem = false;
							}
						}

						if (senhaDoCofre.equals("java")) {
							System.out.println(
									"Parabéns " + nomeUltraSecreto + " você descobriu o código ultra secreto..."
											+ "\no codigo é: \"System.out.println(\" Hello world!!!\")\"");
							System.out.println("Muito obrigado e espero que tenha gostado do jogo = )");

							break;
						} else {
							System.out.println("Senha incorreta!!!");
							if (exibeMensagem == true) {
								System.out.println("Por favor, digite a senha:");
							}

						}

					}
					System.exit(0);

				} else if (comadoDaCasa.equalsIgnoreCase("cozinha")) {
					System.out.println("Você chamou a atenção do cachorro.Tome cuidado!!! digte o proximo comado:");
				} else if (comadoDaCasa.equalsIgnoreCase("banheiro")) {
					System.out.println(
							"O cofre não esta no banheiro, procure em um lugar mais cheiroso!!!. digte o proximo comado:");
				} else if (comadoDaCasa.equalsIgnoreCase("sala")) {
					System.out.println("Cuidado com o vizinho!!! procure em outro comado.");

				} else {
					System.out.println("Você fez barulho. cuidado! ");
				}
				comadoDaCasa = leitor.nextLine();
			}

		} else if (participarDaMisao.equalsIgnoreCase("não") || participarDaMisao.equalsIgnoreCase("nao")) {
			System.out.println("Parabéns!!!" + "\nvocê optou pelo caminho mais difícil."
					+ "\nvocê é uma pessoa procurada pelo FBI" + "\nGAME OVER!!!");
		} else {
			System.out.println("Não compreendemos a sua decisão." + "\nGAMER OVER!!!");
		}

	}

}
