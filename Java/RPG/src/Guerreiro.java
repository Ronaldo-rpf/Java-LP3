public class Guerreiro extends Personagem{
    private int escudo;

    public Guerreiro(String nome, int vida, int forca, int escudo){
        super(nome, vida, forca);
        this.escudo = escudo;
    }

    @Override
    public void atacar(){
        System.out.println("Guerreiro atacou com " + (this.forca + 5) + " de forca.");
    }

    @Override
    public void defender(int dano){
        dano -= escudo;
        if(dano < 0)
            dano = 0;

        System.out.println("Guerreiro recebeu " + (dano) + " de dano");
        this.vida -= dano;
    }
}
