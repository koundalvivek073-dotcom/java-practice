import java.util.Scanner;

public class new2 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
int arr_lenght = sc.nextInt();
int[] arr = new int [arr_lenght];
for(int i = 0; i < arr_lenght; i++){
    arr[i] = sc.nextInt();
    }
    int half = sc.nextInt();
    for(int i =0; i< arr_lenght; i++){
        arr[i] = arr[i * 2 + 1];
        arr[i + half] = arr[i*2];

    System.out.print(arr[i] + " ");
    }
    
}
}

