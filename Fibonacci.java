
    import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter the limit: ");
        int limit = scanner.nextInt();

        int a = 0, b = 1;
        System.out.print("Fibonacci numbers up to " + limit + ": ");

        while (a <= limit) {
            System.out.print(a + " ");
            int next = a + b;
            a = b;
            b = next;
        }

        scanner.close();
    }
}

