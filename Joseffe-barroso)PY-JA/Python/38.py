



num = 1
while (num < 20):
    for i in range(1, 21, 1):
        r = num * i
        print(f'{num} X {i} = {r}')
        i = i + 1
    
        if(i == 21):
            continuar = input("Digite um ok para continuar: ")
 
            if (continuar == "ok"):
                print("Continuemos")
                num = num + 1

                    


    

