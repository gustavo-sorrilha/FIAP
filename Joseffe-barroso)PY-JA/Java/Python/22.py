from ast import If
from socket import if_indextoname
from time import sleep


A = int(input("Digite o primeiro valor:"))
B = int(input("Digite o segundo valor:"))

print('''[ 1 ] Multiplicação
[ 2 ] Adição
[ 3 ] Divisão
[ 4 ] Subtração
[ 5 ] Fim de processo''')
opcao = int(input("Qual é a sua opção?")) 

if opcao == 1:
    r = A * B
    print("A multiplicação deu", r)
       
elif opcao == 2:
    r = A + B
    print("A soma deu", r)
       
elif opcao == 3:
    r = A/B
    print("A divisão deu", r)
elif opcao == 4:
    r = A - B
    print("A subtração deu", r)
elif opcao == 5:
 
    print("Finalizando...")
         
else:
 print("Opção inválida. Tente novamente")
 

print("Fim do programa! Volte sempre")