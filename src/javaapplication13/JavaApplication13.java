/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication13;

import java.util.Scanner;

/**
 *
 * @author mzj10
 */
public class JavaApplication13 {

    /**
     * @param args the command line arguments
     */
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        
        
        
        int i = 3;
        String counter = "yes";
        System.out.println("Hello and welcome to my Calculator");
        while (counter.equals("yes")){
            
        
        System.out.println("The Home page");
        System.out.println("Please choose a number");
        System.out.println("1.Addition\t2.Subtraction\t  3.Multiplication\t4.Division\t 5.Exit");

        String number = sc.nextLine();
        int op = 0;
        switch (number){
            case "1":
                op = 1;
                cal(op);
                break;
            case "2":
                op = 2;
                cal(op);
                break;
            case "3":
                op = 3;
                cal(op);
                break;
            case "4":
                op = 4;
                cal(op);
                break;
            case "5":
                counter = "no";
               
                break;
            default :
                if(i == 0){
                    counter = "no";
                   System.out.println("you have no more tries"); 
                }else{
                System.out.println("Please enter a vaild number");
                System.out.println("You have " + i+ " tries left");
                i--;
                }
                break;
        }
        
           }    
        System.out.println("Goodbye");
             
    }
    public static void cal(int x){
        
        int number1,number2;
        float number3 = 0.0F;
        System.out.println("Please enter a number");
        number1 = sc.nextInt();
        System.out.println("Please another number");
        number2 = sc.nextInt();
        if (x == 1){
          System.out.println("The answer is "+(number1 + " + "+ number2)+" = "+ (number1 + number2));
        }
        else if (x == 2){
          System.out.println("The answer is "+number1 + " - "+ number2+" = "+ (number1 - number2));
        }
        else if (x == 3){
         System.out.println("The answer is "+number1 + " * "+ number2+" = "+ (number1 * number2));
        }
        else {
            number3 = (float)number1/(float)number2;
          System.out.println("The answer is "+number1 + " / "+ number2+" = "+number3);
        }
        
        sc.nextLine();
        String check = "yes";
        while (check.equals("yes")){
            System.out.println("1.Home page");
        System.out.println("2.Try Differnt numbers");
        String num = sc.nextLine();
        
        switch(num){
            case "1":
                check = "no";
                break;
               
            case "2":
                cal(x);
                break;
            default :
                System.out.println("Invaild input, Please enter a vaild input");
        }
        }
        
        
        
    }
    
}
