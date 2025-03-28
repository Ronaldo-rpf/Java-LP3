import java.util.Scanner;

class Calcula{
    private float janeiro;
    private float fevereiro;
    private float marco;
    private float total = janeiro + fevereiro + marco;

    Calcula(){
        
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
