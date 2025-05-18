from abc import ABC, abstractmethod

class IAutenticavel (ABC):
    @abstractmethod
    def autenticar(self, senha: int):
        pass

class ICRAA (ABC):
    @abstractmethod
    def calcularCRAA(self):
        pass

class Usuario (ABC):
    nome: str

class Professor (Usuario, IAutenticavel):
    senha: int

    def __init__(self, nome, senha):
        self.nome = nome
        self.senha = senha
    
    def autenticar (self, senha):
        if self.senha == senha:
            return True
        else:
            return False
    
class Aluno (Usuario, ICRAA):
    matricula: int

    def __init__(self, nome, matricula):
        self.matricula = matricula
        self.nome = nome

    def calcularCRAA(self):
        return 7.5
    
def main():
    print("Qual o nome do professor?")
    nome = str(input("Nome: "))
    senha = 115
    prof = Professor(nome, senha)
    print()
    while True:    
        print(f"Qual a senha do professor {prof.nome}?")
        senha = int(input("Senha: "))
        if prof.autenticar(senha):
            break
        else:
            print("Senha incorreta, tente novamente.")

    print("Senha correta! Professor autenticado.")    


    print()
    print("Qual o nome do aluno?")
    nome = str(input("Nome: "))
    print("Qual a matricula do aluno?")
    mat = str(input("Matricula: "))
    aluno = Aluno(nome, mat)
    print(f"Nome do aluno: {aluno.nome}\nMatricula do aluno: {aluno.matricula}\nCRAA do aluno: {aluno.calcularCRAA()}")

    return

if __name__ == "__main__":
    main()
    print("Fim do programa.")