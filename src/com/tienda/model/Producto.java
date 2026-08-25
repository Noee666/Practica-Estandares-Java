package com.tienda.model;

/**
 * Representa un producto dentro del inventario de la tienda.
 * Contiene la información básica del producto y asegura que 
 * los valores de precio y existencia sean siempre válidos.
 */
public class Producto {

	private String codigo;
	private String nombre;
	private double precio;
	private int existencia;

	/**
	 * Constructor completo para inicializar un nuevo Producto.
	 *
	 * @param codigo     Código identificador del producto.
	 * @param nombre     Nombre descriptivo del producto.
	 * @param precio     Precio del producto (debe ser mayor o igual a 0).
	 * @param existencia Cantidad en inventario (debe ser mayor o igual a 0).
	 * @throws IllegalArgumentException si el precio o existencia son menores a 0.
	 */
	public Producto(String codigo, String nombre, double precio, int existencia) {
		if (precio < 0) {
			throw new IllegalArgumentException("El precio no puede ser negativo.");
		}
		if (existencia < 0) {
			throw new IllegalArgumentException("La existencia no puede ser negativa.");
		}
		this.codigo = codigo;
		this.nombre = nombre;
		this.precio = precio;
		this.existencia = existencia;
	}

	// --- GETTERS Y SETTERS ---

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		if (precio < 0) {
			throw new IllegalArgumentException("El precio no puede ser negativo.");
		}
		this.precio = precio;
	}

	public int getExistencia() {
		return existencia;
	}

	public void setExistencia(int existencia) {
		if (existencia < 0) {
			throw new IllegalArgumentException("La existencia no puede ser negativa.");
		}
		this.existencia = existencia;
	}

	/**
	 * Imprime en consola la información del producto con el formato establecido.
	 */
	public void mostrarInformacion() {
		System.out.printf("Código: %s%n", this.codigo);
		System.out.printf("Nombre: %s%n", this.nombre);
		System.out.printf("Precio: $%.2f%n", this.precio);
		System.out.printf("Existencia: %d%n%n", this.existencia);
	}

	/**
	 * @return una cadena de texto con los parámetros del producto.
	 */
	public String getInformacion() {

		return """
				Código:		%s%n
				Nombre:		%s%n
				Precio:		$%.2s%n
				Existencia: %s%n
				""".formatted(this.codigo, this.nombre, this.precio, this.existencia);
	}
}