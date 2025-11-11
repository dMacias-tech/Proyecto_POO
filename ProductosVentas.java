package proyecto_inventario;

public class ProductosVentas extends Producto {
	private double precio;
	private String codigo;

	public ProductosVentas(String nombre, int cantidad, String codigo, double precio) {
		super(nombre, cantidad);
		this.codigo = codigo;
		this.precio = precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public double getPrecio() {
		return this.precio;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getCodigo() {
		return this.codigo;
	}

	@Override
	public String mostrarDetalles() {
		return "codigo: " + this.codigo + " | " + super.toString() + " | precio: $" + this.precio;
	}
}