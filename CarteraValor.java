public class CarteraValor {
    String nombreValor;
    Integer numeroTitulos;
    double precioCotizacion;

    public CarteraValor(String nombreValor, Integer numeroTitulos, double precioCotizacion) {
        this.nombreValor = nombreValor;
        this.numeroTitulos = numeroTitulos;
        this.precioCotizacion = precioCotizacion;
    }

    public String getNombreValor() {
        return nombreValor;
    }

    public void setNombreValor(String nombreValor){
        this.nombreValor = nombreValor;
    }

    public String getNumeroTitulos() {
        return nombreValor;
    }

    public void setNumeroTitulos(Integer numeroTitulos){
        this.numeroTitulos = numeroTitulos;
    }

    public Double getPrecioCotizacion() {
        return precioCotizacion;
    }

    public void setPrecioCotizacion(Double precioCotizacion){
        this.precioCotizacion = precioCotizacion;
    }
}
