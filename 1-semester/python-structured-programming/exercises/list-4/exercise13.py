# Faça um programa que peça dois números, base e expoente, calcule e mostre o primeiro número elevado ao segundo número. Não utilize a função de potência da linguagem.

while True:
    base = int(input("Informe um número base: "))
    expoente = int(input("Informe um expoente: "))

    resultado = base ** expoente

    print(f"{base} ** {expoente} = {resultado}")
    break