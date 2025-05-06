# Faça um Programa que peça dois números e imprima o maior deles.

numeros = []

num1 = int(input("Digite um número: "))
num2 = int(input("Digite outro número: "))

numeros.append(num1)
numeros.append(num2)

maiorNumero =  sorted(numeros, reverse=True)[0]

print("O maior número é:", maiorNumero)