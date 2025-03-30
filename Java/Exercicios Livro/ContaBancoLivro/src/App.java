
public class App {
    public static void main(String[] args){
        System.out.println("Hello, World!");
        Conta conta1 = new Conta();
        Conta conta2 = new Conta();
        
        conta1.definirData(2, 3, 2007);
        conta1.recuperaDadosParaImpressao();
        
    }
}

