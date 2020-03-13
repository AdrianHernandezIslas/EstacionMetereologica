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
public class DisplayEstadisticas implements Observador,DisplayValores{
    private float totalTemperatura,totalHumedad,totalPresion;
    private float promedioTemperatura,promedioHumedad,promedioPresion;
    private float minimoTemperatura,minimoHumedad,minimoPresion;
    private float maximoTemperatura,maximoHumedad,maximoPresion;
    private int cantidad=0;

    @Override
    public void actualizar(float temp, float humedad, float presion) {
        calcularPromedios(temp,humedad,presion);
        calcularMaximos(temp,humedad,presion);
        calcularMinimos(temp,humedad,presion);
        display(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void display() {
        System.out.printf("\n%-22s%-22s%-22s%-22s","Elemento","Promedio","Maximo","Minimo");
        System.out.printf("\n%-22s%-22s%-22s%-22s","Temperatura",promedioTemperatura+"°",maximoTemperatura+"°",minimoTemperatura+"°");
        System.out.printf("\n%-22s%-22s%-22s%-22s","Humedad",promedioHumedad,maximoHumedad,minimoHumedad);
        System.out.printf("\n%-22s%-22s%-22s%-22s\n\n","Presión",promedioPresion,maximoPresion,minimoPresion); //To change body of generated methods, choose Tools | Templates.
    }
    
    public void calcularPromedios(float temp, float humedad, float presion){
        totalTemperatura+=temp;
        totalHumedad+=humedad;
        totalPresion+=presion;
        cantidad++;
        promedioTemperatura=totalTemperatura/cantidad;
        promedioHumedad=totalHumedad/cantidad;
        promedioPresion=totalPresion/cantidad;
    }
    
    public void calcularMaximos(float temp, float humedad, float presion){
        if(cantidad==1){
            maximoTemperatura=temp;
            maximoHumedad=humedad;
            maximoPresion=presion;
        }else{
            if(temp>maximoTemperatura){
                maximoTemperatura=temp;
            }
            if(humedad>maximoHumedad){
                maximoHumedad=humedad;
            }
            if(presion>maximoPresion){
                maximoPresion=presion;
            }
        }
    }
    
    public void calcularMinimos(float temp, float humedad, float presion){
        if(cantidad==1){
            minimoTemperatura=temp;
            minimoHumedad=humedad;
            minimoPresion=presion;
        }else{
            if(temp<minimoTemperatura){
                minimoTemperatura=temp;
            }
            if(humedad<minimoHumedad){
                minimoHumedad=humedad;
            }
            if(presion<minimoPresion){
                minimoPresion=presion;
            }
        }
    }
}
