package proyecto_inventario;

import java.util.HashMap;

public abstract class Inventario<T extends Producto> {
	private final String tipoInventario;
	private String nombreEmpresa;
	protected HashMap<String, T> productos;

	public Inventario(String nombreEmpresa, String tipoInventario) {
		this.nombreEmpresa = nombreEmpresa;
		this.tipoInventario = tipoInventario;
		this.productos = new HashMap<>();
	}

	// Getters agregados
	public String getTipoInventario() {
		return this.tipoInventario;
	}

	public String getNombreEmpresa() {
		return this.nombreEmpresa;
	}

	public void setNombreEmpresa(String nombreEmpresa) {
		this.nombreEmpresa = nombreEmpresa;
	}

	public void agregarProducto(T producto) {
		productos.put(producto.getNombre(), producto);
	}

	public T buscarProducto(String nombre) {
		return productos.get(nombre);
	}

	public void eliminarProducto(String nombre) {
		productos.remove(nombre);
	}

	public void listaProductos() {
		if (productos.isEmpty()) {
			System.out.println("No hay productos en el inventario.");
			return;
		}
		System.out.println("\n=== Inventario de " + tipoInventario + " - " + nombreEmpresa + " ===");
		for (T p : productos.values()) {
			System.out.println(p.mostrarDetalles());
		}
		System.out.println("Total de productos: " + productos.size());
	}

	public int cantidadProductos() {
		return productos.size();
	}

	public HashMap<String, T> getProductos() {
		return productos;
	}
}