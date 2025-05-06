# • Faça um Programa que peça a temperatura em graus Celsius, transforme e mostre em graus Fahrenheit.
# • F = (C×1.8) + 32

temperaturaCelsius = float(input("Temperatura em graus celsius: "))
temperaturaFahrenheit = (temperaturaCelsius * 1.8) + 32

print("Temperatura em graus fahrenheit: ", round(temperaturaFahrenheit, 2))