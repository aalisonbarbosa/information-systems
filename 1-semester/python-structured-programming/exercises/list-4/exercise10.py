# Faça um programa que receba dois números inteiros e gere os números inteiros que estão no intervalo compreendido por eles

numero1 = int(input("Informe um número: ")) 
numero2 = int(input("Informe um número: "))

intervaloNumeros = ""

for num in range(numero1 + 1, numero2):
    intervaloNumeros += (f"{num} ")
print(f"Intervalo entre os números:\n{intervaloNumeros}")