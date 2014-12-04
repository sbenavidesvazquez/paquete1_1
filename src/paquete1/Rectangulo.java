package paquete1;

public class Rectangulo {

    private long base;
    private long altura;

    public Rectangulo() {

    }

    public Rectangulo(long b, long al) {
        base = b;
        altura = al;
    }

    public long getBase() {
        return base;
    }

    public void setBase(long base) {
        this.base = base;
    }

    public long getAltura() {
        return altura;
    }

    public void setAltura(long altura) {
        this.altura = altura;
    }

    public void calcularArea() {
        System.out.println("area= " + (base * altura));
    }

}
