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
public class CotizacionesCasas {
    
    //metodo de clase ->>>que no se necesita instanciar un objeto porque es estatico
    //metodo de clase que devuelva un objeto de la clase/interface catalogo
     public static Acciones cotizarCasa(int opc, double precioM2, double superficie, int num_residentes,double costos_adicionales){
         
        switch(opc){
            
            case 0:
               return new Casa1(precioM2,superficie,num_residentes);
            case 1:
                return new Casa2(precioM2,superficie,num_residentes,costos_adicionales);                
        }
        return null;
    }
}
