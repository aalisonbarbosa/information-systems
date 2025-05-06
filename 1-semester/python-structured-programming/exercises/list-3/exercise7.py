# Faça um programa que pergunte o preço de três produtos e informe qual produto você deve comprar, sabendo que a decisão é sempre pelo mais barato.

precoProduto1 = float(input("Digite o preço do primeiro produto: "))
precoProduto2 = float(input("Digite o preço do segundo produto: "))
precoProduto3 = float(input("Digite o preço do terceiro produto: "))

if precoProduto1 < precoProduto2 and precoProduto1 < precoProduto3:
    print("O produto mais barato é o primeiro, no valor de R$", precoProduto1)
elif precoProduto2 < precoProduto1 and precoProduto2 < precoProduto3:
    print("O produto mais barato é o segundo, no valor de R$", precoProduto2)
else:
    print("O produto mais barato é o terceiro, no valor de R$", precoProduto3)