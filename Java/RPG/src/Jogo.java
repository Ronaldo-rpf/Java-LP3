import java.util.Scanner; 

public class Jogo{
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
        int escolha = 0;
        System.out.println("Qual classe voce deseja ser no jogo?\n1 - Guerreiro\n2 - Mago\n3 - Arqueiro");
        System.out.print("Escolha: ");
        escolha = Integer.parseInt(teclado.nextLine());
        while(escolha != 1 && escolha != 2 && escolha != 3){
            System.out.println("Opcao invalida, tente novamente.");
            System.out.println("Qual classe voce deseja ser no jogo?\n1 - Guerreiro\n2 - Mago\n3 - Arqueiro");
            System.out.print("Escolha: ");
            escolha = Integer.parseInt(teclado.nextLine());
        }





        teclado.close();
    }
}
