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
public class Main {
    
    ////Aqui se aplica el polimorfismo por sobrecarga de metodos y por herencia

    ////el metodo factory tiene como objetivo ocultar el polimorfismo
    public static void main(String[] args) {
       
        //Para cotizar las casas
        Acciones casa1 = CotizacionesCasas.cotizarCasa(0, 3.4, 23, 10,0);
        casa1.vender();
        
        Acciones casa2 = CotizacionesCasas.cotizarCasa(1, 0, 30 , 2,200);
        casa2.rentar();
        
        
        //clase abstractA
        ClaseAbstracta Apartamento1 = CotizarApartamentos.cotizarApartamento(1);
        Apartamento1.setPrecio(23);
        Apartamento1.setNum_habitaciones(3);
        Apartamento1.setNum_residentes(3);
        
        Apartamento1.cotizarRentaApartamento();//se ejecuta el metodo
        
        ClaseAbstracta Apartamento2 = CotizarApartamentos.cotizarApartamento(2);
        Apartamento2.setPrecio(46);
        Apartamento2.setNum_habitaciones(6);
        Apartamento2.setNum_residentes(2);
        
        Apartamento2.cotizarRentaApartamento();//se ejecuta el metodo
        Apartamento2.cotizarRentaApartamento(67.3);//se manda dato a metodo sobrecargado
        
        
        //recorrer arreglo bidimensional
        String[][] saludos = new String[2][2];
 
        saludos[0][0]= "Pepe";
        saludos[0][1]= "Maria";
        saludos[1][0]= "Eliezer";
        saludos[1][1]= "Blanca";  
        
        for (int i=0; i < saludos.length; i++){
            for (int j=0; j < saludos.length; j++){
                System.out.println("Hola->>>"+saludos[j][i]);   
            }
        }
    }
    
}
