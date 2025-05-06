# • 4) Crie um método que receba o peso e altura e retorne o IMC.

peso = float(input("Informe seu peso: "))
alt = float(input("Informe sua altura (m): "))

def calcularIMC(peso, alt):
    imc = peso / alt**2

    return imc

print(calcularIMC(peso, alt))