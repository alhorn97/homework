/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment4a;

/**
 *
 * @author ahorn
 */
import java.util.Scanner;

public class Assignment4A {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String varMONTH;
        varMONTH="NONE";
        System.out.print("Enter a month: ");
        Scanner scan = new Scanner (System.in);
                      
        String input= scan.next();
        input=input.toUpperCase();
        int numdays = 0;
       //String mth = new string
               
        //block1:
        if ((input.equals("1")) | (input.equals("01")) | (input.equals("JAN")) | (input.equals("JANUARY")))
        {numdays=31; varMONTH="January";}
        
        else if ((input.equals("3")) | (input.equals("03")) |(input.equals("MAR")) | (input.equals("MARCH")))
        {numdays=31;varMONTH="March";}
        else if ((input.equals("4")) | (input.equals("04")) | (input.equals("APR")) |(input.equals("APRIL")))
             {numdays=30;varMONTH="April";}
        else if ((input.equals("5")) | (input.equals("05")) | (input.equals("MAY")))
             {numdays=31;varMONTH="May";}
        else if ((input.equals("6")) | (input.equals("06")) | (input.equals("JUN")) |(input.equals("JUNE")))
             {numdays=30;varMONTH="June";}
        else if ((input.equals("7")) | (input.equals("07")) | (input.equals("JUL")) |(input.equals("JULY")))
             {numdays=31;varMONTH="July";}
        else if ((input.equals("8")) | (input.equals("08")) | (input.equals("AUG")) | (input.equals("AUGUST")))
             {numdays=31;varMONTH="August";}
        else if ((input.equals("9")) | (input.equals("09")) | (input.equals("SEP")) | (input.equals("SEPTEMBER")))
             {numdays=30;varMONTH="September";}
        else if (input.equals("10") | (input.equals("OCT")) | (input.equals("OCTOBER")))
             {numdays=31;varMONTH="October";}
        else if (input.equals("11") | (input.equals("NOV")) | (input.equals("NOVEMBER")))
             {numdays=30;varMONTH="November";}
        else if (input.equals("12") | (input.equals("DEC")) | (input.equals("DECEMBER")))
             {numdays=31;varMONTH="December";}
         //System.out.println(numdays);
         //break block1;
    
         else if (input.equals("2") | (input.equals("02")) | (input.equals("FEB")) | (input.equals("FEBRUARY"))) 
       {
         
          
           System.out.print("Enter a year:");
       Scanner scan2= new Scanner (System.in);
       String input3=scan2.next();
       int year=Integer.parseInt(input3);
       
                    if((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0)))
                        {numdays=29;varMONTH="February";
                        System.out.println("Year " + year + " is a leap year");}
                else
                        {numdays=28;varMONTH="February ";
                        System.out.println("Year " + year + " is not a leap year");}
        
       
       }
    
        System.out.println(varMONTH + " has " + numdays + " days.");
        }
        
    
    
    
}

                
                
    
    
    
