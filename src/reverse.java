import java.util.Scanner;

public class reverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int n = sc.nextInt();
        int a[] = new int[n];
        System.out.println("Enter the array elements:");
        for(int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }
        System.out.println(" The Reversed array is :");
        for(int i = a.length - 1; i >= 0; i--) {
            System.out.print(a[i] + " ");
        }
        // Close the Scanner to prevent resource leak
        sc.close();
    }
}
