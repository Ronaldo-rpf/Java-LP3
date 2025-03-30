public class FiboDuas {
    public static void main (String[] args){
        int j = 0, k = 1;
        System.out.println(j);
        System.out.println(k);
        for (int i=0; i<20; i++){
            System.out.printf("J: %d     K: %d       %d\n", j, k, j + k);
            j = k + j;
        }
    }
}
