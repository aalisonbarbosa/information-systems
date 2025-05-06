# Faça um programa que leia 5 números e informe a soma e a média dos números.

numeros = []

while len(numeros) < 5:
    num = int(input("Informe um número: "))
    numeros.append(num)

somaDosNumeros =  sum(numeros)
mediaDosNumeros = somaDosNumeros / len(numeros)

print(f"A soma dos números é:\n{somaDosNumeros}.\nA média dos números é:\n{mediaDosNumeros}.")