#1 Realiza a leitura de 2 floats e imprime as seguintes operações: soma, subtração, multiplicação, divisão e resto da divisão.

numero1 = float(input("Digite um número: "))
numero2 = float(input("Digite outro número: "))

somaNumeros = numero1 + numero2
subtracaoNumeros = numero1 - numero2
multiplicacaoNumeros = numero1 * numero2
divisaoNumeros = numero1 / numero2
restoDivisaoNumeros = numero1 % numero2

print("Soma dos números: ", somaNumeros)
print("Subtração dos números: ", subtracaoNumeros)
print("Multiplicação dos números: ", multiplicacaoNumeros)
print("Divisão dos números: ", divisaoNumeros)
print("Resto da divisão dos números: ", restoDivisaoNumeros)