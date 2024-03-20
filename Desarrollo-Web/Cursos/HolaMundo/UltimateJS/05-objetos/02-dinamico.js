const user = { id: 1 };

user.name = "Nicolas";
user.guardar = function () {
    console.log("Guardando", user.name);
};

user.guardar();

delete user.name;
delete user.guardar;

console.log(user);

// const user1 = Object.freeze({ id: 1 });
const user1 = Object.seal({ id: 1 });
user1.name = "a";
user1.id = 2;
console.log(user1);
