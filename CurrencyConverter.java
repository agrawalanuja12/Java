import java.util.Scanner;
public class CurrencyConverter {
    
        // Hard-coded exchange rates (example rates, not real-time)
        private static final double USD_TO_EUR = 0.93;
        private static final double USD_TO_JPY = 148.91;
        private static final double EUR_TO_JPY = 160.38;
    
        public static void main(String[] args) {
            try (Scanner sc = new Scanner(System.in)) {
                System.out.println("Currency Converter");
                System.out.println("Available currencies: USD, EUR, JPY");
                System.out.print("Enter the source currency (USD, EUR, JPY): ");
                String sourceCurrency = sc.nextLine().toUpperCase();
   
                System.out.print("Enter the target currency (USD, EUR, JPY): ");
                String targetCurrency = sc.nextLine().toUpperCase();
   
                if (sourceCurrency.equals(targetCurrency)) {
                    System.out.println("Source and target currencies are the same.");
                    return;
                }
   
                System.out.print("Enter the amount to convert: ");
                double amount = sc.nextDouble();
   
                double convertedAmount = convertCurrency(sourceCurrency, targetCurrency, amount);
   
                if (convertedAmount == -1) {
                    System.out.println("Invalid currency input.");
                } else {
                    System.out.printf("Converted amount: %.2f %s%n", convertedAmount, targetCurrency);
                }
            }
        }
    
        private static double convertCurrency(String source, String target, double amount) {
            if (source.equals("USD") && target.equals("EUR")) {
                return amount * USD_TO_EUR;
            } else if (source.equals("USD") && target.equals("JPY")) {
                return amount * USD_TO_JPY;
            } else if (source.equals("EUR") && target.equals("USD")) {
                return amount / USD_TO_EUR;
            } else if (source.equals("EUR") && target.equals("JPY")) {
                return amount * EUR_TO_JPY;
            } else if (source.equals("JPY") && target.equals("USD")) {
                return amount / USD_TO_JPY;
            } else if (source.equals("JPY") && target.equals("EUR")) {
                return amount / EUR_TO_JPY;
            } else {
                return -1; // Invalid input
            }
            
        }
    }
    // Currency Converter Project

    // Description: Built a console-based application to convert amounts between multiple currencies using predefined exchange rates.
    // Key Features: Supported currencies like USD, INR, EUR, and JPY. Handled user inputs, input validation, and precise calculations.
    // Tech Stack: Java, HashMap for storing rates, Scanner for user interaction.
    // Skills Demonstrated: Data structures, user input handling, basic arithmetic, and formatted output.
    
    
    
    
    
    
    

