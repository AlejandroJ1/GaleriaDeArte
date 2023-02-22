package practica2;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class EsculturaTest {
    Escultura escultura1;
    Escultura escultura2;

    @BeforeEach
    void crearObjeto() {
        escultura1 = new Escultura(1, "nombre1", "Antonio","Escultura", 1.0, 3.0, 2.0, 1, "Oleo Antonio","Hierro");
        escultura2 = new Escultura(2, "nombre2", "Alejandro","Escultura", 1.0, 2.0, 3.0, 1, "Acuarela alejandro","Acero");
    }

    @AfterEach
    void borrarObjeto(){
        escultura1 = null;
        escultura2 = null;
    }

    @Test
    void getTecnicaFunciona(){
        String expected = "Hierro";
        assertEquals(expected,escultura1.getMaterial());
    }

    @Test
    void setMaterialFunciona(){
        final String nuevo_material = "Tempera";
        String expected = nuevo_material;
        escultura1.setMaterial(nuevo_material);
        assertEquals(expected, escultura1.getMaterial());
    }
}
