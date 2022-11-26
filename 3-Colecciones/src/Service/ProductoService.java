package Service;

import Entity.Producto;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ProductoService {

    private Scanner leer = new Scanner(System.in).useDelimiter("\n");
    private HashMap<String, Double> mapaProductos = new HashMap();

    public Producto crearProductos() {
        Producto p = new Producto();
        System.out.println("Ingrese el nombre del producto");
        p.setNombreProducto(leer.next());
        System.out.println("Ingrese el precio del producto '" + p.getNombreProducto() + "'");
        p.setPrecio(leer.nextDouble());

        return p;
    }

    public void llenarListado() {
        String respuesta = "S";
        Producto p;
        do {
            p = crearProductos();
            mapaProductos.put(p.getNombreProducto(), p.getPrecio());
            System.out.println("¿Desea agregar otro producto?");
            respuesta = leer.next();

        } while (respuesta.equalsIgnoreCase("S"));
    }

    public void modificarPrecio() {
        String producto;
        Boolean existe = false;

        System.out.println("Ingrese el producto al que le quiere modificar el precio");
        producto = leer.next();
        System.out.println("");
        for (Map.Entry<String, Double> entry : mapaProductos.entrySet()) {

            if (entry.getKey().equalsIgnoreCase(producto)) {
                existe = true;
                System.out.println("Ingrese el nuevo precio para '" + entry.getKey() + "'");
                entry.setValue(leer.nextDouble());
            }
        }
        if (existe) {
            System.out.println("El precio del producto '" + producto + "' fue modificado exitosamente.");
        } else {
            System.out.println("El producto que ingresó no existe");
        }
    }

    public void eliminarProducto() {
        String producto;

        System.out.println("Ingrese el producto que desea eliminar");
        producto = leer.next();

        if (mapaProductos.containsKey(producto)) {
            System.out.println("Producto eliminado correctamente.");
            mapaProductos.remove(producto);

        } else {
            System.out.println("El producto que ingresó no existe.");
        }
    }

    public void mostrarProductos() {
        for (Map.Entry<String, Double> entry : mapaProductos.entrySet()) {

            System.out.println("Producto: " + entry.getKey() + " ; Precio: " + entry.getValue());
        }
    }

    public void menuProduto() {
        int opcion = 0;

        do {
            System.out.println("----------------MENU----------------");
            System.out.println("Ingrese el numero correspondiente a la acción que desea realizar");
            System.out.println("1- Agregar productos");
            System.out.println("2- Modificar precio");
            System.out.println("3- Eliminar producto");
            System.out.println("4- Mostrar listado de todos los productos");
            System.out.println("5- Salir");
            opcion = leer.nextInt();
            switch (opcion) {
                case 1:
                    llenarListado();
                    break;
                case 2:
                    modificarPrecio();
                    break;
                case 3:
                    eliminarProducto();
                    break;
                case 4:
                    mostrarProductos();
                    break;
                case 5:
                    opcion = 5;
                    break;
                default:
                    System.out.println("'" + opcion + "' no es una opción válida. Intente nuevamente");
                    break;

            }
        } while (opcion != 5);
        System.out.println("Usted salió del sistema.");
    }
}
