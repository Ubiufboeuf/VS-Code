function crearUsuario(name, email) {
    return {
        email, // o: email: email,
        name,
        activo: true,
        recuperarClave: function () {
            console.log("Recuperando clave...");
        },
    };
}

let user1 = crearUsuario("Bob", "elpolloscuro2001@gmail.com");
let user2 = crearUsuario("Bob2", "elpolloscuro2001--@gmail.com");

console.log(user1, user2);
