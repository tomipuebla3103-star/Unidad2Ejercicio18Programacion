//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
   ImpresoraFiscal impresora = new ImpresoraFiscal();

    CajaRegistradora caja = new CajaRegistradora(impresora);

    ItemFactura item1 =
            new ItemFactura("Hamburguesa", 2, 5000);

    ItemFactura item2 =
            new ItemFactura("Papas fritas", 1, 2500);

    ItemFactura item3 =
            new ItemFactura("Gaseosa", 2, 1500);

    ItemFactura[] items = {
            item1,
            item2,
            item3
    };

    Factura factura =
            new Factura(1001, "Juan Perez", items);

    caja.cerrarVenta(factura);
}
