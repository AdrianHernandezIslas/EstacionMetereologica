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
public class DisplaySensasionTermica implements Observador, DisplayValores {
    private float sensacionTermica = 0;
    
    @Override
    public void actualizar(float temp, float humedad, float presion) {
        sensacionTermica = calcularSensacionTermica(temp, humedad);
        display(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void display() {
        System.out.println("Sensación termica actual es: " + sensacionTermica + "°"); //To change body of generated methods, choose Tools | Templates.
    }
    
    public float calcularSensacionTermica(float t, float h) {
        return (float) (16.923 + (0.185212 * t) + (5.3791 * h) - (0.100254 * t * h) + (0.00941695 * t * t) + (0.00728898 * h * h)
                + (0.000345372 * t * t * h) - (8.14971e-4 * t * h * h) + (1.02102e-5 * t * t * h * h) - (3.8646e-5 * t * t * t) 
                + (2.91583e-5 * h * h * h) + (1.42721e-6 * t * t * t * h) + (1.97483e-7 * t * h * h * h) - (2.18429e-8 * t * t * t * h * h)
                + (8.43296e-10 * t * t * h * h * h) - (4.81975e-11 * t * t * t * h * h * h));
    }
    
}
