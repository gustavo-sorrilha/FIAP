quantity = 10
sumNumbers = 0
mm = 0

for index in range (0, quantity, 1):
  n = int(input("Digite um número: "))

  if (index == 0):
    mm = n
  elif (n > nh):
    mm = n

  sumNumbers = sumNumbers + n

avarage = sumNumbers / quantity

print("Média", avarage)
print("Soma", sumNumbers)
print("Maior", nh)