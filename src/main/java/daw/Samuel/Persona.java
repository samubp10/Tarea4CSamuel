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
    //Creo los atributos de esta misma clase
    private String nombre;
    private int edad;
    //Creo un constructor con parámetros
    public Persona(String Nombre, int Edad) {
        this.nombre = Nombre;
        this.edad = Edad;
    }
    //Creo el método llamar, que llama al método de setEstado para ponerle el nuevo estado de despierto
    public void llamar(Animal pet) {
        pet.setEstado(Estado.DESPIERTO);
    }
    //Creo el método alimentar, que llama al método comer de Animal
    public void alimetar(Animal pet, double cantidadGramos) {
        
        pet.comer(cantidadGramos);
    }
    //Creo el método de jugar que llama al método de jugar y en el caso de que el método lance la excepción de illegalArgument, pone los minutos a 180
    public void jugar(Animal pet, int cantidadMinutos) {
        try {
            pet.jugar(cantidadMinutos);
        } catch (IllegalArgumentException ia) {
            pet.jugar(180);
        }
    }
}
