import BerryDAO from "../model/dao/berryDAO.js";

class BerryController{
    berryDAO;

    constructor(){
        this.berryDAO = new BerryDAO();
    }

    async obtenerBerrys(){
        return await this.berryDAO.obtenerBerrys();
    }

    async obtenerNextBerrys(){
        return await this.berryDAO.obtenerNextBerrys();
    }
    
    async obtenerPreviousBerrys(){
        return await this.berryDAO.obtenerPreviousBerrys();
    }
}

export default BerryController;