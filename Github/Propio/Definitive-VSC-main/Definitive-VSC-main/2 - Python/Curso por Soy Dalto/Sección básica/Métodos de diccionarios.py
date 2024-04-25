diccionario = {
    "nombre" : 'federico',
    "apellido" : 'artencio',
    "edad" : 16
}

#Nos devuelve uun objeto dict_item
claves = diccionario.keys()

#Obteniendo un elemento con get(), si no encuentra nada el programa continúa
valor_de_diccionario = diccionario.get('o')

#Eliminando todo el diccionario
#   diccionario.clear()

#Eliminando un elemento del diccionario
diccionario.pop("nombre", "edad")

#Obteniendo un elemento dict_items iterable
diccionario_iterable = diccionario.items()

print(diccionario)
print(diccionario_iterable)