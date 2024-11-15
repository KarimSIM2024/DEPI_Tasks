# HomeWork Task for DEPI 
1. **Difference between static and instance variables**:
    - **Static variables**: Stored once when the class loads. Shared by all objects of the class.
    - **Instance variables**: Each object gets its own copy. Memory is given when an object is created.

2. **What happens to a static variable when a class is loaded**:
    - When a class is loaded into memory, its static variables are created and initialized. This ensures there is only one copy of the static variable shared by all objects of the class.

3. **Why can't a static method access instance variables directly?**
    - A static method belongs to the class itself, not any object. It doesn't know which object's instance variables to access because it runs without creating an object.

4. **Output of the code**:
   ```java
   class Counter {
       static int count = 0;
       Counter() { count++; }
   }

   public class Test {
       public static void main(String[] args) {
           Counter c1 = new Counter();
           Counter c2 = new Counter();
           System.out.println(Counter.count);
       }
   }
   ```
   ***Output***: `2`
    - Explanation: `count` is static, so it is shared by all `Counter` objects. Each time `Counter()` runs, `count` goes up by 1. Two `Counter` objects are created, so `count` becomes 2.

5. **Why use `final` and `static` for constants?**
    - `final` means the value can’t change (a constant).
    - `static` means it belongs to the class, not to any specific object. This way, all objects share the same constant.