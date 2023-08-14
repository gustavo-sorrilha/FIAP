numeros = []
pos = -1
n = "s"

qtd = int(input("Digite a quantidade de valores a serem preescritos: "))

while (qtd <= 0 or qtd > 20):
    print("Opa! O limite e até 20")
    qtd = int(input("Digite a quantidade de valores a serem preescritos: "))

for i in range(0, qtd, 1):
    numeros.append(int(input("Digite um valor: ")))

while (n == "s"):
  v = int(input("Digite um numero para ser localizado no array: "))
  pos = -1
  for i in range(0, qtd, 1):
    if (numeros[i] == v):
      pos = i

  if (pos != -1):
    print('O valor foio encontrado na posição', pos)

  else:
    print("Valor não encontrado.")
  
  n = input("Deseja realizar uma nova consulta? (s/n): ")

print("Obrigado")
