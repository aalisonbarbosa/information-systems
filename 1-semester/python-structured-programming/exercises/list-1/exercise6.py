#6 Realiza a leitura de 1 float referente ao salário do cidadão e apresenta o salário com reajuste de 10% da inflação.

salario = float(input("Valor do Salário: "))

valorDoReajuste = 1.1
salarioReajustado = salario * valorDoReajuste

print("Salário com reajuste de 10% da inflação: ", salarioReajustado)