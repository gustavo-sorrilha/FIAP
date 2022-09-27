b = int(input("Digite o valor da base:"))

h = int(input("Digite o valor da altura:"))

a = b * h

if (a > 100):
   print("A área do retângulo é",a)
   print("Terreno grande")  
elif (a < 100): 
   print("A área do retângulo é", a) 
   print("Terreno pequeno")
