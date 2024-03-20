// Crear un algoritmo que devuelva el numero menor y mayor de un array 

let array = [2, 5, 7, 15, -5, -100, 55];

function getMenorMayor(arr){
    let menor = arr[0];
    let mayor = arr[0];
    
    for (numero of arr){
        menor = menor < numero ? menor : numero;
        mayor = mayor > numero ? mayor : numero;
    }

    return [menor, mayor];
}

let numeros = getMenorMayor(array);
console.log(numeros);


// Este puede ser un ejercicio que hagan en una prueba técnica, GUARDA, OJO AL PIOJOa

console.log(numeros[0]); // En este caso devuelve [menor]
console.log(numeros[1]); // Y en este devuelve [mayor]

// 'Devuelve' o muestra esas variables por el return y la declaración de valor de 'numeros',
// numeros es = a lo que devuelva la función 'getMenorMayor' y aparte se le pasa un valor (el arreglo 'array'),
// y al final queda que 'numeros' es igual a [menor, mayor] y queda como un arreglo (aunque se marca como un 'object')

console.log(typeof numeros);
console.log(typeof array); // Ah ta, los arrays se marcan como 'object'

// 21-02-24 => Ya lo volví a ver todo (con la solución) y ahora lo entiendo bien y mejor