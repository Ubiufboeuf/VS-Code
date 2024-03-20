// { id: 1, recuperarClave: function() {} }
function Usuario() {
    this.id = 1;
    this.recuperarClave = function () {
        // Métodos son funciones asignadas a una propiedad de un objeto
        console.log("Recuperando clave...");
    };
}

let usuario = new Usuario();

console.log(usuario);

// Al usar la palabra 'new' pasan 4 cosas:
/* 
    1. Se crea un objeto literal del aire . --- . {}
    2. Se vincula el prototipo de la función con el objeto que se acaba de crear . --- . Prototipo
    3. A la palabra reservada 'this' se le asigna el objeto literal del aire . --- . this = {}
    4. Si la función no devuelve nada, devuelve 'this' . --- . return this
*/
