import java.util.Scanner;

abstract class Pagamento{
    protected double valor;

    protected abstract void processar(double valor);
}

class CartaoCredito extends Pagamento{
    private long numero;

    public CartaoCredito(long numero, double valor){
        this.numero = numero;
        this.valor = valor;
    }

    @Override
    public void processar(double valor){
        System.out.println("Numero do cartao: " + this.numero);
        System.out.println("Pagamento realizado com cartao de credito.\nSaldo anterior: " + this.valor);
        this.valor -= valor;
        System.out.println("Saldo atual: " + this.valor);
        System.out.println();
    }

    public double getSaldo(){
        return this.valor;
    }
}

class Boleto extends Pagamento{
    private long codigo;

    public Boleto(long codigo, double valor){
        this.valor = valor;
        this.codigo = codigo;
    }

    @Override
    public void processar(double valor){
        System.out.println("Codigo do boleto: " + this.codigo);
        System.out.println("Pagamento processado com boleto.\nValor do boleto: " + this.valor);
        this.valor -= valor;
        System.out.println("Valor do boleto apos o pagamento: " + this.valor);
        System.out.println();
    }
}

class Pix extends Pagamento{
    private long chave;

    public Pix(long chave, double valor){
        this.valor = valor;
        this.chave = chave;
    }

    @Override
    public void processar(double valor){
        System.out.println("Chave pix: " + chave);
        System.out.println("Valor processado com pix.\nSaldo anterior: " + this.valor);
        this.valor -= valor;
        System.out.println("Saldo atual: " + this.valor);
        System.out.println();
    }
}

public class ClasseAbstrata{
    public static void main (String[] args){
        double fatura;
        Scanner teclado = new Scanner(System.in);

        CartaoCredito cartao = new CartaoCredito(123456789, 10000);
        System.out.println("Quanto deseja pagar no cartao de credito?\nSaldo atual: " + cartao.getSaldo());
        System.out.print("Valor: ");
        fatura = Double.parseDouble(teclado.nextLine());
        cartao.processar(fatura);

        Boleto boleto = new Boleto(5555, 3000);
        boleto.processar(2600);
        
        Pix pix = new Pix(7696829521l, 1500);
        pix.processar(250);

        teclado.close();
    }
}

