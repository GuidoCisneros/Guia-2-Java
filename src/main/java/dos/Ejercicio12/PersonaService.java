package dos.Ejercicio12;

import java.util.Date;
import java.util.Scanner;

public class PersonaService {
    private Scanner read = new Scanner(System.in).useDelimiter("\n");

    public void creaPersona(Persona persona){
        System.out.println("Ingrese su nombre y apellido");
        persona.setNombreApellido(read.next());
        System.out.println("Ingrese fecha de nacimiento");
        System.out.println("Dia:");
        int dia = read.nextInt();
        System.out.println("Mes:");
        int mes = read.nextInt();
        System.out.println("Año:");
        int anio = read.nextInt();
        Date date = new Date((anio - 1900), (mes - 1), dia);
        persona.setFechaNacimiento(date);
    }
    public void calcularEdad(Persona persona){
        Date dateActual = new Date();
        int edad = dateActual.getYear() - persona.getFechaNacimiento().getYear(); ;

    }
    public boolean menorQue(Persona persona) {
        Date nacimiento = new Date(98, 5, 3);
        if (persona.getFechaNacimiento().getYear() < nacimiento.getYear()){
            System.out.println("Es mayor, de edad");
            return false;
        }else {
            System.out.println("Es menor, de edad");
            return true;
        }
    }
    public void mostrarPersona() {
        String personaComparacion = "Santiago DeMoron";
        Date nacimiento = new Date(98, 5, 3);
        System.out.println("Nombre: " + personaComparacion);
        System.out.println("Nacimiento: " + nacimiento);
    }
}
