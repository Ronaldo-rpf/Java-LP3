public class ContadorEstranho {
    public static void main(String[] args) {
        int aux = 10, i = 1, var;
        while (i <= aux){
            for (int cont = 1; cont <= i; cont++){
                var = cont*i;
                System.out.print(var);
                System.out.print(" ");
            }
            i++;
            System.out.println();
        }
    }
}
