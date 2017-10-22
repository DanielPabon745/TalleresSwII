/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import logic.Ascensor;
import logic.Instancia;
import persistence.FileLog;

/**
 *
 * @author Daniel
 */
public class Taller2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
   
        Ascensor ascensor = Instancia.newAscensor();  
        ascensor.saludo();
        ascensor.subir2Pisos();
        ascensor.subirPiso();
        ascensor.bajar3Pisos();
        ascensor.subirPiso();
        ascensor.bajar1Piso();
       
        
    }
    
}
