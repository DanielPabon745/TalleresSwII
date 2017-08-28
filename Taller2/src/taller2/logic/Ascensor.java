/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logic;

import java.io.File;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import persistence.FileLog;

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
	Date date = new Date();
	DateFormat hourdateFormat = new SimpleDateFormat("HH:mm:ss dd/MM/yyyy");
        FileLog log = new FileLog();
        final String className = this.getClass().getName();
        log.escribir("Acceso a la Clase: -" + className + "- a las: " + hourdateFormat.format(date));
        log.escribir("Ubicada en: -" + this.getClass().getPackage() + "- a las: " + hourdateFormat.format(date));
        log.escribir("¿Es una clase local?: -" + this.getClass().isLocalClass() + "- a las: " + hourdateFormat.format(date));
        log.escribir("¿Class loader?: -" + this.getClass().getClassLoader() + "- a las: " + hourdateFormat.format(date));
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
