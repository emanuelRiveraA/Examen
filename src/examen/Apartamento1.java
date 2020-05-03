/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen;

/**
 *
 * @author Idalia
 */
public class Apartamento1 extends ClaseAbstracta{

    @Override
    public void cotizarRentaApartamento() {
        double costoRenta = ((precio*num_habitaciones)/num_residentes);
        System.out.println("El costo por persona para el apartamento es: "+costoRenta);
    }

    
    
}
