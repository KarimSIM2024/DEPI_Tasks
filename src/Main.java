public class Main {
    public static void main(String[] args) {
        //! This is my Task_1 Submission code for DEPI
        //1. Write a Java program to calculate the area of a rectangle given width = 7 and height = 5. Use multiplication to find the area.
        int width = 7;
        int height = 5;
        int area = width * height;
        System.out.println("Area of the rectangle: " + area);

        /*2. What will be the output of the following code?
        int x = 5;
        System.out.println(x++);
        System.out.println(++x);*/

        int x = 5;
        System.out.println(x++);
        System.out.println(++x);

        //3. Given int a = 17 and int b = 4, use the modulus operator to find the remainder of a divided by b.
        int a = 17;
        int b = 4;
        int remainder = a % b;
        System.out.println("Remainder of a divided by b: " + remainder);

        //4. Use the ternary operator to check if a number is positive or negative. Set int num = -10.
        int num = -10;
        String result = (num >= 0) ? "Positive" : "Negative";
        System.out.println("The number is: " + result);

//        5. Write a program to check if two numbers, int a = 5 and int b = 8, are equal using the == operator.
        a = 5;
        b = 8;
        if (a == b) {
            System.out.println("The numbers are equal.");
        } else {
            System.out.println("The numbers are not equal.");
        }

//        6. Write a program that checks if int age = 25 is between 18 and 30 using logical AND (&&).
        int age = 25;
        if (age >= 18 && age <= 30) {
            System.out.println("Age is between 18 and 30.");
        } else {
            System.out.println("Age is not between 18 and 30.");
        }

//        7. Given int score = 95, check if score is either above 90 or below 50 using logical OR (||).
        int score = 95;
        if (score > 90 || score < 50) {
            System.out.println("Score is either above 90 or below 50.");
        } else {
            System.out.println("Score is between 50 and 90.");
        }

//        8. Reverse a boolean value using the logical NOT (!) operator. Given boolean isAvailable = true, print the opposite.
        boolean isAvailable = true;
        System.out.println("Opposite of isAvailable: " + !isAvailable);

//        9. Divide int x = 50 by int y = 3 and print the quotient and remainder.
        x = 50;
        int y = 3;
        int quotient = x / y;
        remainder = x % y;
        System.out.println("Quotient: " + quotient);
        System.out.println("Remainder: " + remainder);

//        10. Calculate the expression 5 + 3 * 2 and then override the precedence using parentheses (5 + 3) * 2.
        int result1 = 5 + 3 * 2;
        int result2 = (5 + 3) * 2;
        System.out.println("Result without parentheses: " + result1);
        System.out.println("Result with parentheses: " + result2);

//        11. Use the subtraction assignment operator to decrement a variable by a certain value. Set int num = 10 and subtract 3 from it.
        num = 10;
        num -= 3;
        System.out.println("Result after decrementing by 3: " + num);

//        12. Write a program to compare int a = 20 and int b = 15 and print if a is greater than, equal to, or less than b.
        a = 20;
        b = 15;
        if (a > b) {
            System.out.println("a is greater than b.");
        } else if (a == b) {
            System.out.println("a is equal to b.");
        } else {
            System.out.println("a is less than b.");
        }

//        13.  Given int x = 10, use x += 5 and x *= 2 and print the result after each operation.
        x = 10;
        x += 5;
        System.out.println("Result after x += 5: " + x);  // Output: 15
        x *= 2;
        System.out.println("Result after x *= 2: " + x);  // Output: 30

//        14. Write a program that checks if int score = 85 is a passing score (greater than or equal to 60) using a ternary operator.
        score = 85;
        String res = (score >= 60) ? "Passing score" : "Failing score";
        System.out.println("The score is: " + res);

    }
}
