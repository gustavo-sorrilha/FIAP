numeros = []
resultado = []

for i in range(0,5,1):
    numeros.append(int(input("Digite um valor: ")))

c = int(input("Digite um valor para a constante: "))

for i in range(0,5,1):
    resultado.append(c * numeros[i])

print("Array Numeros: ", numeros)
print("Array final: ", resultado)


  