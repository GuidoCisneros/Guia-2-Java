package dos.Ejercicio6;

public class Cafetera {
    private Integer capacidadMaxima = 3000;
    private Integer cantidadActual;

    public Cafetera(){
    }

    public Cafetera(Integer capacidadMaxima,Integer cantidadActual){
        this.cantidadActual = cantidadActual;
        this.capacidadMaxima = capacidadMaxima;
    }
    public Integer getCapacidadMaxima() {
        return capacidadMaxima ;
    }

    public void setCapacidadMaxima (Integer capacidadMaxima) {
        this.capacidadMaxima = capacidadMaxima;
    }

    public Integer getCantidadActual() {
        return cantidadActual;
    }

    public void setCantidadActual(Integer cantidadActual) {
        this.cantidadActual = cantidadActual;
    }
}
