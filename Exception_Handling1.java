import java.util.Scanner;

public class Exception_Handling1 {
    public static void main(String[] args) {
        Scanner get = new Scanner(System.in);

        try {
            System.out.print("Enter the age: ");
            int age = get.nextInt();

            if (age < 18) {
                throw new ArithmeticException("Not Eligible to Vote");
            }

            System.out.println("The Person Can Vote");
        } 
        catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
        finally {
            get.close();
        }
    }
}