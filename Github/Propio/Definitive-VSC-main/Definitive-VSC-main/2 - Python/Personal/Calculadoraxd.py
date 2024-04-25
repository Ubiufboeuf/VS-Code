from os import system

system("cls")
a = int(input("Número 1: "))
b = int(input("Número 2: "))
operador = str(input("Elige una operación aritmética: "))

if (operador == '+' | operador == 'suma'):
    print(f"Resultado de {a} + {b} = {a+b}")