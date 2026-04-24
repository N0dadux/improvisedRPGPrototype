package com.prototype.prototypes;

import com.prototype.therest.Arma;

public class Mago extends Personaje {
          private String nombre;
          private Arma arma;

          public Mago(String nombre, Arma arma) {
                    this.nombre = nombre;
                    this.arma = arma;
          }

          @Override
          public Personaje clonarSuperficial() {
                    try {
                              return (Mago) super.clone(); // copia referencias
                    } catch (CloneNotSupportedException e) {
                              return null;
                    }
          }

          @Override
          public Personaje clonarProfundo() {
                    Mago copia = null;
                    try {
                              copia = (Mago) super.clone();
                              copia.arma = arma.clone(); // nueva instancia
                    } catch (CloneNotSupportedException e) {
                              e.printStackTrace();
                    }
                    return copia;
          }

          public void mostrar() {
                    System.out.println("Mago: " + nombre + ", arma: " + arma.getNombre());
          }

          public Arma getArma() {
                    return arma;
          }
}