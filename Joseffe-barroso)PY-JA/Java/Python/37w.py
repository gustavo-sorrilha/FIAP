num = int(input("Digite o primeiro numero:  "))

while(num <= 0 ):
    print("Não pode numero negativo!")
    num = int(input("Digite o primeiro numero:  "))

a = int(input("Digite o ínicio do intervalo: "))
b = int(input("Digite o fim do intervalo:  "))

while(b < a):
    print("O primeiro valor não pode ser maior que o segundo")
    b = int(input("Digite o B novamente:  "))

index = 1

while(b >= a):
    t = num * b
    print(num, "X", b,"=",t)
    b = b - 1