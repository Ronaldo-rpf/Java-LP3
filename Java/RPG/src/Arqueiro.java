public class Arqueiro extends Personagem{
    private int flechas;

    public Arqueiro(String nome, int vida, int forca, int flechas){
        super(nome, vida, forca);
        this.flechas = flechas;
    }

    @Override
    public int atacar(){
        if(this.flechas <= 1){
            System.out.println("Arqueiro tentou atacar mas nao tem flechas o suficiente.");
            System.out.println("Flechas restantes: " + this.flechas);
            return 0;
        }
        else{
            System.out.println("Arqueiro atacou com " + (this.forca + 3) + " de dano.");
            this.flechas -= 1;
            System.out.println("Flechas restantes: " + this.flechas);
            return (this.forca + 3);
        }
    }

    @Override
    public void defender(int dano){
        System.out.println("Arqueiro recebeu " + dano + " de dano");
        this.vida -= dano;
    }

    @Override
    public int usaHabilidadeEspecial(){
        if (this.flechas >= 3){
            System.out.println("Arqueiro atacou com CHUVA DE FLECHAS causando " + (this.forca + 3) + " de dano a todos os inimigos.");
            this.flechas -= 3;
            System.out.println("Flechas restantes: " + this.flechas);
            return (this.forca + 3);
        }
        else{
            System.out.println("Arqueiro tentou usar sua habilidade especial mas nao tem flechas o suficiente.");
            System.out.println("Flechas restantes: " + this.flechas);
            return 0;
        }
    }
}
