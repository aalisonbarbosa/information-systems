# Faça um Programa que leia 2 números e em seguida pergunte ao usuário qual operação ele deseja realizar. O resultado da operação deve ser acompanhado de uma frase que diga se o número é: 
# par ou ímpar;
# positivo ou negativo; 
# inteiro ou decimal.

numero1 = float(input("Digite o primeiro número: "))
numero2 = float(input("Digite o segundo número: "))

operacao = input("Digite a operação desejada (+, -, *, /): ")

resultadoOperacao = eval(numero1 + operacao + numero2)

print("O resultado da operação é:", resultadoOperacao)

# Verifica se o resultado é par ou ímpar
if resultadoOperacao % 2 == 0:
    print("O resultado é par.")
else:
    print("O resultado é ímpar.")

# Verifica se o resultado é positivo ou negativo
if resultadoOperacao < 0:
    print("O resultado é negativo.")
else:
    print("O resultado é positivo.")

# Verifica se o resultado é inteiro ou decimal
if round(resultadoOperacao) == resultadoOperacao:
    print("O resultado é inteiro.")
else:
    print("O resultado é decimal.")
