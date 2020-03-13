/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patronobservador;

import java.util.ArrayList;

/**
 *
 * @author adrian
 */
public class DatosClima implements Sujeto{
    private final ArrayList observadores;
    private float temperatura,humedad,presion;
    private Reloj reloj;
    
    public DatosClima(){
        observadores = new ArrayList();
        reloj = new Reloj();
    }

    @Override
    public void registrarObservador(Observador o) {
        observadores.add(o); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void notificarObservadores() {
        for (int i=0; i<observadores.size();i++) {
            Observador observador = (Observador) observadores.get(i);
            observador.actualizar(humedad, humedad,presion);  
        }
    }

    @Override
    public void removerObeservador(Observador o) {
        int i = observadores.indexOf(o);
        if(i>=0){
           observadores.remove(o);
        }
    }
    
    public void cambioMediciones(){
        if(reloj.getUltimoRegistro() != null && reloj.getDiferencia(reloj.getTiempoAhora(),reloj.getUltimoRegistro())>=20){
           notificarObservadores();
        }
    }
    
    public void asignarMediciones(float temperatura,float humedad,float presion){
        this.temperatura = temperatura;
        this.humedad = humedad;
        this.presion = presion;
        reloj.registrarMedicion();
        cambioMediciones();
         
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
