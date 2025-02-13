/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week2;
import week2.person.*;
/**
 *
 * @author achmad ifan
 */
public class MenagingPeople {
    public static void main(String[] args) {
        person p1 = new person("Arial", 37);
        person p2 = new person("Joseph", 15);
        
        if(p1.getAge()==p2.getAge()){
            System.out.println(p1.getName()+" is the same age's as "+ p2.getName());
        }else{
            System.out.println(p1.getName()+" is NOT the same age's as "+ p2.getName());
            
        }
        
    }
}
