import java.util.Scanner;
class Firstclass{
        public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
     int amount = 5000;
     int balance = amount;
    while(true){
        System.out.println("****MENU****");
        System.out.println("1. Check balance");
        System.out.println("2. Deposit money");
        System.out.println("3. Withdraw money");
        System.out.println("4. Exit");
        int choice = sc.nextInt();
        switch(choice){
            case 1:
                System.out.println("Balance: " + balance);
                break;
            case 2:
                System.out.println("Enter amount");
                int deposit = sc.nextInt();
                if(deposit >= 100){
                    balance += deposit;
                    System.out.println("Transaction Successful");
                    System.out.println("Updated balance: " + balance);
                } else {
                    System.out.println("Enter valid amount (minimum 100)");
                }
                break;
            case 3:
                System.out.println("Enter amount");
                int withdrawal = sc.nextInt();
                if(withdrawal > balance){
                    System.out.println("Insufficient Funds");
                } else {
                    balance -= withdrawal;
                    System.out.println("Transaction Successful");
                    System.out.println("Updated balance: " + balance);
                }
                break;
            case 4:
                System.out.println("Exit");
                return;
            default:
                System.out.println("Invalid action");
        }
    }
        }
    }

            
         
     

       
        