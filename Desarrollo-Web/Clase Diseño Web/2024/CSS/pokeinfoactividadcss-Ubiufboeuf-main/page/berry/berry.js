import BerryController from "../../controller/berryController.js";

let berryController = new BerryController();
window.onload = async ()=>{
    let berrys = await obtenerBerrys();
    monstrarBerrys(berrys);
    addEvents();
}

async function obtenerBerrys(){
    return await berryController.obtenerBerrys();
}

function monstrarBerrys(berrys){
    let listaBerrysElement = document.querySelector("#listaBerrys");
    listaBerrysElement.innerHTML = "";
    if(berrys!=null){
        berrys.forEach(berry => {
            listaBerrysElement.innerHTML += `
                <div class="berry">
                <img src="${berry.imgURL}">
                    <p>Nombre: ${berry.nombre}</p>
                    <p>Tamaño: ${berry.tamaño}</p>
                    <p>Cosecha maxima: ${berry.cosechaMaxima}</p>
                </div>
            `;
        });
    }
}

async function obtenerNextBerrys(){
    return await berryController.obtenerNextBerrys();
}

async function obtenerPreviousBerrys(){
    return await berryController.obtenerPreviousBerrys();
}

async function mostrarNextBerrys(){
    mostrarCargandoElementos();
    let berrys = await obtenerNextBerrys();
    monstrarBerrys(berrys);
}

async function mostrarPreviousBerrys(){
    mostrarCargandoElementos();
    let berrys = await obtenerPreviousBerrys();
    monstrarBerrys(berrys);
}

function mostrarCargandoElementos (){
    let listaBerrysElement = document.querySelector("#listaBerrys");
    listaBerrysElement.innerHTML = `
    <img src="../assets/loading-loading-forever.gif">
    `;
    ;
}

function addEvents(){
    let btnNextBerrysElement = document.querySelector("#btnNextBerrys");
    btnNextBerrysElement.onclick = ()=>{
        mostrarNextBerrys();
    }

    let btnPreviousBerrysElement = document.querySelector("#btnPreviousBerrys");
    console.log(btnNextBerrysElement);
    btnPreviousBerrysElement.onclick = ()=>{
        mostrarPreviousBerrys();
    }
}

