/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package obsererverjava;


import java.util.Observable;

/**
 *
 * @author adrian
 */
public class DatosClima extends Observable{
    private float temperatura,humedad,presion;
    
    public DatosClima(){
        
    }

    
    
    public void asignarMediciones(float temperatura,float humedad,float presion){
        this.temperatura = temperatura;
        this.humedad = humedad;
        this.presion = presion;
        
        setChanged();
        notifyObservers(new float[]{temperatura,humedad,presion});
         
    }

    public float getTemperatura() {
        return temperatura;
    }

    public float getHumedad() {
        return humedad;
    }

    public float getPresion() {
        return presion;
    }
       
}
