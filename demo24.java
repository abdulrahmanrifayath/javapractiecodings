import java.util.Scanner;

public class demo24 {
    
    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
    
    // Method to display array
    public static void displayArray(int[] arr) {
        System.out.print("Array: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Get array size from user
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();
        
        // Create array
        int[] arr = new int[size];
        
        // Get array elements from user
        System.out.println("Enter " + size + " elements:");
        for (int i = 0; i < size; i++) {
            System.out.print("Element " + (i + 1) + ": ");
            arr[i] = scanner.nextInt();
        }
        
        // Display original array
        System.out.println("\n--- Original Array ---");
        displayArray(arr);
        
        // Call bubble sort function
        bubbleSort(arr);
        
        // Display sorted array
        System.out.println("\n--- Sorted Array (Bubble Sort) ---");
        displayArray(arr);
        
        scanner.close();
    }
}