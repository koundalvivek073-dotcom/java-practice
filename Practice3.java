import java.util.Scanner;
public class Practice3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();
        int lastdigit = 0;
        int sum = 0;
        int originalNumber = n;

        while (n > 0) {
            lastdigit = n % 10;
            sum += lastdigit * lastdigit * lastdigit;
            n = n / 10;
        }

        if (sum == originalNumber) {
            System.out.println("This is astronomical number");
        } else {
            System.out.println("This is not astronomical number");
        }
    }
}



