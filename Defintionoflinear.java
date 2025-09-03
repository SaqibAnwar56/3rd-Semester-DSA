//package ARRAY;
//
//public class Defintionoflinear {
//}Definition:
//Linear Search (also called sequential search) is a simple searching algorithm in which each element of the array is compared with the target value (key) one by one until the element is found or the end of the array is reached.
//
//Working:
//
//Start from the first element.
//
//Compare it with the key.
//
//If they match → return the index (element found).
//
//If not, move to the next element.
//
//Repeat until the array ends.
//
//If no match is found → return “not found”.
//
//Example:
//Array: {5, 10, 20, 1, 4}
//Key: 1
//Search starts at index 0 → compares each element → found at index 3.
//
//Time Complexity:
//
//Best Case: O(1) → key found in the first position.
//
//Worst Case: O(n) → key found at the last position or not present at all.
//
//Average Case: O(n) → on average, we search half the elements.
//
//Space Complexity: O(1) → no extra space used except a few variables.
