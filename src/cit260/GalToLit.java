/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package CIT260;

/**
 *
 * @author Jaqueline Forman
 */
public class GalToLit {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        double gallons; //holds the number of gallons
       double liters; //holds convertion to liters 
       
       gallons = 10;
       
       liters = gallons * 3.7854;
       
       System.out.println(gallons + " gallon is " + liters + " liters. " );
    }
    }