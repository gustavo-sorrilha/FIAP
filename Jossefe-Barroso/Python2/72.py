manha = []
tarde = []
noite = []
retorna = "s"
lotacao = 0
 
 
# Cria as linhas na Matriz
for i in range(0, 5, 1):
    manha.append([])
    tarde.append([])
    noite.append([])
 
# Cria para cada linha, cria as colunas na Matriz já gravando o valor digitado
for l in range(0, 5, 1):
    for c in range(0, 5, 1):    
        manha[l].append("_____")
        tarde[l].append("_____")
        noite[l].append("_____")

while(retorna=="s"):
    nome = input("Digite o nome da pessoa (com até 6 letras): ")
    turno = input("Digite o turno do show que você deseja (m/t/n): ")
    fileira = int(input("Digite a fileira que você deseja sentar (1 a 5)")) - 1
    cadeira = int(input("Digite a cadeira que você deseja sentar (1 a 5)")) - 1

    while (manha[fileira][cadeira] != "_____"):
        print("Esse assento já está reservado")
        fileira = int(input("Digite a fileira que você deseja sentar (1 a 5)")) - 1
        cadeira = int(input("Digite a cadeira que você deseja sentar (1 a 5)")) - 1
    while (tarde[fileira][cadeira] != "_____"):
        print("Esse assento já está reservado")
        fileira = int(input("Digite a fileira que você deseja sentar (1 a 5)")) - 1
        cadeira = int(input("Digite a cadeira que você deseja sentar (1 a 5)")) - 1
    while (noite[fileira][cadeira] != "_____"):
        print("Esse assento já está reservado")
        fileira = int(input("Digite a fileira que você deseja sentar (1 a 5)")) - 1
        cadeira = int(input("Digite a cadeira que você deseja sentar (1 a 5)")) - 1

    lugares[fileira][cadeira] = nome
    print("Reserva realizada com sucesso")
    lotacao = lotacao + 1

    if (lotacao != 20):
        retorna = input("Deseja realizar mais alguma reserva S/N: ")
    else:
        print("O show acabou de lotar! Bora!")
        break


print("Mapa dos lugares do show: ")

for i in range(0, 5, 1):
    print(lugares[i])
