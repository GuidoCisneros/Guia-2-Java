package dos.Ejercicio1;

public class Libro {

    private Integer isbn;
    private String titulo;
    private String autor;
    private Integer numeroPaginas;

    public Libro(){
    }

    public Libro(Integer isbn, String titulo, String autor, Integer numeroPaginas){
        this.autor = autor;
        this.isbn = isbn;
        this.titulo = titulo;
        this.numeroPaginas = numeroPaginas;
    }

    public Integer getIsbn(){return isbn;}

    public void setIsbn(Integer isbn){this.isbn = isbn;}

    public String getTitulo(){return titulo;}

    public void setTitulo(String titulo){this.titulo = titulo;}

    public String getAutor(){return autor;}

    public void setAutor(String autor){this.autor = autor;}

    public Integer getNumeroPaginas(){return numeroPaginas;}

    public void setNumeroPaginas(Integer numeroPaginas){this.numeroPaginas = numeroPaginas;}
}
