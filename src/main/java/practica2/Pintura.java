package practica2;

public class Pintura extends ObraDeArte {

    private String tecnica;

    public Pintura() {

    }

    public Pintura(int id, String nombre, String autor, String tipo, double precio, double altura, double peso,
            int piezas, String descripcion, String tecnica) {
        super(id, nombre, autor, tipo, precio, altura, peso, piezas, descripcion);
        this.tecnica = tecnica;
    }

    public Pintura(int id, String nombre, String autor, double precio, double altura, double peso,
            int piezas, String descripcion, String tecnica) {
        super(id, nombre, autor, precio, altura, peso, piezas, descripcion);
        this.tecnica = tecnica;
    }

    public String getTecnica() {
        return tecnica;
    }

    public void setTecnica(String tecnica) {
        this.tecnica = tecnica;
    }

}