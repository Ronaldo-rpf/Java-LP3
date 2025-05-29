public class Ladino extends Personagem implements HabilidadeEspecial{
    private Boolean stealth;

    public Ladino(String nome, int vida, int forca){
        super(nome, vida, forca);
        this.stealth = false;
    }

    @Override
    public int usaHabilidadeEspecial(){
        System.out.println(this.nome + " (Ladino) usou Golpe das Sombras.");
    
        System.out.println(this.nome + "entrou em modo Stealth.\nProximo ataque causara dano TRIPLO.");
        this.stealth = true;
        return 0;
    }

    @Override
    public int atacar(){
        if (this.stealth == true){
            System.out.println(this.nome + " (Ladino) causou " + this.forca*3 + "de dano.");
            System.out.println(this.nome + " (Ladino) saiu do modo Stealth.");
            this.stealth = false;
            return this.forca*3;
        }
        else{
            System.out.println(this.nome + " (Ladino) causou " + this.forca + "de dano.");
            return this.forca;
        }
    }

    @Override
    public void defender(int dano){
        System.out.println(this.nome + " (Ladino) recebeu " + dano + " de dano.");
        this.vida -= dano;
    }
}