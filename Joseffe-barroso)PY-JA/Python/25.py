n = input(input("Digite o seu nome: "))

s = input('Digite o sexo (M/F): ')
 
e = input(input('Digite o estado civil (C/S): '))

if (s == "F") and (e == "C"):
        tempo = float(input("Digite o tempo de casada (anos):  "))
        print("Obrigado por participar da pesquisa")
elif (s == "M"):
    print("Obrigado por participar da pesquisa")
else:
    print("Tamo junto!")