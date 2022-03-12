package com.firstactivity.one;
import java.util.Scanner; //Import Scanner util package

public class One { //File Name is One.java; may cause error if class name is not the same as the file name
    public static void main(String[] args){

        Scanner UserInput = new Scanner(System.in); //Assigns Scanner Class
        System.out.print("Enter your First Name: ");
        String FirstName = UserInput.nextLine(); //Requests input for FirstName

        System.out.print("Enter your Last Name: ");
        String LastName = UserInput.nextLine(); //Requests input for LastName

        System.out.print("Enter your Age: ");
        int UserAge = UserInput.nextInt(); //Requests input for UserAge

        System.out.println("Your Name is: "+ FirstName + " " + LastName + ".");
        System.out.println("Your Age is: " + UserAge + ".");

        if (UserAge > 0) {
            if (UserAge % 2 == 0){
                System.out.println(UserAge + " is an Even Number");
            }
            else {
                System.out.println(UserAge + " is an Odd Number");
            }
        }
        else {
            System.out.println("Age must be a Positive Integer.");
        }
    }
}
