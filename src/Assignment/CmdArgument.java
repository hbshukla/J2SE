package Assignment;

public class CmdArgument {
    public static void main(String[] args) {
        // Check if any arguments were passed
        if (args.length > 0) {
            // Loop through the args array and print each argument
            for (int i = 0; i < args.length; i++) {
                System.out.println("Argument " + (i + 1) + ": " + args[i]);
            }
        } else {
            System.out.println("No arguments passed.");
        }
    }
}
