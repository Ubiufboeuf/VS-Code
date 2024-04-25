nombre = "Fede"
apellido = "Artencio"
nombre_completo = "Federico, Artencio"
texto_largo = "Texto sin importancia punto com equis de jajajaja jota ese jota ese a"
años = 18

#Convierte a mayúsculas
mayusc = nombre.upper()

#Convierte a minúsculas
minusc = nombre.lower()

#Primera letra en mayúscula (Convierte todo a minusc y luego la primera en mayusc)
primera_letra_mayusc = nombre.capitalize()

#Busca una cadena en otra cadena, si no hay coincidencia devuelve -1
busqueda_find = nombre.find("d")

#Busca una cadena en otra cadena, si no hay coincidencia lanza una excepción
busqueda_index = nombre.index("e")

#Si es numérico devuelve true, sino false
numerico = nombre.isnumeric()

#Si es alfanumérico devuelve true, sino false
alfa_numerico = nombre.isalpha() #Alfanumérico es de la A a la Z

#Cuenta coincidencias de una cadena en otra cadena, devuelve la cantidad de coincidencias
contar_coincidencias = nombre.count("e")

#Devuelve la cantidad de caracteres de una cadena
contar_caracteres = len(nombre)

#Verifica si una cadena empieza con otra cadena dada, si es así devuelve True
empieza_con = nombre.startswith("F")

#Verifica si una cadena termina con otra cadena dada, si es así devuelve True
termina_con = nombre.endswith("e")

#Si el valor 1 se encuentra en la cadena original, remplaza el valor 1 de la misma, por el valor 2
cadena_nueva = nombre.replace("Fede", "a")

#Separa cadenas con la cadena que le pasemos
cadena_separada = nombre_completo.split(" ")
print(cadena_separada[0])