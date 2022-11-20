package com.gm.mundopc;

public class Teclado extends DispositivoEntrada{

    //atributos
    private final int idTeclado;
    private static int contadorTeclados;

    //constructor de dos argumentos
    public Teclado(String tipoEntrada, String marca) {
        super(tipoEntrada,marca);
        this.idTeclado = ++Teclado.contadorTeclados;
    }

    //Metodo to string
    @Override
    public String toString() {
        return "Teclado{" + "idTeclado=" + idTeclado + '}' + super.toString();
    }

}
