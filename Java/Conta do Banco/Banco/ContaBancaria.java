
public class ContaBancaria{
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
        if (valor < 0){
            System.out.println("Valor negativo, não é possivel realizar o deposito.\n\n");
            return;
        }
        System.out.println("Valor depositado com sucesso.");
        saldo += valor;
    }

    public void sacar (double valor){
        if (saldo < valor){
            System.out.println("Saldo insuficiente.\n\n");
            return;
        }
        else if(valor <= 0){
            System.out.println("Valor negativo ou nulo, nao é possivel realizar o saque.\n\n");
            return;
        }
        else{
            System.out.println("Valor sacado com sucesso.\n\n");
            saldo -=valor;
        }
    }

    public void tranferir(double valor, ContaBancaria conta2){
        if (saldo >= valor && valor > 0){
            sacar(valor);
            conta2.depositar(valor);
            System.out.println("Transferencia realizada com sucesso.\n\n");
            return;
        }
        else if (saldo < valor){
            System.out.println("Saldo insuficiente, nao foi possivel realizar a transferencia.\n\n");
            return;
        }
        else{
            System.out.println("Valor negativo ou nulo, nao foi possivel realizar a transferencia.\n\n");
            return;
        }
    }
}

