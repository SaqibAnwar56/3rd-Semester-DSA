package ARRAY;

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {5, 10, 20, 1, 4};
        int key = 1;
        boolean found = false;

        for (int i = 0; i < arr.length; i++) {
            if (key == arr[i]) {
                System.out.println("The element is found at index: " + i);
                found = true;
                break; // stop searching
            }
        }

        if (!found) {
            System.out.println("Element not found");
        }
    }
}
