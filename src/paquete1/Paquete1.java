package paquete1;

import valida1.Valida;//importo só a clase valida
/*import valida1.*; asi importo todas las clases do paquete*/

public class Paquete1 {

    public static void main(String[] args) {
        long b = Valida.pedirDato();
        long al = Valida.pedirDato();
        Rectangulo rec = new Rectangulo(b, al);
        rec.calcularArea();
        
    }

}
