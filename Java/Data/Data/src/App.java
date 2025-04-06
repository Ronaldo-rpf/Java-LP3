public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!\n");

        Data dia1 = new Data();
        dia1.mostrar();

        Data dia2 = new Data("33/06/2007");
        dia2.mostrar();
        Boolean aux = dia2.dataValida(dia2);
        if (aux){
            System.out.println("valido");
        }
        else{
            System.out.println("nao valido, data resetada");
        }
        dia2.mostrar();

        aux = Data.isEqual(dia1, dia2);
        if (aux){
            System.out.println("Iguais");
        }
        else{
            System.out.println("nao sao iguais");
        }

        Data dia3 = new Data(2, 6,1950);
        dia3.mostrar();

        aux = dia3.dataValida(dia3);
        if (aux){
            System.out.println("valido");
        }
        else{
            System.out.println("nao valido, data resetada");
        }
    }
}
