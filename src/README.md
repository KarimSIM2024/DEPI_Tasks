In Java, the `->` and `:` symbols serve different purposes in `switch` statements, especially with the newer "enhanced" switch expressions introduced in Java 12 (standardized in Java 14). Here’s a breakdown of the differences:

### Traditional `switch` with `:`

In the traditional `switch` syntax, the `:` symbol is used to mark each case block. After each case, `break;` is typically needed to prevent fall-through (i.e., prevent the program from executing subsequent cases even if they don’t match).

#### Example

```java
int day = 3;
String dayType;

switch (day) {
    case 1:
    case 7:
        dayType = "Weekend";
        break;
    default:
        dayType = "Weekday";
        break;
}
System.out.println(dayType);
```

### Enhanced `switch` with `->`

The enhanced `switch` expression syntax uses `->` for each case. Each case can either be a single expression or a block. The main advantages of this are:
- **No need for `break;`** — each case is isolated, and there is no risk of fall-through.
- **Can return a value** — `switch` expressions can return a result directly, making them useful in assignments and more concise.

#### Example

```java
int day = 3;
String dayType = switch (day) {
    case 1, 7 -> "Weekend";
    default -> "Weekday";
};
System.out.println(dayType);
```

### Key Differences

| Traditional `switch` (`:`)                     | Enhanced `switch` (`->`)                          |
|------------------------------------------------|---------------------------------------------------|
| Requires `break;` to avoid fall-through.       | Automatically prevents fall-through.              |
| Cannot directly return a value.                | Can return a value directly (useful in assignments). |
| Syntax for multi-statement blocks is less compact. | Allows concise syntax with `->` or block syntax `{ }`. |
| Available in all Java versions.                | Introduced in Java 12 (standard in Java 14+).     |

### When to Use Which Syntax

- Use `->` if you want a concise syntax and are using Java 12+.
- Use `:` for more complex logic where fall-through might be needed (although such cases are rare).