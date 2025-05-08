class Funcionario:
    def calcularBonus(self):
        return 500.0

class Gerente(Funcionario):
    def calcularBonus(self):
        return 2000.0
    
class Operario(Funcionario):
    def calcularBonus(self):
        return 1000.0
    
func1 = Funcionario()
func2 = Gerente()
func3 = Operario()
lista = [func1, func2, func3]

print(func1.calcularBonus())
print(func2.calcularBonus())
print(func3.calcularBonus())
print()

for f in lista:
    print(f"Bonus: R$ {f.calcularBonus()}") 