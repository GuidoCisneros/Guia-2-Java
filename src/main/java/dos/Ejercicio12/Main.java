package dos.Ejercicio12;

public class Main {
    public static void main(String[] args) {
        Persona persona = new Persona();
        PersonaService personaService = new PersonaService();
        personaService.creaPersona(persona);
        personaService.calcularEdad(persona);
        personaService.menorQue(persona);
        personaService.mostrarPersona();
    }
}
