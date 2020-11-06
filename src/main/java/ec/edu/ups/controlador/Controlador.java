/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.controlador;


import ec.edu.ups.modelo.Persona;
import java.util.*;


/**
 *
 * @author NANCY
 * @param <T>
 */
public class Controlador<T> {
    
   private List<T> listaGenerica;

    public Controlador() {
        listaGenerica = new ArrayList<>();
    }

    public void create(T objeto) {
        listaGenerica.add(objeto);
        System.out.println(listaGenerica);
    }
    
    public T read(T comp){
        for (T t : listaGenerica) {
            if(comp.equals(t)){
                return t;
            }
        }
        return null;
    }
    public Persona readPersona(String cedula) {
        var copiaListaPersona = (List<Persona>) List.copyOf(listaGenerica);
        for (Persona p : copiaListaPersona) {
            if (p.getCedula().equalsIgnoreCase(cedula)) {
                return p;
            }
        }
        return null;
    }
    
    public void update(T obj, T Eliminar) {
        int index = (listaGenerica.indexOf(Eliminar));
        listaGenerica.remove(index);
        listaGenerica.add(index, obj);

    }
    
    public void delete(T objeto) {
        listaGenerica.remove(objeto);
    }

    public List<T> findAll() {
        return listaGenerica;
    }
    
    
    public Persona iniciarSesion(String correo, String contraseña) {
        List<Persona> copiaListaPersona;
        copiaListaPersona = (List<Persona>) List.copyOf(listaGenerica);
        return copiaListaPersona.stream().filter(pe -> pe.getCorreo().equalsIgnoreCase(correo) && pe.getContraseña().equalsIgnoreCase(contraseña)).findFirst().get();
    }
    
    public int codigoTelefono() {
        int conta = 0;
        return (++conta);
    }

   
   
}
