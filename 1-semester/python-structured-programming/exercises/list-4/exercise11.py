# Altere o programa anterior para mostrar no final a soma dos números.

numero1 = int(input("Informe um número: ")) 
numero2 = int(input("Informe um número: "))

intervaloNumeros = ""
somaDosNumeros = 0

for num in range(numero1 + 1, numero2):
    intervaloNumeros = intervaloNumeros + (f"{num} ")
    somaDosNumeros = somaDosNumeros + num

print(f"Intervalo entre os números:\n{intervaloNumeros}\nSoma do intervalo entre os números:\n{somaDosNumeros}")