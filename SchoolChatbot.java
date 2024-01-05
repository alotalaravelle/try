import java.util.Scanner;

public class SchoolChatbot {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to School Chatbot!");
        System.out.println("How can I help you today?");
        System.out.println("\n Please type any of the following: Schedule, Grades, Events, or Exit");

        while (true) {
            System.out.print("User: ");
            String userMessage = scanner.nextLine();
            if (userMessage.equalsIgnoreCase("Exit") || userMessage.equalsIgnoreCase("Bye")) {
                System.out.println("School Chatbot: Goodbye! Have a great day.");
                break;
            }

            String botResponse = generateResponse(userMessage);
            System.out.println("School Chatbot: " + botResponse);
        }
        scanner.close();
    }

    private static String generateResponse(String userMessage) {
        if (userMessage.contains("Schedule")) {
            return "The school schedule is available on the school website.";
        } else if (userMessage.contains("Grades")) {
            return "You can check your grades on the student portal.";
        } else if (userMessage.contains("Events")) {
            return "Information about upcoming events can be found on the school bulletin board.";
        } else {
            return "I'm sorry, I didn't understand that. Please ask something else.";
        }
    }
}
