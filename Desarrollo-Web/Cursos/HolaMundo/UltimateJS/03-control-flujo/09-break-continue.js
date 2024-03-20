// break es para salir de un loop y continue permite saltar una iteración

let i = 0;
while (i < 6) {
    i++;
    if (i === 2) {
        continue;
        // Todo lo que venga después del continue será ignorado y el control se vuelve al comienzo del while
    }
    if (i === 4){
        break;
    }
    console.log(i);
}

// Este código sirve también para: for, for in, for of, do while