public class Producto {
/*------------ATRIBUTOS------------*/
    private double precio;
    private int cantidad;
/*------------ATRIBUTOS------------*/


/*------------GETTER------------*/
    public double getPrecio() {
        return precio;
    }

    public int getCantidad() {
        return cantidad;
    }
/*------------GETTER-SETTER------------*/


/*------------CONSTRUCTOR------------*/
    public Producto(double precio, int cantidad) {
        this.precio = precio;
        this.cantidad = cantidad;
    }
/*------------CONSTRUCTOR------------*/


/*------------MÉTODOS------------*/
    @Override
    public String toString() {
        return "Producto\t" +
                "Precio: " + precio +
                "\tCantidad: " + cantidad;
    }
/*------------MÉTODOS------------*/

}
