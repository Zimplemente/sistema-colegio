package Datos;

public class Dgys {
    Integer idgys;
    String nomgrad;
    String nomsecc;

    public Dgys() {
    }

    public Dgys(Integer idgys) {
        this.idgys = idgys;
    }

    public Dgys(Integer idgys, String nomgrad, String nomsecc) {
        this.idgys = idgys;
        this.nomgrad = nomgrad;
        this.nomsecc = nomsecc;
    }

    public Integer getIdgys() {
        return idgys;
    }

    public void setIdgys(Integer idgys) {
        this.idgys = idgys;
    }

    public String getNomgrad() {
        return nomgrad;
    }

    public void setNomgrad(String nomgrad) {
        this.nomgrad = nomgrad;
    }

    public String getNomsecc() {
        return nomsecc;
    }

    public void setNomsecc(String nomsecc) {
        this.nomsecc = nomsecc;
    }
    
    
    
}
