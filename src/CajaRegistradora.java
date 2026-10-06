public class CajaRegistradora {

    ImpresoraFiscal impresora;

    CajaRegistradora(ImpresoraFiscal impresora) {
        this.impresora = impresora;
    }

    void cerrarVenta(Factura factura) {

        System.out.println("Cerrando venta...");

        impresora.imprimirDocumento(factura);
    }
}
