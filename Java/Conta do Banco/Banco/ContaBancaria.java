
public class ContaBancaria{
    private double saldo;
    private Cliente titular;
    private Data dataAbertura;
    private Data[] depositos = new Data[10];
    private Data[] saques = new Data[10];
    private Data[] transferencias = new Data[10];
    private static int numDepositos = 0;
    private static int numSaques = 0;
    private static int numTransferecias = 0;

    public ContaBancaria (String nome, String cpf, Data nascimento){
        titular = new Cliente(nome, cpf, nascimento);
        saldo = 0;
        Banco.incrementarConta();
        dataAbertura = new Data();
    }

    public double getSaldo(){
        return saldo;
    }

    public void setSaldo(double saldo){
        this.saldo = saldo;
    }

    private void incrementaDeposito(){
        numDepositos++;
    }

    private void incrementaSaque(){
        numSaques++;
    }

    private void incrementaTransferencia(){
        numTransferecias++;
    }

    public void exibirInformacoes(){
        titular.exibirCliente();
        System.out.println("Saldo atual: " + saldo);
        System.out.println("Data de abertura da conta: ");
        dataAbertura.mostrar();
    }

    public void depositar(double valor, String data){
        Data datinha = new Data(data);
        Boolean aux = datinha.dataValida(datinha);
        if (aux == false){
            System.out.println("Data invalida, operacao cancelada.");
            return;
        }
        else{
            if (valor < 0){
                System.out.println("Valor negativo, não é possivel realizar o deposito.\n\n");
                return;
            }
            System.out.println("Valor depositado com sucesso.");
            depositos[numDepositos] = datinha;
            incrementaDeposito();
            System.out.println("Feito no dia: ");
            depositos[numDepositos-1].mostrar();
            
            saldo += valor;
        }
    }

    public void sacar (double valor, String data){
        Data datinha = new Data(data);
        Boolean aux = datinha.dataValida(datinha);
        if (aux == false){
            System.out.println("Data invalida, operacao cancelada.");
            return;
        }
        else{
            if (saldo < valor){
                System.out.println("Saldo insuficiente.\n\n");
                return;
            }
            else if(valor <= 0){
                System.out.println("Valor negativo ou nulo, nao é possivel realizar o saque.\n\n");
                return;
            }
            else{
                System.out.println("Valor sacado com sucesso.");
                saques[numSaques] = datinha;
                incrementaSaque();
                System.out.println("Feito no dia: ");
                saques[numSaques - 1].mostrar();
    
                saldo -=valor;
            }
        }
    }

    public void tranferir(double valor, String data, ContaBancaria conta2){
        Data datinha = new Data(data);
        Boolean aux = datinha.dataValida(datinha);
        if (aux == false){
            System.out.println("Data invalida, operacao cancelada.");
            return;
        }
        else{
            if (saldo >= valor && valor > 0){
                sacar(valor, data);
                conta2.depositar(valor, data);
                System.out.println("Transferencia realizada com sucesso.\n\n");
                transferencias[numTransferecias] = datinha;
                incrementaTransferencia();
                System.out.println("Transferencia feita no dia: ");
                transferencias[numTransferecias - 1].mostrar();
    
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
}

