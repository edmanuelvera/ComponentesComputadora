package mundopc;

import com.gm.mundopc.*;

public class MundoPc {
    public static void main(String[] args) {
        
        //Variables / atributos 
        
        Monitor monitorHP = new Monitor("HP", 13);
        Monitor monitorLG = new Monitor("LG", 24);
        
        
        Raton ratonDG = new Raton("USB", "DG");
        Raton ratonHP = new Raton("Bluetoh", "HP");
        
        Teclado tecladoHP = new Teclado("USB", "HP");
        Teclado tecladoLG = new Teclado("Bluetoh", "LG");
        
        //Computadora
        
        Computadora computadora1 = new Computadora("ComputadoraHP", monitorHP, ratonHP, tecladoHP);
        Computadora computadora2 = new Computadora("ComputadoraLG", monitorLG, ratonDG, tecladoLG);
        
        Orden orden1 = new Orden();
        orden1.agregarOrden(computadora1);
        
        orden1.mostrarOrden();
        
        Orden orden2 = new Orden();
        orden2.agregarOrden(computadora2);
        orden2.mostrarOrden();
    }
}
