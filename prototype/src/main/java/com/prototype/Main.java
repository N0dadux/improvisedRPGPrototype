package com.prototype;

import com.prototype.prototypes.Personaje;
import com.prototype.therest.FabricaPersonajes;

public class Main {
    public static void main(String[] args) {

        Personaje p1 = FabricaPersonajes.crearSuperficial("guerrero");
        Personaje p2 = FabricaPersonajes.crearProfundo("mago");

        System.out.println("Personaje 1:");
        p1.mostrar();

        System.out.println("\nPersonaje 2:");
        p2.mostrar();
    }
}