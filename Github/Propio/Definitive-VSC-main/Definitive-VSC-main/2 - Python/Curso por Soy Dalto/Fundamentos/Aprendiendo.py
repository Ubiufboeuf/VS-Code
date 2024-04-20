x = "h"

nombre = "aaa"
print(nombre)

valor_de_papas = 300
valor_de_papas += 22
print(valor_de_papas)

print("hola " +nombre + ", las papas valen") # Acá no puedo poner una variable int, pero si:
nombre = "hola - " + x + " - jsjsjsjs"
print (nombre)

papitas = f"{300}"
queso = "si"
print(papitas + queso)

print("i" in queso) # con esto, si "i" pertenece a queso muestra "True", sino "False"
print("a" not in queso) # esto es lo mismo pero con negacion por el "not"
# estos serian in y ¬ in

equisde = "abcde"
buenas = f"hola " + equisde + " 000"
del equisde # acá "no funciona" el del porque equisde ya tiene el valor "abcde" y ya lo muestra como tal
print(buenas)

"""     gatito = "pqrst"
        del gatito
        logica = "???? " + gatito
        print(logica)
        """
# en este caso se crea y da valor a gatito, se borra gatito y luego se lo usa
""" sigo con un poco de dudas porque se supone que si se usa una variable, y se la borra
antes de un print deberia quedar con cambios, pero supongo que no seria así porque
se borra la variable pero no se puede editar en ningun lado, y como no se vuelve a intentar
modificar esa variable (por ejemplo llamandola especificamente a ella) no da error, ni con un print
"""



# me voy a alejar un poco de lo de arriba para salir del despelote














# Definiendo una variable con camelCase
nombreCompletoConApellido = "\"nombre\" \"apellido\""

#Definiendo una variable con snake_case (recomendado por Python)
nombre_completo_con_apellido = "nombre y apellido" # ni ganas de usar el \"

#Concatenar con +
ejemplo1 = "Hola " + "¿cómo estás?"

#Concatenar con f-strings - permite concatenar letras con numeros
ejemplo_numero_1 = 79
ejemplo2 = f"Hola {ejemplo_numero_1} , se ve todo xd?"

#Operadores de pertenencia (in / not in)
ejemplo3 = "federico"
print("f" in ejemplo3) #True - simón
print("o" not in ejemplo3) #Falso - noooooooooooooooooooooooooooooooo jsjsjssj

# vuevlo a bajar para alejarme un poco de esta parte
































"""ya no se ve la parte de arriba"""
'''guatafac, con exit() se sale de la terminal, y se puede usar acá sin estar en la terminal :O
con esto {
    from os import system
    system("cls")
se borra la terminal de python, tambien está ctrl+l y otra cosa más pero esta es la que me interesa
'''
from os import system
system("cls")


# Chau chau, me voy pa' abajo

































"""Ahora vamos a ver datos compuestos: lista - tupla - conjunto - diccionario"""

#listas son modificables
lista = ["Fede aaa", "OOOO", "MMmmm", True, 79]

#Tuplas no son modificables
tupla = ("Fede bbb", "1111", "mmMMM", False, 97)

#Mostramos valores para verificar que estén bien 👍 :O
print(lista)
print(lista[0]) #Con esto se muestra el primer valor, que se aloja en el índice 0

#Esta línea de codigo está bien porque las lsitas son modificables, y estamos cambiando el índice [3] poniendo otro valor
lista[3] = "pepito"

#Esta linea NO está bien porque las tuplas no son modificables y no podemos cambiar algun valor de indice
# tupla[3]


#Conjuntos - creo que tienen todas las propiedades de métodos discretos, al menos las improtantes (mirá vos cuales son)
Conjunto = {"Federico ccc", "2222", "MmMmM", "88"}

conjunto = {"Federico ????"} # Acá marco que se puede redefinir un conjunto, no editar, recrear (crear denuevo)

# conjunto[1] = "Artencio" --- Esta linea está mal porque no se puede usar indices con conjuntos

''' Datasos de conjuntos:
        1. En los conjuntos no se repiten valores, lo muestro abajo
        2. Para acceder a los datos individuales de un conjunto se necesita usar un bucle (aún no se como)
        3. Son datos desordenados
        4. 
'''

#Creamos un diccionario
diccionario = {
    # 'clave - key' : "Valor - value"
    'nombre' : "Fede",
    'Edad' : "16",
    'AprendiendoPython' : "Si"
}

print(diccionario[nombre])
#la siguiente linea es una forma erronea de mostrar una linea
#   print(diccionario[1])


"""
Para no tener todo desperdigado voy a crear otro archivo para seguir con los codigos, seguramente haga más para tener todo más
organizado, y lo que ya está en este archivo lo más probable es que lo deje como está, incluso si lo hace más difícil de entender,
pero sinceramente no veo las ganas de hacer un archivo para cada cosa, por si alguna vez lo hago, voy a darles nombres a cada uno
y así lo puedo hacer más cómodo de entender.
"""