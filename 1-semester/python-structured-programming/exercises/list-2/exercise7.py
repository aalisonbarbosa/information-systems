# Faça um Programa que calcule a área de um quadrado, em seguida mostre o dobro desta área para o usuário.

ladoDoQuadrado = float(input("Valor do lado do quadrado(cm): "))

areaDoQuadrado = ladoDoQuadrado ** 2
dobroAreaDoQuadrado = areaDoQuadrado * 2

print("Área do quadrado em dobro: ", dobroAreaDoQuadrado, "cm")