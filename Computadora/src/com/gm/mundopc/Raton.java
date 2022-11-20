package com.gm.mundopc;

public class Raton extends DispositivoEntrada {

    //atributos
    private final int idRaton;
    private static int contadorRatones;

    //constructor dos argumentos
    public Raton(String tipoEntrada, String marca) {
        super(tipoEntrada, marca);
        this.idRaton = ++Raton.contadorRatones;
    }

    //Metodo ToString
    @Override
    public String toString() {
        return "Raton{" + "idRaton=" + idRaton + '}' + super.toString();
    }

}
