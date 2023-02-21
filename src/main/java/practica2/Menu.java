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

}
