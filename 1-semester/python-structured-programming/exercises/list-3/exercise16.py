# Faça um Programa que peça um número e informe se o número é inteiro ou decimal. Dica: utilize uma função de arredondamento.

while True:
    numero = float(input("Digite um número: "))

    if round(numero) == numero:
        print("O número é inteiro.")
    else: 
        print("O número é decimal.")
    break