package dos.EjercicioEx6;

public class Ahorcado {

    private String[] descifrar;
    private Integer jugadas;

    public Ahorcado(){
    }

    public Ahorcado(Integer jugadas, String[] descifrar){
        this.jugadas = jugadas;
        this.descifrar = descifrar;
    }

    public String[] getDescifrar() {
        return descifrar;
    }

    public void setDescifrar(String[] descifrar) {
        this.descifrar = descifrar;
    }

    public Integer getJugadas() {
        return jugadas;
    }

    public void setJugadas(Integer jugadas) {
        this.jugadas = jugadas;
    }
}
