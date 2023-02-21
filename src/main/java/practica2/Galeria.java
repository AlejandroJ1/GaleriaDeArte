package practica2;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Galeria {

    Scanner leer = new Scanner(System.in);
    private Menu menu = new Menu();
    private ObraDeArte[] obras = new ObraDeArte[5];

    public Galeria(Scanner leer, ObraDeArte[] obras) {
        this.leer = leer;
        this.obras = obras;
    }

    public Scanner getLeer() {
        return leer;
    }

    public void setLeer(Scanner leer) {
        this.leer = leer;
    }

    public Menu getMenu() {
        return menu;
    }

    public ObraDeArte[] getObras() {
        return obras;
    }

    public void mostrarObras() {
        System.out.printf("%-7s %-22s %-11s %-9s %-9s %-6s %-12s %s%n",
                "id", "Nombre", "Autor", "Precio", "Altura", "Peso", "Piezas", "Descripcion");
        for (int i = 0; i < this.obras.length; i++) {
            System.out.printf("%-5d %-22s %-12s $%-10.2f %-8.2f %-8.2f %-8d %s%n",
                    this.obras[i].getId(), this.obras[i].getNombre(), this.obras[i].getAutor(),
                    this.obras[i].getPrecio(), this.obras[i].getAltura(), this.obras[i].getPeso(),
                    this.obras[i].getPiezas(), this.obras[i].getDescripcion());
        }
    }

    public void altaObraDeArte() {
        ObraDeArte obra;
        int opcion;

        System.out.println("¿Qué tipo de obra de arte desea dar de alta?");
        System.out.println("1. Pintura");
        System.out.println("2. Escultura");
        opcion = leer.nextInt();

        leer.nextLine();

        System.out.println("Introduzca el id de la obra.");
        int id = leer.nextInt();

        leer.nextLine();

        System.out.println("Introduzca el nombre de la obra.");
        String nombre = leer.nextLine();

        System.out.println("Introduzca el autor de la obra.");
        String autor = leer.nextLine();

        System.out.println("Introduzca el precio de la obra.");
        double precio = leer.nextDouble();

        System.out.println("Introduzca la altura de la obra.");
        double altura = leer.nextDouble();

        System.out.println("Introduzca el peso de la obra.");
        double peso = leer.nextDouble();

        System.out.println("Introduzca el número de piezas de la obra.");
        int piezas = leer.nextInt();

        leer.nextLine();
        System.out.println("Introduzca una descripción de la obra.");
        String descripcion = leer.nextLine();

        if (opcion == 1) {
            System.out.println("Introduzca la técnica de la obra.");
            String tecnica = leer.nextLine();
            obra = new Pintura(id, nombre, autor, precio, altura, peso, piezas, descripcion, tecnica);
        } else {
            System.out.println("Introduzca el material de la obra.");
            String material = leer.nextLine();
            obra = new Escultura(id, nombre, autor, precio, altura, peso, piezas, descripcion, material);
        }

        obras = Arrays.copyOf(obras, obras.length + 1); // Añadir un espacio al array
        obras[obras.length - 1] = obra; // Agregar la nueva obra al final del array

        System.out.println("La obra de arte se ha dado de alta correctamente.");
    }

    public void todasLasObras() {

        // Aquí inicializo las obras de arte

        Pintura obra_uno = new Pintura(1, "El Guernica", "P.Picasso", "Pintura", 1000.00, 5, 2, 5,
                "Cuadro guerra civil",
                "Oleo");
        Pintura obra_dos = new Pintura(2, "La Vie", "P.Picasso", "Pintura", 200.00, 1, 1, 1,
                "Esto es una pintura",
                "Oleo");
        Pintura obra_tres = new Pintura(3, "El sueño", "P.Picasso", "Pintura", 300.00, 1.3, 1, 1,
                "Esto es una pintura",
                "Oleo");
        Pintura obra_cuatro = new Pintura(4, "Retrato de Dora Maar", "P.Picasso", "Pintura", 400.00, 1, 0.8, 1,
                "Esto es una pintura",
                "Oleo");
        Escultura obra_cinco = new Escultura(5, "El piel roja", "U.Checa", "Escultura", 350.00, 1, 0.8, 1,
                "Esto es una escultura",
                "Hierro");

        this.obras[0] = obra_uno;
        this.obras[1] = obra_dos;
        this.obras[2] = obra_tres;
        this.obras[3] = obra_cuatro;
        this.obras[4] = obra_cinco;

    }
}
