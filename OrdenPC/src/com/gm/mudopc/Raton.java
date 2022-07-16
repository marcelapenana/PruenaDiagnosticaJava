package com.gm.mudopc;

public class Raton  extends DispositivoEntrada{

    private final int idRaton;
    private static int contadorRatones;

    //Constructor que inicializa las variables

    public Raton (String tipoEntrada, String marca){
        super(tipoEntrada, marca);
        idRaton = ++contadorRatones;

    }

    @Override
    public String toString(){
        return "raton{" +
                "idRaton=" + idRaton + ", " + super.toString();
    }



}
