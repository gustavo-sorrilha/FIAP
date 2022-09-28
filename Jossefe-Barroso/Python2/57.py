nomes = []
sexo = []
age = []

for i in range(1,3,1):
    nome = (input("Digite um nome: "))
    sex = input("Digite o sexo da pessoa (F/M): ")
    idade = int(input("Digite a idade da pessoa : "))
    
    while (idade < 0):
        age = int(input("Digite a idade da pessoa novamente: "))
    

    if (sex == "F"):
        sexo.append(sex)
        nomes.append(nome)
        age.append(idade)

print("Nomes: ", nomes)
print("Sexo: ", sexo)
print("Idade: ", age)


