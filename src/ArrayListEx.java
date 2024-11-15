import java.util.ArrayList;
import java.util.HashSet;
import java.util.Collections;

public class ArrayListEx {

    public static void main(String[] args) {
        // 1. Adding elements and displaying the ArrayList
        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Cherry");
        System.out.println("ArrayList contents: " + fruits);

        // 2. Removing element at index 1
        fruits.remove(1);
        System.out.println("After removing element at index 1: " + fruits);

        // 3. Checking if ArrayList contains "Banana"
        boolean containsBanana = fruits.contains("Banana");
        System.out.println("Contains 'Banana': " + containsBanana);

        // 4. Iterating through an ArrayList of integers using enhanced for loop
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        System.out.println("Iterating through numbers:");
        for (int num : numbers) {
            System.out.println(num);
        }

        // 5. Getting the size of an ArrayList
        System.out.println("Size of the ArrayList: " + numbers.size());

        // 6. Clearing all elements from an ArrayList
        numbers.clear();
        System.out.println("After clearing, size of the ArrayList: " + numbers.size());

        // 7. Accessing an out-of-bounds index
        try {
            System.out.println(fruits.get(10));
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Error: " + e.getMessage());
        }

        // 8. Method to return the sum of integers in an ArrayList
        ArrayList<Integer> sumList = new ArrayList<>();
        sumList.add(5);
        sumList.add(10);
        sumList.add(15);
        System.out.println("Sum of the list: " + sum(sumList));

        // 9. Method to find duplicates
        ArrayList<Integer> duplicateList = new ArrayList<>();
        duplicateList.add(1);
        duplicateList.add(2);
        duplicateList.add(2);
        duplicateList.add(3);
        duplicateList.add(3);
        duplicateList.add(4);
        System.out.println("Duplicates: " + findDuplicates(duplicateList));

        // 10. Method to reverse an ArrayList
        ArrayList<String> words = new ArrayList<>();
        words.add("Hello");
        words.add("World");
        words.add("Java");
        System.out.println("Reversed list: " + reverseList(words));

        // 11. Method to find common elements between two ArrayLists
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        list1.add(1); list1.add(2); list1.add(3);
        list2.add(2); list2.add(3); list2.add(4);
        System.out.println("Common elements: " + commonElements(list1, list2));

        // 12. Method to remove even numbers from an ArrayList
        ArrayList<Integer> numberList = new ArrayList<>();
        numberList.add(1); numberList.add(2); numberList.add(3); numberList.add(4);
        removeEvenNumbers(numberList);
        System.out.println("After removing even numbers: " + numberList);

        // 13. Method to find the top n largest elements
        ArrayList<Integer> topList = new ArrayList<>();
        topList.add(5); topList.add(1); topList.add(9); topList.add(3);
        System.out.println("Top 2 largest elements: " + topNLargest(topList, 2));

        // 14. Method to check if a matrix is an identity matrix
        int[][] identityMatrix = {{1, 0, 0}, {0, 1, 0}, {0, 0, 1}};
        System.out.println("Is identity matrix: " + isIdentityMatrix(identityMatrix));

        // 15. Method to rotate a matrix 90 degrees clockwise
        int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int[][] rotatedMatrix = rotateMatrix(matrix);
        System.out.println("Rotated Matrix:");
        for (int[] row : rotatedMatrix) {
            for (int elem : row) {
                System.out.print(elem + " ");
            }
            System.out.println();
        }
    }

    // 8. Method to sum integers in an ArrayList
    public static int sum(ArrayList<Integer> list) {
        int total = 0;
        for (int num : list) {
            total += num;
        }
        return total;
    }

    // 9. Method to find duplicates in an ArrayList
    public static ArrayList<Integer> findDuplicates(ArrayList<Integer> list) {
        HashSet<Integer> seen = new HashSet<>();
        HashSet<Integer> duplicates = new HashSet<>();
        for (int num : list) {
            if (!seen.add(num)) {
                duplicates.add(num);
            }
        }
        return new ArrayList<>(duplicates);
    }

    // 10. Method to reverse an ArrayList
    public static ArrayList<String> reverseList(ArrayList<String> list) {
        ArrayList<String> reversedList = new ArrayList<>(list);
        Collections.reverse(reversedList);
        return reversedList;
    }

    // 11. Method to find common elements between two ArrayLists
    public static ArrayList<Integer> commonElements(ArrayList<Integer> list1, ArrayList<Integer> list2) {
        ArrayList<Integer> common = new ArrayList<>();
        HashSet<Integer> set1 = new HashSet<>(list1);
        for (int num : list2) {
            if (set1.contains(num)) {
                common.add(num);
            }
        }
        return common;
    }

    // 12. Method to remove even numbers from an ArrayList
    public static void removeEvenNumbers(ArrayList<Integer> list) {
        list.removeIf(num -> num % 2 == 0);
    }

    // 13. Method to find top n largest elements in an ArrayList
    public static ArrayList<Integer> topNLargest(ArrayList<Integer> list, int n) {
        ArrayList<Integer> sortedList = new ArrayList<>(list);
        Collections.sort(sortedList, Collections.reverseOrder());
        return new ArrayList<>(sortedList.subList(0, n));
    }

    // 14. Method to check if a matrix is an identity matrix
    public static boolean isIdentityMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (i == j && matrix[i][j] != 1) return false;
                if (i != j && matrix[i][j] != 0) return false;
            }
        }
        return true;
    }

    // 15. Method to rotate a matrix 90 degrees clockwise
    public static int[][] rotateMatrix(int[][] matrix) {
        int n = matrix.length;
        int[][] rotated = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                rotated[j][n - 1 - i] = matrix[i][j];
            }
        }
        return rotated;
    }
}