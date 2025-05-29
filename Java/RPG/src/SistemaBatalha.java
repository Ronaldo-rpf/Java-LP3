import java.util.Scanner;

public class SistemaBatalha {

    public SistemaBatalha(){
        
    }

    public void adiciona_aliado(Personagem pessoa){

    }

    public void adicionar_inimigo(Personagem pessoa){

    }

    public void iniciar_batalha(){
        Scanner teclado = new Scanner(System.in);
        int escolha = 0;
        System.out.println("Qual classe voce deseja ser no jogo?\n1 - Guerreiro\n2 - Mago\n3 - Arqueiro\n4 - Ladino\n5 - Clerigo");
        System.out.print("Escolha: ");
        escolha = Integer.parseInt(teclado.nextLine());
        while(escolha != 1 && escolha != 2 && escolha != 3 && escolha != 4 && escolha != 5){
            System.out.println("Opcao invalida, tente novamente.");
            System.out.println("Qual classe voce deseja ser no jogo?\n1 - Guerreiro\n2 - Mago\n3 - Arqueiro\n4 - Ladino\n5 - Clerigo");
            System.out.print("Escolha: ");
            escolha = Integer.parseInt(teclado.nextLine());
        }
        switch (escolha){
            case 1:
                System.out.println("Voce escolhe a classe Guerreiro.");
                break;
            case 2:
                System.out.println("Voce escolhe a classe Mago.");
                break;
            case 3:
                System.out.println("Voce escolhe a classe Arqueiro.");
                break;
            case 4:
                System.out.println("Voce escolhe a classe Ladino.");
                break;
            case 5:
                System.out.println("Voce escolhe a classe Clerigo.");
                break;
            default:
                break;
        }
        


        teclado.close();    
    } 
}
