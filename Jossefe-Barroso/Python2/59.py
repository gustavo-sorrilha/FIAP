nomes = []
sexo = []
age = []

for i in range(1,101,1):
    nome = (input("Digite um nome: "))
    sex = input("Digite o sexo da pessoa (F/M): ")
    idade = int(input("Digite a idade da pessoa : "))
    
    if (idade > 17):
        sexo.append(sex)
        nomes.append(nome)
        age.append(idade)
        

continuar = (input("Para continuar clique em uma tecla "))              
print("Nomes: ", nomes)
print("Sexo: ", sexo)
print("Idade: ", age)

