/**
 * Crear algoritmo que devuelva
 * el precio del producto
 * más impuesto
 */

function precioCompleto(precio, impuesto) {
    return precio + precio * impuesto;
}

let resultado = precioCompleto(19.90, 0.15);
console.log(resultado);

// El 0.15 indica el 15%

/*
    No lo pude hacer yo solo por eso del 15%,
    pero si lo entendí.
    28-02-24
*/