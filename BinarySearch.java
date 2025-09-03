package ARRAY;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int key = 7;
        int p = 0;
        int q = arr.length - 1;
        boolean found = false;
        while (p <= q) {
            int mid = (p + q) / 2;
            if (arr[mid] == key) {
                System.out.println("Element found at index:" + mid);
                found = true;
                break;
            } else if (arr[mid] < key) {
                p = mid + 1;
            } else {
                q = mid - 1;
            }
        }
            if (!found) {
                System.out.println("Element not found");
            }
        }
    }

