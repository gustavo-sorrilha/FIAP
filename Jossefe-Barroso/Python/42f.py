q = int(input("Qual é o valor da sequencia? "))
while (q <= 0 or q > 100): 
  q = int(input("O valor da sequência deve ser positivo e menor que cem. Informe novamente: "))

sequencia = 2
sumNumbers = 0

for index in range(2, q + 2, 1):
  print(sequencia)
  sumNumbers = sumNumbers + sequencia
  sequencia = index**2+1

print(f"A soma dos valores deu: {sumNumbers}")
