package practica2;


import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;


public class MenuTest {
    ObraDeArte obra1;
    ObraDeArte obra2;

    @BeforeEach
    void crearObjeto() {
        obra1 = new ObraDeArte(1, "nombre_obra1", "Antonio","Pintura", 1.0, 3.0, 2.0, 1, "Primera pintura");
        obra2 = new ObraDeArte(2, "nombre_obra2", "Alejandro","Pintura", 1.0, 2.0, 3.0, 1, "Escultura barroca");
    }

    @AfterEach
    void borrarObjeto() {
        obra1 = null;
        obra2 = null;
    }

    

}
