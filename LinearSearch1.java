package ARRAY;

public class LinearSearch1{

    // Linear search method
    public static int linearSearch(int[] arr, int key) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                return i; // Return index if found
            }
        }
        return -1; // Return -1 if not found
    }

    public static void main(String[] args) {
        int[] arr = {5, 10, 20, 1, 4};
        int key = 1;

        int result = linearSearch(arr, key);

        if (result != -1) {
            System.out.println("Element found at index: " + result);
        } else {
            System.out.println("Element not found");
        }
    }
}

