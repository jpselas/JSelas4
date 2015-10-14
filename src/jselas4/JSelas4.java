/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jselas4;

/**
 *
 * @author John
 */
import java.util.Scanner;
public class JSelas4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //challenge 13
        Scanner input = new Scanner(System.in);
        int weight;
        int height;
        double bmi;
        System.out.print("Please Enter your weight in ilbs: ");
        weight = input.nextInt();
        System.out.print("Please Enter your height in inches: ");
        height = input.nextInt();
        bmi = (weight * 703)/(height* height);
        System.out.print("Your BMI is : " + bmi);
        if (bmi <18.5){
            System.out.println(" You are underweight!!!");
        }
        else if(bmi>25){
            System.out.println(" You are overweight!!!");
        }
        else{
            System.out.println(" You are at optimal weight!!!");
        }
        
        //challenge 14 
        System.out.println(" ");
        Die first = new Die();
        Die second = new Die();
        first.setRoll();
        second.setRoll();
        System.out.println("First dice: " + first.getRoll());
        System.out.println("Second dice: " + second.getRoll());
        
        
        //challenge 15
        System.out.println(" ");
        int amountOfBooks;
        System.out.print("Please enter how many books you bought this month: ");
        amountOfBooks = input.nextInt();
        if (amountOfBooks > 4){
            System.out.println("You earned 60 points");
        }
        else if(amountOfBooks == 1){
            System.out.println("You earned 5 points");
        }
        else if(amountOfBooks == 2){
            System.out.println("You earned 15 points");
        }
        else if(amountOfBooks == 3){
            System.out.println("You earned 30 points");
        }
        else{
            System.out.println("You earned 0 points");
        }
        
        //challenge 16
        System.out.println(" ");
        int month;
        int day;
        int year;
        System.out.print("Please enter the month: ");
        month = input.nextInt();
        System.out.print("Please enter the day: ");
        day = input.nextInt();
        System.out.print("Please enter the year (last 2 digits: ");
        year = input.nextInt();
        MagicDate sure = new MagicDate(month,day,year);
        if (sure.isMagic() == true){
            System.out.println("You have magic date");
        }
        else{
            System.out.println("You have no magic");
        }
    }
    
}
