v1 = float(input('Digite a velocidade inicial (m/s): '))
 
a1 = float(input('Digite a aceleração (m/s):  '))

tp = float(input('Digite o tempo do percurso (s): '))

V = v1 + a1 * tp

if (V < 40):
  input("Veiculo muito lento")

elif (V < 60):
  input("Velocidade permitida")

elif (V < 80):
  input("Velocidade de cruzeiro")

elif (V < 120):
  input("Veiculo rápido")

else:
  input("Veiculo muito rápido")