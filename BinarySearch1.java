package ARRAY;

public class BinarySearch1 {

    // Binary Search method
    public static int binarySearch(int[] arr, int key) {
        int p = 0;                  // start index
        int q = arr.length - 1;     // end index

        while (p <= q) {
            int mid = (p + q) / 2;  // find middle index

            if (arr[mid] == key) {
                return mid; // element found
            }
            else if (arr[mid] < key) {
                p = mid + 1; // search in right half
            }
            else {
                q = mid - 1; // search in left half
            }
        }
        return -1; // element not found
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        int key = 7;

        int result = binarySearch(arr, key);

        if (result != -1) {
            System.out.println("Element found at index: " + result);
        } else {
            System.out.println("Element not found");
        }
    }
}
