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
