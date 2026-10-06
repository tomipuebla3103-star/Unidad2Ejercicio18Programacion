public class ImpresoraFiscal {
    void imprimirDocumento(Factura factura) {

        System.out.println("================================");
        System.out.println("         FACTURA");
        System.out.println("================================");
        System.out.println("Número: " + factura.numero);
        System.out.println("Cliente: " + factura.cliente);
        System.out.println("--------------------------------");

        double total = 0;

        for (ItemFactura item : factura.items) {

            double subtotal = item.calcularSubtotal();

            System.out.println(
                    item.descripcion + " x" +
                            item.cantidad + " - $" +
                            subtotal
            );

            total = total + subtotal;
        }

        System.out.println("--------------------------------");
        System.out.println("TOTAL: $" + total);
        System.out.println("================================");
        System.out.println("        FIN DE FACTURA");
        System.out.println("================================");
    }
}
