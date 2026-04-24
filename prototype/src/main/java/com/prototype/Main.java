package com.prototype;

import com.prototype.prototypes.Mago;
import com.prototype.therest.FabricaPersonajes;

public class Main {
    public static void main(String[] args) {
        
        Mago mago1 = (Mago) FabricaPersonajes.crearSuperficial("mago");
        Mago mago2 = (Mago) FabricaPersonajes.crearSuperficial("mago");

        mago1.getArma().setNombre("Varita");

        System.out.println("Copia superficial:");
        mago1.mostrar();
        mago2.mostrar(); // se ve afectado

        Mago mago3 = (Mago) FabricaPersonajes.crearProfundo("mago");
        Mago mago4 = (Mago) FabricaPersonajes.crearProfundo("mago");

        mago3.getArma().setNombre("Cetro");

        System.out.println("\nCopia profunda:");
        mago3.mostrar();
        mago4.mostrar(); // NO se ve afectado
    }
}