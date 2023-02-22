package practica2;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ObraDeArteTest {
    ObraDeArte obra1;
    ObraDeArte obra2;

    @BeforeEach
    void crearObjeto() {
        obra1 = new ObraDeArte(1, "nombre_obra1", "Antonio","Pintura", 1.0, 3.0, 2.0, 1, "Primera pintura");
        obra2 = new ObraDeArte(2, "nombre_obra2", "Alejandro","Pintura", 1.0, 2.0, 3.0, 1, "Escultura barroca");
    }

    @AfterEach
    void borrarObjeto(){
        obra1 = null;
        obra2 = null;
    }

    @Test
    void getIdFunciona() {
        int expected = 1;
        assertEquals(expected, obra1.getId());
    }

    @Test
    void setIdFunciona() {
        final int uno = 1;
        int expected = uno;
        obra1.setId(uno);
        assertEquals(expected, obra1.getId());
    }

    @Test
    void getAutorFunciona() {
        String expected = "Antonio";
        assertEquals(expected, obra1.getAutor());
    }

    @Test
    void setAutorFunciona() {
        final String nuevo_autor = "Alejandro";
        String expected = nuevo_autor;
        obra1.setAutor(nuevo_autor);
        assertEquals(expected, obra1.getAutor());
    }

    @Test
    void getNombreFunciona() {
        String expected = "nombre_obra1";
        assertEquals(expected, obra1.getNombre());
    }

    @Test
    void setNombreFunciona() {
        final String nuevo_nombre = "Aeiou";
        String expected = nuevo_nombre;
        obra1.setNombre(nuevo_nombre);
        assertEquals(expected, obra1.getNombre());
    }

    @Test
    void getTipoFunciona() {
        String expected = "Pintura";
        assertEquals(expected, obra1.getTipo());
    }

    @Test
    void setTipoFunciona() {
        final String nuevo_tipo = "Escultura";
        String expected = nuevo_tipo;
        obra1.setTipo(nuevo_tipo);
        assertEquals(expected, obra1.getTipo());
    }

    @Test
    void getPrecioFunciona() {
        double expected = 1;
        assertEquals(expected, obra1.getPrecio());
    }

    @Test
    void setPrecioFunciona() {
        final double nuevo_precio = 100;
        double expected = nuevo_precio;
        obra1.setPrecio(nuevo_precio);
        assertEquals(expected, obra1.getPrecio());
    }

    @Test
    void getAlturaFunciona() {
        double expected = 3.0;
        assertEquals(expected, obra1.getAltura());
    }

    @Test
    void setAlturaFunciona() {
        final double nueva_altura = 8.5;
        double expected = nueva_altura;
        obra1.setAltura(nueva_altura);
        assertEquals(expected, obra1.getAltura());
    }

    @Test
    void getPesoFunciona() {
        double expected = 2.0;
        assertEquals(expected, obra1.getPeso());
    }

    @Test
    void setPesoFunciona() {
        final double nuevo_peso = 5.0;
        double expected = nuevo_peso;
        obra1.setPeso(nuevo_peso);
        assertEquals(expected, obra1.getPeso());
    }

    @Test
    void getPiezasFunciona() {
        int expected = 1;
        assertEquals(expected, obra1.getPiezas());
    }

    @Test
    void setPiezasFunciona() {
        final int nuevo_piezas = 3;
        int expected = nuevo_piezas;
        obra1.setPiezas(nuevo_piezas);
        assertEquals(expected, obra1.getPiezas());
    }

    @Test
    void getDescripcionFunciona() {
        String expected = "Primera pintura";
        assertEquals(expected, obra1.getDescripcion());
    }

    @Test
    void setDescFunciona() {
        final String nueva_descripcion = "nueva descripcion";
        String expected = nueva_descripcion;
        obra1.setDescripcion(nueva_descripcion);
        assertEquals(expected, obra1.getDescripcion());
    }
}
