public class Mago extends Personagem{
    private int mana;

    public Mago(String nome, int vida, int forca, int mana){
        super(nome, vida, forca);
        this.mana = mana;
    }

    @Override
    public int atacar(){
        if(this.mana <= 10){
            System.out.println("Mago atacou com " + (this.forca * 2) + " de dano.");
            System.out.println("Mago gastou 10 de mana.");
            this.mana-=10;
            System.out.println("Mana restante: " + this.mana);
            return (this.forca * 2);
        }
        else
            System.out.println("Mago nao tem mana suficiente para atacar!");
            return 0;
    }

    @Override
    public void defender(int dano){
        System.out.println("Mago recebeu " + dano + " de dano");
        this.vida -= dano;
    }

    @Override
    public int usaHabilidadeEspecial(){
        System.out.println("Mago usou TELEPORTE e recuperou 20 de mana.");
        this.mana += 20;
        System.out.println("Mana restante: " + this.mana);
        return 0;
    }
}
