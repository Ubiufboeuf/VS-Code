'''
#Creando datos
datos = ("Fede","Artencio",200)

#Desempaquetando (asignando) - Funciona en tuplas () y listas {}
nombre,apellido, numero_random = datos

#Mostrando resultado
print(numero_random)
'''


'''
#Creando una tupla con tuple()
tupla = tuple(["a","B"])

#Creando una tupla sin parentesis de varios datos
tupla = "a","B"

#Creando una tupla sin () con un dato
tupla = "c",

print(tupla)
'''


'''
#Creando un conjunto con set()
conjuto_aparte = set(["Hola"])

#Subconjunto en un conjunto
subconjunto = frozenset(["A","B"])
conjunto = {subconjunto,"c?"}

print(conjunto)

#Teoría de conjuntos

conjunto1 = {1,3,5,7,9}
conjunto2 = {1,5,9}

#Conjunto 2 es subconjunto de conjunto 1
res = conjunto2.issubset(conjunto1)
res2 = conjunto2 <= conjunto1

#Conjunto 1 es superconjunto de conjunto 2
res = conjunto1.issuperset(conjunto2)
res2 = conjunto1 > conjunto2

#Verificando si hay algún número en común
resultado = conjunto2.isdisjoint(conjunto1) # Dará True si no hay ningún valor igual entre conjuntos

print(res)
print(res2)
print(resultado)
'''