// Crear algoritmo que devuelva cantidad de numeros positivos de un array

let array = [2, 5, 7, 15, -5, -100, 55];

function cuantosPositivos(arr){
    let cantidad = 0;
    for (elemento of arr){
        if (elemento > 0){
            cantidad++;
        }
    }
    return cantidad;
}

let resultado = cuantosPositivos(array);
console.log(resultado);

// 20-02-24 => Tampoco pude y no lo llegué a entender del todo la solución

// 21-02-24 => Lo volví a ver y ahora lo entiendo 👍