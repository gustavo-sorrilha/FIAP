s = input('Digite o sexo (M/F): ')
 
p = float(input('Digite o peso (kg): '))

a = float(input('Digite a altura (m)'))

imc = p/(a * a)

if (s == "M"):
 if ( imc < 20):
   print("Abaixo do peso")

 elif ( imc < 25):
    print("Peso ideal")

 else:
  print("Acima do peso")

if (s == "F"):
 if (imc < 19):
   print("Abaixo do peso")

 elif (imc < 24):
    print("Peso ideal")

 else:
    print("Acima do peso")

