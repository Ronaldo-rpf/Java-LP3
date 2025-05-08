import java.util.ArrayList;

class Funcionario{
    public double calcularBonus(){
        return 500.0;
    }
}

class Gerente extends Funcionario{
    public double calcularBonus(){
        return 2000.0;
    }
}

class Operario extends Funcionario{
    public double calcularBonus(){
        return 1000.0;
    }
}

public class Listas {
    public static void main(String[] args){
        ArrayList<Funcionario> lista = new ArrayList<>();
        lista.add(new Gerente());
        int n = lista.size();
        for (int i = 0; i < n; i++){
            System.out.println(lista.get(i).calcularBonus());
        }

        for (Funcionario i : lista){
            System.out.println(i.calcularBonus());
        }
    }    
}
