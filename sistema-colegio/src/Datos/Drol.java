package Datos;

public class Drol {
    Integer idrol;
    String nomrol;

    public Drol() {
    }

    public Drol(Integer idrol) {
        this.idrol = idrol;
    }

    public Drol(Integer idrol, String nomrol) {
        this.idrol = idrol;
        this.nomrol = nomrol;
    }

    public Integer getIdrol() {
        return idrol;
    }

    public void setIdrol(Integer idrol) {
        this.idrol = idrol;
    }

    public String getNomrol() {
        return nomrol;
    }

    public void setNomrol(String nomrol) {
        this.nomrol = nomrol;
    }
    
    
}
