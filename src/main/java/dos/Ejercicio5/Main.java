package dos.Ejercicio5;

import java.util.Scanner;

/**
 * Realizar una clase llamada Cuenta (bancaria) que debe tener como mínimo los
 * atributos: numeroCuenta (entero), el DNI del cliente (entero largo), el saldo actual. Las
 * operaciones asociadas a dicha clase son:
 * • Constructor por defecto y constructor con DNI, saldo, número de cuenta e interés. (check)
 * • Agregar los métodos getters y setters correspondientes (check)
 * • Metodo para crear un objeto Cuenta, pidiéndole los datos al usuario.
 * • Método ingresar(double ingreso): el método recibe una cantidad de dinero a
 * ingresar y se la sumara a saldo actual. (check)
 * • Método retirar(double retiro): el método recibe una cantidad de dinero a retirar y
 * se la restará al saldo actual. Si la cuenta no tiene la cantidad de dinero a retirar, se
 * pondrá el saldo actual en 0. (check)
 * • Método extraccionRapida(): le permitirá sacar solo un 20% de su saldo. Validar
 * que el usuario no saque más del 20%.(check)
 * • Método consultarSaldo(): permitirá consultar el saldo disponible en la cuenta.
 * • Método consultarDatos(): permitirá mostrar todos los datos de la cuenta
 */
public class Main {
    private static Scanner read = new Scanner(System.in).useDelimiter("\n");

    public static void main(String[] args) {
        menu();
    }

    public static void menu() {
        CuentaService cuentaService = new CuentaService();
        Cuenta cuenta = new Cuenta();
        int opcion = 0;
        do {
            System.out.println("Ingrese la opcion que desea realizar");
            System.out.println("1 - Crear cuenta");
            System.out.println("2 - Ingresar Dinero");
            System.out.println("3 - Retirar Dinero");
            System.out.println("4 - Extraccion Rapida (solo hasta el 20% de su saldo)");
            System.out.println("5 - Consultar Datos");
            System.out.println("6 - Consultar Saldo");
            System.out.println("7 - Salir");

            opcion = read.nextInt();

            switch (opcion) {
                case 1:
                    cuenta = cuentaService.crearCuenta();
                    break;
                case 2:
                    System.out.println("Ingrese la cantidad de dinero que desea depositar");
                    cuentaService.ingresarDinero(read.nextDouble(), cuenta);
                    break;
                case 3:
                    System.out.println("Ingrese la cantidad de dinero que desea retirar");
                    cuentaService.retirarDinero(read.nextDouble(), cuenta);
                    break;
                case 4:
                    cuentaService.extraccionRapida(cuenta);
                    break;
                case 5:
                    cuentaService.consultarDatos(cuenta);
                    break;
                case 6:
                    cuentaService.consultarSaldo(cuenta);
                    break;
            }
        }while (opcion != 7);
    }

}
