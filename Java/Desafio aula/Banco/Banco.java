import java.util.Scanner;

class ContaBancaria{
    private double saldo;
    private String titular;

    public ContaBancaria (String nome){
        titular = nome;
        saldo = 0;
    }

    public double getSaldo(){
        return saldo;
    }

    public void setSaldo(double saldo){
        this.saldo = saldo;
    }

    public void ExibirInformacoes(){
        System.out.println("Titular: "+titular);
        System.out.println("Saldo atual: " + saldo);
    }

    public void depositar(double valor){
        saldo += valor;
    }

    public void sacar (double valor){
        if (saldo < valor){
            System.out.println("Saldo insuficiente.\n\n");
            return;
        }
        else{
            saldo -=valor;
        }
    }

    public void tranferir(double valor, ContaBancaria conta2){
        if(saldo >= valor){
            sacar(valor);
            conta2.depositar(valor);
        }
        else{
            return;
        }
    }
}





public class Banco {
    public static void main(String[] args){
        /*Scanner teclado = new Scanner(System.in);
        System.out.println("Bem-vindo a sua nova conta no banco!\nPara comecar, me diga seu nome completo: ");
        String nome = teclado.nextLine();

        ContaBancaria conta1 = new ContaBancaria(nome);
        conta1.setSaldo(100);
        conta1.ExibirInformacoes();

        double deposito = teclado.nextDouble();
        conta1.depositar(deposito);

        conta1.ExibirInformacoes();

        double saque = teclado.nextDouble();
        conta1.sacar(saque);

        conta1.ExibirInformacoes();



        teclado.close();*/

        ContaBancaria conta2 = new ContaBancaria("yuri");
        ContaBancaria conta1 = new ContaBancaria("Artur");

        conta1.setSaldo(1000);
        conta2.setSaldo(500);
        conta1.ExibirInformacoes();
        conta2.ExibirInformacoes();

        conta1.tranferir( 2000, conta2);
        conta1.ExibirInformacoes();
        conta2.ExibirInformacoes();
    }
}
