package dos.Ejercicio1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Libro libro = new Libro();
        formularioLibro(libro);
        mostrarLibro(libro);
    }
    public static void  formularioLibro(Libro libro){
        Scanner read = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingrese N° de ISBN");
        libro.setIsbn(read.nextInt());
        System.out.println("Ingrese titulo del libro");
        libro.setTitulo(read.next());
        System.out.println("Ingrese nombre del autor");
        libro.setAutor(read.next());
        System.out.println("Numero de paginas");
        libro.setNumeroPaginas(read.nextInt());
    }
    public static void mostrarLibro(Libro libro){
        System.out.println("ISBN: " + libro.getIsbn());
        System.out.println("Titulo: " + libro.getTitulo());
        System.out.println("Autor: " + libro.getAutor());
        System.out.println("N° de páginas: " + libro.getNumeroPaginas());
    }
}
