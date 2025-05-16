import java.util.Scanner;

interface Autenticavel{
    public boolean autenticar(long senha);
}

interface CRAA{
    public double calcularCRAA();
}

abstract class Usuario{
    protected String nome;
}

class Professor extends Usuario implements Autenticavel{
    private long senha;

    public Professor(String nome, long senha){
        this.nome = nome;
        this.senha = senha;
    }

    @Override
    public boolean autenticar(long senha){
        if (this.senha == senha){
            return true;
        }
        else{
            return false;
        }
    }
}

class Aluno extends Usuario implements CRAA{
    private long matricula;

    public Aluno(String nome, long id){
        this.nome = nome;
        this.matricula = id;
    }

    @Override
    public double calcularCRAA(){
        return 7.5;
    }

    public long getMatricula(){
        return this.matricula;
    }
}

public class Interface {
    public static void main(String[] args){
        long senha;
        Scanner teclado = new Scanner(System.in);
        Professor prof = new Professor("Bravo", 115);
        Aluno aluno = new Aluno("Yuyu", 2024);
        System.out.println("Aluno: " + aluno.nome + "\nCRAA: " + aluno.calcularCRAA() + "\nMatricula: " + aluno.getMatricula());
        System.out.println();
        do{
            System.out.println("Professor: " + prof.nome);
            System.out.print("Senha: ");
            senha = Long.parseLong(teclado.nextLine());
        } while(!prof.autenticar(senha));

        System.out.println("Senha correta! Usuario (professor) autenticado.");
        teclado.close();
    }
}
