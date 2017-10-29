/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_prg_04_12_bar_chart;

import java.util.Scanner;
/**
 *
 * @author bluebackdev
 * Write a program that asks the user to enter today's sales for five stores.
 * The program should display a bar chart comparing each store's sales. Create
 * each bar in the bar chart by displaying a row of asterisks. Each asterisk
 * should represent $100 of sales. Here is an example of the program's output.
 * 
 *      Enter Today's sales for store 1: 1000 [Enter]
 *      Enter Today's sales for store 2: 1200 [Enter]
 *      Enter Today's sales for store 3: 1800 [Enter]
 *      Enter Today's sales for store 4: 800 [Enter]
 *      Enter Today's sales for store 5: 1900 [Enter]
 * 
 *      SALES BAR CHART
 *      Store 1: **********
 *      Store 2: ************
 *      Store 3: ******************
 *      Store 4: ********
 *      Store 5: *******************
 * 
 */
public class JAVA_PRG_04_12_Bar_Chart {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        // User output string
        String strOutputMessage;
        
        // Holds store sales
        int intStore1;
        int intStore2;
        int intStore3;
        int intStore4;
        int intStore5;
        
        // Constant describing number of stores in total
        final int INT_STORES = 5;
        
        // Create keyboard for user input
        Scanner scrKeyboard = new Scanner(System.in);
        
        do {
            System.out.print("Please enter today's sales for store 1:");
            intStore1 = scrKeyboard.nextInt();
        } while (intStore1 < 0 || intStore1 > 100000);
        do {
            System.out.print("Please enter today's sales for store 2:");
            intStore2 = scrKeyboard.nextInt();
        } while (intStore2 < 0 || intStore2 > 100000);
        do {
            System.out.print("Please enter today's sales for store 3:");
            intStore3 = scrKeyboard.nextInt();
        } while (intStore3 < 0 || intStore3 > 100000);
        do {
            System.out.print("Please enter today's sales for store 4:");
            intStore4 = scrKeyboard.nextInt();
        } while (intStore4 < 0 || intStore4 > 100000);
        do {
            System.out.print("Please enter today's sales for store 5:");
            intStore5 = scrKeyboard.nextInt();
        } while (intStore5 < 0 || intStore5 > 100000);
        
        System.out.print("Store 1: ");
        for(int i = 0 ; i < (intStore1 / 100) ; i++)
        {
            System.out.print("*");
        }
        System.out.print("\nStore 2: ");
        for(int i = 0 ; i < (intStore2 / 100) ; i++)
        {
            System.out.print("*");
        }
        System.out.print("\nStore 3: ");
        for(int i = 0 ; i < (intStore3 / 100) ; i++)
        {
            System.out.print("*");
        }
        System.out.print("\nStore 4: ");
        for(int i = 0 ; i < (intStore4 / 100) ; i++)
        {
            System.out.print("*");
        }
        System.out.print("\nStore 5: ");
        for(int i = 0 ; i < (intStore5 / 100) ; i++)
        {
            System.out.print("*");
        }
        System.out.println();
    }
    
}
