import java.util.Scanner;
class javapracticenew1{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Array length");
        int arrlength = sc.nextInt();
        int [] arr = new int[arrlength];
        boolean found = false;
        System.out.println("Enter Array elements");
        for(int i=0; i<arrlength; i++){
            arr[i] = sc.nextInt();
        }
        int num = sc.nextInt();
        for(int i =0; i<arrlength; i++){
            if (arr[i] == num){
                System.out.print("your number is at index " + i);
                found = true;
            }

        }
        if(!found){
            System.out.print(" -1");
        }
    }
}