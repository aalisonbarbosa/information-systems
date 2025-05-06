# Faça um Programa que pergunte quanto você ganha por hora e o número de horas trabalhadas no mês. 
# • Calcule e mostre o total do seu salário no referido mês.

ganhoPorHora = float(input("Ganho por hora: "))
horasTrabalhadasNoMes = float(input("Horas trabalhadas no mês: "))

salarioPorMes = ganhoPorHora * horasTrabalhadasNoMes

print("Sálario por mês: R$", salarioPorMes)