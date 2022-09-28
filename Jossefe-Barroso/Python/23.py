print('''[ 1 ] Triângulo
[ 2 ] Quadrado
[ 3 ] Retângulo
[ 4 ] Círculo
[ 5 ] Fim de processo''')
opção = int(input("Qual é a sua opção?")) 

if opção == 1:
    print("A fórmula do triângulo é base x altura/2")
    A = int(input("Digite o primeiro valor:"))
    B = int(input("Digite o segundo valor:"))

    r = (A * B)/2
    print("A área deu",r)

elif opção == 2:
    print("A fórmula do quadrado é base x altura")
    A = int(input("Digite o primeiro valor:"))
    B = int(input("Digite o segundo valor:"))

    r = (A * B)
    print("A área deu",r)

elif opção == 3:
    print("A fórmula do retângulo é base x altura")
    A = int(input("Digite o primeiro valor:"))
    B = int(input("Digite o segundo valor:"))

    r = (A * B)
    print("A área deu",r)

elif opção == 4:
    print("A fórmula do círculo é π x r^2")
    A = int(input("Digite o valor do raio: "))
    

    r = 3,14 * A^2
    print("A área deu",r)

elif opção == 5:
    print("Finalizando ...")

else:
    print("Opção inválida. Tente novamente")

print("Fim do programa! Volte sempre")
