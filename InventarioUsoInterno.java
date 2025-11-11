package proyecto_inventario;

public class InventarioUsoInterno extends Inventario<ProductosUsoInterno> {

    public InventarioUsoInterno(String nombreEmpresa) {
        super(nombreEmpresa, "Uso Interno");
    }

    public void listarPorDepartamento(String departamento) {
        System.out.println("\nProductos del departamento: " + departamento + " ");
        boolean encontrado = false;
        for (ProductosUsoInterno p : productos.values()) {
            if (p.getDepartamento().equalsIgnoreCase(departamento)) {
                System.out.println(p.mostrarDetalles());
                encontrado = true;
            }
        }
        if (!encontrado) {
            System.out.println("No se encontraron productos en ese departamento.");
        }
    }

    public void listarPorResponsable(String responsable) {
        System.out.println("\nProductos a cargo de: " + responsable + " ");
        boolean encontrado = false;
        for (ProductosUsoInterno p : productos.values()) {
            if (p.getResponsable().equalsIgnoreCase(responsable)) {
                System.out.println(p.mostrarDetalles());
                encontrado = true;
            }
        }
        if (!encontrado) {
            System.out.println("No se encontraron productos para ese responsable.");
        }
    }
}