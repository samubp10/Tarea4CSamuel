/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package daw.Samuel;

import java.time.LocalDate;

/**
 *
 * @author samuel
 */
public class Animal {

    private LocalDate FechaNacimiento;
    private String Nombre;
    private String Tipo;
    private int Peso;
    private String Estado;
    private static int Contador;

    public Animal(LocalDate FechaNacimiento, String Nombre, String Tipo, int peso, String Estado) {
        this.FechaNacimiento = FechaNacimiento;
        this.Nombre = Nombre;
        this.Tipo = Tipo;
        this.Peso = peso;
        this.Estado = Estado;
        Contador++;
    }

    
    public Animal() {
        this.FechaNacimiento = FechaNacimiento.now();
        this.Nombre = "Turrón";
        this.Tipo = Tipo;
        this.Peso = 2200;
        this.Estado = "durmiendo";
        Contador++;
    }

    public LocalDate getFechaNacimiento() {
        return FechaNacimiento;
    }

    public String getNombre() {
        return Nombre;
    }

    public String getTipo() {
        return Tipo;
    }

    public int getPeso() {
        return Peso;
    }

    public String getEstado() {
        return Estado;
    }

    public void setFechaNacimiento(LocalDate FechaNacimiento) {
        this.FechaNacimiento = FechaNacimiento;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public void setTipo(String Tipo) {
        this.Tipo = Tipo;
    }

    public void setPeso(int peso) {
        this.Peso = peso;
    }

    public void setEstado(String Estado) {
        this.Estado = Estado;
    }

    public void comer(double cantidadGramos){
        if(cantidadGramos < 0){
           cantidadGramos*=(- 1);
           this.Peso -= cantidadGramos;
        }
        this.Peso += cantidadGramos;
        
    }
    
        public void dormir(){
       
            this.Estado = "dormir";
        
    }
            
        public void depertar(){
       
            this.Estado = "despierto";
        
    }
            
        public void descansar(){
       
            this.Estado = "reposo";
        
    }

    
}
