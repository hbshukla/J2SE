package Assignment;

public class CarriageReturnAnimation {

	public static void main(String[] args) throws InterruptedException {
        String[] messages = {"Hello", "World", "Java"};

        // Create a loop to animate the overwriting effect
        for (String msg : messages) { //enhanced for loop
            System.out.print(msg + "\r");  // Print message and move cursor to start of line
            Thread.sleep(2000);  // Wait for 2 second before overwriting 
        }

        // Adding a final message after the loop
        System.out.print("Done!           \r");  // Clears any leftover characters
    }
}