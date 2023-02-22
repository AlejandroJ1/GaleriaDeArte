package practica2;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class GaleriaTest {
    ObraDeArte[] obras = new ObraDeArte[2];

    @BeforeEach
    void crearObjeto() {
        obras[0] = new ObraDeArte(1, "La noche estrellada", "Vincent van Gogh", 1000, 73.7, 30, 1, "Óleo sobre lienzo");
        obras[1] = new ObraDeArte(2, "El pensador", "Auguste Rodin", 2000, 73, 300, 1, "Bronce");
    }

    @AfterEach
    void borrarObjeto() {
        obras[0] = null;
        obras[1] = null;
    }

    @Test
    void mostrarObrasFunciona() {
        
    }
}
