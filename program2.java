import java.util.Scanner;

public class program2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Siddarth SR Pillai-21MIC0048");
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        
        System.out.println("Power table of " + number + ":");
        for (int i = 1; i <= 10; i++) {
            System.out.println(number + " ^ " + i + " = " + (number ^ i));
        }
        
        scanner.close();
    }
}
