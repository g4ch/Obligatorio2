/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package obligatorio2;

/**
 *
 * @author alumnoFI
 */
public class Afiliado extends Persona {
    Medico medico;
    Sucursal sucursal;
    Historia historia;

    public Afiliado() {
        medico=new Medico();
        sucursal=new Sucursal();
        historia=new Historia();
    }
    
}
