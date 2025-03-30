
//tanto metodo quanto atributo, se for static nao precisa acessar por objeto.

public class Fatorial {
    public static void main(String[] args) {
        long temp = 40, numeros;
        while (temp != 0){
            numeros = temp;
            if (temp == 1){
                System.out.println("Fatorial de " + temp + ": 1");
                break;
            }
            for (long i = numeros-1; i != 1; i--){
                numeros *= i;
            }
            System.out.println("Fatorial de "+ temp + ": " + numeros);
            temp--;
        }
    }
}

