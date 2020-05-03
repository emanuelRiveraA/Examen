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
public abstract class ClaseAbstracta {
    
    protected double precio;
    protected double num_habitaciones;
    protected double num_residentes;
    protected double servicios;

    public ClaseAbstracta() {
    }

    public ClaseAbstracta(double precio, double num_habitaciones, double num_residentes, double servicios) {
        this.precio = precio;
        this.num_habitaciones = num_habitaciones;
        this.num_residentes = num_residentes;
        this.servicios = servicios;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public double getNum_habitaciones() {
        return num_habitaciones;
    }

    public void setNum_habitaciones(double num_habitaciones) {
        this.num_habitaciones = num_habitaciones;
    }

    public double getNum_residentes() {
        return num_residentes;
    }

    public void setNum_residentes(double num_residentes) {
        this.num_residentes = num_residentes;
    }

    public double getServicios() {
        return servicios;
    }

    public void setServicios(double servicios) {
        this.servicios = servicios;
    }

    
    
    public abstract void cotizarRentaApartamento(); 

    void cotizarRentaApartamento(double Tv_paga){};
}
