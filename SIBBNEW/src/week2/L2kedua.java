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
public class L2kedua {
    public static void main(String[] args) {
        String lampu;
        
        Scanner input = new Scanner(System.in);
        System.out.print("inputkan warna lampu : ");
        lampu = input.next();
        
        switch (lampu) {
            case "merah":
                System.out.println("lampu merah, silahkan berhenti!");
                break;
            case "kuning":
                System.out.println("lampu kuning, harap berhati-hati!");
                break;
            case "hijau":
                System.out.println("\tlampu hijau, silahkan jalan!");
                break;
            default:
                System.out.println("warna lampu tidak ditemukan");
        }
        
        
    }
}
