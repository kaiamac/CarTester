/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package cartester;
import java.util.*;
/**
 *
 * @author kamac8665
 */
public class CarTester {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        int age,made;
        double cost;
        String type,model;
        
        System.out.println("Please give me the age of your car.");
        age = userInput.nextInt();
        System.out.println("Please give me the year your car was made.");
        made = userInput.nextInt();
        System.out.println("Please give me the cost of your car.");
        cost = userInput.nextDouble();
        System.out.println("Please give me the brand of your car.");
        type = userInput.next();
        System.out.println("Finally, please give me the model of your car.");
        model = userInput.next();
        Car car1 = new Car(age,made,cost,type,model);
        
        System.out.println("Please give me the age of your car.");
        age = userInput.nextInt();
        System.out.println("Please give me the year your car was made.");
        made = userInput.nextInt();
        System.out.println("Please give me the cost of your car.");
        cost = userInput.nextDouble();
        System.out.println("Please give me the brand of your car.");
        type = userInput.next();
        System.out.println("Finally, please give me the model of your car.");
        model = userInput.next();
        Car car2 = new Car(age,made,cost,type,model);
        
        System.out.println("Please give me the age of your car.");
        age = userInput.nextInt();
        System.out.println("Please give me the year your car was made.");
        made = userInput.nextInt();
        System.out.println("Please give me the cost of your car.");
        cost = userInput.nextDouble();
        System.out.println("Please give me the brand of your car.");
        type = userInput.next();
        System.out.println("Finally, please give me the model of your car.");
        model = userInput.next();
        Car car3 = new Car(age,made,cost,type,model);
        
        System.out.println("------------------------");
        
        System.out.println(car1.toString());
        
        System.out.println("------------------------");
        
        System.out.println(car2.toString());
        
        System.out.println("------------------------");
        
        System.out.println(car3.toString());
        
        System.out.println("Honking the horn.");
        car1.honkHorn1();
        car2.honkHorn2();
    }
    
}