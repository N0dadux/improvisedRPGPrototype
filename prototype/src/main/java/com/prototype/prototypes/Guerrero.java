package com.prototype.prototypes;

import com.prototype.therest.Arma;

public class Guerrero extends Personaje {
    private String nombre;
    private Arma arma;

    public Guerrero(String nombre, Arma arma) {
        this.nombre = nombre;
        this.arma = arma;
    }

    @Override
    public Personaje clonarSuperficial() {
        try {
            return (Guerrero) super.clone();
        } catch (CloneNotSupportedException e) {
            return null;
        }
    }

    @Override
    public Personaje clonarProfundo() {
        Guerrero copia = null;
        try {
            copia = (Guerrero) super.clone();
            copia.arma = arma.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return copia;
    }

    public void mostrar() {
        System.out.println("Guerrero: " + nombre + ", arma: " + arma.getNombre());
    }

    public Arma getArma() {
        return arma;
    }
}
