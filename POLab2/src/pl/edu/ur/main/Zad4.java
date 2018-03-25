
package pl.edu.ur.main;
import java.util.Scanner;

public class Zad4 {
    
    
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
           
           System.out.print("\n1.Sumowanie Tablic 2.Iloczyn tablicy 3.wartość średnia 4.wartosc minimalna 5.wartość maksymalna 6.zakonczenie programu\nWybierz dzialanie:  ");
        w= podaj.nextInt();
               if (w==1){
                   int suma = 0;
                 for(int q =0; q<tab.length; q++)   suma += tab[q];
                 System.out.println(suma);
              
               } else if (w==2) {
                   int iloczyn = 1;
                   for (int q = 0; q<tab.length; q++) iloczyn *= tab[q];
                   System.out.println(iloczyn);
                 
               }else if (w==3) {
                   int suma =0;
                   int iloraz ;
                   for(int q=0; q<tab.length; q++ ) suma+= tab[q];
                   iloraz =  suma/tab.length;
                   System.out.println(iloraz);
                   
                 }else if (w==4) {
                     int szukanaLiczba = tab[0];
                     for(int q =0; q<tab.length; q++){
                         if(szukanaLiczba < tab[q]){
                             szukanaLiczba = tab[q];

                             System.out.println(szukanaLiczba);
                         }
                     }
                 }
                    
                 
                                
                            
               
               
       
       }
            
            
    
    }
}

