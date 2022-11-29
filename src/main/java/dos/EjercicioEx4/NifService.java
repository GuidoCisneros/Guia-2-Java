package dos.EjercicioEx4;

import java.util.Scanner;

public class NifService {
    private Scanner read = new Scanner(System.in).useDelimiter("\n");

    public void crearNif(Nif nif){
        System.out.println("Ingrese numero de DNI");
        nif.setDocumentoIdentificacion(read.nextInt());
        double letra = nif.getDocumentoIdentificacion() % 23;
        String vector[] = {"T","R","W","A","G","M","Y","F","P","D","X","B","N","J","Z","S","Q","V","H","L","C","K","E"};
        for (double x =0; x < 22; x++){
            if (x == Math.abs(letra)){
                nif.setLetraIdentificacion(vector[(int) x]);
            }
        }
    }

    public void mostrar(Nif nif){
        System.out.println(nif.getDocumentoIdentificacion() + "-" + nif.getLetraIdentificacion());
    }
}
