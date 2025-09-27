package gitConnect1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task1_Body {
    public static void main(String[] args) {
        Scanner user_input = new Scanner(System.in);
        List<Task1_BankAccount> details = new ArrayList<>();

        details.add(new Task1_BankAccount(213423567, "Sachin", 12500.60));
        details.add(new Task1_BankAccount(113623764, "Rohan", 6000.40));
        details.add(new Task1_BankAccount(618426575, "Mohit", 11000.50));
        details.add(new Task1_BankAccount(513423676, "Soham", 1500.20));
        details.add(new Task1_BankAccount(963455673, "Ram", 3200.10));

        while (true) {
            System.out.println("1. Get account details");
            System.out.println("2. Deposit money");
            System.out.println("3. Withdraw money");
            System.out.println("4. Exit");
            System.out.println("------------------------------------------------------------------------");
            System.out.print("Enter your choice: ");
            int choice = user_input.nextInt();

            if (choice == 1) {
                System.out.print("Enter account number: ");
                long account_number = user_input.nextLong();
                boolean found = false;
                for (Task1_BankAccount acc : details) {
                    if (account_number == acc.getAccoubtNumber()) {
                        found = true;
                        System.out.println(acc.toString());
                        System.out.println("------------------------------------------------------------------------");
                    }
                }
                if (!found) {
                    System.out.println("Account does not exist");
                    System.out.println("------------------------------------------------------------------------");
                }
            } 
            else if (choice == 2) {
                System.out.print("Enter account number: ");
                long account_no = user_input.nextLong();
                boolean found = false;
                for (Task1_BankAccount acc : details) {
                    if (acc.getAccoubtNumber() == account_no) {
                        System.out.print("Enter deposit amount: ");
                        double amount = user_input.nextDouble();
                        if (amount > 0) {
                            acc.setSalary(acc.getSalary() + amount);
                            System.out.println("Deposit successful! Updated balance: " + acc.getSalary());
                        } else {
                            System.out.println("Please enter a valid amount");
                        }
                        found = true;
                    }
                }
                if (!found) {
                    System.out.println("Account does not exist");
                }
                System.out.println("------------------------------------------------------------------------");
            } 
            else if (choice == 3) {
                System.out.print("Enter account number: ");
                long account_no = user_input.nextLong();
                boolean found = false;
                for (Task1_BankAccount acc : details) {
                    if (acc.getAccoubtNumber() == account_no) {
                        System.out.print("Enter withdraw amount: ");
                        double amount = user_input.nextDouble();
                        if (amount > 0) {
                            if (amount <= acc.getSalary()) {
                                acc.setSalary(acc.getSalary() - amount);
                                System.out.println("Withdrawal successful! Updated balance: " + acc.getSalary());
                            } else {
                                System.out.println("Insufficient balance");
                            }
                        } else {
                            System.out.println("Please enter a valid amount");
                        }
                        found = true;
                    }
                }
                if (!found) {
                    System.out.println("Account does not exist");
                }
                System.out.println("------------------------------------------------------------------------");
            } 
            else if (choice == 4) {
                System.out.println("Thank you! Exiting...");
                break;
            } 
            else {
                System.out.println("Invalid choice. Please try again.");
            }
        }

        user_input.close();
    }
}
