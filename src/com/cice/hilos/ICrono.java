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
/*Runnable es una interfaz funcional @FunctionalInterface, sólo tiene un método abtracto para implementar*/
public class ICrono implements Runnable{

    @Override
    public void run() {
        int contador = 0;
       
        while (true){
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                Logger.getLogger(ICrono.class.getName()).log(Level.SEVERE, null, ex);
            }
              System.out.println(Thread.currentThread().getName());
              System.out.println(++contador);
         
        }
       
    }
    
}
