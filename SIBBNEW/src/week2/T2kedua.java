/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week2;
import java.util.Scanner;
/**
 *
 * @author achmad ifan
 */

        
public class T2kedua {
public static void kop(){
    System.out.println("\t  CAFE CERIA");
    System.out.println("\tANEKA MINUMAN");
    System.out.println("------------------------------------");
}
public static void menu(){
    System.out.println("\tSpesial Menu :");
    System.out.println("\t1.\tSoft drinks");
    System.out.println("\t2.\tMix juice");
    System.out.println("\t3.\tNescafe");
    System.out.println("\t4.\tSoda milk");
    System.out.println("\t5.\ttea");
}
public static void kasir(){
    System.out.println("------------------------------------");
    Scanner input = new Scanner(System.in);
    System.out.print("Masukkan nama pembeli : ");
    String nama = input.next();
    System.out.println("");
    
    System.out.print("Silahkan masukan pilihan anda : ");
    int pilihan = input.nextInt();
    String menu = "";
    
    switch(pilihan){
        case 1:
            menu = "Sofr drinnks";
            break;
        case 2:
            menu = "Mix juice";
            break;
        case 3:
            menu = "Nescafe";
            break;
        case 4:
            menu = "Soda milk";
            break;
        case 5:
            menu = "Tea";
            break;
        default :
            System.out.println("Menu Tidak Tersedia");
    }
    System.out.println("Minuman yang anda pesan adalah "+menu);
    System.out.println("Pesanan akan segera kami antar");
    System.out.println("Terima kasih"+nama+"telah berkunjung diCafe Ceria");
    
}
    public static void main(String[] args) {
        kop();
        menu();
        kasir();
    }
}
