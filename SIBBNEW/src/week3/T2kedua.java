/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week3;
import java.util.Random;
import java.util.Scanner;
/**
 *
 * @author achmad ifan
 */
public class T2kedua {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random random = new Random();
        
        System.out.print("Masukan Jumlah deret array : ");
        int jumlah = input.nextInt();
        
        if(jumlah>0){
        int [] deret = new int [jumlah];
        for (int i = 0; i < jumlah; i++) {
            deret[i] = random.nextInt(100)+1;
        }
        
        System.out.print("deret angka random :  ");
        for (int i = 0; i < jumlah; i++) {
            System.out.print(deret[i]+" ");
        }    
        }else{
            System.out.println("Anggka tidak boleh minus");
        }
    }
   
}
