let obj = {};
let obj2 = new Object();

/**
 * new Array(); []
 * new String(); "" '' ``
 * new Number(); 12
 * new Boolean(); true false
 */

function Usuario() {
    this.name = "galleta";
}
let user = new Usuario();
console.log(user.constructor);

const s1 = "1 + 1";
const s2 = new String("1 + 1");

console.log(eval(s1), eval(s2));
console.log(s2.valueOf());
