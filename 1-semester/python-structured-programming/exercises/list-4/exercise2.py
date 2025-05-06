# Faça um programa que leia um nome de usuário e a sua senha e não aceite a senha igual ao nome do usuário, mostrando uma mensagemde erro e voltando a pedir as informações.

while True:
    nomeUsuario = input("Digite seu nome: ")
    senhaUsuario = input("Digite sua senha: ")
    
    if nomeUsuario == senhaUsuario:
        print("Sua senha não pode ser igual a seu nome!\nTente novamente!")
        continue
    break