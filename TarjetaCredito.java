import java.util.Date;
public class TarjetaCredito {
    String tipoTarjeta;
    long nro;
    String titular;
    Date fechaVencimiento;
    public TarjetaCredito(String tipoTarjeta, long nro, String titular, Date fechaVencimiento){
        this.tipoTarjeta = tipoTarjeta;
        this.nro = nro;
        this.titular = titular;
        this.fechaVencimiento = fechaVencimiento;
    }
    public String getTipoTarjeta() {
        return tipoTarjeta;
    }

    public void setTipoTarjeta(String tipoTarjeta){
        this.tipoTarjeta = tipoTarjeta;
    }

    public long getNro() {
        return nro;
    }

    public void setNro(long nro){
        this.nro = nro;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular){
        this.titular = titular;
    }

    public Date getFechaVencimiento(){
        return fechaVencimiento;
    }

    public void setFechaVencimiento(Date fechaVencimiento){
        this.fechaVencimiento = fechaVencimiento;
    }

}