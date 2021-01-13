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
    //Creo los atributos
    private LocalDate FechaNacimiento;
    private String Nombre;
    private Tipo Tipo;
    private double Peso;
    private Estado Estado;
    private static int Contador;
    //Ceo un contructor con parámetros
    public Animal(LocalDate FechaNacimiento, String Nombre, Tipo Tipo, double peso, Estado Estado) {
        this.FechaNacimiento = FechaNacimiento;
        this.Nombre = Nombre;
        this.Tipo = Tipo;
        this.Peso = peso;
        this.Estado = Estado;
        Contador++;
    }
    //Creo un construtor sin parámetros con valores por defecto
    public Animal() {
        this.FechaNacimiento = FechaNacimiento.now();
        this.Nombre = "Turrón";
        this.Tipo = Tipo.GATO;
        this.Peso = 2200;
        this.Estado = Estado.DURMIENDO;
        Contador++;
    }


    //Getters y setters de mis atributos
    public LocalDate getFechaNacimiento() {
        return FechaNacimiento;
    }

    public String getNombre() {
        return Nombre;
    }

    public Tipo getTipo() {
        return Tipo;
    }

    public double getPeso() {
        return Peso;
    }

    public Estado getEstado() {
        return Estado;
    }

    public void setFechaNacimiento(LocalDate FechaNacimiento) {
        this.FechaNacimiento = FechaNacimiento;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public void setTipo(Tipo Tipo) {
        this.Tipo = Tipo;
    }

    public void setPeso(double peso) {
        this.Peso = peso;
    }

    public void setEstado(Estado Estado) {
        this.Estado = Estado;
    }
    //Método comer, que lo que hace es que si el valor es negativo lo pone a positivo, y si el valor es positivo lo suma al peso y el estado lo cambia a comiendo
    public void comer(double cantidadGramos) {
        if (cantidadGramos < 0) {
            cantidadGramos *= (- 1);

        }
        this.Peso += cantidadGramos;
        this.Estado = Estado.COMIENDO;

    }
    //El método de dormir lo que hace es cambiar el estado a durmiendo
    public void dormir() {

        this.Estado = Estado.DURMIENDO;

    }
    //El método de despertar lo que hace es cambiar el estado del animal a despierto
    public void depertar() {

        this.Estado = Estado.DESPIERTO;

    }
    //Descansar pone a dormir al bicho
    public void descansar() {

        this.Estado = Estado.DURMIENDO;

    }
    //El método jugar lo que hace es coger la cantidad de minutos que juega, si es mayor a 180, 
    //manda un IlllegalArgumentException que será recojido más tarde, si es negativo, 
    //lo transforma a positivo y si el valor nuevamente obtenido es mayor a 180 lanza la
    //excepción anteriormente comentada. Si es múltiplo de 60, irá restando al peso 20 
    //y 30 a los minutos hasta que la cantidad llegue a 0. Si la cantidad no es múltiplo de 30
    //como por ejemplo 40, lo que hace es hacer lo mismo de antes solo que cuando la cantidad de 
    //minutos sea inferior a 30, le restará directamente 10 
    public void jugar(int cantidadMinutos) {
        this.Estado = Estado.JUGANDO;
        if (cantidadMinutos < 0) {
            cantidadMinutos *= -1;
            if (cantidadMinutos > 180) {
            // Lanzará esta excepción
            throw new IllegalArgumentException("IAE");
        }
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
                } while (cantidadMinutos >= 30);
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
    //El método clonar lo que hace es si es nulo crea un nuevo animal y si no, 
    //crea un nuevo animal clonandolo de el objeto introducido como pet
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
