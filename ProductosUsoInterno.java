package proyecto_inventario;

public class ProductosUsoInterno extends Producto {
    private String departamento;
    private String responsable;

    public ProductosUsoInterno(String nombre, int cantidad, String departamento, String responsable) {
        super(nombre, cantidad);
        this.departamento = departamento;
        this.responsable = responsable;
    }

    public String getDepartamento() {
        return this.departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public String getResponsable() {
        return this.responsable;
    }

    public void setResponsable(String responsable) {
        this.responsable = responsable;
    }

    @Override
    public String mostrarDetalles() {
        return super.toString() + " | departamento: " + this.departamento +
                " | responsable: " + this.responsable;
    }
}