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
    private double Peso;
    private String Estado;
    private static int Contador;

    public Animal(LocalDate FechaNacimiento, String Nombre, String Tipo, double peso, String Estado) {
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

    public double getPeso() {
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

    public void setPeso(double peso) {
        this.Peso = peso;
    }

    public void setEstado(String Estado) {
        this.Estado = Estado;
    }

    public void comer(double cantidadGramos) {
        if (cantidadGramos < 0) {
            cantidadGramos *= (- 1);

        }
        this.Peso += cantidadGramos;
        this.Estado = "comiendo";

    }

    public void dormir() {

        this.Estado = "dormido";

    }

    public void depertar() {

        this.Estado = "despierto";

    }

    public void descansar() {

        this.Estado = "reposo";

    }

    public void jugar(int cantidadMinutos) {
        this.Estado = "jugando";
        if (cantidadMinutos < 0) {
            cantidadMinutos *= -1;
        }
        // Si la cantidad de minutos es mayor o igual a 30...
        if (cantidadMinutos >= 30 && cantidadMinutos <= 180) {
            // Si el resto de 30 es 0, es decir que es 30 ...
            if (cantidadMinutos % 30 == 0) {
                do {
                    // se añadirá un valor más a c
                    cantidadMinutos -= 30;
                    this.Peso -= 20;
                } while (cantidadMinutos >= 30);
                this.Peso -= 10;
            } else if (cantidadMinutos % 30 != 0) {
                do {
                    cantidadMinutos -= 30;
                } while (cantidadMinutos > 30);
                this.Peso -= 10;
            }
            // Si supera los 180 minutos
        } else if (cantidadMinutos > 180) {
            // Lanzará esta excepción
            throw new IllegalArgumentException("IAE");
        }
    }

    @Override
    public String toString() {
        return "Animal{" + "FechaNacimiento=" + FechaNacimiento + ", Nombre=" + Nombre + ", Tipo=" + Tipo + ", Peso=" + Peso + ", Estado=" + Estado + '}';
    }

    public Animal clonar(Animal pet) {
        if (pet == null) {
            return new Animal();
        } else {
            Animal pet2 = new Animal(pet.FechaNacimiento, pet.Nombre, pet.Tipo, pet.Peso, pet.Estado);
            return pet2;
        }
        
    }

    public int getContadorInstancias() {
        return Contador;
    }

}
