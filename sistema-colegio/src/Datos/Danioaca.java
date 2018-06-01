
package Datos;


public class Danioaca {
    
    Integer idanio;
    String anioactual;
    String fechin;
    String fechfin;

    public Danioaca() {
    }

    public Danioaca(Integer idanio) {
        this.idanio = idanio;
    }

    public Danioaca(Integer idanio, String anioactual, String fechin, String fechfin) {
        this.idanio = idanio;
        this.anioactual = anioactual;
        this.fechin = fechin;
        this.fechfin = fechfin;
    }

    public Integer getIdanio() {
        return idanio;
    }

    public void setIdanio(Integer idanio) {
        this.idanio = idanio;
    }

    public String getAnioactual() {
        return anioactual;
    }

    public void setAnioactual(String anioactual) {
        this.anioactual = anioactual;
    }

    public String getFechin() {
        return fechin;
    }

    public void setFechin(String fechin) {
        this.fechin = fechin;
    }

    public String getFechfin() {
        return fechfin;
    }

    public void setFechfin(String fechfin) {
        this.fechfin = fechfin;
    }
    
    
       
    
}
