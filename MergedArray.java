package ARRAY;

public class MergedArray{
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3};
        int[] arr2 = {4, 5, 6};

        int[] merged = new int[arr1.length + arr2.length];

        // Copy arr1 into merged
        for (int i = 0; i < arr1.length; i++) {
            merged[i] = arr1[i];
        }

        // Copy arr2 into merged
        for (int i = 0; i < arr2.length; i++) {
            merged[arr1.length + i] = arr2[i];
        }

        // Print merged array
        System.out.println("Merged Array:");
        for (int num : merged) {
            System.out.print(num + " ");
        }
    }
}
