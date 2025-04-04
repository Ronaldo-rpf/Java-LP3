import java.time.LocalDate;

public class Data {
    private int dia;
    private int mes;
    private int ano;
    
    public int getAno(){
        return ano;
    }

    public Data(){
        LocalDate sistema = LocalDate.now();
        mes = sistema.getMonthValue();
        dia = sistema.getDayOfMonth();
        ano = sistema.getYear();
    }
    public Data(int dia, int mes, int ano){
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;

    }

    public Data (String data){
        System.out.println(data.length());
        dia = Integer.parseInt(data.substring(0, 2));
        mes = Integer.parseInt(data.substring(3, 5));
        ano = Integer.parseInt(data.substring(6, 10));
    }

    public Boolean dataValida(Data valida){
        int[] meses = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        if (valida.mes <= 0 || valida.mes > 12){
            return false;
        }
        else if (valida.dia <= 0 || valida.dia > meses[valida.mes + 1]){
            return false;
        }
        else if (valida.ano <= 1930 || valida.ano > getAno()){
            return false;
        }
        else{
            return true;
        }
    }

    public static Boolean isEqual(Data data1, Data data2){
        if (data1.dia == data2.dia && data1.mes == data2.mes && data1.ano == data2.ano){
            return true;
        }
        else{
            return false;
        }
    }
    
}

NUNCA ACESSE DIRETAMETNE A VARIAVEL, É SEMPRE PELO GET OU PELO SET