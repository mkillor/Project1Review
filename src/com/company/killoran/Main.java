package com.company.killoran;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner input = new Scanner(System.in);

        //Display menu..
        System.out.println("\tMenu");
        System.out.println("\t1. Add to do");
        System.out.println("\t2. Update to do");
        System.out.println("\t3. Remove to do");
        System.out.println("\t4. List all to do's");
        System.out.println("\t0. Exit program");
        System.out.println("");

        //Switch case statements for menu items
        while(true) {
            System.out.println("\tPlease make a selection...");
            String selection = input.nextLine();
            switch (selection) {
                case "1":
                    System.out.println("\t****Adding a to do item.");
                    //method goes here
                    break;
                case "2":
                    System.out.println("\t****Updating an existing to do.");
                    //method goes here
                    break;
                case "3":
                    System.out.println("\t****Removing a to do completely.");
                    //method goes here
                    break;
                case "4":
                    System.out.println("\t****Listing all to do items");
                    //method goes here
                    break;
                case "0":
                    System.out.println("\t****Program ending...");
                    System.exit(0);
                default:
                    System.out.println("Please make a valid selection...");
            }
        }

    }
}
