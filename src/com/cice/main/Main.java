/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cice.main;

import com.cice.hilos.Crono;
import com.cice.hilos.ICrono;

/**
 *
 * @author cice
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Crono crono = new Crono();
        crono.start();
        
        ICrono icrono = new ICrono();
        // icrono implementa la interfaz, por lo que es necesario crear un Thread
        Thread hilo = new Thread(icrono,"Crono runnable");
        hilo.start();
    }
    
}
