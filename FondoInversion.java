import java.util.Date;
class FondoInversion {
    String nombre;
    double importe;
    double rentabilidad;
    Date fechaApertura;
    Date fechaVencimiento;

    public FondoInversion(String nombre, double importe, double rentabilidad, Date fechaApertura, Date fechaVencimiento) {
        this.nombre = nombre;
        this.importe = importe;
        this.rentabilidad = rentabilidad;
        this.fechaApertura = fechaApertura;
        this.fechaVencimiento = fechaVencimiento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Double getImporte() {
        return importe;
    }

    public void setImporte(Double importe) {
        this.importe = importe;
    }

    public Double getRentabilidad() {
        return rentabilidad;
    }

    public void setRentabilidad(Double rentabilidad) {
        this.rentabilidad = rentabilidad;
    }

    public Date getFechaApertura() {
        return fechaApertura;
    }

    public void setFechaApertura(Date fechaApertura) {
        this.fechaApertura = fechaApertura;
    }

    public Date getFechaVencimiento() {
        return fechaVencimiento;
    }

    public void setFechaVencimiento(Date fechaVencimiento) {
        this.fechaVencimiento = fechaVencimiento;
    }

}