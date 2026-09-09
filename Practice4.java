import java.util.Scanner;
class Practice4{
        public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter a number");
            int num = sc.nextInt();
int origanlNum = num;
int reverseNum = 0;
while(num>0){
int lastdigit = num % 10;
reverseNum = (reverseNum*10) + (lastdigit);
num = num/10;
}{
    if(origanlNum==reverseNum){
        System.out.println("This is palandrome");
    }else{
System.out.println("This is not palandrome");
        }
    }
    }
}

      