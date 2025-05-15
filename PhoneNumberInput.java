import java.util.InputMismatchException;
import java.util.Scanner;

public class PhoneNumberInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your phone number: ");
        try {
            long phoneNumber = sc.nextLong();
            System.out.println("Phone number entered: " + phoneNumber);
        } catch (InputMismatchException e) {
            System.out.println("Error: Invalid input. Please enter only numbers.");
        }
    }
}
