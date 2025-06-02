
public abstract class Personagem implements HabilidadeEspecial{
    protected String nome;
    protected int vida;
    protected int forca;

    public Personagem(String nome, int vida, int forca){
        this.nome = nome;
        this.vida = vida;
        this.forca = forca;
    }

    protected abstract int atacar();

    protected abstract void defender(int dano);

    protected void mostrar_status(){
        System.out.println("Nome: " + this.nome + "\nVida: " + this.vida + "\nForca: " + this.forca);
        System.out.println();
    }


}
