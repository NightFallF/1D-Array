import java.util.Scanner;

public class InArr {
    public static void main(String[] args) {
        Scanner get = new Scanner(System.in);
        System.out.print("Enter the number of elements you want: ");
        int n = get.nextInt();
        get.nextLine();
        String[] arr = new String[n];
        for (int i = 0; i < n; i++) {
            System.out.printf("Enter Array element no.%d: ", i+1);
            arr[i] = get.nextLine();
        }
        System.out.println("\nThe given Array elements are: ");
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i]);
        }
    }
}
