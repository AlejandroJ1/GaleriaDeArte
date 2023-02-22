package practica2;

public class Escultura extends ObraDeArte {

    private String material;

    public Escultura() {

    }

    public Escultura(int id, String nombre, String autor, String tipo, double precio, double altura, double peso,
            int piezas, String descripcion, String material) {
        super(id, nombre, autor, tipo, precio, altura, peso, piezas, descripcion);
        this.material = material;
    }

    public Escultura(String nombre, String autor, double precio, double altura, double peso,
            int piezas, String descripcion, String material) {
        super(nombre, autor, precio, altura, peso, piezas, descripcion);
        this.material = material;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

}
