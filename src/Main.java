// Filename: CurrencyConverter_joshua.java
// Author: JoshuaR
// Date: 2024-02-09
// Description: Converts an amount of money from the selected option to CAD

// Import necessary tools
import org.dc.java.CurrencyConverter.CAD;
import org.dc.java.CurrencyConverter.GBP;
import org.dc.java.CurrencyConverter.USD;
import org.dc.java.CurrencyConverter.EUR;
import java.util.Scanner;

class CurrencyConverter {
    public static void main(String[] args) {
        // Creating variables in main to be used later
        // Crated a scanner to read user input
        Scanner scanner = new Scanner(System.in);
        CAD cad = new CAD();
        USD usd = new USD();
        GBP gbp = new GBP();
        EUR eur = new EUR();

        while (true) {
            // Presents menu
            // Allows user to choose and option
            System.out.println("1. CAD\n2. USD\n3. GBP\n4. EUR\n5. Quit");
            System.out.print("Choose a currency: ");
            int choice = scanner.nextInt();
            if (choice == 6) {
                System.out.println("Goodbye!");
                break;
            }

            System.out.print("Enter amount: ");
            double amount = scanner.nextDouble();

            // Takes the choice from the menu and completes the respective case
            switch (choice) {
                case 1:
                    System.out.println("Converted amount in CAD: " + cad.convertToCAD(amount));
                    System.out.println("Converted amount in USD: " + cad.convertToUSD(amount));
                    System.out.println("Converted amount in GBP: " + cad.convertToGBP(amount));
                    System.out.println("Converted amount in EUR: " + cad.convertToEUR(amount));
                    break;
                case 2:
                    System.out.println("Converted amount in CAD: " + usd.convertToCAD(amount));
                    break;
                case 3:
                    System.out.println("Converted amount in CAD: " + gbp.convertToCAD(amount));
                    break;
                case 4:
                    System.out.println("Converted amount in CAD: " + eur.convertToCAD(amount));
                    break;
                default:
                    System.out.println("Invalid choice!");
            }
        }
        scanner.close();
    }
}
