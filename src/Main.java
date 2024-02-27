import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        System.out.println("-------------------------------------------------------------------------");
        System.out.println("Tarea: Calcular importe de cada producto de una lista y sumarlo");
        System.out.println("-------------------------------------------------------------------------");

        List<Producto> list_productos = new ArrayList<>();
        list_productos.add(new Producto(10,2));
        list_productos.add(new Producto(20,3));
        list_productos.add(new Producto(30,4));
        list_productos.add(new Producto(40,1));
        list_productos.add(new Producto(50,2));

        System.out.println("=======================Lista de Productos=======================");
        list_productos.forEach(System.out::println);

        Stream<Double> stream_Importe = list_productos.stream().map(u -> u.getCantidad()* u.getPrecio());
        /*Los elementos de este Stream son el resultado de multiplicar el precio de cada producto por su respectiva cantidad*/

        System.out.println("=======================Stream_Importe(Precio * Cantidad)=======================");
        Optional<Double> granTotal = stream_Importe.peek(u -> System.out.print(u + "\t"))   /*Inspeccionar cada elemento del Stream*/
                                                    .reduce(Double::sum);   /*Sumar cada elemento del Stream*/
        System.out.println("\n============================================================================");
        System.out.println("Gran Total = " + granTotal.get());


    }
}