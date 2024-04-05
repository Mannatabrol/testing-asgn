import java.util.Scanner;

public class peak {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();

        int[] arr = new int[size];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();
        }

        scanner.close();
        int peak = findPeakElement(arr);
        if (peak != -1) {
            System.out.println("Peak element: " + arr[peak]);
        } else {
            System.out.println("No peak element found.");
        }
    }

    public static int findPeakElement(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if ((i == 0 || arr[i] >= arr[i - 1]) && (i == arr.length - 1 || arr[i] >= arr[i + 1])) {
                return i;
            }
        }
        return -1;
    }
}
