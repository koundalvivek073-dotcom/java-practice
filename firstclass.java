import java.util.Scanner;
class Firstclass{
        public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
     int ammount = 5000; 
     int deposit = 0;
     int witdrawl = 0;
     int balance = ammount + deposit - witdrawl;
    while(true){System.out.println("****MENU****");
     System.out.println("1. Check balance");
     System.out.println("2. Deposit money");
     System.out.println("3. Widraw money");
     System.out.println("4. Exit");
     int choice = sc.nextInt();
     switch(choice){
     case 1 :  System.out.println(balance);
     break;
     case 2 : System.out.println("Enter ammount");
      deposit = sc.nextInt();
      if(deposit>=100){
        System.out.println("Transaction Sucessfull");
      }else{
        System.out.println("enter valid ammount");
         }
     break;
     case 3 : System.out.println("Enter ammount");
     witdrawl = sc.nextInt();
     if(witdrawl>balance){
        System.out.println("Insufficient Funds");
     } else{
        System.out.println("Transaction Successfull");
     }
     break;
     case 4  : System.out.println("Exit");
     return;
     case 5 : System.out.println("invalid action");
     
     }
    }
        }
    }

            
         
     

       
        