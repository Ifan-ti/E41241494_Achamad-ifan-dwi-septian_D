/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week2;

/**
 *
 * @author achmad ifan
 */

class book{
    int price;
    int pages;
    
    public void set (int price, int pages){
        this.price = price;
        this.pages = pages;
    }
    public void show(){
        System.out.println("book informasion");
        System.out.println("book price : " + price);
        System.out.println("numbers of pages : " + pages);
    }
}

public class L1ketiga {
    public static void main(String[] args) {
        book b = new book();
        b.set(100000, 10);
        b.show();
        
    }
}
