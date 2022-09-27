


a = 0
b = 1
c = a + b

for i in range(1, 31,1):
    print(c)
    b = a
    a = c
    c = a+b

