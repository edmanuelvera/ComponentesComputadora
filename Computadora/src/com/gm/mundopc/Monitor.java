package com.gm.mundopc;

public class Monitor{

    //Atributos
    private final int idMonitor;
    private String marca;
    private double tamanio;
    private static int contadorMonitores;

    //constructor vacio
    private Monitor() {
        this.idMonitor = ++Monitor.contadorMonitores;
    }

    //constructor con dos argumentos
    public Monitor(String marca, double tamanio) {
        this(); //<- Llamando al constructor para iniciar variable de idmonitor.
        this.marca = marca;
        this.tamanio = tamanio;
    }

    //metodos get y set
    public int getIdMonitor() {
        return this.idMonitor;
    }


    public String getMarca() {
        return this.marca;
    }


    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getTamanio() {
        return this.tamanio;
    }

    public void setTamaño(double tamanio) {
        this.tamanio = tamanio;
    }

    //metodo toString

    @Override
    public String toString() {
        return "Monitor{" + "idMonitor=" + idMonitor + ", marca=" + marca + ", tamanio=" + tamanio + '}';
    }
    
    
    
}
