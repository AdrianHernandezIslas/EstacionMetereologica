/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patronobservador;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author adrian
 */
public class Reloj {
    private ArrayList<Date> tiempo;
    private Calendar calendario;
    
    public Reloj(){
        tiempo = new ArrayList<>();
    }
    
    public void registrarMedicion(){
        calendario = Calendar.getInstance();
        Date d = calendario.getTime();
        tiempo.add(d);
    }
    
    public Date getTiempoAhora(){
        calendario = Calendar.getInstance();
        return calendario.getTime();  
    }
    
    public long getDiferencia(Date ta,Date tu){
        return (ta.getTime()-tu.getTime())/1000;
    }
    
    public Date getUltimoRegistro(){
        if(!tiempo.isEmpty()){
            return tiempo.get(tiempo.size()-1);
        }
        
        return null;
    }

    public ArrayList<Date> getTiempo() {
        return tiempo;
    }
    
    
}
