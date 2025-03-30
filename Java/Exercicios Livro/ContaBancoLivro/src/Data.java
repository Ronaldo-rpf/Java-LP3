
public class Data {
    private int dia;
    private int mes;
    private int ano;

    public Data(){
        dia=0;
        mes=0;
        ano=0;
    }

    public void dias(int dia, int mes, int ano){
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }

    public String retornar(){
        String aux = "\nDia: " + dia + "\nMes: "+mes+"\nAno: "+ano;
        return aux;
    }

    public void mostrarData(){
        System.out.println("Data de abertura da Conta: ");
        System.out.printf("Dia: %d\n",dia);
        System.out.printf("Mes: %d\n", mes);
        System.out.printf("Ano: %d\n", ano);
    }

}
