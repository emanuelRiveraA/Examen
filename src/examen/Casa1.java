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
public class Casa1 implements Acciones{
    
    private Double precioM2;
    private Double superficie;
    private int num_residentes;

    public Casa1() {
    }

    public Casa1(Double precio, Double superficie, int num_residentes) {
        this.precioM2 = precio;
        this.superficie = superficie;
        this.num_residentes = num_residentes;
    }

    public Double getPrecio() {
        return precioM2;
    }

    public void setPrecio(Double precio) {
        this.precioM2 = precio;
    }

    public Double getSuperficie() {
        return superficie;
    }

    public void setSuperficie(Double superficie) {
        this.superficie = superficie;
    }

    public int getNum_residentes() {
        return num_residentes;
    }

    public void setNum_residentes(int num_residentes) {
        this.num_residentes = num_residentes;
    } 

    @Override
    public void vender() {
        double costo_total = precioM2*superficie*num_residentes;
        
        System.out.println("La casa tiene un costo de : "+costo_total);
    }

    @Override
    public void comprar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void rentar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void prestar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
