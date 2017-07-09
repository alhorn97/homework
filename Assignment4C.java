/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment4c;

/**
 *
 * @author ahorn
 */

import java.util.Scanner;

public class Assignment4C {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String id1 = "blank1";
        String id2 = "blank2";
        int points1 = 0;
        int points2 = 0;
        
        Scanner scan1 = new Scanner (System.in);
        Scanner scan2 = new Scanner (System.in);
        
        System.out.println("Enter the name of the first individual: ");
        String input1= scan1.next();
        id1=input1;
        System.out.println("Enter the name of the second individual: ");
        String input2= scan2.next();
        id2=input2;
        
        //first characters
        char fc1;
        char fc2;
        fc1=id1.charAt(0);
        fc2=id2.charAt(0);
        
        //second characters
         char fc11;
        char fc22;
        fc11=id1.charAt(1);
        fc22=id2.charAt(1);
        
        //last characters
        int id1size= id1.length()-1;
        int id2size= id2.length()-1;
        char c1;  //last char id1
        char c2;  //last char id2
        
        c1=id1.charAt(id1size);
        c2=id2.charAt(id2size);
        
        //Step i.
        if (id1.equalsIgnoreCase(id2))
        {
        points1=-1;
        points2=-1;
            //exit
        System.out.println(points1);
        System.out.println(points2);
        System.exit(0);
        }
        
         //Step ii.
        if (id1.length() == id2.length())
        {
        points1=points1+2;
        points2=points2+2;
        } 
        
       
        if (id1.length() +1 == id2.length())
        {
                points1=points1+1;
        }
        
        
      
        if (id2.length() +1 == id1.length())
        {
            points2=points2+1;
        }
        
        
        //Step iii
        if (fc1 == fc2)
                {
                    points1=points1+1;
                    points2=points2+1;
                    System.out.println(fc1);
                    System.out.println(fc2);
                }
       
        // Step iv    
        
        
        
         if (c1 == c2)
                {
                    points1=points1+1;
                    points2=points2+1;
                    System.out.println(c1);
                    System.out.println(c2);
                }
        
        
        
        //System.out.println(points1);
        
        
        System.out.println(id1 + " " + points1);
        System.out.println(id2 + " " + points2);
        
       // Step V.
        if (c2 == fc1)
            points2=points2+1;
        
        if (c1 == fc2)
            points1=points1+1;
        
       // Step vi.
         int csize;
         csize=Character.getNumericValue(fc1) + Character.getNumericValue(fc2);
         csize= (csize % 3);
         System.out.println(csize);
         
         // Step vii.
         int csize2;
         csize2=Character.getNumericValue(fc11) + Character.getNumericValue(fc22);
         csize2= (csize2 % 4);
         System.out.println(csize2);
         
    }
    
    
}
