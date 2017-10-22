/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logic;

import java.util.Date;
import java.util.GregorianCalendar;
import persistence.FileLog;


/**
 *
 * @author Daniel
 */
public class Ascensor {
    
    private int piso = 1;
    FileLog file;
    public Ascensor(){
        file = new FileLog();
    }
    
    @PostConstruct(times = 2)
    public void saludo(){
        System.out.println("Hola, Bienvenido");
    }
    
    @InvocacionMultiple
    public void subirPiso(){
        piso++;
        System.out.println("Subiendo 1 piso: "+ piso);
        file.escribir(this.getClass().getName()+" "+new Exception().getStackTrace()[0].getMethodName()+" "+file.fechaActual());
    }
    
    @InvocacionMultiple
    public void bajar1Piso(){
        piso--;
        System.out.println("Bajando 1 piso: "+ piso);
        file.escribir(this.getClass().getName()+" "+new Exception().getStackTrace()[0].getMethodName()+" "+file.fechaActual());
    }   
    
    @InvocacionMultiple(vecesAInvocar = 2)
    public void subir2Pisos(){
        piso++;
        System.out.println("Subiendo 2 pisos: "+ piso);
        file.escribir(this.getClass().getName()+" "+new Exception().getStackTrace()[0].getMethodName()+" "+file.fechaActual());
    }
    
    @InvocacionMultiple(vecesAInvocar = 3)
    public void bajar3Pisos(){
        piso--;
        System.out.println("Bajando 3 pisos: "+ piso);
        file.escribir(this.getClass().getName()+" "+new Exception().getStackTrace()[0].getMethodName()+" "+file.fechaActual());
    }
}
