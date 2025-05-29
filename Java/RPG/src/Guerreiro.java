public class Guerreiro extends Personagem implements HabilidadeEspecial{
    private int escudo;

    public Guerreiro(String nome, int vida, int forca, int escudo){
        super(nome, vida, forca);
        this.escudo = escudo;
    }

    @Override
    public int atacar(){
        System.out.println("Guerreiro atacou causando " + (this.forca + 5) + " de dano.");
        return (this.forca + 5);
    }

    @Override
    public void defender(int dano){
        dano -= escudo;
        if(dano < 0)
            dano = 0;

        System.out.println("Guerreiro recebeu " + (dano) + " de dano");
        this.vida -= dano;
    }

    @Override
    public int usaHabilidadeEspecial(){
        System.out.println("Guerreiro usou INVESTIDA e causou " + (((this.forca) + 5)*2) + " de dano.");
        System.out.println("Seu escudo quebrou ao atacar.");
        this.escudo = 0;
        return (((this.forca) + 5)*2);
    }
}
