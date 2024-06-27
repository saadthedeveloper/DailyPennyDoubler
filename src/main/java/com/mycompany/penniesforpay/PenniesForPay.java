/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.penniesforpay;
import java.util.Scanner;

public class PenniesForPay {

    public static void main(String[] args) {
        double salary = 1;
        int days;
        int loopCounter = 1;
        double salaryInDollars;
        double totalPay = 0;
        
        Scanner keyboard = new Scanner(System.in);
        
        System.out.println("Enter the number of days: ");
        days = keyboard.nextInt();
        
        while(days<=0)
        {
        System.out.println("Number of days can't be below 1, Re-enter: ");
        days = keyboard.nextInt();
        }
        
        System.out.println("Day" + "     "+ "Salary");
        
        while(loopCounter <= days)
        {
        salary = salary * 2;
        salaryInDollars = salary / 100.0;
        System.out.printf("%-8d %-8.2f \n", loopCounter, salary);
        totalPay = totalPay + salaryInDollars;
        loopCounter++;
        }
        
        System.out.println("\nTotal Pay: " + totalPay);

    }
}
