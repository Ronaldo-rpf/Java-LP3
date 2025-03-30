public class Fibonacci {
    public static void main (String[] args){
        int j = 0, k = 1;
        System.out.println(j + "\n" + k);
        for (int i = 0; i <= 100; ){
            i = j + k;
            //System.out.println(i);
            System.out.printf("J: %d     K: %d       %d\n", j, k, j + k);
            j = k;
            k = i;
        }
    }
}
