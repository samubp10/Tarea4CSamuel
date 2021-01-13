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
public enum Tipo {
    GATO("Gato"),
    PERRO("Perro"),
    LAGARTO("Lagarto"),
    COBAYA("Cobaya"),
    PERIQUITO("Periquito");
    private String tipo;

    private Tipo(String tipo) {
        this.tipo = tipo;
    }
    
}
