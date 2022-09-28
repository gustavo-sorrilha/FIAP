
print('Tabuada com WHILE')
 
num = int(input("Digite um numero para obter a tabuada: "))
 
while(num != 5):
    print("Não pode ser outro número diferente de 5")
    num = int(input("Digite o número 5:  "))
 
i = 1
 
while(i < 11):
    r = num * i
    print(f'{num} X {i} = {r}')
    i = i + 1