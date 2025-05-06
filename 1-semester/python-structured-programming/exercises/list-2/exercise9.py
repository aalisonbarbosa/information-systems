# Faça um Programa que peça a temperatura em graus Fahrenheit, transforme e mostre a temperatura em graus Celsius. 
# • C = (F−32) ÷ 1.8.

temperaturaFahrenheit = float(input("Temperatura em graus fahrenheit: "))
temperaturaCelsius = ((temperaturaFahrenheit - 32) / 1.8)

print("Temperatura em graus celsius: ", round(temperaturaCelsius, 2))