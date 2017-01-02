/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication22;

/**
 *
 * @author Carlos Zamora
 */
public class Fachada {
    
    private Disquetera disquetera;
    private Impresora impresora;
    private Altavoces altavoces;
    
    public void expulsarCD(){
        disquetera.expulsarCD();
    }
    
    public void imprimir(){
        impresora.imprimir();
    }
    
    public void setVolume(int vol){
        altavoces.setVolume(vol);
    }
    
}
