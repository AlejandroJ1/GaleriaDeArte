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

    
    public void todasLasObras() {

        //Aquí inicializo las obras de arte

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
