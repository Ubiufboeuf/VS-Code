# Básicamente "if"

'''
    edad = "Diez y nueve"

    if edad > "Diez y nuev":
        print("Eres mayor de edad")
    else:
        print("No eres mayor de edad")

    - Terminal -
    Eres mayor de edad

Esto porque en caso de ser str se toman la cantidad de caracteres y de ahí se compara
por cantidad
'''

edad = 8

if edad >= 40:
    print("Edad >= 40")
    print(edad, " >= 40")
    
elif edad >= 18:
    print("Edad >= 18")
    print(edad, " >= 18")

else:
    print("Edad < 18")
    print(edad, " < 18")