import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("-------------------------------------------------------------------------");
        System.out.println("Tarea: Calcular importe de cada producto de una lista y sumarlo");
        System.out.println("-------------------------------------------------------------------------");

        List<Producto> list_productos = new ArrayList<>();
        list_productos.add(new Producto(10,2)); /*Producto_1*/
        list_productos.add(new Producto(20,3)); /*Producto_2*/
        list_productos.add(new Producto(30,4)); /*Producto_3*/
        list_productos.add(new Producto(40,1)); /*Producto_4*/
        list_productos.add(new Producto(50,2)); /*Producto_5*/

        System.out.println("=======================Lista de Productos=======================");
        list_productos.forEach(System.out::println);

        System.out.println("=======================Stream_Importe(Precio * Cantidad)=======================");
        Double granTotal = list_productos.stream()  /*Convertir tipo 'List' en tipo 'Stream'*/
                .map(u -> u.getCantidad()* u.getPrecio())   /*Multiplicar el precio de cada producto por su respectiva cantidad*/
                .peek(u -> System.out.print(u + "\t"))   /*Inspeccionar cada elemento del Stream*/
                .reduce(0d,Double::sum);    /*Sumar cada elemento del Stream*/

        System.out.println("\nGran Total = " + granTotal);

    }
}