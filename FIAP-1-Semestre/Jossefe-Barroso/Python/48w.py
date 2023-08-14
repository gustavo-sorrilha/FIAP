number = int(input("Digite o valor de n: "))
while (number <= 0): number = int(input("Informe somente valores positivos: "));

f = 1
m = 2
while (m <= number):
    f = f*m

    m = m + 1
    
    if (m - 1 == number):
        print(f"O valor de {number}! é = {f}")

        userAnswer = input("\nDeseja executar o programa novamente? 'SIM' ou 'NAO': ")
        while (userAnswer != 'SIM' and userAnswer != 'NAO'): 
            userAnswer = input("Deseja executar o programa novamente? 'SIM' ou 'NAO': ")
        if (userAnswer == 'SIM'): 
            m = 2
            f = 1
            
            number = int(input("Digite o valor de n: "))
            while (number <= 0): number = int(input("Informe somente valores positivos: "));