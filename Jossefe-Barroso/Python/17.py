t1 = float(input('Digite a altura do triangulo: '))
 
c1 = float(input('Digite o cateto: '))

c2 = float(input('Digite o cateto: '))

SmCatetos = c1**2 + c2**2

if (t1**2 == SmCatetos):
   print("É um triângulo retângulo")

else:
    print("Não é um triângulo retângulo")