import java.util.Random;
import java.util.ArrayList;

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
        int aux;
        Random random = new Random();
        System.out.println("Certo dia o grande" + listaAliados.get(1).nome + " estava escalando uam montanha com sua trupe de duas pessoas, o temido " + listaAliados.get(2).nome + " e o louvavel "+ listaAliados.get(3).nome+ ", e quando chegaram la em cima... \nSE DEPARARAM COM UM FUCKING DRAGAO!\nTodos se armaram e se prepararam para a batalha.");

        System.out.println("\"UUUUUUUUUAAAAAAAAAAAAAAAAAHHHHH VOCES JAMAIS PEGARAM O TESOURO QUE NAO E MEU E DOS ANOOOOOOEEESSSSSSS!!!!!!\"");
        System.out.println("A batalha comecou:");
        while (listaAliados.size() != 0 && listaInimigos.size() != 0){
            System.out.println("Turno " + cont + ":");
            aux = listaInimigos.get(1).tomarDecisao(listaAliados, random);
            
        }


        
    } 
}
