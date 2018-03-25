
package pl.edu.ur.main;

import java.util.Scanner;


public class Zad6 {
    public static void main(String[] args) {
        Scanner scanner =  new Scanner (System.in);
        int a;
        while(true)
        {
            System.out.println("Podaj liczbe");
            a= scanner.nextInt();
            
            if(a < 0)
            {
                break;
            }
        }
    }
    
    
}
