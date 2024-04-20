# Creando una lista con "list"
lista = list(["hola", "Fede",16,88,79, False])
lista2 = list([1,2,3,88,20,4090,False,True])

#Devuelve la cantidad de elementos de la lista
cantidad_elementos = len(lista)

#Agregando un elemento a la lista
lista.append("xd")

#Agregando un elemento a lla lista en un índice específico
lista.insert(2,"A")

#Agregando varios elementos a la lista
lista.extend([True,4060])

#Eliminando un elemento de la lista por su índice, con -n elimina desde final n índice
lista.pop(3)

#Removiendo un elemento de la lista por su valor
lista.remove(88)

#Eliminando todos los elementos de la lista
#   lista.clear()

#Ordenando la lista de forma ascendente, o descendente (con reverse=True)
lista2.sort()

#Invirtiendo los elementos de una lista
lista2.reverse()