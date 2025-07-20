
    import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        int reverse = 0;

        
        for (; number != 0; number = number / 10) {
            int digit = number % 10;
            reverse = reverse * 10 + digit;
        }

        System.out.println("Reversed number: " + reverse);

        sc.close();
    }
}


