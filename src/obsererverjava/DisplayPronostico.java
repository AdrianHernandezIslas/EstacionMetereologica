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
public class DisplayPronostico implements Observer,DisplayValores{

    private float presionActual = 29.92f;
    private float presionAnterior;
    //private DatosClima datosClima;
    
    public DisplayPronostico(){
        //this.datosClima = datosClima;
    }

    @Override
    public void display() {
       if(presionActual>presionAnterior){
           System.out.println("Mejoramiento");
       }else if(presionActual == presionAnterior){
           System.out.println("No hat cambiaos");
       }else if(presionActual<presionAnterior){
           System.out.println("Va a llover creo");
       }
       
    }

    @Override
    public void update(Observable o, Object arg) {
        float values[] = (float[])arg;
        presionAnterior = presionActual;
        presionActual = values[2];
        display(); //To change body of generated methods, choose Tools | Templates.
    }
    
}
