"""
    los 3 operadores lógicos "básicos":
    AND = . (multiplicación - y - &)
    OR = + (suma - o - | )
    NOT = ' o ¬ (negación - invertir)
    
    Una cosa, este ejemplo lo hace más entendible
    A+'B o A +' B es lo mismo que la negación de A y B (solo que no puedo jacer eso en teclado)
    
    Escribir:
        A . B
    es lo mismo que:
        AB    
"""

"""
            - Álgebra de boole -
    
        OR          |   AND         |   NOT         |   Teorema de Morgan   |   Disyunción  
        ------------|---------------|---------------|-----------------------|---------------
1.      A + 0 = A   |   A . 0 = 0   |   A = A'      |   A +' B = A' . B'    |   (A + B) . C
2.      A + A = A   |   A . A = A   |   A' = A      |   A .' B = A' + B'    |   = AC + BC
3.      A + 1 = 1   |   A . 1 = A   |               |                       |
4.      A + A' = 1  |   A . A' = 0  |               |                       |

"""