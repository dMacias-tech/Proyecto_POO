package proyecto_inventario;
//hola munod
public class GeneradorInventario {
    
    public static Inventario<? extends Producto> crearInventario(String tipo, String nombreEmpresa) {
        switch (tipo.toLowerCase()) {
            case "venta" -> {
                return new InventarioVenta(nombreEmpresa);
            }
            case "uso interno" -> {
                return new InventarioUsoInterno(nombreEmpresa);
            }
            default -> throw new IllegalArgumentException("Tipo de inventario no reconocido: " + tipo);
        }
    }

}
