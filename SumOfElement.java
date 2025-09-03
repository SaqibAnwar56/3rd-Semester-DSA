package ARRAY;

public class SumOfElement {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i]; // Add current element to sum
        }

        System.out.println("Sum of elements: " + sum);
    }
}

