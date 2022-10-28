package dos.Ejercicio5;

public class Cuenta {
    private Integer numeroDeCuenta;
    private Long dni;
    private Double saldo;

    public Cuenta() {
    }

    public Cuenta(Integer numeroDeCuenta, Long dni, Double saldo) {
        this.numeroDeCuenta = numeroDeCuenta;
        this.dni = dni;
        this.saldo = saldo;
    }

    public Integer getNumeroDeCuenta() {
        return numeroDeCuenta;
    }

    public void setNumeroDeCuenta(Integer numeroDeCuenta) {
        this.numeroDeCuenta = numeroDeCuenta;
    }

    public Long getDni() {
        return dni;
    }

    public void setDni(Long dni) {
        this.dni = dni;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }
}
