/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.util.Scanner;

/**
 *
 * @author Tasya
 */
public class saran2bahanresep {
        public static void main(String[] args) {
    String identitas = "Natasya putri Hardiyanti / XRPL5 /30" ;
    System.out.println("identitas : " + identitas ) ;
    
    System.out.print("\nSaran Resep dari bahan milik anda\n") ;
    
     Scanner scanner = new Scanner(System.in) ;
    
    System.out.println("Bahan Pertama :"); 
    System.out.println("1. Pisang") ;
    System.out.println("2. Telur") ;
    System.out.print("Masukan no pilihan anda :");
    int bahan1 = scanner.nextInt();
    
    
        
     if (bahan1 == 1 || bahan1==2 ) 
    {
        System.out.println("Bahan kedua :");
        if (bahan1 == 1) {
            System.out.println("1. Susu") ;
            System.out.println("2.Minyak goreng");
            System.out.println("3.Tidak ada");
            
        }else{
            System.out.println("1. Minyak Goreng") ;
            System.out.println("2. Roti") ;
            System.out.println ("3. Tidak ada") ;
        }
        System.out.print("Masukan no pilihan anda:") ;
    
        
      
        
    }else 
        System.out.println("Mohon Maaf , Pilihan tidak ditemukan ," +"Tidak dapat memberikan saran resep");
          int bahan2 = scanner.nextInt();
     if (bahan2 >= 1 && bahan1 <=3) 
     {
         if (bahan1==1)
             switch(bahan2)
             {
                 case 1 : System.out.println("anda dapat membuat milk shake banana"); break ;
                 case 2 : System.out.println("anda dapat membuat pisang goreng"); break ;
                 case 3 : System.out.println("anda dapat membuat pisang rebus") ;
                 
             }
         else 
             switch (bahan2)
             {
         case 1: System.out.println("anda dapat membuat telur mata sapi"); break ;
         case 2 : System.out.println("anda dapat membuat sandwich telur"); break ;
         case 3 : System.out.println("anda dapat membuat telur rebus");
         
        }
     
    }else 
      System.out.println ("mohon maaf , pilihan tidak ditemukan ," + "tidak dapat memberikan saran resep");
    }
}

