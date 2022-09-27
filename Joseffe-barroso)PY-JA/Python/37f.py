


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

for index in range(b,a-1,-1):
    r = num * index
    print(f'{num} X {index} = {r}')
    index = index + 1


