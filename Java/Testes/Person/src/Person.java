public class Person {
    String primeiroNome;
    String segundoNome;
    String ocupacao;
    int idades;
    int ex;
    Integer idade = new Integer(100);

    public Person(){
        this.primeiroNome = "ronaldo";
        this.segundoNome = "porto";
        this.idades = 10;
    }

    public void mostrar (){
        System.out.printf("%d \n%d\n", idades, idade);
    }


}
