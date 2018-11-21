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
public class computadora extends tecnologia {
    
    private String procesador;
    private int RAM;
    
    public computadora (){};
       
    
    public computadora(String procesador, int RAM, String NOserie){
    super(Noserie,anio,modelo);
    this.procesador=procesador;
    this.RAM=RAM;
    
    }
}
