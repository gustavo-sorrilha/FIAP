numeros = []

for i in range(1,11,1):
    numeros.append(int(input("Digite um valor: ")))

m = numeros[0]

for i in range(0,10,1):
    if (numeros[i] > m):
        m = numeros[i]
    
print("O maior numero de array é: ", m)
