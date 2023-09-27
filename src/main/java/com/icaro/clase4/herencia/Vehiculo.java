package com.icaro.clase4.herencia;

public class Vehiculo {

    private String marca;
    private  String modelo;
    private int anio;

    public Vehiculo(String marca, String modelo, int anio) {
        this.marca = marca;
        this.modelo = modelo;
        this.anio = anio;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public int getAnio() {
        return anio;
    }

    public void acelerar() {
        System.out.println("Vehiculo Acelerando");
    }
    public void frenar() {
        System.out.println("Vehiculo frenando");
    }

}
