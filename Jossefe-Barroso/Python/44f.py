sequencia = int(input("Qual é o valor do termo?"))

while (sequencia <= 0) or (sequencia > 50):
    sequencia = int(input("O valor da sequência de termos deve ser positivo e menor que cinquenta. Informe novamente: "))

numerator = 1
denominator = 2
sumNumbers = 0

for index in range(1, sequencia, 1):
    numerator = (index ** 2) + 1
    denominator = (index ** 3)
    divisao = numerator / denominator
    if (index == 1): print(f'{numerator}')
    else: print(f"{numerator}/{denominator}")
    sumNumbers = sumNumbers + divisao

print('A soma é: %.2f' %sumNumbers)