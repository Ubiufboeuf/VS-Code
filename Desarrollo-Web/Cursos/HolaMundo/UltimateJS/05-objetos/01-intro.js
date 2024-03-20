let user = {
    email: "elpolloscuro2001@gmail.com",
    username: "Galleta_Oscura",
    direccion: {
        calle: "Jazmín",
        numero: "35",
    },
    activo: true,
    recuperarClave: function () {
        //  Esto es una función anónima por no tener nombre, pero eso evita que sea redundante.
        console.log("Recuperando clave...");
    },
};

/* 
    Al estilo de programación donde tomamos datos que se encuentran relacionados entre sí,
    como variables (email, username, etc) o acciones (recuperarClave, etc), se le conoce como:

    Programación Orientada a Objetos => POO
    Object Oriented Programming => OOP
    
    Se encapsulan datos o comportamientos comunes entre sí dentro de una variable, que en este caso es un objeto.
*/
