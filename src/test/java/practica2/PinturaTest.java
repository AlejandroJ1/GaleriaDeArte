package practica2;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class PinturaTest {
    Pintura pintura1;
    Pintura pintura2;

    @BeforeEach
    void crearObjeto() {
        pintura1 = new Pintura(1, "nombre_pintura1", "Antonio","Pintura", 1.0, 3.0, 2.0, 1, "Oleo Antonio","Oleo");
        pintura2 = new Pintura(2, "nombre_pintura2", "Alejandro","Pintura", 1.0, 2.0, 3.0, 1, "Acuarela alejandro","Acuarela");
    }

    @AfterEach
    void borrarObjeto(){
        pintura1 = null;
        pintura2 = null;
    }

    @Test
    void getTecnicaFunciona(){
        String expected = "Oleo";
        assertEquals(expected,pintura1.getTecnica());
    }

    @Test
    void setTecnicaFunciona(){
        final String nueva_descripcion = "Tempera";
        String expected = nueva_descripcion;
        pintura1.setTecnica(nueva_descripcion);
        assertEquals(expected, pintura1.getTecnica());
    }
    
    
}
