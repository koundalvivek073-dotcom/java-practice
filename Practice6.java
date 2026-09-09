import java.util.Scanner;
class Practice6{
        public static void main(String[] args){
Scanner sc = new Scanner(System.in);
System.out.println("Enter a number");
int num = sc.nextInt();
int factorial = 1;
while(num>0){
 factorial = factorial * num;
 num--;
}
      System.out.println(factorial);
    }
    }