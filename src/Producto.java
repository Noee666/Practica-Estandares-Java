public class Producto {

	// Variables de clase
	public String codigo;
	public String nombre;
	public double precio;

	// Constructor principal
	public Producto(String codigo, String nombre, double precio) {
		this.codigo = codigo;
		this.nombre = nombre;
		this.precio = precio;
	}

	// Devuelve una cadena de texto con la información del producto
	public String Mostrar() {
		return """
			   Nombre ====> %s
			   Precio ====> %f
			   Código ====> %s
			   """.formatted(nombre, precio, codigo);
	}
}
