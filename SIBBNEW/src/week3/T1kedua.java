/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week3;

/**
 *
 * @author achmad ifan
 */
public class T1kedua {
    public static void main(String[] args) {
        int awal = 1;
        System.out.println("\t Do-While");
        System.out.println("Bilangan Kelipatan 2 (1-100)");
        System.out.println("============================");
        
        System.out.print("   "+awal +" ");
        do { 
            awal = awal *2;
            if(awal<100){
            System.out.print(awal + " ");
            }
        } while (awal < 100);
    }
}
