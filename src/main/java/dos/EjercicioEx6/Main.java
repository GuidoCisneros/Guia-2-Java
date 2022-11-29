package dos.EjercicioEx6;

public class Main {
    public static void main(String[] args) {
        Ahorcado ahorcado = new Ahorcado();
        AhorcadoService ahorcadoService = new AhorcadoService();
        ahorcadoService.juego(ahorcado);
    }
}
