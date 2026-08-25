package com.tienda.app;

import com.tienda.model.Producto;
import java.util.ArrayList;

/**
 * Clase principal que ejecuta la aplicación de administración de productos.
 */
public class TiendaApp {

    public static void main(String[] args) {

        // 1. Crear colección ArrayList para almacenar los productos
        ArrayList<Producto> inventario = new ArrayList<>();

        // 2. Crear tres productos
        Producto p1 = new Producto("P001", "Laptop", 15000.00, 10);
        Producto p2 = new Producto("P002", "Mouse", 350.00, 25);
        Producto p3 = new Producto("P003", "Teclado Mecánico", 1250.50, 15);

        // 3. Almacenarlos en la colección
        inventario.add(p1);
        inventario.add(p2);
        inventario.add(p3);

        // 4. Mostrar la información de cada producto
        for (Producto producto : inventario) {
            producto.mostrarInformacion();
        }
    }
}