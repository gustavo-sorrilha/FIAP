nome = []
age = []

for i in range(1,101,1):
    nome.append(input("Digite um nome: "))
    age.append(int(input("Digite uma idade: ")))

print("Nomes: ", nome)
print("Idades: ", age)