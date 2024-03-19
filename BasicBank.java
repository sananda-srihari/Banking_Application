//A basic banking application code using java

import java.util.Scanner;

public class Main 
{
	// Main class to run the banking application
	
    public static void main(String[] args) 
    {
    	// Initialize variables and arrays
        boolean condition = true;
        double[] accountBalance = new double[100];
        String[] accountName = new String[100];
        int option, size = 0;
        
        // Start the main program loop
        while (condition) 
        {
            // Display the banking menu options
            System.out.println("Banking Menu: ");
            System.out.println("Select any one option from below. ");
            System.out.println("1) Add Customer");
            System.out.println("2) Change Customer Name");
            System.out.println("3) Check Account Balance");
            System.out.println("4) Update Account Balance");
            System.out.println("5) Summary of All Accounts");
            System.out.println("6) Quit");

            // Read user input
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter your option: ");

            option = sc.nextInt();

            // Perform actions based on user input
            if (option == 1) 
            {
            	// Add new customer
                // Prompt user for customer name and opening balance
                // Display account details
            	
                System.out.println("\nAdd Customer Menu");

                sc.nextLine();

                System.out.print("\nEnter Customer Name: ");
                String name = sc.nextLine();
                accountName[size] = name;
                System.out.print("Enter Opening Balance Amount: ");
                double amt = sc.nextDouble();
                accountBalance[size] = amt;

                System.out.println("Account created successfully. \n");
                System.out.println("Account Details:- \n ");
                System.out.println("Account Number: " + (size));
                System.out.println("Account Name:" + accountName[size]);
                System.out.println("Account Balance: " + accountBalance[size] + " Rs \n");

                size = size + 1;

            } 
            else if (option == 2) 
            {
            	// Change customer name
                // Prompt user for account number and new name
                // Display confirmation message

                System.out.println("\nChange Customer Name Menu");
                System.out.print("\nEnter your Account Number: ");

                int accountIndex;
                String temp;

                accountIndex = sc.nextInt();
                sc.nextLine();

                if (accountIndex > size) 
                {
                    System.out.println("Account does not exist.");
                    System.out.println("Terminating...");
                } 
                else 
                {
                    temp = accountName[accountIndex];
                    System.out.print("Enter the new name: ");
                    String name = sc.nextLine();
                    accountName[accountIndex] = name;
                    System.out.println("Name is successfully updated from " + temp + " to " + name + ". \n");
                }
            } 
            else if (option == 3) 
            {
            	// Check account balance
                // Prompt user for account number
                // Display account balance

                System.out.println("\nCheck Account Balance Menu");
                System.out.print("\nEnter your Account Number: ");

                int accountIndex;
                accountIndex = sc.nextInt();

                if (accountIndex > size) 
                {
                    System.out.println("Account does not exist.");
                    System.out.println("Terminating...");
                } 
                else 
                {
                    System.out.println(
                            accountName[accountIndex] + " your balance is " + accountBalance[accountIndex] + "Rs.");
                }
            } 
            else if (option == 4) 
            {
            	// Update account balance
                // Prompt user for account number and deposit amount
                // Display updated balance
            	
                System.out.println("\nUpdate Account Balance Menu ");
                System.out.print("\nEnter your Account Number: ");

                int accountIndex;
                accountIndex = sc.nextInt();

                if (accountIndex > size) 
                {
                    System.out.println("Account does not exist.");
                    System.out.println("Terminating...");
                } 
                else 
                {
                    System.out.print("Enter the amount to be deposited: ");
                    double amt = sc.nextDouble();

                    accountBalance[accountIndex] += amt;
                    System.out.println(accountName[accountIndex] + " your updated balance is : "
                            + accountBalance[accountIndex] + " RS. \n ");
                }
            } 
            else if (option == 5) 
            {
            	// Display summary of all accounts  
            	
                for (int i = 0; i < size; i++) 
                {
                    System.out.println("Account Number: " + i + ", Name: " + accountName[i] + ", Balance: "
                            + accountBalance[i] + "Rs. \n ");
                }
            } 
            else if (option == 6) 
            {
            	// Quit the program
            	
                System.out.println("Terminating...");
                System.exit(0);
            } 
            else 
            {
            	// Display error message for invalid input
            	
                System.out.println("\n Invalid input.");
                System.out.println("Terminating...");
                System.exit(0);
            }
        }
    }
}
