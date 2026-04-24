package com.prototype.prototypes;

public interface Personaje extends Cloneable {
     Personaje clonarSuperficial();

     Personaje clonarProfundo();

     void mostrar();
}
