/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package opbootcamp_ej2;

/**
 *
 * @author Usuario
 */
public class Opbootcamp_ej2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
  double precio = 20.5;
        System.out.println("El valor final con el IVA incluido es de : " + calcularPrecio(precio));
    }
   static double calcularPrecio(double precio){
      
        double total = precio + (precio * 0.21);
        return total;
    }
}
