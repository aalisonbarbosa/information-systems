# João Papo-de-Pescador, homem de bem, comprou um microcomputador para controlar o rendimento diário de seu trabalho. Toda vez que ele traz um peso de peixes maior que o estabelecido pelo regulamento de pesca do estado de São Paulo (50 quilos) deve pagar uma multa de R$ 4,00 por quilo excedente. João precisa que você faça um programa que leia a variável peso (peso de peixes) e calcule o excesso. Gravar na variável excesso a quantidade de quilos além do limite e na variável multa o valor da multa que João deverá pagar. Imprima os dados do programa com as mensagens adequadas.

while True:
    pesoPeixe = float(input("Quilos de peixe: "))
    limiteDePesoPeixe = 50
    multaPorQuiloExcedente = 4

    if pesoPeixe > 0:
        if pesoPeixe > limiteDePesoPeixe:
            excessoPeso = pesoPeixe - limiteDePesoPeixe
            multa = excessoPeso * multaPorQuiloExcedente

            print("Limite de Peso: 50kg")
            print("Quilos além do limite estabelecido: ", excessoPeso, "kg")
            print("Valor da multa: ", multa,"R$")
        else:
            print("Peso abaixo do limite. Não há multas!")
        break
    else :
        print("Insira um valor acima de 0")