/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cice.main;

import com.cice.hilos.Crono;
import com.cice.hilos.ICrono;
import com.cice.hilos.Test;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author cice
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        String nombre = "alicia";
        // TODO code application logic here
        Crono crono = new Crono();
        crono.setPriority(Thread.MIN_PRIORITY);
        
        Crono crono1 = new Crono();
        crono1.setPriority(Thread.MAX_PRIORITY);
        
        
        Crono crono2 = new Crono();
        crono2.setPriority(Thread.NORM_PRIORITY);
       
        
        
        Crono crono3 = new Crono();
        crono3.setPriority(Thread.MAX_PRIORITY);
         
        
        Crono crono4 = new Crono();
        crono4.setPriority(Thread.MAX_PRIORITY);
        
        crono.start();
        crono1.start();
        crono2.start();
        crono3.start();
        crono4.start();

        ICrono icrono = new ICrono();
        // icrono implementa la interfaz, por lo que es necesario crear un Thread
        Thread hilo = new Thread(icrono,"Crono runnable");
        hilo.setPriority(Thread.MAX_PRIORITY);
        hilo.start();
        
        Test test = new Test();
        test.start();
        
        while (true) {
            try {
                Thread.sleep(500);
            } catch (InterruptedException ex) {
                Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        
       
       
    }
    
}
