
public class Conta {
    private String titular;
    private int numero;
    private String agencia;
    private double saudo;
    private Data dataDeAbertura = new Data();

    public Conta(){
        titular = "Danilo";
        numero = 0;
        agencia = "";
        saudo = 0;
    }

    public void definirData(int dia, int mes, int ano){
        dataDeAbertura.dias(dia, mes, ano);
    }

    public void recuperaDadosParaImpressao(){
        System.out.printf("Titular: %s\n", titular);
        System.out.printf("Numero da Conta: %d\n", numero);
        System.out.printf("Agencia: %s\n", agencia);
        System.out.printf("Saudo: %f\n", saudo);
        dataDeAbertura.mostrarData();
        System.out.println(dataDeAbertura.retornar());
    }

    public String getTitular() {
        return titular;
    }

    public int getNumero(){
        return numero;
    }

    public String getAgencia(){
        return agencia;
    }

    public double getSaudo(){
        return saudo;
    }

    public String getDataDeAbertura(){
        return dataDeAbertura;
    }

    public void setTitular(String nome){
        titular = nome;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void setAgencia(String nome){
        agencia = nome;
    }

    public void setSaudo(double valor){
        saudo = valor;
    }

    public void setDataDeAbertura(String data){
        dataDeAbertura = data;
    }

    public void saca(double valor){
        if (valor < 0){
            System.out.println(" Valor impossivel de se sacar.");
        }
        else if (saudo < valor){
            System.out.println("Saudo Insuficiente.");
        }
        else{
            saudo -= valor;
        }
    }

    public void deposita(double valor){
        if (valor < 0){
            System.out.println("Valor impossivel de se depositar.");
        }
        else{
            saudo += valor;
        }
    }

    public double calculaRendimento(){
        return saudo*0.1;
    }



    
}
