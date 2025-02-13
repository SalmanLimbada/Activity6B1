import java.util.Scanner;

public class CounterApp {
    private int counter;

    public CounterApp() {
        counter = 0;
    }

    public void start() {
        Scanner scanner = new Scanner(System.in);
        String command;

        while (true) {
            System.out.println("\nCurrent counter: " + counter);
            System.out.println("Enter a command (increment, decrement, reset, exit): ");
            command = scanner.nextLine();

            if (command.equalsIgnoreCase("increment")) {
                increment();
            } else if (command.equalsIgnoreCase("decrement")) {
                decrement();
            } else if (command.equalsIgnoreCase("reset")) {
                reset();
            } else if (command.equalsIgnoreCase("exit")) {
                System.out.println("Exiting the app. Goodbye!");
                break;
            } else {
                System.out.println("Invalid command. Try again.");
            }
        }

        scanner.close();
    }

    private void increment() {
        counter++;
    }

    private void decrement() {
        counter--;
    }

    private void reset() {
        counter = 0;
    }

    public static void main(String[] args) {
        CounterApp app = new CounterApp();
        app.start();
    }
}
