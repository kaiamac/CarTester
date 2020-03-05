/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package cartester;

/**
 *
 * @author kamac8665
 */
public class Car {
    //Private global variables
    private int carAge, yearMade;
    private double price;
    private String brand,modelType;
    
    public Car(int age, int made, double cost, String type, String model){
        carAge = age;
        yearMade = made;
        price = cost;
        brand = type;
        modelType = model;
    }
    
    public void honkHorn1(){
        System.out.println("HONK! HONK! HONK!");
    }
    
    public void honkHorn2(){
        System.out.println("BEEEEEEEEEEP!");
    }
    
    public String toString() {
        String output1 = "Car age (in years): "+carAge+"\n";
        output1 += "Year it was made: "+yearMade+"\n";
        output1 += "Car cost (in dollars): "+price+"\n";
        output1 += "Car brand: "+brand+"\n";
        output1 += "Car model: "+modelType+"\n";
        return output1;
    }
}