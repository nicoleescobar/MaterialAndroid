package com.example.android.personasmaterial;

import java.util.ArrayList;

/**
 * Created by android on 17/10/2017.
 */

public class Datos {
    private static ArrayList<Persona> personas = new ArrayList<>();

    public static void guardar(Persona p){
        personas.add(p);
    }

    public static ArrayList<Persona> obtener(){
        return personas;
    }
}
