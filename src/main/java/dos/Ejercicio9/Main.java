package dos.Ejercicio9;

public class Main {

    public static void main(String[] args) {
        Matematica matematica = new Matematica();
        MatematicaService matematicaService = new MatematicaService();
        System.out.println("Aca abajo apareceran los numeros a calcular");
        matematica.setValor1((int) (Math.random() * 100));
        matematica.setValor2((int) (Math.random() * 100));
        System.out.println(matematica.getValor1());
        System.out.println(matematica.getValor2());
        matematicaService.devolverMayor(matematica);
        matematicaService.calcularPotencia(matematica);
        matematicaService.calculaRaiz(matematica);
    }
}
