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
public enum Estado {
    COMIENDO("comiendo"),
    DURMIENDO("durmiendo"),
    DESPIERTO("despierto/reposando"),
    JUGANDO("jugando");
    private String estado;

    private Estado(String estado) {
        this.estado = estado;
    }

    public String getEstado() {
        return estado;
    }

    
}
