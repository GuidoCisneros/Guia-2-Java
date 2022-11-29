package dos.Ejercicio10;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        double vectorA[] = new double[50];
        double vectorB[] = new double[20];

        for (int x =0; x < 49; x++){
            vectorA[x] = Math.round(Math.random() * 100);
        }

        System.out.println(Arrays.toString(vectorA));
        System.out.println(" ");
        Arrays.sort(vectorA);
        for (int x =0; x < 10; x++){
            vectorB[x] = vectorA[x];
        }
        Arrays.fill(vectorB,10,20,0.5);
        System.out.println(Arrays.toString(vectorA));
        System.out.println(" ");
        System.out.println(Arrays.toString(vectorB));
    }
}
