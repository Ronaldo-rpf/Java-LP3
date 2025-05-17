public class Arqueiro extends Personagem{
    private int flechas;

    public Arqueiro(String nome, int vida, int forca, int flechas){
        super(nome, vida, forca);
        this.flechas = flechas;
    }

    @Override
    public void atacar(){
        if(this.flechas <= 1){
            System.out.println("Arqueiro tentou atacar mas nao tem flechas o suficiente.");
            return;
        }
        else
            System.out.println("Arqueiro atacou com " + (this.forca + 3) + " de dano.");
            this.flechas -= 1;
    }

    @Override
    public void defender(int dano){
        System.out.println("Arqueiro recebeu " + dano + " de dano");
        this.vida -= dano;
    }
}
