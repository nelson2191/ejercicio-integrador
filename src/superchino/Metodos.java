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

    private Inventario matrizInventario[][] = new Inventario[1][11];

    public void agregarProducto() {

        for (int x = 0; x < 1; x++) {
            for (int y = 0; y < 1; y++) {
                Inventario inv = new Inventario();
                inv.setCodigoProducto(JOptionPane.showInputDialog(null, "Digite el codigo del producto:"));
                inv.setNombreProducto(JOptionPane.showInputDialog(null, "Digite el nombre del producto:"));
                inv.setCantidad(Integer.parseInt(JOptionPane.showInputDialog(null, "Digite la cantidad del producto:")));
                inv.setPrecio(Float.parseFloat(JOptionPane.showInputDialog(null, "Digite el precio del producto:")));

                inv.setTipo(Integer.parseInt(JOptionPane.showInputDialog(null,
                        "***Ingrese el tipo de producto***\n\n"
                        + "1.Alimentos\n"
                        + "2.Bebidas\n"
                        + "3.Higiene\n"
                        + "4.Limpieza\n"
                        + "Digite su opción:")));
                if (inv.getTipo() == 1) {
                    inv.setPrecioBruto(inv.getPrecio() + 0.20 * inv.getPrecioBruto());

                } else if (inv.getTipo() == 2) {
                    inv.setPrecioBruto(inv.getPrecio() * 0.3 + inv.getPrecio());
                } else if (inv.getTipo() == 3) {
                    inv.setPrecioBruto(inv.getPrecio() * 0.25 + inv.getPrecio());
                } else if (inv.getTipo() == 4) {
                    inv.setPrecioBruto((inv.getPrecio() * 0.19) + (inv.getPrecio() * 0.04) + 1000 + inv.getPrecio());
                }
                //Sugerencia crear variable y asignarle el valor del metodo getPrecio

                inv.setPrecioBruto(Float.parseFloat(JOptionPane.showInputDialog(null, "Digite el costo del producto:")));
                inv.setGananciaEsperado((inv.getPrecioBruto() - inv.getPrecio()) * inv.getCantidad());
                inv.setNombreEmpleado(JOptionPane.showInputDialog(null, "Digite el nombre del empleado:"));
                inv.setCedula(JOptionPane.showInputDialog(null, "Digite la cedula del empleado:"));
                inv.setNombreSupermercado(JOptionPane.showInputDialog(null, "Digite el nombre del supermercado:"));
                inv.setCodigoSupermercado(JOptionPane.showInputDialog(null, "Digite el codigo del supermercado:"));
                matrizInventario[x][y] = inv;
            }
        }
    }

    public void mostrarInventario() {
        for (int i = 0; i < 1; i++) {
            for (int y = 0; y < 1; y++) {
                JOptionPane.showMessageDialog(null, matrizInventario[i][y].getCodigoProducto() + " " + matrizInventario[i][y].getNombreProducto() + " " + matrizInventario[i][y].getCantidad());
            }
        }
        ganancia();
    }

    public void ganancia() {
        double ganancia = 0;
        for (int i = 0; i < 1; i++) {
            ganancia = ganancia + matrizInventario[0][i].getGananciaEsperado();
        }
        JOptionPane.showMessageDialog(null, "La ganancia esperada es:" + ganancia);
    }

}
