import java.time.LocalDate;

public class Data {
    private int dia;
    private int mes;
    private int ano;
    
    public int getAno(){
        return ano;
    }

    public int getMes(){
        return mes;
    }

    public int getDia(){
        return dia;
    }

    public void setAno(int _ano){
        ano = _ano;
    }

    public void setMes(int _mes){
        mes = _mes;
    }

    public void setDia(int _dia){
        dia = _dia;
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
        dia = Integer.parseInt(data.substring(0, 2));
        mes = Integer.parseInt(data.substring(3, 5));
        ano = Integer.parseInt(data.substring(6, 10));
    }

    public int calcularIdade(Data data){
        Boolean aux = dataValida(data);
        if (aux == false){
            System.out.println("Data invalida, calculo encerrado.");
            return 0;
        }
        Data hoje = new Data();
        if (hoje.ano < data.ano || hoje.ano == data.ano){
            System.out.println("Data invalida.");
            return 0;
        }
        else if (hoje.mes == data.mes){
            if (hoje.dia > data.dia){
                return hoje.ano - data.ano - 1;
            }
            else if (hoje.dia == data.dia){
                return hoje.ano - data.ano;
            }
            else{
                return hoje.ano - data.ano;
            }
        }
        else if (hoje.mes < data.mes){
            return hoje.ano - data.ano - 1;
        }
        else{
            return hoje.ano - data.ano;
        }
    }

    public Boolean dataValida(Data valida){
        int[] meses = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        if (valida.mes <= 0 || valida.mes > 12){
            setar(valida);
            return false;
        }
        else if (valida.dia <= 0 || valida.dia > meses[valida.mes + 1]){
            setar(valida);
            return false;
        }
        else if (valida.ano <= 1930 || valida.ano > getAno()){
            setar(valida);
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

    private void setar(Data data){
        LocalDate sistema = LocalDate.now();
        data.mes = sistema.getMonthValue();
        data.dia = sistema.getDayOfMonth();
        data.ano = sistema.getYear();
    }

    public void mostrar(){
        System.out.println("Dia: "+dia+"\nMes: "+mes+"\nAno: "+ano);
    }
    
}
