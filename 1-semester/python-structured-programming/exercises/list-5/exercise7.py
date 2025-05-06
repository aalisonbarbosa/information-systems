# • 7) Crie um método que receba o valor em celsius e converta a farenheit

temperatura = float(input("Informe uma temperatura: "))

def converterTemperatura(temp):
    tempFah = (temp*1.8) + 32

    return tempFah

print(converterTemperatura(temperatura))