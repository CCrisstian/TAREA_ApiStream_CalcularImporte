public class Producto {
/*------------ATRIBUTOS------------*/
    private double precio;
    private int cantidad;

/*------------GETTER------------*/
    public double getPrecio() {
        return precio;
    }

    public int getCantidad() {
        return cantidad;
    }

/*------------CONSTRUCTOR------------*/
    public Producto(double precio, int cantidad) {
        this.precio = precio;
        this.cantidad = cantidad;
    }

/*------------MÉTODOS------------*/
    @Override
    public String toString() {
        return "Producto\t" +
                "Precio: " + precio +
                "\tCantidad: " + cantidad;
    }

}
