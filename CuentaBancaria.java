import java.util.Date;
public class CuentaBancaria {
    String nroCuenta;
    Date fechaApertura;
    Double saldo;
    Double tipoInteres;
    Cliente cliente;
    public CuentaBancaria(String nroCuenta, Date fechaApertura, Double saldo, Double tipoInteres, Cliente cliente) {
        this.nroCuenta = nroCuenta;
        this.fechaApertura = fechaApertura;
        this.tipoInteres = tipoInteres;
        this.saldo = saldo;
        this.cliente = cliente;
    }

    public String getNumeroCuenta() {
        return nroCuenta;
    }

    public void setNumeroCuenta(String nroCuenta) {
        this.nroCuenta = nroCuenta;
    }

    public Date getFechaApertura() {
        return fechaApertura;
    }

    public void setFechaApertura(Date fechaApertura) {
        this.fechaApertura = fechaApertura;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getTipoInteres() {
        return tipoInteres;
    }

    public void setTipoInteres(double tipoInteres) {
        this.tipoInteres = tipoInteres;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
}