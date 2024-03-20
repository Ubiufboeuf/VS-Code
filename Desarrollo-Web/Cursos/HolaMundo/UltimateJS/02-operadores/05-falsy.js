// short-circuit

// Falso
// False
// 0
// ''
// null
// undefined
// NaN
let nombre = 'A';
let username = nombre || 'Anónimo';
console.log(username);

function fn1() {
    console.log('función 1');
    return false;
}

function fn2() {
    console.log('función 2');
    return true;
}

let x = fn1() && fn2();