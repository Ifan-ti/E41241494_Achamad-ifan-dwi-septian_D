/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week2;
import java.util.Scanner;
public class T2pertama {
public static void kop(){
    System.out.println("-----------------------------------------------");
    System.out.println("\t  karisma Agung Plaza ( KAP )");
    System.out.println("\t    Promo Belanja Berhadia");
    System.out.println("\tKhusus Pembelian 5 Barang Pertama");
    System.out.println("\tDengan Harga Minimun Rp 100000,00");
    System.out.println("-----------------------------------------------");
}
public static void kasir(){
    Scanner input = new Scanner(System.in);
    Scanner input1 = new Scanner(System.in);
    int harga=0;
    int Tharga=0;
    int jumlah =0;
    System.out.print("Masukan nama pembeli : ");
    String nama = input1.nextLine();
    do{            
        System.out.print("Masukan Harga Barang ke-"+(jumlah+1) +" ");
        harga = input.nextInt();
        Tharga +=harga;
        jumlah ++;
        } while (harga != 0);
        System.out.println("Total Harga Pembelian Atas Nama "+nama+" adalah Rp "+ Tharga);
        
        if(Tharga >= 100000 && jumlah >= 5){
            System.out.println("Selamat.....");
            System.out.println("Anda Mendapat Hadiah 1 Buah mug cantig");
        }else{
            System.out.println("Maaf Anda Tidak Dapat Hadiah");
        }  
}
public static void trims(){
    System.out.println("-----------------------------------------------");
    System.out.println("\t\t Terima kasih");
    System.out.println("Anda Sudah Belanja Di Kharisma Agung Plaza");
    
}

    public static void main(String[] args) {
        kop();
        kasir();
        trims();
    }
}
