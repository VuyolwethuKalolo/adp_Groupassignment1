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
public class Squarre {
    // atribu of my square
		private double side =0;
	
	// the two constructors
    public Squarre()// the defaul constructor
    {
    	side = 0 ;
    }
    
    public  Squarre( double mySide)// the parameter constructor
    {
    	if (side > 0)
    		side = mySide;
    		
    }
    
    // the set & get methods for my Square
    
    public  void setSide(double mySide)
    {
    		side = mySide;
    }
    
    public double  getSide()// to get my value in mySide variable and return radius
    {
    	return side;
    }
    
    public double getPerimeter()
    {
    	return (4*side);
    }
    
    public  double getDiagonal()
    {
    	return ((2 * Math.sqrt(side)) );// using the math method to call the square root of side
    }
    
    public  double getArea()
    {
    	return (Math.round(side*side));
    }
    
    public String toString()  //Overrides the methods provided to dispaly the four attributes of my circles
   		{
   			String str;

   	str = "Side: " + getSide()+" cm " + "\nPerimeter: " + getPerimeter()+" cm "+ "\nDiagonal: " + getDiagonal()+" cm "+	"\nArea : " + getArea()+" cm " ;
	
     		return str;
     		
   		}
}
    

