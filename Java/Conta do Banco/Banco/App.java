public class App {
    public static void main (String[] args){
        ContaBancaria conta1 = new ContaBancaria("ROnaldo");
        Banco.quantasContas();
        ContaBancaria conta2 = new ContaBancaria("amigo");
        conta1.setSaldo(1000);
        conta2.setSaldo(400);
        conta1.exibirInformacoes();
        conta2.exibirInformacoes();

        Banco.quantasContas();

        conta1.depositar(400, "04/05/2024");
        conta1.exibirInformacoes();

        conta1.depositar(100,"60/01/2008");

        conta2.sacar(200, "03/06/1995");
    }
}
