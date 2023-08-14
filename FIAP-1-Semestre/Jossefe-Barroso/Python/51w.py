a = int(input("Digite o número inicial: "))
b = int(input("Digite o número final: "))

while (a <= b):
    if (a >= 10):
        if (a % 2 == 0):
            print(a)
    a = a + 1
print("São os números pares no intervalo informado.")
print("Programa Encerrado")