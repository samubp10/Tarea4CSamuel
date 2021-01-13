/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package daw.Samuel;

/**
 *
 * @author Samuel
 */
public class Persona {
    
    private String nombre;
    private int edad;
    
    public Persona(String Nombre, int Edad) {
        this.nombre = Nombre;
        this.edad = Edad;
    }
    
    public void llamar(Animal pet) {
        pet.setEstado("despertado");
    }
    
    public void alimetar(Animal pet, double cantidadGramos) {
        
        pet.comer(cantidadGramos);
    }
    
    public void jugar(Animal pet, int cantidadMinutos) {
        try {
            pet.jugar(cantidadMinutos);
        } catch (IllegalArgumentException ia) {
            pet.jugar(180);
        }
    }
}
