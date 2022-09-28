sequencia = int(input("Qual é o valor do termo?"))

while (sequencia <= 0) or (sequencia > 50):
    sequencia = int(input("O valor da sequência de termos deve ser positivo e menor que cinquenta. Informe novamente: "))

n = 1
denominator = 2
index = 1
sumNumbers = 0

while (index < sequencia):
    n  = (index ** 2) + 1
    denominator = (index ** 3)
    divisao = n  / denominator
    if (index == 1): print(f'{n }')
    else: print(f"{n }/{denominator}")
    index = index + 1
    sumNumbers = sumNumbers + divisao

print('A soma é: %.2f' %sumNumbers)