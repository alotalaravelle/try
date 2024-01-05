import java.util.Scanner;
import java.util.Stack;

public class FruitBasket {
    public static void main(String[] args) {
        Stack<String> basket = new Stack<>();
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter the number of fruits you would like to catch: ");
            int numFruits = scanner.nextInt();
            scanner.nextLine();
            
            for (int i = 0; i < numFruits; i++) {
                System.out.print("Choose a fruit to catch (A for apple, O for orange, M for mango, G for guava): ");
                String choice = scanner.nextLine().toUpperCase();
                
                switch (choice) {
                    case "A" -> basket.push("apple");
                    case "O" -> basket.push("orange");
                    case "M" -> basket.push("mango");
                    case "G" -> basket.push("guava");
                    default -> {
                        System.out.println("Invalid choice. Try again.");
                        i--;
                    } 
                }
                
                System.out.println("Basket: " + basket);
            }
            
            System.out.println("Enter 'E' to start eating a fruit.");
            
            while (!basket.isEmpty()) {
                String input = scanner.nextLine().toUpperCase();
                
                if (input.equals("E")) {
                    if (!basket.isEmpty()) {
                        String eatenFruit = basket.pop();
                        System.out.println("Eating " + eatenFruit + ".");
                        System.out.println("Remaining fruits in the basket: " + basket);
                    } else {
                        System.out.println("No more fruits in the basket.");
                    }
                } else {
                    System.out.println("Invalid input. Enter 'E' to eat a fruit.");
                }
            }
            
            System.out.println("No more fruits in the basket. Game over.");
        }
    }
}
