package practica2;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class MenuTest {
    Escultura escultura1;
    Pintura pintura1;

    @BeforeEach
    void crearObjeto() {
        pintura1 = new Pintura(1, "nombre:pintura", "Antonio", 1.0, 3.0, 2.0, 1, "Primera pintura", "Oleo");
        escultura1 = new Escultura(2, "nombre_escultura", "Alejandro", 1.0, 2.0, 3.0, 1, "Escultura barroca", "Cobre");
    }

    @AfterEach
    void borrarObjeto() {
        pintura1 = null;
        escultura1 = null;
    }

    

}
