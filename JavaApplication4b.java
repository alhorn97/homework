/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication4b;

/**
 *
 * @author ahorn
 */
import java.util.Scanner;
import java.util.Random;

        
public class JavaApplication4b {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String mm;
        String dd;
        String s;
        s="/";
        int lgth;
        int p1;
        int month;
        int day;
        String sign="none";
        Random rnum = new Random();
        
        
        Scanner scan = new Scanner (System.in);
        System.out.println("Enter your birthdate (mm/yy) :");
        String input= scan.next();
        lgth=input.length();
        p1=input.indexOf(s);
        //p1=p1+1;
        //System.out.println("Length= "+lgth);
        //System.out.println("Position of / i= " +p1);
        mm=input.substring(0, p1);
        dd=input.substring(p1+1);
        //System.out.println("Month is "+ mm);
        //System.out.println("Day is " + dd);
        month=Integer.parseInt(mm);
        day=Integer.parseInt(dd);
        //System.out.println(month);
        //System.out.println(day);
        
        
        
        if ((month==4 && day>=20) | (month==5 && day<=20))
        sign="Taurus";
        else if((month==5 && day>=21) | (month==6 && day<=20))
        sign="Gemini";
        else if((month==6 && day>=21) | (month==7 && day<=22))
        sign="Cancer";
        else if((month==7 && day>=23) | (month==8 && day<=22))
        sign="Leo";
        else if((month==8 && day>=23) | (month==9 && day<=22))
        sign="Virgo";
        else if((month==9 && day>=23) | (month==10 && day<=22))
        sign="Libra";
        else if((month==10 && day>=23) | (month==11 && day<=21))
        sign="Scorpio";
        else if((month==10 && day>=23) | (month==11 && day<=21))
        sign="Sagittarius";
        else if((month==12 && day>=22) | (month==1 && day<=19))
        sign="Capricon";
        else if((month==1 && day>=20) | (month==2 && day<=18))
        sign="Aquarius";
        else if((month==2 && day>=19) | (month==3 && day<=20))
        sign="Pisces";
         System.out.println("Your sign is " + sign);
                
        int randomNum = rnum.nextInt((4 - 1) + 1) + 1;
        //System.out.println(randomNum);
        if (randomNum==1)
            System.out.println("This is your lucky day.");
        if (randomNum==2)
            System.out.println("Stay home today.");
        if (randomNum==3)
            System.out.println("You will encounter an old friend.");
        if (randomNum==4)
            System.out.println("Beware of dogs.");
        
        
    }
   
}
