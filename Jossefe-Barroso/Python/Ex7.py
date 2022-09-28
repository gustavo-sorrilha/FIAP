a = float(input("Digite o valor do Primeiro Produto:" ))
b = float(input("Digite o valor do Segundo Produto:" ))
c = float(input("Digite o valor do Terceiro Produto:" ))
d = float(input("Digite o valor do Quarto Produto:" ))
e = float(input("Digite o valor do Quinto Produto:" ))

Preço = a+b+c+d+e

print("O valor total dos produtos é:", Preço)

Pagamento = float(input("Informe o valor em dinheiro:"))

Troco = Pagamento - Preço

print("O seu troco deu", Troco)
