/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taller2;

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
        ascensor.pisoActual();
        ascensor.subir2Pisos();
        ascensor.subirPiso();
        ascensor.bajar3Pisos();
        ascensor.subirPiso();
        ascensor.bajar1Piso();
    }
    
}
