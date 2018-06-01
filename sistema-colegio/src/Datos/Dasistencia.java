package Datos;

public class Dasistencia {
    Integer idasist;
    String fechasist;
    String conasist;
    Dusuario odusuario;

    public Dasistencia() {
    }

    public Dasistencia(Integer idasist) {
        this.idasist = idasist;
    }

    public Dasistencia(Integer idasist, String fechasist, String conasist, Dusuario odusuario) {
        this.idasist = idasist;
        this.fechasist = fechasist;
        this.conasist = conasist;
        this.odusuario = odusuario;
    }

    public Integer getIdasist() {
        return idasist;
    }

    public void setIdasist(Integer idasist) {
        this.idasist = idasist;
    }

    public String getFechasist() {
        return fechasist;
    }

    public void setFechasist(String fechasist) {
        this.fechasist = fechasist;
    }

    public String getConasist() {
        return conasist;
    }

    public void setConasist(String conasist) {
        this.conasist = conasist;
    }

    public Dusuario getOdusuario() {
        return odusuario;
    }

    public void setOdusuario(Dusuario odusuario) {
        this.odusuario = odusuario;
    }
}

