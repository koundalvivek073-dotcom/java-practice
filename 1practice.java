import java.util.Scanner;
class Secondclass{
    public static void main(String[] args){
Scanner sc = new Scanner(System.in);
System.out.println("Enter your pin");
int pin = sc.nextInt();
if(pin==1234){
    System.out.println("Enter your ammount");
int ammount = sc.nextInt();
if(ammount<=5000){
    System.out.println("Transaction sucessfull");
}else{
    System.out.println("Enter otp");
    int otp = sc.nextInt();
    if(otp==1232456){
        System.out.println("Transaction sucessfull");
    }else{
        System.out.println("invalid otp");
    }
}
}else{System.out.println("Invalid otp");

}
    }
}


    

    


    


    
