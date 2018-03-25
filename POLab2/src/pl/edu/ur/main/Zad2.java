
package pl.edu.ur.main;

import static java.lang.Math.sqrt;
import java.util.Scanner;


public class Zad2 {



public static void main(String[] args)
{
    Scanner s = new Scanner(System.in);
        int a,b,c,w,i = 1,rad,d = 0;
        double pi  = 3.14159265359;
        
        System.out.print("Podaj a: ");
        a = s.nextInt();
        System.out.print("Podaj b: ");
        b = s.nextInt();
        System.out.println("Podaj kąt");
        d = s.nextInt();
        
        
        
        
     while ( i==1) {
         
         System.out.print("\n1.Dodawanie 2.Odejmowanie 3.Mnozenie 4.Dzielenie 5.potęgowanie 6.pierwiastkowanie 7.wartość trygon 8.zakoncz program\nWybierz dzialanie:  ");
        w = s.nextInt();
       
       switch(w)
        {
            case 1:
                c = a+b;
                System.out.println("a+b ="+c);
               break;
            case 2:
                c = a-b;
                System.out.println("a-b ="+c);
                break;
            case 3:
                c = a*b;
                System.out.println("a*b ="+c);
                break;
            case 4:
                if(b!=0)
                {
                    c=a/b;
                    System.out.println("a/b ="+c);
                }
                else
                {
                   System.out.print("nie wolno dzielic przez 0!");
                }
            case 5:
                c = a^b;
                System.out.println("a^b =" + c );
            break;
            
            case 6:
                c = (int) sqrt(a);
                System.out.println(" pierwiastek z liczby  = " +c);
                break;
                
            case 7:
               rad = (int) (d * (pi/180));
               System.out.println("Wartość trygonometryczna = " + rad);
               break;
                
            case 8:
                i=0;
                System.out.println("koniec programu");
                
                break;
       }   
       
       
       
       
        
}
}
}