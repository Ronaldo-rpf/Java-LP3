import java.util.Random;
import java.util.ArrayList;

public class App {
    public static void main(String[] args){
        System.out.println("Hello, World!");
        Random random = new Random();
        ArrayList<Integer> lista = new ArrayList<>();
        lista.add(2);
        lista.add(6);
        lista.add(4);
        lista.add(3);


        for (int i=0; i<10; i++){
            System.out.println(random.nextInt(lista.size())); 
        }
        
    }
}
