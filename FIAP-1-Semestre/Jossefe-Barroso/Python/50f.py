number = int(input("Digite um valor inicial: "))
number2 = int(input("Digite um valor final: "))


while(number > number2):
    print("Os valor inicial não pode ser maior que o final")
    number2= int(input("Digite outro valor final: "))

soma = 0
for number in range (number, number2 + 1 ,1):
    soma = soma + number

    print(soma)
