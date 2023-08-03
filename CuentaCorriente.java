import java.util.ArrayList;
import java.util.List;
import java.util.Date;
class CuentaCorriente extends CuentaBancaria{
    List<TarjetaCredito> tarjetasCredito;

    public CuentaCorriente(String nroCuenta, Date fechaApertura, double saldo, double tipoInteres, Cliente cliente) {
        super(nroCuenta, fechaApertura, saldo, tipoInteres, cliente);
        tarjetasCredito = new ArrayList<>();
    }

    public void agregarTarjetaCredito(TarjetaCredito tarjetaCredito) {
        tarjetasCredito.add(tarjetaCredito);
    }

    public List<TarjetaCredito> getTarjetasCredito(){
        return tarjetasCredito;
    }

    public void setTarjetasCredito(List tarjetasCredito){
        this.tarjetasCredito = tarjetasCredito;
    }

}
