print('''[ 1 ] À vista em dinheiro ou cheque, recebe 10 porcento de desconto
[ 2 ] À vista no cartão de crédito, recebe 15 porcento de desconto
[ 3 ] Em duas vezes, preço normal de etiqueta sem juros
[ 4 ] Em duas vezes, preço normal de etiqueta mais juros de 10%''')
opção = int(input("Qual é a sua opção?")) 

a = float(input("Digite o valor a ser pago: "))

if opção == 1:
    r = a * 0.1 
    t = a - r
    print("O valor a ser pago é R$",t)
elif opção == 2:
    r = 0.15 * a 
    t = a - r
    print("O valor a ser pago é R$",t)
elif opção == 3:
    r = a/2
    print("O valor a ser pago é 2 vezes de R$",r)
elif opção == 4: 
    r = a * 0.1
    t = a + r    
    print("O valor a ser pago é R$",t)