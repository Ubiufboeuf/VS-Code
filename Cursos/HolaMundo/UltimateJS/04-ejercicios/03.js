/**
 * Indice validar que no sea menor a cero y que el elemento exista en el array
 */
// Me mató, tuve que ver la solución con el video y aún así no entendí ni el ejercicio ni la solución :P

function getbyIdx(arr, idx){ // idx es indice
    if (idx < 0 || arr.length <= idx) {
        return 'Elemento no existe';
    }

    return arr[idx];
}

let resultado = getbyIdx([1, 2], 1);
console.log(resultado);

/**
 * Construir una 'function' que nos permita obtener un elemento por su indice, se le pasa el array y el indice.
 * 
 * El valor que le pasemos como indice no puede ser menor que 0 y el elemento debe existir en el array, ej: si le pasamos 4
 * debe indicar que el eleento no existe o algo parecido.
 */

// 20-02-24 => No lo pude hacer solo


// 21-02-24 => Ya lo vi mejor y ahora si lo entendí