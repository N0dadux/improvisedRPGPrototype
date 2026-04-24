package com.prototype.therest;

public class Arma implements Cloneable {
          private String nombre;

          public Arma(String nombre) {
                    this.nombre = nombre;
          }

          public String getNombre() {
                    return nombre;
          }

          public void setNombre(String nombre) {
                    this.nombre = nombre;
          }

          @Override
          public Arma clone() {
                    try {
                              return (Arma) super.clone();
                    } catch (CloneNotSupportedException e) {
                              return null;
                    }
          }
}