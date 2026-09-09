import java.util.Scanner;
class practice21{
   public static void main(String[] var0){
    Scanner sc = new Scanner(System.in);
    System.out.println("Type_Arrey_length");
     int arry_length = sc.nextInt();
    System.out.println("Type inputs");
    int [] values = new int[arry_length];
    boolean found = false;
      int num_match = sc.nextInt();
    for(int i = 0; i < arry_length; i++){
    values[i] = sc.nextInt();
    if(num_match == values [i]){
        System.out.print(i);
    }
     System.out.println("Type The Match needed");
       }
       if(!found){
        System.out.print("-1");
       }
    }
    }
   
