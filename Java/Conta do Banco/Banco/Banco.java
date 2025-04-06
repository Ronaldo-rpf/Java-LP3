
public class Banco {
    private static int quantidadeContas = 0;

    public static void incrementarConta(){
        quantidadeContas++;
    }

    public static void quantasContas(){
        System.out.printf("Quantidade total de contas: %d\n\n", quantidadeContas);
    }
}
