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
public class CotizarApartamentos {
    
    public static ClaseAbstracta cotizarApartamento(int opc){
        
        switch(opc){
            
            case 1:
                return new Apartamento1();
            case 2:
                return new Apartamento2();
            default:
                System.out.println("NO SE ENCONTRO LA OPCIÓN");
            
        }
        
        return null;
    }
    
}
