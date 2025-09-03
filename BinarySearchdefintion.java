//Definition:
//Binary Search is an efficient searching algorithm that works on sorted arrays. It finds the position of a target value (key) by repeatedly dividing the search range into half. The algorithm compares the key with the middle element of the array:
//
//If the middle element is equal to the key → element is found.
//
//If the key is smaller → search continues in the left half of the array.
//
//If the key is larger → search continues in the right half of the array.
//
//This process is repeated until the element is found or the search range becomes empty.
//
//        Requirement: The array must be sorted before applying Binary Search.
//
//        Example:
//Array: {10, 20, 30, 40, 50}, Key: 30
//Middle element = 30 → Found in the first check.
//
//Time Complexity:
//
//Best Case: O(1) → when the key is found at the middle in the first comparison.
//
//Worst Case: O(log₂ n) → when the search space is halved until only one element remains.
//
//Average Case: O(log₂ n)
//
//Space Complexity:
//
//O(1) for iterative method.
//
//O(log n) for recursive method (because of function call stack).
