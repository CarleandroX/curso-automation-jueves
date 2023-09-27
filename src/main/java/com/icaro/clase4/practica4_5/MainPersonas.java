package com.icaro.clase4.practica4_5;

public class MainPersonas {
    public static void main(String[] args) {

        Persona persona = new Persona("Persona", "Personita");

        Alumno alumno = new Alumno("abc", 6, "Pepe", "Pepito");

        Profesor profesor = new Profesor("Jose", "Joseito");

        persona.getApellido();

        alumno.getNombre();
        profesor.agregarAlumnos(alumno);

    }

}
