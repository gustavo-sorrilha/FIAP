matriz = [ [0,0,0,0], [0,0,0,0], [0,0,0,0] ]

for l in range(0, 3, 1):
    for c in range(0, 4, 1):
        matriz[l][c] = int(input("Digite um numero: "))

for i in range(0, 3, 1):
    print(matriz[i])

x = int(input("Digite um numero para constante multiplicativa: "))

for l in range(0, 3, 1):
    for c in range(0, 4, 1):
        matriz[l][c] = matriz[l][c] * x

for i in range(0, 3, 1):
    print(matriz[i])