public class Factura {

    int numero;
    String cliente;
    ItemFactura[] items;

    Factura(int numero, String cliente, ItemFactura[] items) {
        this.numero = numero;
        this.cliente = cliente;
        this.items = items;
    }
}
