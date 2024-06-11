class BerryDAO{
    nextPage=null;
    previousPage=null;

    async obtenerBerrys() {
        let url = "https://pokeapi.co/api/v2/berry";
        let consulta = await fetch(url);
        let resultado = await consulta.json();
        let berrys = resultado.results;
        this.nextPage = resultado.next;
        this.previousPage = resultado.previous;       
        berrys = await this.obtenerDataBerrys(berrys);
        console.log(this.nextPage);
        return berrys;
    }

    async obtenerDataBerrys(berrys){
        let dataBerrys = [];
        await Promise.all(berrys.map(async(berry) => {
            let consulta = await fetch(berry.url);
            let data =await consulta.json();
       
            let dataBerry = {
                nombre:berry.name,
                tamaño:data.size,
                cosechaMaxima:data.max_harvest,
                imgURL:await this.obtenerUrlImgBerry(data.item.url)
            }
            dataBerrys.push(dataBerry);
        }));
        return dataBerrys;
    }

    async obtenerUrlImgBerry(urlItemBerry){
        let consulta = await fetch(urlItemBerry);
        let resultado = await consulta.json();
        return resultado.sprites.default;
    }

    async obtenerNextBerrys(){
        let url = this.nextPage;
        if(url !=null){
            let consulta = await fetch(url);
            let resultado = await consulta.json();
            let berrys = resultado.results;
            this.nextPage = resultado.next;
            this.previousPage = resultado.previous;
            berrys = await this.obtenerDataBerrys(berrys);
            return berrys;
        }else{
            return null;
        }
        
    }
    
    async obtenerPreviousBerrys(){
        let url = this.previousPage;
        if(url !=null){
            let consulta = await fetch(url);
            let resultado = await consulta.json();
            let berrys = resultado.results;
            this.nextPage = resultado.next;
            this.previousPage = resultado.previous;
            berrys = await this.obtenerDataBerrys(berrys);
            return berrys;
        }else{
            return null;
        }

    }
}


export default BerryDAO;