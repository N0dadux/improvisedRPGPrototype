package com.prototype.therest;

import java.util.HashMap;
import java.util.Map;

import com.prototype.prototypes.Guerrero;
import com.prototype.prototypes.Mago;
import com.prototype.prototypes.Personaje;

public class FabricaPersonajes {
          private static Map<String, Personaje> prototipos = new HashMap<>();

          static {
                    prototipos.put("mago", new Mago("Gandalf", new Arma("Bastón")));
                    prototipos.put("guerrero", new Guerrero("Aragorn", new Arma("Espada")));
          }

          public static Personaje crearSuperficial(String tipo) {
                    return prototipos.get(tipo).clonarSuperficial();
          }

          public static Personaje crearProfundo(String tipo) {
                    return prototipos.get(tipo).clonarProfundo();
          }
}