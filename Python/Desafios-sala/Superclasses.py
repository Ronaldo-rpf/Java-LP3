class SensorBase:
    def coletarDados(self):
        return "Coletando dados genericos"
    
class SensorTemperatura(SensorBase):
    def coletarDados(self):
        dados = super().coletarDados()
        return "Temperatura 22ºC\n" + dados
    
class SensorUmidade (SensorBase):
    def coletarDados(self):
        dados = super().coletarDados()
        return "Umidade: 45%\n" + dados
    
class SensorComposto (SensorTemperatura, SensorUmidade):
    def coletarDados(self):
        return super().coletarDados()
    




sensor1 = SensorTemperatura()
sensor2 = SensorUmidade()
print(sensor2.coletarDados())
print(sensor1.coletarDados())
print("\n\n\n")
sensor3 = SensorComposto()
print("Dados combinados:\n" + sensor3.coletarDados().replace("Coletando dados genericos", ""))