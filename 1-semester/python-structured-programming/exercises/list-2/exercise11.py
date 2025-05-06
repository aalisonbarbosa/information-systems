# Faça um Programa que peça 2 números inteiros e um número real. Calcule e mostre: 
# • o produto do dobro do primeiro com metade do segundo . 
# • a soma do triplo do primeiro com o terceiro. 
# • o terceiro elevado ao cubo.

num1 = int(input("Digite um número inteiro: "))
num2 = int(input("Digite outro número inteiro: "))
num3 = float(input("Digite outro número real: "))

produtoDosNumeros =  (num1 * 2)/(num2 / 2)
triploDosNumeros = (num1 * 3) + num3
numeroElevadoAoCubo =  num3 ** 3

print("O produto do dobro do primeiro com metade do segundo: ", produtoDosNumeros)
print("A soma do triplo do primeiro com o terceiro: ", triploDosNumeros)
print("O terceiro elevado ao cubo: ", numeroElevadoAoCubo)