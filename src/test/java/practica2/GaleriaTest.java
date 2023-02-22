package practica2;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Scanner;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class GaleriaTest {
    ObraDeArte obra1;
    ObraDeArte obra2;

    @BeforeEach
    void crearObjeto() {
        obra1 = new ObraDeArte(1, "nombre_pintura", "Antonio", "Pintura", 1.0, 3.0, 2.0, 1, "Primera pintura");
        obra2 = new ObraDeArte(2, "nombre_escultura", "Alejandro", "Pintura", 1.0, 2.0, 3.0, 1, "Escultura barroca");
    }

    @AfterEach
    void borrarObjeto() {
        obra1 = null;
        obra2 = null;
    }

}
