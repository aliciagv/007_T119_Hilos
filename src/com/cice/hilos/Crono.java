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
public class Crono extends Thread {
    
    @Override
    public void run() {
        int contador = 0;
       
        while (true) {
            try {
                Thread.sleep(1000);
                
            } catch (InterruptedException ex) {
                Logger.getLogger(Crono.class.getName()).log(Level.SEVERE, null, ex);
            }
             System.out.println("Nombre: " + this.getName());
            System.out.println(++contador);
        }
        
    }
}
