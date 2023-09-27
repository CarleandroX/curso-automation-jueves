package com.icaro.clase4.herencia;

public class Coche extends Vehiculo {

    private int cilindrada;

    public Coche(String marca, String modelo, int anio, int cilindrada) {
        super(marca, modelo, anio);
        this.cilindrada = cilindrada;
    }

    public int getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(int cilindrada) {
        this.cilindrada = cilindrada;
    }

    @Override
    public void acelerar() {
        System.out.println("Coche acelerando");

    }
}
