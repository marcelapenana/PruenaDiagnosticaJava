package com.gm.mudopc;

public class Monitor {
    //Declaración de variables

    private final int idMonitor;

    private String marca;

    private double tamaño;


    private static  int contadorMonitores;

    private Monitor() { idMonitor = ++contadorMonitores;}

    //Constructor que inicializa las varianles

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getTamaño() {
        return tamaño;
    }

    public void setTamaño(double tamaño) {
        this.tamaño = tamaño;
    }

    //metodo que concatena las variables y regresa una cadena

    public Monitor(String marca, double tamaño){

        this();
        this.marca = marca;
        this.tamaño = tamaño;

    }


}
