package javaapplication1;
import java.util.*;

public class Base {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        problem_6();
    }
    
    static void problem_1(){
        String fName = "Boris";
        String lName = "Bankov";
        System.out.println(fName + " " + lName);
    }
    
    static void problem_1b(){
        
        System.out.println("Enter first name: ");
        String fName = reader.nextLine();
        System.out.println("Enter last name: ");
        String lName = reader.nextLine();
        System.out.println("Hello, " + fName + " " + lName);
    }
    
    static void problem_2(){
        System.out.println("Enter first number:");
        int num1 = reader.nextInt();
        System.out.println("Enter second number: ");
        int num2 = reader.nextInt();
        System.out.println(num1 + num2);
        
    }
    
    static void problem_3(){
        System.out.println("Enter first number:");
        int num1 = reader.nextInt();
        System.out.println("Enter second number:");
        int num2 = reader.nextInt();
        
        if(num1>num2){
            System.out.println(num1-num2);
        } else {
            System.out.println(num2-num1);
        }
    }
    
    static void problem_4(){
        System.out.println("enter a number:");
        int number = reader.nextInt();
        if(number % 2 == 0) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
    
    static void problem_5(){
        System.out.println("enter a number:");
        int number = reader.nextInt();
        switch(number){
            case 0: System.out.println("nula"); break;
            case 1: System.out.println("edno"); break;
            case 2: System.out.println("dve"); break;
            case 3: System.out.println("tri"); break;
            case 4: System.out.println("four"); break;
            case 5: System.out.println("pet"); break;
            case 6: System.out.println("six"); break;
            case 7: System.out.println("sedem"); break;
            case 8: System.out.println("osem"); break;
            case 9: System.out.println("nine"); break;
            default: System.out.println("molq, vyvedete edna cifra"); break;
        }
    }
    
    static void problem_6(){
        System.out.println("enter a letter:");
        String grade = reader.nextLine();
        switch(grade.charAt(0)){
            case 'a':
            case 'A': System.out.println("Excellent"); break;
            case 'b':
            case 'B': System.out.println("Very Good"); break;
            case 'c':
            case 'C': System.out.println("Good"); break;
            case 'd':
            case 'D': System.out.println("Average"); break;
            default: System.out.println("BAD!");
        }
       
    }
}
