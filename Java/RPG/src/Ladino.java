public class Ladino extends Personagem implements HabilidadeEspecial{
    private Boolean stealth;

    public Ladino(String nome, int vida, int forca, int fe){
        super(nome, vida, forca);
        this.stealth = false;
    }

    public void usaHabilidadeEspecial(){
        System.out.println(this.nome + " (Ladino) usou Golpe das Sombras.");
    
        System.out.println(this.nome + "entrou em modo Stealth.\nProximo ataque causara dano TRIPLO.");
        this.stealth = true;
    }

    public void atacar(){
        if (this.stealth == true){
            System.out.println(this.nome + " (Ladino) causou " + this.forca*3 + "de dano.");
            System.out.println(this.nome + " (Ladino) saiu do modo Stealth.");
            this.stealth = false;
        }
        else{
            System.out.println(this.nome + " (Ladino) causou " + this.forca + "de dano.");
            
        }
    }

    public void defender(int dano){
        System.out.println(this.nome + " (Ladino) recebeu " + dano + " de dano.");
        this.vida -= dano;
    }
}