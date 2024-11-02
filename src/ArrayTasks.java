public class ArrayTasks {

    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        int[] grades = {70, 45, 90, 30, 60};
        int target = 2;
        int threshold = 3;

        printArray(numbers);
        System.out.println("Sum: " + sumArray(numbers));
        System.out.println("Even Count: " + countEvens(numbers));
        System.out.println("Largest Number: " + findLargest(numbers));
        System.out.println("Smallest Number: " + findSmallest(numbers));
        reverseArray(numbers);
        System.out.print("Reversed Array: ");
        printArray(numbers);
        checkIfEmpty(new int[]{});
        checkGrades(grades);
        System.out.println("Greater Than Threshold: " + countGreaterThan(numbers, threshold));
        printDivisibleByThree(numbers);
        System.out.println("Occurrences of " + target + ": " + countOccurrences(numbers, target));
        checkAllPositive(numbers);
        categorizeValues(new int[]{10, 20, 50, 100, 200});
        findIndex(numbers, target);
        categorizeEvenOdd(numbers);
    }

    // 1. Print all elements of an array
    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    // 2. Find sum of all elements
    public static int sumArray(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return sum;
    }

    // 3. Count how many numbers are even
    public static int countEvens(int[] array) {
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                count++;
            }
        }
        return count;
    }

    // 4. Find the largest number
    public static int findLargest(int[] array) {
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }

    // 5. Find the smallest number
    public static int findSmallest(int[] array) {
        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        return min;
    }

    // 6. Reverse the elements of the array itself
    public static void reverseArray(int[] array) {
        int left = 0;
        int right = array.length - 1;
        while (left < right) {
            int temp = array[left];
            array[left] = array[right];
            array[right] = temp;
            left++;
            right--;
        }
    }

    // 7. Check if array is empty
    public static void checkIfEmpty(int[] array) {
        if (array.length == 0) {
            System.out.println("Array is empty");
        } else {
            System.out.println("Array is not empty");
        }
    }

    // 8. Print "Pass" or "Fail" for grades
    public static void checkGrades(int[] grades) {
        for (int i = 0; i < grades.length; i++) {
            switch (grades[i] >= 50 ? 1 : 0) {
                case 1:
                    System.out.println(grades[i] + ": Pass");
                    break;
                default:
                    System.out.println(grades[i] + ": Fail");
                    break;
            }
        }
    }

    // 9. Count elements greater than a threshold
    public static int countGreaterThan(int[] array, int threshold) {
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > threshold) {
                count++;
            }
        }
        return count;
    }

    // 10. Print numbers divisible by 3
    public static void printDivisibleByThree(int[] array) {
        System.out.print("Divisible by 3: ");
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 3 == 0) {
                System.out.print(array[i] + " ");
            }
        }
        System.out.println();
    }

    // 11. Count occurrences of a target number
    public static int countOccurrences(int[] array, int target) {
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == target) {
                count++;
            }
        }
        return count;
    }

    // 12. Check if all elements are positive
    public static void checkAllPositive(int[] array) {
        boolean allPositive = true;
        for (int i = 0; i < array.length; i++) {
            if (array[i] <= 0) {
                allPositive = false;
                break;
            }
        }
        System.out.println(allPositive ? "All Positive" : "Not all positive");
    }

    // 13. Categorize values as "small", "medium", or "large"
    public static void categorizeValues(int[] array) {
        for (int i = 0; i < array.length; i++) {
            switch (array[i] / 50) {
                case 0:
                    System.out.println(array[i] + ": Small");
                    break;
                case 1:
                    System.out.println(array[i] + ": Medium");
                    break;
                default:
                    System.out.println(array[i] + ": Large");
                    break;
            }
        }
    }

    // 14. Find index of target value
    public static void findIndex(int[] array, int target) {
        boolean found = false;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == target) {
                System.out.println("Index of target: " + i);
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Not Found");
        }
    }

    // 15. Categorize each element as "Even" or "Odd"
    public static void categorizeEvenOdd(int[] array) {
        for (int i = 0; i < array.length; i++) {
            switch (array[i] % 2) {
                case 0:
                    System.out.println(array[i] + ": Even");
                    break;
                default:
                    System.out.println(array[i] + ": Odd");
                    break;
            }
        }
    }
}