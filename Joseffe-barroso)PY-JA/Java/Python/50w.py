number = int(input("Digite um valor inicial: "))
number2 = int(input("Digite um valor final: "))

while number > number2:
    print("O número inicial não pode ser maio que o final")
    int(input("Digite um valor final novamente:"))

soma=0

while number<=number2:
    soma = soma + number
    number = number + 1

print(f"A soma dos valores do intervalo é: {soma}")