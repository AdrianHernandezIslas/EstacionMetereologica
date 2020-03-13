/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package obsererverjava;

import java.util.Observable;
import java.util.Observer;
import patronobservador.DisplayValores;





/**
 *
 * @author adrian
 */
public class MostrarCondicionActual implements Observer,DisplayValores{
    private float temp,humedad,presion;
    

    @Override
    public void display() {
        System.out.println("Las Condiciones Actuales son:\nPresion:"+presion+" temperatura: "+temp+" Humedad: "+humedad);
    }

    @Override
    public void update(Observable o, Object arg) {
        float values[] = (float[])arg;
        this.presion = values[0];
        this.temp = values[1];
        this.humedad = values[2]; 
        display();
    }
    
}
