import java.util.Scanner;

//tanto metodo quanto atributo, se for static nao precisa acessar por objeto.

class Calcula{
    private float janeiro;
    private float fevereiro;
    private float marco;
    private float total = janeiro + fevereiro + marco;

    Calcula(){
        janeiro = 0;
        fevereiro = 0;
        marco = 0;
        total = 0;
    }

    public void setJan(Scanner tec){
        this.janeiro = tec.nextFloat();
        System.out.println(janeiro);
    }

    private void setFev(float _fev){
        this.fevereiro = _fev;
    }

    private void setMar(float _mar){
        this.marco = _mar;
    }

    private void mostrar(){
        System.out.println(total);
    }
}

public class Balanco {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Calcula meses = new 
        
        setJan(teclado);



    }
}
