package ARRAY;

public class ReverseArrat {
    public static void main(String[] args) {
        int[] arr1 = new int[100];

        // Fill arr1 with values 0 to 99
        for (int i = 0; i < 100; i++) {
            arr1[i] = i;
        }

        int[] arr2 = new int[100];

        // Reverse arr1 into arr2
        for (int i = 0; i < 100; i++) {
            arr2[i] = arr1[99 - i];
        }

        // Print arr1
        System.out.println("Array1:");
        for (int i = 0; i < 100; i++) {
            System.out.println(arr1[i]);
        }

        // Print arr2
        System.out.println("Array2:");
        for (int i = 0; i < 100; i++) {
            System.out.println(arr2[i]);
        }
    }
}
