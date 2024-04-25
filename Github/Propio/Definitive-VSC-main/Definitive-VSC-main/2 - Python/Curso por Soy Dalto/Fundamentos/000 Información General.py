"""Acá va a haber información de python como atajos, datasos, líneas de código como el cls de la terminal, etc"""

# los tipos de mensaje que conozco son:
""" - Este - """
''' - Este - '''
# Y este (al menos por ahora)

# La principal ventaja de las comillas y apóstrofes triples es que se puede hacer esto con ambos:
"""
a
a
a
"""
# Pero no puedo hacer tab antes de usarlos, y es un poco raro usarlos si hay texto antes """ pero se puede usar así de todas formas """





""" 
    - Diferencia de variables java y python -

    Las variables son distintas que en java, no se las crea así:
        tipo_de_variable nombre_de_variable;
        tipo_de variable nombre_de_variable = valor;
    Se hace de la siguiente forma:
        nombre_de_variable = valor
    No se puede crear una variable sin valor (creo) y para asignar el tipo de variable se usa:
        con nada para booleanos y enteros
        con '' para chars
        con "" para String
        no se como hacer para float, double y los otros
"""





"""
    - Concatenación mediante + y f-string -
    
    Concatenar es "unir" pero sin unir, este es el ejemplo que me se:
    print(variable1 + variable2 + "texto")
    Creo que se podría tomar como unir diferentes tipos de texto incluidas variables en un caso específico o no tan específico
    porque creo que se puede usar en variables para asignar valores o crearlas de 0
    
    Para unir un texto con números (enteros, y creo que float y double) se necesita usar un f-string, que aún no domino,
    ni me se el concepto ni como usarlo correctamente :(
"""





"""
    - Operadores de pertenencia (in y not in) -
    
    El in sirve para ver si algún dato tipo Str o char pertenece a una variable, devuelve valor booleano (o almenos true o false)
    Ejemplo que se me ocurre y que funciona:
        x = "123"
        print("123" in x)
    La terminal devolverá un True porque el Str 123 está en x
        
    El not in sirve para ver si algún dato Str o char no pertenece, devuelve True o False (creo que booleano)
    Ejemplo:
        x = 'b'
        print('h' not in x)
    La terminal devolverá un True porque el char h no está en x
"""





"""
    - camelCase y snake-case -
    
    El camelCase es una forma de escribir cosas como variables de varias palabras, funciona pero es un poco difícil de leer comodamente

    El snake-case es otra forma de escribir el nombre de varias cosas como variables, este es el método recomendado por los creadores
    de python, se ve mejor y si estás editando esa línea apenas se nota el _ pero es un poco más incomodo de usar si no estás
    tan acostumbrado
"""