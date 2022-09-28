numeros = []

for i in range(1,21,1):
    numeros.append(int(input("Digite um valor: ")))
    

c = int(input("Digite um valor para a constante: "))

for i in range(0,20,1):
    numeros[i] = numeros[i] + c
    print(numeros[i])
    
