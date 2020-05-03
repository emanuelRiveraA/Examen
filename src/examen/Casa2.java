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
public class Casa2 implements Acciones{
    
    private Double precioM2;
    private Double superficie;
    private int num_residentes;
    private double costos_adicionales;

    public Casa2() {
    }

    public Casa2(Double precioM2, Double superficie, int num_residentes, double costos_adicionales) {
        this.precioM2 = precioM2;
        this.superficie = superficie;
        this.num_residentes = num_residentes;
        this.costos_adicionales = costos_adicionales;
    }

    public Double getPrecioM2() {
        return precioM2;
    }

    public void setPrecioM2(Double precioM2) {
        this.precioM2 = precioM2;
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

    public double getCostos_adicionales() {
        return costos_adicionales;
    }

    public void setCostos_adicionales(double costos_adicionales) {
        this.costos_adicionales = costos_adicionales;
    }

    

    @Override
    public void vender() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void comprar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void rentar() {
        System.out.println("El costo de la renta para la casa es de: "+((superficie*num_residentes)+costos_adicionales));
    }

    @Override
    public void prestar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
}
