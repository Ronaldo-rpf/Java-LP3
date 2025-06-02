public class Clerigo extends Personagem{
    private int fe;

    public Clerigo(String nome, int vida, int forca, int fe){
        super(nome,vida,forca);
        this.fe = fe;
    }

    @Override
    public int atacar(){
        System.out.println(this.nome + " (Clerigo) causou " + this.forca + "de dano.");
        return this.forca;
    }

    @Override
    public void defender(int dano){
        System.out.println(this.nome + " (Clerigo) recebeu " + dano + " de dano.");
        this.vida -= dano;
    }

    @Override
    public int usaHabilidadeEspecial(){
        System.out.println(this.nome +" (Clerigo) usou Ressureicao.");
        //System.out.println(pessoa.nome + "foi revivida com 50% da vida.");
        this.fe -= 30;
        System.out.println("Fe: " + this.fe);
        return 0;
    }
}

