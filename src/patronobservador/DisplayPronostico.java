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
public class DisplayPronostico implements Observador,DisplayValores{

    private float presionActual = 29.92f;
    private float presionAnterior;
    //private DatosClima datosClima;
    
    public DisplayPronostico(){
        //this.datosClima = datosClima;
    }
    
    @Override
    public void actualizar(float temp, float humedad, float presion) {
        presionAnterior = presionActual;
        presionActual = presion;
        display();
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
    
}
