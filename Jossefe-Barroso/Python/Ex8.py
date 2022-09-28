from ctypes.wintypes import FLOAT


p1 = float(input("Informe sua primeira nota:"))
p2 = float(input("Informe sua segunda nota:"))

media = (p1 + p2) / 2

if media < 6:
    print("Reprovado!")

else:
    print("Aprovado!")