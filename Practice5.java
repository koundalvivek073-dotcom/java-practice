import java.util.Scanner;
public class Practice5 {
    public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.println("Enter the number");
int num = sc.nextInt();
int LastDigit = num % 10;
int sum = 0;
sum = num % 10 + LastDigit;
System.out.println(sum);
    }
}