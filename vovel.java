import java.util.Scanner;
class vovel{
   public static void main(String[] var0){
      String str = "hEllo world";
System.out.print("Vowels in 'hello world': ");
        for (int i = 0; i < str.length(); i++) {
            char ch = Character.toLowerCase(str.charAt(i));
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                System.out.print(ch + " ");
            }
        }
    }
}


   
