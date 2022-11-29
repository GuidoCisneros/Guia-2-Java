package dos.Ejercicio9;

public class MatematicaService {

    public int devolverMayor(Matematica matematica){
        if (matematica.getValor1()> matematica.getValor2()){
            System.out.println("El Primer numero es mayor: " + matematica.getValor1());
            return matematica.getValor1();
        }else {
            System.out.println("El segundo numero es mayor: " + matematica.getValor2());
            return matematica.getValor2();
        }
    }
    public void calcularPotencia(Matematica matematica){
        if (matematica.getValor1()> matematica.getValor2()){
            int potencia = (int) Math.pow(matematica.getValor1(), matematica.getValor2());
            System.out.println("La potencia de " + matematica. getValor1() + " elevado a la " + matematica.getValor2() + " es " + potencia);
        }else {
            int potencia = (int) Math.pow(matematica.getValor2(), matematica.getValor1());
            System.out.println("La potencia de " + matematica. getValor2() + " elevado a la " + matematica.getValor1() + " es " + potencia);
        }
    }

    public void calculaRaiz(Matematica matematica){
        if (matematica.getValor1()> matematica.getValor2()){
            int raiz = (int) Math.sqrt(matematica.getValor2());
            System.out.println("La raiz del menor numero es " + raiz);
        }else {
            int raiz = (int) Math.sqrt(matematica.getValor1());
            System.out.println("La raiz del menor numero es " + raiz);
        }
    }
}
