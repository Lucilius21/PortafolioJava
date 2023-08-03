import java.util.Date;
class CajaDeAhorro extends CuentaBancaria{
    private Integer numeroMeses;

    public CajaDeAhorro(String nroCuenta, Date fechaApertura, double saldo, double tipoInteres, Cliente cliente, Integer numeroMeses) {
        super(nroCuenta, fechaApertura, saldo, tipoInteres, cliente);
        this.numeroMeses = numeroMeses;
    }

    public Integer getNumeroMeses(){
        return numeroMeses;
    }
    public void setNumeroMeeses(Integer numeroMeses){
        this.numeroMeses = numeroMeses;
    }
}
