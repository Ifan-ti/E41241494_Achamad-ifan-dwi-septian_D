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
public class T1pertama {
    public static void main(String[] args) {
     Scanner input = new Scanner(System.in);
     
        System.out.print("Masukan angka awal : ");
        int awal = input.nextInt();
        System.out.print("Masukan angka awal : ");
        int akhir = input.nextInt();
        
        for (int i = awal; i <= akhir; i++) {
            
            if(i % 2 == 0){
                System.out.print(i);
            }else{
                System.out.print(" ");
            }
        }
    }
  
}
