/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taller2;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 *
 * @author Dreyk
 */
public class FileLog {
    	private File archivo;
	private FileWriter fichero;
	private PrintWriter pw;
	
	public FileLog() {
		archivo = new File ("log.txt");
	}

	public void escribir(String log) {
		// TODO Auto-generated method stub
		try {
			fichero = new FileWriter(archivo.getName(), true);
			pw = new PrintWriter(fichero);
			pw.println(log);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
	           try {
	               // Nuevamente aprovechamos el finally para 
	               // asegurarnos que se cierra el fichero.
	               if (null != fichero)
	                  fichero.close();
	               } catch (Exception e2) {
	                  e2.printStackTrace();
            }
        }
    }
}
