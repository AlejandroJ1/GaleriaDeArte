package practica2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Menu {

    Scanner leer = new Scanner(System.in);
    private static Galeria galeria = new Galeria();

    public Menu(Scanner leer) {
        this.leer = leer;
    }

    public static void main(String[] args) {

    }

    public Menu() {

    }

    public static void MenuPrincipal(ObraDeArte[] obras) {

        int opcion;
        boolean finalizar = false;

        while (!finalizar) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Bienvenido a nuestra galería de arte");
            System.out.println("(1) Visualizar las obras de arte de la galería");
            System.out.println("(2) Dar de alta una obra de arte");
            System.out.println("(3) Modificar datos de una obra");
            System.out.println("(4) Visualiar datos de una obra de arte");
            System.out.println("(5) Obtener el precio de venta de una de las obras");
            System.out.println("(6) Dar información adcinional sobre una obra");
            opcion = sc.nextInt();
            try {
                switch (opcion) {
                    case 1:
                        sc.nextLine();
                        System.out.println("Has seleccionadp la 1");

                        sc.nextLine();
                        break;
                    case 2:
                        System.out.println("Has seleccionado la 2");
                        sc.nextLine();

                        sc.nextLine();
                        break;
                    case 3:
                        System.out.println("Has seleccionado la 3");

                        break;
                    case 4:
                        System.out.println("Has seleccionado la 4");

                        break;
                    case 5:
                        System.out.println("Has seleccionado la 5");

                        break;
                    case 6:
                        System.out.println("Has seleccionado la 6");

                        break;
                    case 0:
                        System.out.println(finalizar);
                        break;
                    default:
                        System.out.println("Numeros del 1 al 6, por favor.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Debes insertar un número");
                sc.next();
            }
            System.out.println("¡¡Gracias por usar esta aplicación!!");

        }

    }

    public int preguntarTipo() {
        System.out.println("||==========================================||");
        System.out.println("||    Elige un tipo para la obra.           ||");
        System.out.println("||                                          ||");
        System.out.println("||    1 --> Pictorica.                      ||");
        System.out.println("||    2 --> Escultura .                     ||");
        System.out.println("||==========================================||");
        int obras = leer.nextInt();
        return obras;
    }

    public int menuParaModificarObra() {
        System.out.println("¿Que desea modificar?");
        System.out.println("(1)Nombre de la obra ");
        System.out.println("(2)Autor");
        System.out.println("(3)Tipo");
        System.out.println("(4)Precio");
        System.out.println("(5)Altura");
        System.out.println("(6)Peso ");
        System.out.println("(7)Piezas");
        System.out.println("(8)Descripción");
        System.out.println("(0)Atras");
        int obras = leer.nextInt();
        return obras;
    }

    public static void precioVenta(ObraDeArte valorPrecioVenta) {
        double precioFinal = 0;
        System.out.println("||                 -=>OBRA Nº " + valorPrecioVenta.getId() + "<=-");
        System.out.println("|| Nombre: " + valorPrecioVenta.getNombre());
        System.out.println("|| Altura(m): " + valorPrecioVenta.getAltura());
        System.out.println("|| Peso(t): " + valorPrecioVenta.getPeso());
        System.out.println("|| Número de piezas: " + valorPrecioVenta.getPiezas());
        System.out.println("|| Precio(€): " + valorPrecioVenta.getPrecio());
        System.out.println("|| Comisión Galería(€): " + valorPrecioVenta.getPrecio() * 0.25);
        System.out.printf("|| Importe por peso(€): %f %n", ((valorPrecioVenta.getPeso()) > 1.0) ? 100.0 : 20.0);
        System.out.printf("|| Importe por altura(€): %f %n", ((valorPrecioVenta.getAltura()) > 2.0) ? 100.0 : 20.0);
        if (valorPrecioVenta.getPiezas() > 2) {
            for (int i = 2; i < valorPrecioVenta.getPiezas(); i++) {
                System.out.printf("|| Importe adicional - pieza %d (€): %f %n", i + 1, 10.0);
                precioFinal += 10.0;
            }
        }
        precioFinal = (valorPrecioVenta.getPrecio()) + (valorPrecioVenta.getPrecio() * 0.25)
                + (((valorPrecioVenta.getPeso()) > 1.0) ? 100.0 : 20.0)
                + (((valorPrecioVenta.getAltura()) > 2.0) ? 100.0 : 20.0);
        System.out.printf("|| Precio de venta(€): %f %n", precioFinal);

        if (valorPrecioVenta.getTipo().equalsIgnoreCase("Pictorica")) {
            System.out.println("|| Descuento(10% Pintura €): " + precioFinal * 0.1);
            System.out.printf("|| Precio final de venta(€): %f %n", precioFinal -= precioFinal * 0.1);
        } else if (valorPrecioVenta.getTipo().equalsIgnoreCase("Escultura")) {
            System.out.println("|| Descuento(20% Escultura €) + (Sobrecoste 50€): " + precioFinal * 0.2 + 50.00);
            System.out.printf("|| Precio final de venta(€): %f %n", precioFinal -= precioFinal * 0.1);
        }
    }

    public static void imprimirEtiqueta(ObraDeArte etiquetas) {
        System.out.println("|| Nombre:" + etiquetas.getNombre());
        System.out.println("|| Autor:" + etiquetas.getAutor());
        System.out.println("|| Descripción:" + etiquetas.getDescripcion());
    }
}
