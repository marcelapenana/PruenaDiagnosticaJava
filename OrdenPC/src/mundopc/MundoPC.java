package mundopc;

import  com.gm.mudopc.*;

public class MundoPC {
    public  static void main(String args[]){
        //Creacion de computadoras toshiba
        Monitor monitorToshi = new Monitor("Toshiba", 13);
        Teclado tecladoToshi = new Teclado( "bluetooth", "Toshiba");
        Raton ratonToshi = new Raton( "bluetooth","Toshiba");
        Computadora compuToshiba = new Computadora( "Computadora Toshiba", monitorToshi, tecladoToshi, ratonToshi);

        Monitor monitorDell = new Monitor("Dell", 15);
        Teclado tecladoDell = new Teclado( "usb", "dell");
        Raton ratonDell = new Raton("usb", "dell");
        Computadora compuDell = new Computadora( "Computadora Dell", monitorDell, tecladoDell, ratonDell);

        Computadora compuArmada = new Computadora("Computadora Armada", monitorDell, tecladoToshi, ratonToshi);
        //Agregamos computadoras a la orden

        Orden orden1 = new Orden();
        orden1.agregarComputadora(compuToshiba);
        orden1.agregarComputadora(compuDell);
        orden1.agregarComputadora(compuArmada);

        //imprimir la orden
        orden1.mostrarOrden();

        //agregamos una segunda orden
        Orden orden2 = new Orden();
        orden2.agregarComputadora(compuArmada);
        orden2.agregarComputadora(compuDell);
        System.out.println("");
        orden2.mostrarOrden();

    }

}
