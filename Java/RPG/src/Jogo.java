import java.util.Scanner;

public class Jogo{
    public static int escolha(Scanner teclado){
        
        int escolha = 0;
        System.out.println("Qual classe voce escolhe?\n1 - Guerreiro\n2 - Mago\n3 - Arqueiro\n4 - Ladino\n5 - Clerigo");
        System.out.print("Escolha: ");
        escolha = Integer.parseInt(teclado.nextLine());
        while(escolha != 1 && escolha != 2 && escolha != 3 && escolha != 4 && escolha != 5){
            System.out.println("Opcao invalida, tente novamente.");
            System.out.println("Qual classe voce escolhe?\n1 - Guerreiro\n2 - Mago\n3 - Arqueiro\n4 - Ladino\n5 - Clerigo");
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
        
        return escolha;
    }

    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
        SistemaBatalha jogo = new SistemaBatalha();
        
        System.out.println("----------------------------- JOGO RPG -----------------------------------");
        System.out.println("Bem vindo!\nQual classe voce tera nessa aventura?");
        int classe = escolha(teclado);
        System.out.println("Otima escolha!\nAgora responda: ");
        System.out.print("Qual sera o seu nome: ");
        String nome = teclado.nextLine();
        
        switch (classe){
            case 1:
                Guerreiro proGue = new Guerreiro(nome, 35, 13, 5);
                jogo.adiciona_aliado(proGue);
                break;
            case 2:
                Mago proMag = new Mago(nome, 20, 30, 30);
                jogo.adiciona_aliado(proMag);
                break;
            case 3:
                Arqueiro proArq = new Arqueiro(nome, 25, 25, 40);
                jogo.adiciona_aliado(proArq);
                break;
            case 4:
                Ladino proLad = new Ladino(nome, 30, 15);
                jogo.adiciona_aliado(proLad);
                break;
            case 5:
                Clerigo proCler = new Clerigo(nome, 25, 10, 50);
                jogo.adiciona_aliado(proCler);
                break;
            default:
                break;
        }
        System.out.println("Voce pode escolher mais dois aliados para batalhar com voce.");
        classe = escolha(teclado);
        switch (classe){
            case 1:
                System.out.print("Qual sera nome dele: ");
                nome = teclado.nextLine();
                Guerreiro ali1Gue = new Guerreiro(nome, 35, 13, 5);
                jogo.adiciona_aliado(ali1Gue);
                break;
            case 2:
                System.out.print("Qual sera nome dele: ");
                nome = teclado.nextLine();
                Mago ali1Mag = new Mago(nome,  20, 30, 30);
                jogo.adiciona_aliado(ali1Mag);
                break;
            case 3:
                System.out.print("Qual sera nome dele: ");
                nome = teclado.nextLine();
                Arqueiro ali1Arq = new Arqueiro(nome, 25, 25, 40);
                jogo.adiciona_aliado(ali1Arq);
                break;
            case 4:
                System.out.print("Qual sera nome dele: ");
                nome = teclado.nextLine();
                Ladino ali1Lad = new Ladino(nome,  30, 15);
                jogo.adiciona_aliado(ali1Lad);
                break;
            case 5:
                System.out.print("Qual sera nome dele: ");
                nome = teclado.nextLine();
                Clerigo ali1Cler = new Clerigo(nome, 25, 10, 50);
                jogo.adiciona_aliado(ali1Cler);
                break;
            default:
                break;
        }
        System.out.println("Agora o outro aliado.");
        classe = escolha(teclado);
        switch (classe){
            case 1:
                System.out.print("Qual sera nome dele: ");
                nome = teclado.nextLine();
                Guerreiro ali2Gue = new Guerreiro(nome, 35, 13, 5);
                jogo.adiciona_aliado(ali2Gue);
                break;
            case 2:
                System.out.print("Qual sera nome dele: ");
                nome = teclado.nextLine();
                Mago ali2Mag = new Mago(nome, 20, 30, 30);
                jogo.adiciona_aliado(ali2Mag);
                break;
            case 3:
                System.out.print("Qual sera nome dele: ");
                nome = teclado.nextLine();
                Arqueiro ali2Arq = new Arqueiro(nome, 25, 25, 40);
                jogo.adiciona_aliado(ali2Arq);
                break;
            case 4:
                System.out.print("Qual sera nome dele: ");
                nome = teclado.nextLine();
                Ladino ali2Lad = new Ladino(nome, 30, 15);
                jogo.adiciona_aliado(ali2Lad);
                break;
            case 5:
                System.out.print("Qual sera nome dele: ");
                nome = teclado.nextLine();
                Clerigo ali2Cler = new Clerigo(nome, 25, 10, 50);
                jogo.adiciona_aliado(ali2Cler);
                break;
            default:
                break;
        }
        System.out.println("Perfeito, agora vamos para a aventura!!!");
        Dragao bicho = new Dragao("Askelad", 50, 20, 20);
        jogo.adicionar_inimigo(bicho);
        
        jogo.iniciar_batalha();


        teclado.close();
    }
}
