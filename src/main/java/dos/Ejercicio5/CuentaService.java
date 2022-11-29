package dos.Ejercicio5;

import java.util.Scanner;

public class CuentaService {
    private Scanner read = new Scanner(System.in).useDelimiter("\n");

    public Cuenta crearCuenta() {
        Cuenta cuenta = new Cuenta();
        System.out.println("Ingrese su dni");
        cuenta.setDni(read.nextLong());
        System.out.println("Digite el numero de cuenta");
        cuenta.setNumeroDeCuenta(read.nextInt());
        cuenta.setSaldo(0.0);
        return cuenta;
    }

    public void ingresarDinero(Double dinero, Cuenta cuenta){
        cuenta.setSaldo(cuenta.getSaldo() + dinero);
    }

    public void retirarDinero(Double dinero, Cuenta cuenta){
        if(cuenta.getSaldo() < dinero){
            System.out.println("No se puede retirar el dinero solicitado por falta de fondos\n" +
                    "su saldo es: "+ cuenta.getSaldo());
        }else{
            cuenta.setSaldo(cuenta.getSaldo() - dinero);
        }
    }

    public void extraccionRapida(Cuenta cuenta){
        System.out.println("En este modo solo se puede retirar hasta el 20% de su saldo, por favor indique cuanto desea retirar");
        double extraccion = read.nextDouble();
        if (extraccion > (cuenta.getSaldo()*0.2)){
            System.out.println("No se puede retirar el limite solicitado");
        }else{
            cuenta.setSaldo(cuenta.getSaldo() - extraccion);
            System.out.println("Su nuevo saldo es: $ " + cuenta.getSaldo());
        }
    }

    public void consultarSaldo(Cuenta cuenta){
        System.out.println("Su saldo es : $ " + cuenta.getSaldo());
    }

    public void consultarDatos(Cuenta cuenta) {
        System.out.println("DNI: " + cuenta.getDni() + "\nNro. de cuenta: " + cuenta.getNumeroDeCuenta() + "\nSaldo: $ " + cuenta.getSaldo());
    }
}
