p1 = float(input('Digite a primeira nota do 1 semestre: '))
 
p2 = float(input('Digite a segunda nota do 1 semestre:  '))

MEDIA = (p1 + 2 * p2) / 3

if ( MEDIA < 5):
  print("Reprovado")

else:
  print("Aprovado")