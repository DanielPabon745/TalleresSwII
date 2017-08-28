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
public class Ascensor {
    
    private int piso = 0;
    
    
    @PostConstruct(call = 1)
    public void pisoActual(){
        System.out.println("Piso Actual: "+ piso);
    }
    
    @Log
    public void log(){
        
    }
    
    @InvocacionMultiple
    public void subirPiso(){
        piso++;
        System.out.println("Subiendo 1 piso: "+ piso);
    }
    
    @InvocacionMultiple
    public void bajar1Piso(){
        piso--;
        System.out.println("Bajando 1 piso: "+ piso);
    }
    
    @InvocacionMultiple(vecesAInvocar = 2)
    public void subir2Pisos(){
        piso++;
        System.out.println("Subiendo 2 pisos: "+ piso);
    }
    
    @InvocacionMultiple(vecesAInvocar = 3)
    public void bajar3Pisos(){
        piso--;
        System.out.println("Bajando 3 pisos: "+ piso);
    }
}
