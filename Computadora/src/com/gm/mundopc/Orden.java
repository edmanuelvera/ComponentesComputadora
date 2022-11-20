package com.gm.mundopc;

public class Orden {

    private final int idOrden;
    private Computadora computadoras[];
    private static int contadorOrdenes;
    private static final int MAX_COMPUTADORAS = 10;
    private int contadorComputadoras;

    //Constructor vacio para inicar idOrden
    public Orden() {
            this.idOrden = ++Orden.contadorOrdenes;
            this.computadoras = new Computadora[Orden.MAX_COMPUTADORAS];
    }
    
    //Metodo para agregar computadoras.
    
    public void agregarOrden(Computadora computadora){
        if(this.contadorComputadoras < Orden.MAX_COMPUTADORAS){
            this.computadoras[this.contadorComputadoras++] = computadora;
        }
        else{
            System.out.println("Has superado el limite de computadoras.");
        }
    }
    
    //Metodo para mostrar una orden
    
    public void mostrarOrden(){
        System.out.println("Orden N°: " + this.idOrden);
        System.out.println("Computadoras de las orden: " + this.idOrden);
        for (int i = 0; i < this.contadorComputadoras; i++) {
            System.out.println(this.computadoras[i]);
        }
    }
}
