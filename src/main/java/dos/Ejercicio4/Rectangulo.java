package dos.Ejercicio4;

public class Rectangulo {

    private Integer base;
    private Integer altura;

    public Rectangulo(Integer base, Integer altura){
        this.base = base;
        this.altura = altura;
    }
    public Rectangulo(){
    }

    public Integer getAltura() {return altura;}

    public void setAltura(Integer altura) {this.altura = altura;}

    public Integer getBase() {return base;}

    public void setBase(Integer base) {this.base = base;}
}
