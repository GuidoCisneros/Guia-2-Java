package dos.EjercicioEx4;

public class Nif {

    private String LetraIdentificacion;
    private Integer DocumentoIdentificacion;

    public Nif(String letraIdentificacion, Integer documentoIdentificacion){
        this.DocumentoIdentificacion = documentoIdentificacion;
        this.LetraIdentificacion = letraIdentificacion;
    }

    public Nif() {
    }

    public String getLetraIdentificacion() {
        return LetraIdentificacion;
    }

    public void setLetraIdentificacion(String letraIdentificacion) {
        LetraIdentificacion = letraIdentificacion;
    }

    public Integer getDocumentoIdentificacion() {
        return DocumentoIdentificacion;
    }

    public void setDocumentoIdentificacion(Integer documentoIdentificacion) {
        DocumentoIdentificacion = documentoIdentificacion;
    }
}
