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
public class PatronObservador {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        DatosClima datosClima = new DatosClima();
        DisplayPronostico displayPronostico = new DisplayPronostico();
        DisplaySensasionTermica displaySensasion = new DisplaySensasionTermica();
        DisplayEstadisticas de = new DisplayEstadisticas();
        MostrarCondicionActual mca = new MostrarCondicionActual();
        datosClima.registrarObservador(displayPronostico);
        datosClima.registrarObservador(displaySensasion);
        datosClima.registrarObservador(de);
        datosClima.registrarObservador(mca);
        datosClima.asignarMediciones(80f,65f,30.4f);
        datosClima.asignarMediciones(82f,70f,29.2f);
        datosClima.asignarMediciones(78,60,67);
    }
    
}
