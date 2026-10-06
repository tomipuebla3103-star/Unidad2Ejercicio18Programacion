public class ItemFactura {
    String descripcion;
    int cantidad;
    double precioUnitario;

    ItemFactura(String descripcion, int cantidad, double precioUnitario) {
        this.descripcion = descripcion;
        this.cantidad = cantidad;
        this.precioUnitario = precioUnitario;
    }

    double calcularSubtotal() {
        return cantidad * precioUnitario;
    }
}
