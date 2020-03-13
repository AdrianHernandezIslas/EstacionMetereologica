/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patronobservador;

/**
 *
 * @author adrian
 */
public class MostrarCondicionActual implements Observador, DisplayValores{
    private float temp,humedad,presion;

    @Override
    public void actualizar(float temp, float humedad, float presion) {
         this.temp = temp;
         this.humedad = humedad;
         this.presion = presion;
         display();
    }

    @Override
    public void display() {
        System.out.println("Las Condiciones Actuales son:\nPresion:"+presion+" temperatura: "+temp+" Humedad: "+humedad);
    }
    
}
