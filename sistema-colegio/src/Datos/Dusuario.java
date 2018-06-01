package Datos;

public class Dusuario {
    Integer idusu;
    String codusu;
    String apepatusu;
    String apematusu;
    String nomusu;
    Integer edadusu;
    String genusu;
    String usuario_idusu;
    String dirusu;
    String emailusu;
    String telfusu;
    Drol odrol;
    String estado;

    public Dusuario() {
    }

    public Dusuario(Integer idusu) {
        this.idusu = idusu;
    }

    public Dusuario(Integer idusu, String codusu, String apepatusu, String apematusu, String nomusu, Integer edadusu, String genusu, String usuario_idusu, String dirusu, String emailusu, String telfusu, Drol odrol, String estado) {
        this.idusu = idusu;
        this.codusu = codusu;
        this.apepatusu = apepatusu;
        this.apematusu = apematusu;
        this.nomusu = nomusu;
        this.edadusu = edadusu;
        this.genusu = genusu;
        this.usuario_idusu = usuario_idusu;
        this.dirusu = dirusu;
        this.emailusu = emailusu;
        this.telfusu = telfusu;
        this.odrol = odrol;
        this.estado = estado;
    }

    public Integer getIdusu() {
        return idusu;
    }

    public void setIdusu(Integer idusu) {
        this.idusu = idusu;
    }

    public String getCodusu() {
        return codusu;
    }

    public void setCodusu(String codusu) {
        this.codusu = codusu;
    }

    public String getApepatusu() {
        return apepatusu;
    }

    public void setApepatusu(String apepatusu) {
        this.apepatusu = apepatusu;
    }

    public String getApematusu() {
        return apematusu;
    }

    public void setApematusu(String apematusu) {
        this.apematusu = apematusu;
    }

    public String getNomusu() {
        return nomusu;
    }

    public void setNomusu(String nomusu) {
        this.nomusu = nomusu;
    }

    public Integer getEdadusu() {
        return edadusu;
    }

    public void setEdadusu(Integer edadusu) {
        this.edadusu = edadusu;
    }

    public String getGenusu() {
        return genusu;
    }

    public void setGenusu(String genusu) {
        this.genusu = genusu;
    }

    public String getUsuario_idusu() {
        return usuario_idusu;
    }

    public void setUsuario_idusu(String usuario_idusu) {
        this.usuario_idusu = usuario_idusu;
    }

    public String getDirusu() {
        return dirusu;
    }

    public void setDirusu(String dirusu) {
        this.dirusu = dirusu;
    }

    public String getEmailusu() {
        return emailusu;
    }

    public void setEmailusu(String emailusu) {
        this.emailusu = emailusu;
    }

    public String getTelfusu() {
        return telfusu;
    }

    public void setTelfusu(String telfusu) {
        this.telfusu = telfusu;
    }

    public Drol getOdrol() {
        return odrol;
    }

    public void setOdrol(Drol odrol) {
        this.odrol = odrol;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    
}
