/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package opbootcamp_ej1;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class OpBootcamp_Ej1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner leer = new Scanner(System.in);
       
       //numericos 
       
       int n1 = 5;
       double n2 = 5.3;
       short n3 =8;
       long n4 = 10;
       byte n5=1;
       
       
       //caracter
       char letra1 = 'z';
       
       //booleano
       boolean verd1 = true;
       
       //string
       
       String cadena1 = "Hola mundo";
       
       
       
        System.out.println("Tipos de datos numericos, int: " + n1 + "double: " + n2 + "short: " + n3 + "long: " + n4 + "byte: " + n5);
        System.out.println("Tipo de dato de carater, char : " + letra1);
        System.out.println("Tipo de dato booleano, boolean: " + verd1);
        System.out.println("Tipo de dato de cadena de texto, string: " + cadena1);
    }
    
}
