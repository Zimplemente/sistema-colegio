package Datos;

public class Dcurso {
    Integer idcurso;
    String codcur;
    String nomcur;
    Dgys odgys;
    Dusuario odusuario;

    public Dcurso() {
    }

    public Dcurso(Integer idcurso) {
        this.idcurso = idcurso;
    }

    public Dcurso(Integer idcurso, String codcur, String nomcur, Dgys odgys, Dusuario odusuario) {
        this.idcurso = idcurso;
        this.codcur = codcur;
        this.nomcur = nomcur;
        this.odgys = odgys;
        this.odusuario = odusuario;
    }

    public Integer getIdcurso() {
        return idcurso;
    }

    public void setIdcurso(Integer idcurso) {
        this.idcurso = idcurso;
    }

    public String getCodcur() {
        return codcur;
    }

    public void setCodcur(String codcur) {
        this.codcur = codcur;
    }

    public String getNomcur() {
        return nomcur;
    }

    public void setNomcur(String nomcur) {
        this.nomcur = nomcur;
    }

    public Dgys getOdgys() {
        return odgys;
    }

    public void setOdgys(Dgys odgys) {
        this.odgys = odgys;
    }

    public Dusuario getOdusuario() {
        return odusuario;
    }

    public void setOdusuario(Dusuario odusuario) {
        this.odusuario = odusuario;
    }

    
}
