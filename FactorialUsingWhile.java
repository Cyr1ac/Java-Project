
import java.util.Scanner;

public class FactorialUsingWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

      
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        int fact = 1;
        int i = 1;

        
        while (i <= number) {
            fact = fact * i;
            i++;
        }

        System.out.println("Factorial of " + number + " is: " + fact);

        sc.close();
    }
}

    

