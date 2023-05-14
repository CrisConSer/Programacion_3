import java.util.ArrayList;
import java.util.Scanner;

public class PruebaGestisimal2 {

static Scanner scanner = new Scanner(System.in);

// Ahora iniciamos el arraylist para que se vaya creando una lista automatica cada vez que ingresamos un articulo nuevo

static ArrayList<Gestisimal> almacenes = new ArrayList<>();

    /**
       * @param args
       */
    public static void main(String[] args) {
    int option = 0;

    while (option != 7) {
        System.out.println("GESTISIMAL MENU:");
        System.out.println("1. Listado");
        System.out.println("2. Alta");
        System.out.println("3. Baja");
        System.out.println("4. Modificación");
        System.out.println("5. Entrada de mercancía");
        System.out.println("6. Salida de mercancía");
        System.out.println("7. Salir");
        System.out.print("Selecciona una opción: ");
        option = scanner.nextInt();

        switch (option) {
            case 1:
                listado();
                break;
            case 2:
                alta();
                break;
            case 3:
                baja();
                break;
            case 4:
                modificar();
                break;
            case 5:
                entrada();
                break;
            case 6:
                salida();
                break;
            case 7:
                System.out.println("Nos vemos pronto!");
                break;
            default:
                System.out.println("Opción inválida!");
                break;
        }
    }
}

    static void listado() {
        System.out.println("LISTADO DE ARTÍCULOS:");

        for (Gestisimal gestisimal : almacenes) {
            System.out.println(gestisimal);
        }
    }


    static void alta() {
        System.out.print("Introduce el código del artículo: ");
        int codigo = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Introduce la descripción del artículo: ");
        String description = scanner.nextLine();
        System.out.print("Introduce el precio de compra del artículo: ");
        double purchasePrice = scanner.nextDouble();
        System.out.print("Introduce el precio de venta del artículo: ");
        double precioVenta = scanner.nextDouble();
        System.out.print("Introduce el stock del artículo: ");
        int stock = scanner.nextInt();
        almacenes.add(new Gestisimal(codigo, description, purchasePrice, precioVenta, stock));
        System.out.println("Artículo añadido correctamente!");
    }

    static void baja() {
        System.out.print("Introduce el código del artículo a eliminar: ");
        int codigo = scanner.nextInt();
        for (Gestisimal gestisimal : almacenes) {
            if (gestisimal.getCodigo() == codigo) {
                almacenes.remove(gestisimal);
                System.out.println("Artículo eliminado correctamente!");
                return;
            }
        }
        System.out.println("Artículo no encontrado!");
    }

    static void modificar() {
        System.out.print("Introduce el código del artículo a modificar: ");
        int codigo = scanner.nextInt();
        for (Gestisimal gestisimal : almacenes) {
            if (gestisimal.getCodigo() == codigo) {
                System.out.print("Introduce la descripción del artículo: ");
                scanner.nextLine();
                String descripcion = scanner.nextLine();
                System.out.print("Introduce el precio de compra del artículo: ");
                double precioCompra = scanner.nextDouble();
                System.out.print("Introduce el precio de venta del artículo: ");
                double precioVenta = scanner.nextDouble();
                System.out.print("Introduce el stock del artículo: ");
                int stock = scanner.nextInt();
                gestisimal.setDescripcion();
                gestisimal.getPrecioCompra(precioCompra);
                gestisimal.setPrecioVenta(precioVenta);
                gestisimal.setStock(stock);
                System.out.println("Artículo modificado correctamente!");
                return;
            }
        }
        System.out.println("Artículo no encontrado");
}
static void entrada() {
    System.out.print("Introduce el código del artículo: ");
    int codigo = scanner.nextInt();
    for (Gestisimal gestisimal : almacenes) {
        if (gestisimal.getCodigo() == codigo) {
            System.out.print("Introduce el número de unidades a añadir: ");
            int cantidad = scanner.nextInt();
            gestisimal.setStock(gestisimal.getStock() + cantidad);
            System.out.println("Stock actualizado correctamente!");
            return;
        }
    }
    System.out.println("Artículo no encontrado!");
}

static void salida() {
    System.out.print("Introduce el código del artículo: ");
    int codigo = scanner.nextInt();
    for (Gestisimal gestisimal : almacenes) {
        if (gestisimal.getCodigo() == codigo) {
            System.out.print("Introduce el número de unidades a retirar: ");
            int cantidad = scanner.nextInt();
            if (gestisimal.getStock() >= cantidad) {
                gestisimal.setStock(gestisimal.getStock() - cantidad);
                System.out.println("Stock actualizado correctamente!");
            } else {
                System.out.println("No hay suficiente stock para retirar esa cantidad!");
            }
            return;
        }
    }
    System.out.println("Artículo no encontrado!");
}
}


