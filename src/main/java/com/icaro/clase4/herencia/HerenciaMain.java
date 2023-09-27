package com.icaro.clase4.herencia;

public class HerenciaMain {
    public static void main(String[] args) {
        Vehiculo vehiculo = new Vehiculo("Toyota", "Corolla", 2020);

        Coche coche = new Coche("Ford", "Mustang", 2021, 5000);

        System.out.println("Marca vehiculo: " + vehiculo.getMarca());
        System.out.println("Modelo vehiculo: " + vehiculo.getModelo());
        System.out.println("Anio vehiculo: " + vehiculo.getAnio());

        System.out.println("Marca Coche: " + coche.getMarca());
        System.out.println("Modelo Coche: " + coche.getModelo());
        System.out.println("Anio Coche: " + coche.getAnio());
        System.out.println("Cilindrada Coche: " + coche.getCilindrada());

        vehiculo.acelerar();
        coche.acelerar();
    }
}
