package dos.Ejercicio9;

public class Matematica {

    private Integer valor1;
    private Integer valor2;

    public Matematica(){
    }

    public Matematica(Integer valor1, Integer valor2){
        this.valor1 = valor1;
        this.valor2 = valor2;
    }

    public Integer getValor1(){return valor1;}

    public void setValor1(Integer valor1){this.valor1 = valor1;}

    public Integer getValor2(){return valor2;}

    public void setValor2(Integer valor2){this.valor2 = valor2;}
}
