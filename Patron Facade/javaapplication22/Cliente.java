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
public class Cliente {
    
    Fachada fachada;
    
    public Cliente(){
        fachada = new Fachada();
        
        fachada.expulsarCD();
        fachada.imprimir();
        
    }
    
}