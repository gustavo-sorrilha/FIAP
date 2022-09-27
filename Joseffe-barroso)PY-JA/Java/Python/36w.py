 
v1 = int(input("Digite um numero para obter a tabuada: "))
 
while(v1 <= 0):
    print("Não pode numero negativo!")
    v1 = int(input("Digite um numero novamente para obter a tabuada: "))
 
i = 1
 
while(i < 11):
    r = v1 * i
    print(f'{v1} X {i} = {r}')
    i = i + 1