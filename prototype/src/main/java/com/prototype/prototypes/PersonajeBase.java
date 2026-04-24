package com.prototype.prototypes;

public abstract class PersonajeBase implements Personaje {
          protected String nombre;
          protected String clase;
          protected int nivel;
          protected int puntosVida;
          protected int puntosEnergia;

          public PersonajeBase(String nombre, String clase, int nivel, int vida, int energia) {
                    this.nombre = nombre;
                    this.clase = clase;
                    this.nivel = nivel;
                    this.puntosVida = vida;
                    this.puntosEnergia = energia;
          }

          @Override
          public Personaje clonarSuperficial() {
                    try {
                              return (Personaje) super.clone();
                    } catch (CloneNotSupportedException e) {
                              return null;
                    }
          }

          @Override
          public Personaje clonarProfundo() {
                    // Como no hay objetos internos mutables, es igual a superficial
                    return clonarSuperficial();
          }

          @Override
          public void mostrar() {
                    System.out.println(
                                        "Nombre: " + nombre +
                                                            ", Clase: " + clase +
                                                            ", Nivel: " + nivel +
                                                            ", Vida: " + puntosVida +
                                                            ", Energía: " + puntosEnergia);
          }
}