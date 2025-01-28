package DataAccess.DTO;

public class GeneroDTO {
    private Integer IDGenero;
    private String Genero;

    public GeneroDTO(Integer iDGenero, String genero) {
        IDGenero = iDGenero;
        Genero = genero;
    }

    public GeneroDTO(String genero) {
        Genero = genero;
    }

    public Integer getIDGenero() {
        return IDGenero;
    }

    public void setIDGenero(Integer iDGenero) {
        IDGenero = iDGenero;
    }

    public String getGenero() {
        return Genero;
    }

    public void setGenero(String genero) {
        Genero = genero;
    }
    
    public GeneroDTO() {
    }

    @Override
    public String toString(){
        return getClass().getName()
        + "\n IdGenero        : "+ getIDGenero       ()
        + "\n Genero          : "+ getGenero      ();
    }
}
