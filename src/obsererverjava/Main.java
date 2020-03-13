/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package obsererverjava;

import patronobservador.Reloj;

/**
 *
 * @author adrian
 */
public class Main {
    public static void main(String[] args) throws InterruptedException {
        DatosClima datosClima = new DatosClima();
        MostrarCondicionActual mca = new MostrarCondicionActual();
        DisplaySensasionTermica dst = new DisplaySensasionTermica();
        DisplayPronostico dp = new DisplayPronostico();
        DisplayEstadisticas de = new DisplayEstadisticas();
        datosClima.addObserver(dst);
        datosClima.addObserver(dp);
        datosClima.addObserver(mca);
        datosClima.addObserver(de);
        datosClima.asignarMediciones(23,3,1);
        Thread.sleep(20000);
        datosClima.asignarMediciones(22,10,7);
        Thread.sleep(2000);
        datosClima.asignarMediciones(30,15,7);
        
        
        
        
        
        
       
    }
}
