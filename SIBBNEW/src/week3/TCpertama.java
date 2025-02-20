/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week3;

import java.util.Scanner;

/**
 *
 * @author achmad ifan
 */
public class TCpertama {
    public static void main(String[] args) {
   Scanner input = new Scanner(System.in);
   
        System.out.print("Masukan Tinggi Segitiga : ");
        int load = input.nextInt();
        int tinggi = load;
        
        
        
        //menentukan lebar
        for (int i = 0; i < load; i++) {
        int lebar = (tinggi-1)*2+1;
        tinggi--;
        //memberikan spasi
            for (int j = tinggi; j < load; j++) {
                System.out.print(" ");
                
            }
            
            for (int j = 0; j < lebar; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
   
   
}
