package com.prototype.therest;

import java.util.HashMap;
import java.util.Map;

import com.prototype.prototypes.Guerrero;
import com.prototype.prototypes.Mago;
import com.prototype.prototypes.Personaje;


public class FabricaPersonajes {
    private static Map<String, Personaje> prototipos = new HashMap<>();

    static {
        prototipos.put("guerrero", new Guerrero("Conan", 10, 100, 50));
        prototipos.put("mago", new Mago("Merlin", 12, 80, 120));
    }

    public static Personaje crearSuperficial(String tipo) {
        return prototipos.get(tipo).clonarSuperficial();
    }

    public static Personaje crearProfundo(String tipo) {
        return prototipos.get(tipo).clonarProfundo();
    }
}