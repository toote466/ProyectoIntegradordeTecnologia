/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package compuproyecto;

/**
 *
 * @author ANTONIO
 */
public abstract class tecnologia {
    
    private String Noserie;
    private String anio;
    private String modelo;
    
    
    public tecnologia(){};
    
    public tecnologia(String Noserie, String anio, String modelo){
        
        this.Noserie=Noserie;
        this.anio=anio;
        this.modelo=modelo;
        
    }

    /**
     * @return the Noserie
     */
    public String getNoserie() {
        return Noserie;
    }

    /**
     * @param Noserie the Noserie to set
     */
    public void setNoserie(String Noserie) {
        this.Noserie = Noserie;
    }

    /**
     * @return the anio
     */
    public String getAnio() {
        return anio;
    }

    /**
     * @param anio the anio to set
     */
    public void setAnio(String anio) {
        this.anio = anio;
    }

    /**
     * @return the modelo
     */
    public String getModelo() {
        return modelo;
    }

    /**
     * @param modelo the modelo to set
     */
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
}
