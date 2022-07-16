package com.gm.mudopc;

public class Orden {

    private final int idOrden;

    //Declaracion de arreglos de computadoras

    private final Computadora computadoras[];

    private static int contadorOrdenes;

    private int contadorComputadoras;

    //Definimos el maximo de elemteos del arreglo

    private static final int maxComputadoras = 10;

    public Orden(){
        this.idOrden = ++contadorOrdenes;
        //Se instancia el arreglo de computadoras
        computadoras = new Computadora[maxComputadoras];

    }

    public void agregarComputadora(Computadora computadora){
        //Si las computadoras agregadas no superan el maximo de computadoras
        //Agregamos nuevas computadoras
        if(contadorComputadoras < maxComputadoras)
        {
            computadoras[contadorComputadoras++] = computadora;
        } else {
            System.out.println("Se ha superado el maximo de productos : " +"" +maxComputadoras);

        }

    }

    public void mostrarOrden(){
        System.out.println("Orden #"+ idOrden);
        System.out.println("Computadoras de la orden #" + idOrden + ":");
        for (int i = 0; i < contadorComputadoras; i++){
            System.out.println(computadoras);
        }
    }
}
