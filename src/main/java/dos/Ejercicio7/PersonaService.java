package dos.Ejercicio7;

import java.util.Scanner;

public class PersonaService {
    private Scanner read = new Scanner(System.in).useDelimiter("\n");

    public void crearPersona(Persona persona){
        System.out.println("Ingrese nombre y apellido:");
        persona.setNombre(read.next());
        System.out.println("Ingrese edad:");
        persona.setEdad(read.nextInt());
        System.out.println("Sexo:");
        persona.setSexo(read.next());
        System.out.println("Ingrese peso:");
        persona.setPeso(read.nextInt());
        System.out.println("Ingrese altura:");
        persona.setAltura(read.nextDouble());
    }

    public int calcularIMC(Persona persona){
        double imc = persona.getPeso()/(Math.pow(persona.getAltura(),2));
        if (imc > 25){
            int sobrepeso = 1;
            System.out.println("Tiene sobrepeso");
            return sobrepeso;
        }else if (imc <= 25 && imc >= 20){
            int bajopeso = 0;
            System.out.println("Tiene poco peso");
            return bajopeso;
        }else {
            int pesoideal = -1;
            System.out.println("Tiene el peso ideal");
            return pesoideal;
        }
    }

    public boolean esMayorDeEdad(Persona persona) {
        if (persona.getEdad() >= 18){
            System.out.println("Es mayor de edad");
            return true;
        }else {
            System.out.println("Es menor de edad");
            return false;
        }
    }
}