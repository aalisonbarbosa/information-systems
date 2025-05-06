# Faça um Programa que leia três números e mostre-os em ordem decrescente

numeros = []

while len(numeros) < 3:
    numero = input("Digite um número: ")
    
    try:
        numero = int(numero)
        numeros.append(numero)
    except:
        print("Digite um número válido.")

numerosEmOrdemDecrescente = sorted(numeros, reverse=True)
saidaNumeros = ""

for i in range(len(numerosEmOrdemDecrescente)):
    saidaNumeros += f"{numerosEmOrdemDecrescente[i]}"
    
    if i < len(numerosEmOrdemDecrescente) - 1:
        saidaNumeros += ", "
    else: 
        saidaNumeros += "."

print("Os números digitados em ordem decrescente são:", saidaNumeros)