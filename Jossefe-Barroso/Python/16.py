
v1 = float(input('Digite o primeiro lado do triângulo: '))
 
v2 = float(input('Digite o segundo lado do triângulo: '))

v3 = float(input('Digite o terceiro lado do triângulo: '))

if (v1 + v2 < v3) or (v1 + v3 <v2) or (v2 + v3 < v1):
   print("Não é um triângulo")

elif (v1 == v2) and (v1 == v3):
   print("Equilatero")

elif (v1 == v2) or (v1 == v3) or (v2 == v3):
   print("Isosceles")

else:
  print("Escaleno")