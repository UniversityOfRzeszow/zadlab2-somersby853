
package pl.edu.ur.main;

import java.util.Scanner;
public class Zad3 {
    
    
    

public static void main(String[] args) {
    Scanner podaj = new Scanner(System.in);
        
        
        int a,b,c,d,e,f,g,h,i,j,w;
        System.out.println("Podaj liczbe");
        a = podaj.nextInt();
         System.out.println("Podaj liczbe");
        b = podaj.nextInt();
         System.out.println("Podaj liczbe");
        c = podaj.nextInt();
         System.out.println("Podaj liczbe");
        d = podaj.nextInt();
         System.out.println("Podaj liczbe");
        e = podaj.nextInt();
         System.out.println("Podaj liczbe");
        f = podaj.nextInt();
         System.out.println("Podaj liczbe");
        g = podaj.nextInt();
         System.out.println("Podaj liczbe");
        h = podaj.nextInt();
         System.out.println("Podaj liczbe");
        i = podaj.nextInt();
         System.out.println("Podaj liczbe");
        j = podaj.nextInt();
         
        int [] tab = new int [10];
        tab[0] = a;
        tab[1] = b;
        tab[2] = c;
        tab[3] = d;
        tab[4] = e;   
        tab[5] = f;
        tab[6] = g;
        tab[7] = h;
        tab[8] = i;
        tab[9] = j;
        int km =6;
       while (km ==6) {
           
           System.out.print("\n1.Tablic od początku 2.Tablica od końca 3.Nieparzyste elementy 4.Parzyste 6.zakonczenie programu\nWybierz dzialanie:  ");
        w= podaj.nextInt();
               if (w==1){
                    for (int q = tab.length -1; q>=0; q--) System.out.println(tab[q]);
              
               } else if (w==2) {
                   for (int q = 0; q<tab.length; q++) System.out.println(tab[q]);
              
               }else if (w==3) {
                   
                   for(int q=0; q<tab.length; q++ )
                   {
                       if(tab[q] % 2 ==1)
                       {
                           System.out.println(tab[q]);
                       }
                       
                   }
                    
                     
                    }else if (w==4){
                        for(int q=0; q<tab.length; q++)
                        {
                            if(tab[q] % 2 == 0)
                            {
                                System.out.println(tab[q]);
                            }
                        }
                        
                            
                            }else if (w==6){
                                break;
                            }
               
                  
                  
              
                
               
       

}
}
}