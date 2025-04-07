
public class Cliente {
    private String cpf;
    private String nome;
    private Data dataNascimento;

    public Cliente (String _nome, String _cpf, Data _nascimento){
        cpf = _cpf;
        nome = _nome;
        dataNascimento = _nascimento;
    }

    public void exibirCliente(){
        System.out.println("Titular: "+nome);
        System.out.println("CPF: "+cpf);
        System.out.println("Data de Nascimento: ");
        dataNascimento.mostrar();
    }
}
