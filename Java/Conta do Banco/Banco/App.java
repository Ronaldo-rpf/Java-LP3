public class App {
    public static void main (String[] args){
        Data nascimento = new Data("02/02/2006");
        Boolean aux = nascimento.dataValida(nascimento);
        if (aux == false){
            System.out.println("Data invalida. Programa encerrado.");
            return;
        }
        ContaBancaria conta1 = new ContaBancaria("Ronaldo", "076.968.295-21", nascimento);
        conta1.exibirInformacoes();

        int idade = nascimento.calcularIdade(nascimento);
        System.out.println("idade do titular: "+idade);
    }
}

