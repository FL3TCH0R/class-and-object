/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.multi_classes;

/**
 *
 * @author fletc
 */

class car{   // class
   public String color="blue"; //field
   public String model="Rolls Royce";
   public String license_plate="A67B94";
   public void display(){ //member functions
       System.out.println("blue color");
       System.out.println("Rolls Royce");
       System.out.println("A76B94");
       
               }
}
class animal{
    public String type="mammal";
    public String name="Elephant";
    public String Country_of_origin="Africa";
 
    public void display(){ //member functions
   
       
        System.out.println("mammal");
       System.out.println("Elephant");
       System.out.println("Africa");   
    }
       
}
public class Multi_classes {

    public static void main(String[] args) {
        
          car car1= new car();   // creating an object
        car1.display(); 
        
        animal animal1= new animal();
        animal1.display();
        
        
        
            }
}
