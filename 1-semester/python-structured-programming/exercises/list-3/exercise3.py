# Faça um Programa que verifique se uma letra digitada é "F" ou "M". Conforme a letra escrever: F -Feminino, M -Masculino, Sexo Inválido.

while True:
    print("Opções de sexo:\nF - Feminino.\nM - Masculino.")
    sexo = input("Informe seu sexo: ")

    if sexo in "Ff":
        print("Sexo Feminino.")
    elif sexo in "Mm":
        print("Sexo Masculino.")
    else:
        print("Sexo Inválido!")
        continue
    break