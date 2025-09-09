# 2D Matrix Search Concepts

When working with **2D arrays (matrices)**, searching for an element depends on whether the matrix is **sorted** or **unsorted**.  
This guide explains both cases with approaches and examples.

---

## 📌 Case 1: Sorted 2D Matrix

If the rows and columns of the matrix are sorted, we can use optimized searching techniques.

### ✅ Approaches:
1. **Binary Search**
   - Treat the matrix as a flattened 1D array.
   - Apply binary search to find the element.
   - **Time Complexity:** `O(log(mn))`  

2. **Staircase Search**
   - Start from the **top-right** or **bottom-left** corner.
   - Move left if the current element is larger than the target.
   - Move down if the current element is smaller than the target.
   - **Time Complexity:** `O(m + n)`

---

## 📌 Case 2: Unsorted 2D Matrix

If the matrix is **not sorted**, we cannot apply binary search or staircase search.

### ✅ Approaches:
1. **Brute Force (Linear Search)**
   - Traverse each element of the matrix.
   - Check if it matches the target.
   - **Time Complexity:** `O(m × n)`

   ```java
   public class SearchMatrix {
       public static boolean search(int[][] matrix, int target) {
           for (int i = 0; i < matrix.length; i++) {
               for (int j = 0; j < matrix[i].length; j++) {
                   if (matrix[i][j] == target) {
                       return true; // found
                   }
               }
           }
           return false; // not found
       }

       public static void main(String[] args) {
           int[][] matrix = {
               {10, 5, 8},
               {2, 9, 4},
               {7, 6, 3}
           };
           System.out.println(search(matrix, 9));  // true
           System.out.println(search(matrix, 11)); // false
       }
   }
