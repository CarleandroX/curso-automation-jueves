package com.icaro.clase3;

import java.util.ArrayList;
import java.util.List;

public class P2Colecciones {

    public static void main(String[] args) {

        // ARRAYS
        int [] ArrayDeEnteros = new int[3];

        ArrayDeEnteros[0] = 20;
        ArrayDeEnteros[1] = 500;
        ArrayDeEnteros[2] = 10000;

        System.out.println("Posicion 0: " + ArrayDeEnteros[0]);

        int variable = ArrayDeEnteros[1];
        System.out.println("La posicion 1 tiene " + variable);

        System.out.println("Posicion 2: " + ArrayDeEnteros[2]);

       // System.out.println("Posicion 3: " + ArrayDeEnteros[3]);

        // LISTAS
        List<String> listaDeStrings = new ArrayList<>();

        listaDeStrings.add("Hola");
        listaDeStrings.add("Soy");
        listaDeStrings.add("Carlos");

        System.out.println("Posicion 0: " + listaDeStrings.get(0));
        System.out.println("Posicion 0: " + listaDeStrings.get(1));
        System.out.println("Posicion 0: " + listaDeStrings.get(2));

        System.out.println("Datos de la lista: " + listaDeStrings);
      //  System.out.println("Posicion 3: " + listaDeStrings.get(3));


    }
}
