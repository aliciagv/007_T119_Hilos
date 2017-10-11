/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cice.hilos;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author cice
 */
public class Test extends Thread {
    
    public static String nombre ="Hilo Test";
    
    
    @Override
    public void run(){
        try {
            Thread.sleep(5000);
        } catch (InterruptedException ex) {
            Logger.getLogger(Test.class.getName()).log(Level.SEVERE, null, ex);
        }
        synchronized (nombre) {
        nombre= "Hilo Test Cambiado";
        }
    }
    
}
