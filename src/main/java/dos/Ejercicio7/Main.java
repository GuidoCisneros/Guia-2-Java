package dos.Ejercicio7;

import java.util.Scanner;

public class Main {
    private Scanner read = new Scanner(System.in).useDelimiter("\n");

    public static void main(String[] args) {
        PersonaService personaService = new PersonaService();
        Persona persona = new Persona();
        Persona persona2 = new Persona();
        Persona persona3 = new Persona();
        Persona persona4 = new Persona();

        personaService.crearPersona(persona);
        int peso = personaService.calcularIMC(persona);
        boolean edad = personaService.esMayorDeEdad(persona);
        personaService.crearPersona(persona2);
        int peso2 = personaService.calcularIMC(persona2);
        boolean edad2 = personaService.esMayorDeEdad(persona2);
        personaService.crearPersona(persona3);
        int peso3 = personaService.calcularIMC(persona3);
        boolean edad3 = personaService.esMayorDeEdad(persona3);
        personaService.crearPersona(persona4);;
        int peso4 = personaService.calcularIMC(persona4);
        boolean edad4 = personaService.esMayorDeEdad(persona4);
        cantidadPorcentajePeso(peso,peso2,peso3,peso4);
        cantidadPorcentajeEdad(edad,edad2,edad3,edad4);
    }

    private static void cantidadPorcentajePeso(int peso, int peso2, int peso3, int peso4) {
        int pesoi = 0;
        int pesob = 0;
        int pesos = 0;

        if (peso == -1){
            pesoi++;
        } else if (peso == 0) {
            pesob++;
        }else {
            pesos++;
        }

        if (peso2 == -1){
            pesoi++;
        } else if (peso2 == 0) {
            pesob++;
        }else {
            pesos++;
        }

        if (peso3 == -1){
            pesoi++;
        } else if (peso3 == 0) {
            pesob++;
        }else {
            pesos++;
        }

        if (peso4 == -1){
            pesoi++;
        } else if (peso4 == 0) {
            pesob++;
        }else {
            pesos++;
        }
        System.out.println("Cantidad de personas con peso ideal: " + pesoi);
        System.out.println("Cantidad de personas con peso debajo de lo ideal: " + pesob);
        System.out.println("Cantidad de personas con sobrepeso: " + pesos);
        double pesoip = (pesoi/(pesoi + pesos + pesob))*100;
        double pesobp = (pesob/(pesoi + pesos + pesob))*100;
        double pesosp = (pesos/(pesoi + pesos + pesob))*100;
        System.out.println("Porcentaje con peso ideal: " + pesoip + "%");
        System.out.println("Porcentaje con bajo del peso ideal: " + pesobp + "%");
        System.out.println("Porcentaje con sobrepeso: " + pesosp + "%");
    }

    private static void cantidadPorcentajeEdad(boolean edad, boolean edad2, boolean edad3, boolean edad4) {
        int mayor = 0;
        int menor = 0;
        if (edad == true){
            mayor++;
        }else {
            menor++;
        }

        if (edad2 == true){
            mayor++;
        }else {
            menor++;
        }

        if (edad3 == true){
            mayor++;
        }else {
            menor++;
        }

        if (edad4 == true){
            mayor++;
        }else {
            menor++;
        }
        System.out.println("Cantidad de personas mayores: " + mayor);
        System.out.println("Cantidad de personas menores: " + menor);
        double mayorp = (mayor/(mayor + menor)) * 100;
        double menorp = (menor/(mayor + menor)) * 100;
        System.out.println("Porcentaje de gente mayor: " + mayorp + "%");
        System.out.println("Porcentaje de gente menor: " + menorp + "%");
    }
}
