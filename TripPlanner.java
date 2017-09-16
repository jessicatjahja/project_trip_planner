import java.io.*;
import java.util.*;

public class TripPlanner {
    public static void main(String[] args) {
        greet();
        timeBudget();
        timeDiff();
        countryArea();
    }

    //greets the user
     public static void greet() {
         Scanner kb = new Scanner(System.in);
         String name;
         String vacay;

         System.out.println("Welcome to Vacation Planner!");
         System.out.print("What is your name? ");
         name = kb.nextLine();
         System.out.print("Nice to meet you, " + name + ". Where are you travelling to? ");
         vacay = kb.nextLine();
         System.out.println("Great! " + vacay + " sounds like a great trip.");
         System.out.println("**********");
     }

     //gets the user's time and budget
      public static void timeBudget() {
          Scanner kb = new Scanner(System.in);
          int days;
          double money;
          String currency;
          double conversion;
          int hours;
          int minutes;
          double dayBudget;
          double totalForeignBudget;
          double forex;

          System.out.println();
          System.out.print("How many days are you going to spend travelling? ");
          days = kb.nextInt();
          System.out.print("How much money, in USD, are you planning to spend on your trip? ");
          money = kb.nextDouble();
          System.out.print("What is the three-letter currency symbol for your travel destination? ");
          currency = kb.next();
          System.out.print("How many " + currency + " are there in 1 USD? ");
          conversion = kb.nextDouble();
          System.out.println();

          hours = days * 24;
          minutes = hours * 60;
          System.out.println("If you are travelling for " + days + " days that is the same as " + hours + " hours or " + minutes + " minutes.");
          dayBudget = money / days;
          System.out.printf("If you are going to spend $%.2f", money);
          System.out.printf(" USD, that means per day you can spend up to $%.2f", dayBudget);
          System.out.println(" USD.");
          totalForeignBudget = money*conversion;
          System.out.printf("Your total budget in " + currency + " is %.2f", totalForeignBudget);
          forex = totalForeignBudget/days;
          System.out.printf(" " + currency + ", which per day is %.2f", forex);
          System.out.println(" " + currency + ".");
          System.out.println("**********");
      }

      //calculates time difference
      public static void timeDiff(){
        Scanner kb = new Scanner(System.in);
        int hours;
        int midnightTime;
        int noonTime;

        System.out.println();
        System.out.print("What is the time difference, in hours, between your home and your destination? ");
        hours = kb.nextInt();
        midnightTime = hours;
        noonTime = 12+hours;
        System.out.println("That means that when it is midnight at home, it will be 0" + midnightTime + ":00 in your travel destination, and when it is noon at home, it will be " + noonTime + ":00.");
        System.out.println("**********");
      }

      //converts country area from km2 to miles2
      public static void countryArea(){
          Scanner kb = new Scanner(System.in);
          double kmArea;
          double milesArea;

          System.out.println();
          System.out.print("What is the square area of your destination country in km2? ");
          kmArea = kb.nextDouble();
          milesArea = kmArea*0.3861;
          System.out.printf("In miles2 that is %.2f\n", milesArea);
          System.out.println(".");
          System.out.println("**********");
      }
}