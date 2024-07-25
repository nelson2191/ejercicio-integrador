/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package superchino;

import javax.swing.JOptionPane;

/**
 *
 * @author Daniel
 */
public class Metodos {
   
   private Inventario arrayInventario[]=new Inventario[10]; 
  
   public void agregarProducto(){
      int x;
      for(x=0;x<3;x++){
          Inventario i=new Inventario();
          i.setCodigoProducto(JOptionPane.showInputDialog(null,"Digite el codigo del producto:"));
          i.setNombreProducto(JOptionPane.showInputDialog(null,"Digite el nombre del producto:"));
          i.setCantidad(Integer.parseInt(JOptionPane.showInputDialog(null,"Digite la cantidad del producto:")));
          i.setPrecio(Float.parseFloat(JOptionPane.showInputDialog(null,"Digite el precio del producto:")));
          i.setTipo(Integer.parseInt(JOptionPane.showInputDialog(null,
                         "***Ingrese el tipo de producto***\n\n"
                         + "1.Alimentos\n"
                         + "2.Bebidas\n"
                         + "3.Higiene\n"
                         + "4.Limpieza\n"
                         + "Digite su opción:")));
            if (i.getTipo()==1){
                i.setPrecioBruto(i.getPrecio()+0.20*i.getPrecioBruto());
                i.getPrecioBruto();
    
            } else if (i.getTipo()==2){
                i.setPrecioBruto(i.getPrecio()*0.3+i.getPrecio());
          }
             else if (i.getTipo()==3){
                i.setPrecioBruto(i.getPrecio()*0.25+i.getPrecio());
          }
            else if (i.getTipo()==4){
                i.setPrecioBruto(i.getPrecio()*0.19+i.getPrecio()*0.04+1000+i.getPrecio());
          }
       
          i.setPrecioBruto(Float.parseFloat(JOptionPane.showInputDialog(null,"Digite el costo del producto:")));
          i.setGananciaEsperado(Float.parseFloat(JOptionPane.showInputDialog(null,"Digite la ganacia esperada:")));
          i.setNombreEmpleado(JOptionPane.showInputDialog(null,"Digite el nombre del empleado:"));
          i.setCedula(JOptionPane.showInputDialog(null,"Digite la cedula del empleado:"));
          i.setNombreSupermercado(JOptionPane.showInputDialog(null,"Digite el nombre del supermercado:"));
          i.setCodigoSupermercado(JOptionPane.showInputDialog(null,"Digite el codigo del supermercado:"));
          arrayInventario[x]=i;
      }
   }
  
   public void mostrarInventario(){
      for (int i=0; i<4;i++ ){
            JOptionPane.showMessageDialog(null, arrayInventario[i].getCodigoProducto()+" "+arrayInventario[i].getNombreProducto()+" "+arrayInventario[i].getCantidad());
        }
   }
}
