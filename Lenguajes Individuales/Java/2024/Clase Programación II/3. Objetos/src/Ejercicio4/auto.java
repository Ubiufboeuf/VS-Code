package Ejercicio4;

public class auto {
    
    String matricula;
    String numeroMotor;
    int itv;
    String dgt;

    public static void main(String[] args) {
        
        auto auto1 = new auto();
        auto auto2 = new auto();
        auto auto3 = new auto();


        auto1.matricula = "LAT 784";
        auto1.numeroMotor = "oisf2q0q48";
        auto1.itv = 2012;
        auto1.dgt = "ECO";

        auto2.matricula = "LAD 784";
        auto2.numeroMotor = "o23hj";
        auto2.itv = 2022;
        auto2.dgt = "B";

        auto3.matricula = "LAM 784";
        auto3.numeroMotor = "1ef0uq2ho7";
        auto3.itv = 2013;
        auto3.dgt = "C";


        System.out.println("\n\n\n");

        System.out.println("Auto 1");
        System.out.println("matricula: " + auto1.matricula);
        System.out.println("Numero Motor: " + auto1.numeroMotor);
        System.out.println("ITV: " + auto1.itv);
        System.out.println("DGT: " + auto1.dgt);

        System.out.println();
        
        System.out.println("Auto 2");
        System.out.println("matricula: " + auto2.matricula);
        System.out.println("Numero Motor: " + auto2.numeroMotor);
        System.out.println("ITV: " + auto2.itv);
        System.out.println("DGT: " + auto2.dgt);

        System.out.println();
        
        System.out.println("Auto 3");
        System.out.println("matricula: " + auto3.matricula);
        System.out.println("Numero Motor: " + auto3.numeroMotor);
        System.out.println("ITV: " + auto3.itv);
        System.out.println("DGT: " + auto3.dgt);


    }

}
