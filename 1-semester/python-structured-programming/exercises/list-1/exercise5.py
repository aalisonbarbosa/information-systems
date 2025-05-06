#5 Realiza a leitura de 1 float referente ao valor de um produto e imprime o valor com descontos de 10%, 20% e 50%.

valorProduto = float(input("Valor do Produto: "))

valorProdutoComDescontoDe10Porcento = valorProduto * 0.9
valorProdutoComDescontoDe20Porcento = valorProduto * 0.8
valorProdutoComDescontoDe50Porcento = valorProduto * 0.5

print("Valor com Desconto de 10%: ", valorProdutoComDescontoDe10Porcento)
print("Valor com Desconto de 20%: ", valorProdutoComDescontoDe20Porcento)
print("Valor com Desconto de 50%: ", valorProdutoComDescontoDe50Porcento)