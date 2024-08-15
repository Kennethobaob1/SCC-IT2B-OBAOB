package obaob;

import java.util.Scanner;

public class Obaob {
       public static void main(String[] args) {
           
           Scanner input = new Scanner(System.in);
           
          String fname;
          int byear;
          
          System.out.println("Enter your name: ");
          fname = input.nextLine();
          System.out.println("Enter birth year: ");
          byear = input.nextInt();
                   
          System.out.println("Hello "+fname+"\nYour age is"+(2024-byear));
    }   
}