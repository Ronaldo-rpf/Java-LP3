import java.util.ArrayList;
import java.util.Random;

public class Dragao extends Inimigo{
    private int escudo;
    private static int flag = 1;

    public Dragao(String nome, int vida, int forca, int escudo){
        super(nome, vida, forca);
        this.escudo = escudo;
    }

    @Override
    public void defender(int dano){
        escudo -= dano;
        if (escudo <= 0 && flag == 1){
            System.out.println("A carapaca do dragao foi destruida.");
            flag = 0;
            return;
        }
        else if(flag == 1){
            System.out.println("Dragao levou 0 de dano.");
            System.out.println("Sua carapaca ainda tem " + escudo + " de vida.");
            return;            
        }
        else{
            System.out.println("Dragao levou " + dano + " de dano.");
            this.vida -= dano;
            return;
        }
    }

    @Override
    public int atacar(){
        System.out.println(this.nome + " atacou e causou " + this.forca + " de dano.");
        return this.forca;
    }

    @Override
    public int usaHabilidadeEspecial(){
        System.out.println(this.nome + " usou BOLA DE FOGO e causou " + this.forca*2 + " de dano.");
        return this.forca*2;
    }

    @Override
    public int tomarDecisao(ArrayList<Personagem> lista, Random random){
        return random.nextInt(lista.size());
    }

}
