from ctypes.wintypes import FLOAT

alt = float(input('Digite a sua altura em (m): '))
 
peso = float(input('Digite o seu peso (Kg): '))
 
imc = peso / (alt * alt)
 
if imc < 20:
    print("Abaixo do peso!")
elif imc < 25:
    print("Peso ideal!")
else:
    print("Acima do peso!")

