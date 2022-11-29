package dos.Ejercicio12;

import java.util.Date;

public class Persona {

    private String nombreApellido;
    private Date fechaNacimiento;

    public Persona() {
    }

    public Persona(String nombreApellido, Date fechaNacimiento) {
        this.nombreApellido = nombreApellido;
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getNombreApellido() {
        return nombreApellido;
    }

    public void setNombreApellido(String nombreApellido) {
        this.nombreApellido = nombreApellido;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }
}
