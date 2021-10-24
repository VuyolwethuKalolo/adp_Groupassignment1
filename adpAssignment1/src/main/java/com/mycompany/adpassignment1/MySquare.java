/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.adpassignment1;

/**
 *
 * @author user
 */
import javax.swing.*;
import java.util.Scanner;
public class MySquare {
    
    static Scanner console = new Scanner(System.in);
    public static void main(String[] args)
    {
   double Side1=0,Side2; 

 
         Squarre SQ = new Squarre(Side1);
         Squarre SQ2 = new Squarre();
          
			// getting values for the Side
          Side1=Double.parseDouble(JOptionPane.showInputDialog(" Enter radius for the first Square:"));
          SQ.setSide(Side1);

         Side2=Double.parseDouble(JOptionPane.showInputDialog(" Enter radius for the second Square:"));
          SQ2.setSide(Side2);
           
			// using messageboxes to dispaly the results
          JOptionPane.showMessageDialog(null, "First Circle  \nPerimneter: " + SQ.getPerimeter()+" cm "+
          	"\nArea: " +SQ2.getArea()+" cm "+ "\n Diagonal: " + SQ2.getDiagonal()+" cm "+ "\n Side: " + SQ2.getSide()+" cm ");
          	
         
          	
          // an other way to display the values of the four attributes of each sqaure	
        System.out.println("\nFirst Circle " + "\n"+ SQ);
        System.out.println("\n**************************");
        
        
 
        
    }
}//end of the program.

    

