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
public interface Sujeto {
    public void registrarObservador(Observador o);
    public void notificarObservadores();
    public void removerObeservador(Observador o);
}
