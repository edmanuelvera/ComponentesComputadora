package com.gm.mundopc;

public class Computadora {
    //atributos

    private final int idComputadora;
    private String nombre;
    private Monitor monitor;
    private Raton raton;
    private Teclado teclado;
    private static int contadorComputadoras;

    //constructor
    private Computadora() {
        this.idComputadora = ++Computadora.contadorComputadoras;
    }

    //Constructor de argumentos con otras clases
    public Computadora(String nombre, Monitor monitor, Raton raton, Teclado teclado) {
        this();
        this.nombre = nombre;
        this.monitor = monitor;
        this.raton = raton;
        this.teclado = teclado;
    }
    
    //Metodos get y set

    public int getIdComputadora() {
        return idComputadora;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Monitor getMonitor() {
        return this.monitor;
    }

    public void setMonitor(Monitor monitor) {
        this.monitor = monitor;
    }

    public Teclado getTeclado() {
        return this.teclado;
    }

    public void setTeclado(Teclado teclado) {
        this.teclado = teclado;
    }

    //Metodo toString
    @Override
    public String toString() {
        return "Computadora{" + "idComputadora=" + idComputadora + ", nombre="
                + nombre + ", monitor=" + monitor + ", raton=" + raton + ", teclado="
                + teclado + '}';
    }

}
