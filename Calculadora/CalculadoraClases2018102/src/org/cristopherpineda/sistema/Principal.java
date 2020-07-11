/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.cristopherpineda.sistema;

import javax.swing.JOptionPane;

/**
 *
 * @author programacion
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     // int valor1,valor2 ;
     int op;
     Sumar suma = new Sumar(0,0);
     Restar res = new Restar(0,0);
     Dividir div = new Dividir(0,0);
     Multiplicar mult = new Multiplicar(0,0);
     
   JOptionPane.showMessageDialog(null ,"Cristopher Raúl López Pineda"); 
   op = Integer.parseInt(JOptionPane.showInputDialog(null ,"Ingrese un numero de opción: \n"
   + "1.Suma\n"
   + "2.Resta\n"        
   + "3.Multiplicación\n"
   + "4.División\n" 
   + "5.Salir"        
           
   ));
   switch(op){
        
       case 1:
   suma.valor1=Integer.parseInt(JOptionPane.showInputDialog("Ingrese un número:"));
   suma.valor2=Integer.parseInt(JOptionPane.showInputDialog("Ingrese otro número:"));
   JOptionPane.showMessageDialog(null,"La sumatoria es"+ " "+(suma.valor1+suma.valor2));
    break;
       case 2:
   res.valor1=Integer.parseInt(JOptionPane.showInputDialog("Ingrese un número:"));
   res.valor2=Integer.parseInt(JOptionPane.showInputDialog("Ingrese otro número:"));
   JOptionPane.showMessageDialog(null,"La resta es igual a"+ " "+(res.valor1-res.valor2));
    break;
       case 3:
   div.valor1=Integer.parseInt(JOptionPane.showInputDialog("Ingrese un número:"));
   div.valor2=Integer.parseInt(JOptionPane.showInputDialog("Ingrese otro número:"));
   JOptionPane.showMessageDialog(null,"La división es igual a"+ " "+(div.valor1/div.valor2));
    break;
       case 4:
   mult.valor1=Integer.parseInt(JOptionPane.showInputDialog("Ingrese un número:"));
   mult.valor2=Integer.parseInt(JOptionPane.showInputDialog("Ingrese otro número:"));
   JOptionPane.showMessageDialog(null,"La multiplicación es igual a"+ " "+(mult.valor1*mult.valor2));
    break;
       case 5:
           Salida salir = new Salida();
           salir.attachShutDownHook();
           break;
   }
    }
    
}// TODO code application logic here
    
    

