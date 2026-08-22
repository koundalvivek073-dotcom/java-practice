import java.util.Scanner;
class vovel{
   public static void main(String[] var0) {
Scanner sc = new Scanner(System.in);
char input = sc.next().charAt(0);
if(input == 'a' || input == 'e' || input == 'i' || input == 'o' || input == 'u'){
    System.out.println("vovel");
}
else{System.out.print("conso");
}

}

   }
