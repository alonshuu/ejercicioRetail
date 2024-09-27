import java.util.ArrayList;

class GestorInventario {
    private ArrayList<Producto> inventario;

    // Constructor
    public GestorInventario() {
        this.inventario = new ArrayList<>();
    }

    // Métodos vacíos
    public void agregarProducto(Producto producto) {
        inventario.add(producto); //
        System.out.println("Producto agregado:" + producto);
    }

    public void eliminarProducto(String id) {
        Producto productoEliminar = consultarProductoPorId(id);
        if (productoEliminar != null) { //
            inventario.remove(productoEliminar);
            System.out.println("Producto eliminado" + id);

        } else {
            System.out.println("Producto no encontrado.");
        }
    }

    public void modificarProducto(String id) {
        Producto productoModificable = consultarProductoPorId(id);
        if (productoModificable != null) {
            productoModificable.set
        }
    }

    public Producto consultarProductoPorId(String id) {
        // Implementar lógica
        return null;
    }

    public void aplicarDescuento(String id, double porcentaje) {
        // Implementar lógica
    }

    public double calcularValorTotalInventario() {
        // Implementar lógica
        return 0.0;
    }

    public void mostrarInventario() {
        // Implementar lógica
    }
}