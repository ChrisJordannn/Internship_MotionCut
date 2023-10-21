import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;
class Expense {
    String description;
    double amount;
    String category;

    Expense(String description, double amount, String category) {
        this.description = description;
        this.amount = amount;
        this.category = category;
    }
}
class ExpenseTracker {
    ArrayList<Expense> expenses;
    ExpenseTracker() {
        this.expenses = new ArrayList<>();
        FileToProgram(); //txt file to program
    }
    void AddExpense(String d, double a, String c) {
        if (Validation(a)) { 
            Expense expense = new Expense(d, a, c);
            expenses.add(expense);
            System.out.println("Expense added successfully!");
            ProgramToFile();
        } else {
            System.out.println("Invalid amount. Please enter a non-negative amount.");
        }
    }//program to txt file
    void ViewExpenses() {
        if (expenses.isEmpty()) {
            System.out.println("Expense list is empty, please input expense to view it.");
        } else {
            System.out.println("YOUR EXPENSES:");
            for (Expense expense : expenses) {
                System.out.println("Description: " + expense.description +
                        ", Amount: " + expense.amount +
                        ", Category: " + expense.category);
            }
        }
    }
    void ExpenseSummary(String c) {
        double total = 0;
        for (Expense expense : expenses) {
            if (expense.category.equals(c)) {
                total += expense.amount;
            }
        }
        System.out.println("Total expenses for category '" + c + "': " + total);
    }
    private boolean Validation(double a) {
        return a >= 0;
    }
    public void ProgramToFile() {
        try (PrintWriter writer = new PrintWriter(new FileWriter("C:\\Users\\chrisjordan\\Documents\\MotionCutTxt.txt"))) {
            for (Expense expense : expenses) {
                writer.println(expense.description + "," + expense.amount + "," + expense.category);
            }
            System.out.println("Expenses saved to text file");
        } catch (IOException e) {
            System.out.println("Error saving expenses to file");
        }
    }
    private void FileToProgram() {
        try (BufferedReader reader = new BufferedReader(new FileReader("C:\\Users\\chrisjordan\\Documents\\MotionCutTxt.txt"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(",");
                if (parts.length == 3) {
                    String d = parts[0];
                    double a = Double.parseDouble(parts[1]);
                    String c = parts[2];
                    expenses.add(new Expense(d, a, c));
                }
            }
            System.out.println("Expenses loaded from text file!");
        } catch (IOException e) {
            System.out.println("Error loading expenses from file");
        }
    }
}
public class ExpenseTracking {
    public static void main(String[] args) {
        ExpenseTracker expenseTracker = new ExpenseTracker();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("\nExpense Tracker Menu:");
            System.out.println("1. Add Expense");
            System.out.println("2. View Expenses");
            System.out.println("3. Expense Summaries");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            if (scanner.hasNextInt()) {
                int choice = scanner.nextInt();
                scanner.nextLine();
                switch (choice) {
                    case 1:
                        System.out.print("Enter description: ");
                        String d = scanner.nextLine();
                        System.out.print("Enter amount: ");
                        if (scanner.hasNextDouble()) {
                            double a = scanner.nextDouble();
                            scanner.nextLine(); 
                            System.out.print("Enter category: ");
                            String c = scanner.nextLine();
                            expenseTracker.AddExpense(d, a, c);
                        } else {
                            System.out.println("Invalid amount. Please enter a valid number.");
                            scanner.nextLine(); 
                        }
                        break;
                    case 2:
                        expenseTracker.ViewExpenses();
                        break;
                    case 3:
                        System.out.print("Enter category for expense summaries: ");
                        String summaryCategory = scanner.nextLine();
                        expenseTracker.ExpenseSummary(summaryCategory);
                        break;
                    case 4:
                        expenseTracker.ProgramToFile(); 
                        System.out.println("Exiting Now!");
                        System.exit(0);
                }
            } else {
                System.out.println("Invalid input. Please enter a number.");
                scanner.nextLine(); 
            }
        }
    }
}
