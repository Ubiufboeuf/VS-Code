#Creando un diccionario con dict()
diccionario = dict(nombre="Fede",edad=16)

#Las listas no pueden ser claves y usamos frozenset para meter conjuntos
diccionario = {frozenset(["a","b"]):99}

#Creando diccionarios con fromkeys() con 2 valores
diccionario = dict.fromkeys(["Fede","arararara"])

#Igual pero cambiando el defecto a "x"
diccionario = dict.fromkeys(["nombre","apellido"],"x")

print(diccionario)