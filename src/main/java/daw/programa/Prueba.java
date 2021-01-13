/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package daw.programa;

import daw.Samuel.Animal;
import daw.Samuel.Estado;
import daw.Samuel.Persona;
import daw.Samuel.Tipo;
import java.time.LocalDate;

/**
 *
 * @author Samuel
 */
public class Prueba {

    public static void main(String[] args) {
        //Creo los animales y a las personas
        Animal a1 = new Animal();
        Animal a2 = new Animal(LocalDate.of(2021, 12, 12), "trueno", Tipo.PERRO, 1120.0, Estado.DURMIENDO);
        Persona p1 = new Persona("Pepe", 21);
        Persona p2 = new Persona("Paco", 41);
        // Dos personas
        // Imprimir las dos mascotas
        System.out.println(a1.toString());
        System.out.println(a2.toString());

        // Clona al animal a2 en un nuevo animal a3
        Animal a3 = a2.clonar(a2);
        System.out.println(a3);
        // System.out.println(a3);

        // Imprimir el contador de instancias
        System.out.println(a2.getContadorInstancias());

        // p1 debe despertar a todos los animales.
        p1.llamar(a1);
        System.out.println(a1.getEstado());
        p1.llamar(a2);
        System.out.println(a2.getEstado());
        p1.llamar(a3);
        System.out.println(a3.getEstado());
        // p2 juega con a2 durante 120 minutos.
        p2.jugar(a2, 120);

        //p1 alimenta a a1 1000 gramos. Imprime el nuevo peso de a1.
        p1.alimetar(a1, 1000);
        System.out.println(a1.getPeso());
        // p1 debe jugar con a1 200 minutos. Imprime el nuevo peso de a1.
        p1.jugar(a1, 200);
        System.out.println(a1.getPeso());

    }
}
