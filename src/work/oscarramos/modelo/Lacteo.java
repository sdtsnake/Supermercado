package work.oscarramos.modelo;

public class Lacteo extends Producto {
    private int cantidad;
    private int protenias;

    public Lacteo(String nombre, Double precio, int cantidad, int protenias) {
        super(nombre, precio);
        this.cantidad = cantidad;
        this.protenias = protenias;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public int getProtenias() {
        return protenias;
    }

    public void setProtenias(int protenias) {
        this.protenias = protenias;
    }
}
