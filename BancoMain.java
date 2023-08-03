import java.util.Date;
public class BancoMain {
    public static void main(String[] args) {



        Cliente cliente1 = new Cliente(35127896, "Juan", "Perez","Calle 123", 351551234);
        CuentaCorriente cuentaCorriente1 = new CuentaCorriente("001", new Date(), 1000.0, 0.01, cliente1);
        TarjetaCredito tarjetaCredito1 = new TarjetaCredito("Visa", 1234567891, "Juan Perez", new Date());
        cuentaCorriente1.agregarTarjetaCredito(tarjetaCredito1);

        CajaDeAhorro cajaAhorro1 = new CajaDeAhorro("002", new Date(), 500.0, 0.005, cliente1, 12);

        FondoInversion fondoInversion1 = new FondoInversion("Fondo 1", 2000.0, 0.05, new Date(), new Date());

        CarteraValor carteraValores1 = new CarteraValor("Valor A", 100, 50.0);
        CarteraValor carteraValores2 = new CarteraValor("Valor B", 50, 75.0);


        System.out.println("Cliente: " + cliente1.getNombre());
        System.out.println("Cuenta Corriente: " + cuentaCorriente1.getNumeroCuenta());
        System.out.println("Saldo Cuenta Corriente: " + cuentaCorriente1.getSaldo());
        System.out.println("Tarjetas de Crédito asociadas a la Cuenta Corriente: ");
        for (TarjetaCredito tarjeta : cuentaCorriente1.getTarjetasCredito()) {
            System.out.println("Tipo: " + tarjeta.getTipoTarjeta() + ", Número: " + tarjeta.getNro());
        }

        System.out.println("\nCaja de Ahorro: " + cajaAhorro1.getNumeroCuenta());
        System.out.println("Saldo Caja de Ahorro: " + cajaAhorro1.getSaldo());
        System.out.println("Número de Meses: " + cajaAhorro1.getNumeroMeses());

        System.out.println("\nFondo de Inversión: " + fondoInversion1.getNombre());
        System.out.println("Importe: " + fondoInversion1.getImporte());
        System.out.println("Rentabilidad: " + fondoInversion1.getRentabilidad());
        System.out.println("Fecha de Apertura: " + fondoInversion1.getFechaApertura());
        System.out.println("Fecha de Vencimiento: " + fondoInversion1.getFechaVencimiento());

        System.out.println("\nCartera de Valores:");
        System.out.println("Valor A: " + carteraValores1.getNumeroTitulos() + " títulos a " + carteraValores1.getPrecioCotizacion() + " cada uno.");
        System.out.println("Valor B: " + carteraValores2.getNumeroTitulos() + " títulos a " + carteraValores2.getPrecioCotizacion() + " cada uno.");
    }
}
