package practica2;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Galeria {

    Scanner leer = new Scanner(System.in);
    private Menu menu = new Menu();
    private ObraDeArte[] obras = new ObraDeArte[5];

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
}
