public class Mago extends Personagem implements HabilidadeEspecial{
    private int mana;

    public Mago(String nome, int vida, int forca, int mana){
        super(nome, vida, forca);
        this.mana = mana;
    }

    @Override
    public void atacar(){
        if(this.mana <= 10){
            System.out.println("Mago atacou com " + (this.forca * 2) + " de dano.");
            System.out.println("Mago gastou 10 de mana.");
            this.mana-=10;
            System.out.println("Mana restante: " + this.mana);
        }
        else
            System.out.println("Mago nao tem mana suficiente para atacar!");
    }

    @Override
    public void defender(int dano){
        System.out.println("Mago recebeu " + dano + " de dano");
        this.vida -= dano;
    }

    @Override
    public void usaHabilidadeEspecial(){
        System.out.println("Mago usou TELEPORTE e recuperou 20 de mana.");
        this.mana += 20;
        System.out.println("Mana restante: " + this.mana);
    }
}
