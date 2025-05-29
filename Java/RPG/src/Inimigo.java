import java.util.ArrayList;
import java.util.Random;

public abstract class Inimigo {
    protected String nome;
    protected int vida;
    protected int forca;

    public Inimigo(String nome, int vida, int forca){
        this.nome = nome;
        this.vida = vida;
        this.forca = forca;
    }

    protected abstract int atacar();

    protected abstract void defender(int dano);

    protected void mostrar_status(){
        System.out.println("Nome: " + this.nome + "\nVida: " + this.vida + "\nForca: " + this.forca);
    }

    protected abstract int tomarDecisao(ArrayList<Personagem> listaAliados, Random random);

}
