package proyecto_inventario;

public class PruebaInventario {
    public static void main(String[] args) {
        // Crear inventario de venta
        InventarioVenta inventarioVenta = (InventarioVenta) GeneradorInventario.crearInventario("venta",
                "TechStore S.A.");

        // Agregar productos de venta
        ProductosVentas laptop = new ProductosVentas("Laptop Dell XPS", 10, "LAP-001", 1200.50);
        ProductosVentas mouse = new ProductosVentas("Mouse Logitech", 50, "MOU-002", 25.99);
        ProductosVentas teclado = new ProductosVentas("Teclado Mecánico", 30, "TEC-003", 89.99);

        inventarioVenta.agregarProducto(laptop);
        inventarioVenta.agregarProducto(mouse);
        inventarioVenta.agregarProducto(teclado);

        // Mostrar inventario de venta
        inventarioVenta.listaProductos();
        inventarioVenta.mostrarResumen();

        // Buscar producto
        System.out.println("\nBúsqueda por nombre");
        ProductosVentas encontrado = inventarioVenta.buscarProducto("Mouse Logitech");
        if (encontrado != null) {
            System.out.println("Producto encontrado: " + encontrado.mostrarDetalles());
        }

        // Buscar por código
        System.out.println("\nBúsqueda por código");
        ProductosVentas porCodigo = inventarioVenta.buscarPorCodigo("LAP-001");
        if (porCodigo != null) {
            System.out.println("Producto encontrado: " + porCodigo.mostrarDetalles());
        }

        System.out.println("\n" + "=".repeat(60) + "\n");

        // Crear inventario de uso interno
        InventarioUsoInterno inventarioInterno = (InventarioUsoInterno) GeneradorInventario
                .crearInventario("uso interno", "TechStore S.A.");

        // Agregar productos de uso interno
        ProductosUsoInterno computadora = new ProductosUsoInterno("Computadora de oficina", 15, "IT", "Juan Pérez");
        ProductosUsoInterno impresora = new ProductosUsoInterno("Impresora HP", 5, "Administración", "María García");
        ProductosUsoInterno herramientas = new ProductosUsoInterno("Kit de herramientas", 3, "Mantenimiento",
                "Carlos López");
        ProductosUsoInterno sillas = new ProductosUsoInterno("Sillas ergonómicas", 20, "IT", "Juan Pérez");

        inventarioInterno.agregarProducto(computadora);
        inventarioInterno.agregarProducto(impresora);
        inventarioInterno.agregarProducto(herramientas);
        inventarioInterno.agregarProducto(sillas);

        // Mostrar inventario de uso interno
        inventarioInterno.listaProductos();

        // Listar por departamento
        inventarioInterno.listarPorDepartamento("IT");

        // Listar por responsable
        inventarioInterno.listarPorResponsable("Juan Pérez");

        // Eliminar un producto
        System.out.println("\nEliminando producto");
        inventarioVenta.eliminarProducto("Mouse Logitech");
        System.out.println("Producto eliminado exitosamente.");
        inventarioVenta.listaProductos();
    }
}
