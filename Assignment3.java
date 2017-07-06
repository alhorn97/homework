/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment3;

/**
 *
 * @author ahorn
 */
import javax.swing.JOptionPane;
import java.util.Random;
import java.text.DecimalFormat;



public class Assignment3 {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        // TODO code application logic here
        Random random = new Random();
                
        String input = JOptionPane.showInputDialog (null,"Please enter first integer." );
        String input2 = JOptionPane.showInputDialog (null,"Please enter second integer." );
        String text1 = JOptionPane.showInputDialog (null,"Please enter a text string." );
        String text2 = JOptionPane.showInputDialog (null,"Please enter a search character." );
        String s = new String();
        s= text2;
              
        
        
                
        int var1 = Integer.parseInt( input);
        int var2 = Integer.parseInt( input2);
       // int var3 = Integer.parseInt( text2);
        int smaller = Math.min (var1,var2);
        int larger = Math.max (var1,var2);
        int var4= text1.indexOf(s);
        var4= var4+1;
        char var5 = text1.charAt(var1-1);
        
        
                
        
        
        
                
       // String tvar1 = new String (text1);
        //String tvar2 = new String (text2);
        
        String message1 = new String();
             
        int rnd1 = random.nextInt(larger -smaller +1) + smaller;
//        NumberFormat formatter = new DecimalFormat("#0.00");
        DecimalFormat numFormat;
        numFormat = new DecimalFormat("###.##");
     
        
         
        
        
        message1= ("1)Random number between " + smaller + " and " + larger + " is " + rnd1 + ".");
        message1= (message1 + "\n" + "2)The length of " + text1 + " is " + text1.length());
        message1= (message1 + "\n" + "3)The position of '" + text2 + "' within " + text1 + " is " + var4);
        message1= (message1 + "\n" + "4)The string as uppercase: " + text1.toUpperCase() );
        message1= (message1 + "\n" + "5)The character at position " + var1 + " is " + var5) ;
        message1= (message1 + "\n" + "6)The substring from " + smaller + " to " + larger + " is " + text1.substring(smaller-1,larger));
        message1= (message1 + "\n" + "7)The cube of " + larger + " is "+ numFormat.format (Math.cbrt((double)larger)));
                
        System.out.println (rnd1);
        System.out.println (text1.length());
        System.out.println(var4);
        System.out.println(message1);
        
        
        
        
                
                
        
 
        
                
    }
   
}
