package proyecto_inventario;

public class InventarioVenta extends Inventario<ProductosVentas> {

    public InventarioVenta(String nombreEmpresa) {
        super(nombreEmpresa, "Venta");
    }

    public double calcularValorTotal() {
        double total = 0;
        for (ProductosVentas p : productos.values()) {
            total += p.getPrecio() * p.getCantidad();
        }
        return total;
    }

    public void mostrarResumen() {
        System.out.println("\nResumen Inventario de Venta");
        System.out.println("Empresa: " + getNombreEmpresa());
        System.out.println("Total de productos: " + cantidadProductos());
        System.out.println("Valor total del inventario: $" + String.format("%.2f", calcularValorTotal()));
    }

    public ProductosVentas buscarPorCodigo(String codigo) {
        for (ProductosVentas p : productos.values()) {
            if (p.getCodigo().equalsIgnoreCase(codigo)) {
                return p;
            }
        }
        return null;
    }
}