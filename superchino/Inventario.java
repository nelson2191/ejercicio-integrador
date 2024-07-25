/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package superchino;

/**
 *
 * @author Daniel
 */
public class Inventario {
    private String codigoProducto;
    private String nombreProducto;
    private int cantidad;
    private double precio;
    private int tipo;
    private double precioBruto;
    private double gananciaEsperado;
    private String nombreEmpleado;
    private String cedula;
    private String nombreSupermercado;
    private String codigoSupermercado;
  
   

    public Inventario() {
    }

    public Inventario(String codigoProducto, String nombreProducto, int cantidad, double precio, int tipo, double precioBruto, double gananciaEsperado, String nombreEmpleado, String cedula, String nombreSupermercado, String codigoSupermercado) {
        this.codigoProducto = codigoProducto;
        this.nombreProducto = nombreProducto;
        this.cantidad = cantidad;
        this.precio = precio;
        this.tipo = tipo;
        this.precioBruto = precioBruto;
        this.gananciaEsperado = gananciaEsperado;
        this.nombreEmpleado = nombreEmpleado;
        this.cedula = cedula;
        this.nombreSupermercado = nombreSupermercado;
        this.codigoSupermercado = codigoSupermercado;
    }

    public String getCodigoProducto() {
        return codigoProducto;
    }

    public void setCodigoProducto(String codigoProducto) {
        this.codigoProducto = codigoProducto;
    }

    public String getNombreProducto() {
        return nombreProducto;
    }

    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

    public double getPrecioBruto() {
        return precioBruto;
    }

    public void setPrecioBruto(double precioBruto) {
        this.precioBruto = precioBruto;
    }

    public double getGananciaEsperado() {
        return gananciaEsperado;
    }

    public void setGananciaEsperado(double gananciaEsperado) {
        this.gananciaEsperado = gananciaEsperado;
    }

    public String getNombreEmpleado() {
        return nombreEmpleado;
    }

    public void setNombreEmpleado(String nombreEmpleado) {
        this.nombreEmpleado = nombreEmpleado;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getNombreSupermercado() {
        return nombreSupermercado;
    }

    public void setNombreSupermercado(String nombreSupermercado) {
        this.nombreSupermercado = nombreSupermercado;
    }

    public String getCodigoSupermercado() {
        return codigoSupermercado;
    }

    public void setCodigoSupermercado(String codigoSupermercado) {
        this.codigoSupermercado = codigoSupermercado;
    }
    
}
