import java.util.Random;
import java.util.ArrayList;
import java.util.Scanner;

public class SistemaBatalha {
    private static ArrayList<Personagem> listaAliados = new ArrayList<>();
    private static ArrayList<Inimigo> listaInimigos = new ArrayList<>();
    private static int cont = 1;

    public void adiciona_aliado(Personagem pessoa){
        listaAliados.add(pessoa);
    }

    public void adicionar_inimigo(Inimigo pessoa){
        listaInimigos.add(pessoa);
    }

    public void iniciar_batalha(){
        Scanner teclado = new Scanner(System.in);
        int aux;
        Random random = new Random();
        System.out.println("Certo dia o grande" + listaAliados.get(1).nome + " estava escalando uam montanha com sua trupe de duas pessoas, o temido " + listaAliados.get(2).nome + " e o louvavel "+ listaAliados.get(3).nome+ ", e quando chegaram la em cima... \nSE DEPARARAM COM UM FUCKING DRAGAO!\nTodos se armaram e se prepararam para a batalha.");

        System.out.println("\"UUUUUUUUUAAAAAAAAAAAAAAAAAHHHHH VOCES JAMAIS PEGARAM O TESOURO QUE NAO E MEU E DOS ANOOOOOOEEESSSSSSS!!!!!!\"");
        System.out.println("A batalha comecou:");
        while (listaAliados.size() != 0 && listaInimigos.size() != 0){
            System.out.println("----------------------Status inimigos----------------------");
            for (int i = 0; i < listaInimigos.size(); i++){
                listaInimigos.get(i).mostrar_status();
            }
            System.out.println("----------------------Status aliados----------------------");
            for (int i = 0; i < listaAliados.size(); i++){
                listaAliados.get(i).mostrar_status();
            }
            System.out.println("Turno " + cont + ":");
            aux = listaInimigos.get(1).tomarDecisao(listaAliados, random);
            System.out.println(listaInimigos.get(1).nome + " vai atacar " + listaAliados.get(aux + 1).nome + ".");
            if (cont % 2 == 0){
                listaAliados.get(aux + 1).defender(listaInimigos.get(1).atacar());
            }
            else{
                listaAliados.get(aux + 1).defender(listaInimigos.get(1).usaHabilidadeEspecial());
            }
            System.out.println();
            for (int i = 0; i <listaAliados.size(); i++){
                System.out.println("Qual habilidade voce quer que "+ listaAliados.get(i).nome + " use?");
                System.out.println("1 - Atacar.\n2 - Habilidade especial.\n3 - Fugir (nao recomendado).");
                System.out.print("Escolha: ");
                aux = teclado.nextInt();
                if (aux == 1){
                    System.out.println("Quem voce deseja atacar?");    
                    for (int j = 0; j < listaInimigos.size(); j++){
                        System.out.println((j+1) + " - " + listaInimigos.get(j).nome);
                    }
                    aux = teclado.nextInt();
                    aux--;
                    listaInimigos.get(aux).defender(listaAliados.get(i).atacar());
                }
                else if (aux == 2){
                    System.out.println("Quem voce deseja atacar?");    
                    for (int j = 0; j < listaInimigos.size(); j++){
                        System.out.println((j+1) + " - " + listaInimigos.get(j).nome);
                    }
                    aux = teclado.nextInt();
                    aux--;
                    listaInimigos.get(aux).defender(listaAliados.get(i).usaHabilidadeEspecial());
                }
                else{
                    System.out.println(listaAliados.get(i).nome + " fugiu da batalha.");
                    listaAliados.remove(i);
                }
                System.out.println();
            }
            for (int i = 0; i < listaInimigos.size(); i++){
                if (listaInimigos.get(i).vida <= 0){
                    System.out.println(listaInimigos.get(i).nome + " morreu.");
                    listaInimigos.remove(i);
                }
            }
            for (int i = 0; i < listaAliados.size(); i++){
                if (listaAliados.get(i).vida <= 0){
                    System.out.println(listaAliados.get(i).nome + " morreu.");
                    listaAliados.remove(i);
                }
            }
            cont++;
        }
        cont = 0;
        System.out.println("A BATALHA TERMINOU!!!");
        teclado.close();
    } 
}
