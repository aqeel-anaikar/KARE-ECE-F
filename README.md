# Java Programming & Data Structures: 18-Day Intensive Syllabus

This repository contains a comprehensive 18-day Java programming course covering core Java concepts and essential data structures and algorithms.

## 📚 Course Overview

| Day | Topic                   | Key Concepts                                               |
|-----|-------------------------|-----------------------------------------------------------|
| 1   | Introduction to Java    | Java basics, program structure, data types, variables      |
| 2   | Operators & Conditionals| Type casting, operators, conditional statements            |
| 3   | Loops & Control Flow    | Looping statements, switch case, jumping statements        |
| 4-6 | Arrays & Patterns       | 1D/2D arrays, array operations, pattern programs           |
| 7   | OOP Fundamentals        | Classes, objects, OOP principles                           |
| 8   | Methods & Constructors  | Static methods, method overloading, constructors           |
| 9   | Advanced OOP            | Inheritance, abstraction, polymorphism, encapsulation      |
| 10  | Exception Handling      | Exception types, try-catch-finally, custom exceptions      |
| 11  | Review & Practice       | Consolidation of previous concepts                         |
| 12  | Collections Framework   | Lists, Sets, Maps, Iterators, Sorting                      |
| 13  | DSA Introduction        | Data structures, complexity analysis, Linked Lists         |
| 14  | Stack & Queue           | Stack/Queue operations, implementations                    |
| 15  | Sorting Algorithms      | Insertion, Selection, Bubble, Merge, Quick Sort            |
| 16  | Searching Algorithms    | Linear, Binary, Fibonacci Search                           |
| 17  | Tree Data Structures    | To be detailed                                             |
| 18  | Graph Data Structures   | To be detailed                                             |

---

## 🗓️ Detailed Syllabus

### Day 1: Introduction to Java

```java
public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello, Java!");
    }
}
```

- What is Java?
- Features of Java
- Java installation and setup
- Writing your first Java program
- Structure of a Java program
- Understanding `main()` method
- Primitive data types (`byte`, `short`, `int`, `long`, `float`, `double`, `char`, `boolean`)
- Declaring and initializing variables
- Constants (using `final` keyword)

### Day 2: Operators & Conditionals

- Type casting (Implicit and Explicit)
- Operators in Java:
  - Arithmetic, Relational, Logical
  - Assignment, Unary, Bitwise
  - Ternary Operator
- Conditional Statements:
  - `if`, `if-else`, `else-if` ladder
  - Nested if statements

### Day 3: Loops & Control Flow

- Looping Statements:
  - `for`, `while`, `do-while` loops
  - Enhanced for loop (`foreach`)
  - Nested loops
- Switch Case:
  - Syntax of `switch` and `case`
  - `default` case
- Jumping Statements:
  - `break` and `continue`
  - Using `break` and `continue` in loops

### Day 4-6: Arrays & Patterns

```java
int[] numbers = {1, 2, 3, 4, 5};
System.out.println(Arrays.toString(numbers));
```

- What is an array?
- Declaring and initializing arrays
- Types of arrays: 1D and 2D
- Accessing and modifying elements
- Iterating through arrays
- Common array operations:
  - Finding max/min elements
  - Sorting arrays
  - Searching (Linear and Binary)
- Array methods:
  - `Arrays.toString()`, `Arrays.sort()`
  - `Arrays.binarySearch()`, `Arrays.copyOf()`
  - `Arrays.fill()`
- Pattern programs:
  - Pyramid and triangle patterns
  - Diamond patterns
  - Reverse patterns
  - Custom patterns

### Day 7: OOP Fundamentals

- Features of OOP:
  - Encapsulation, Inheritance
  - Polymorphism, Abstraction
  - Real-world OOP examples
- Classes and objects:
  - Defining classes
  - Creating and using objects
  - Understanding `this` keyword

### Day 8: Methods & Constructors

- Static methods (usage, syntax)
- Dynamic methods (instance methods)
- Passing arguments to methods
- Method overloading
- Static keyword:
  - Static variables and methods
  - Static blocks
- Constructors:
  - Parameterized and non-parameterized
  - Constructor overloading
  - Default constructor

### Day 9: Advanced OOP

```java
class Animal { void sound() { /* ... */ } }
class Dog extends Animal {
    @Override void sound() { System.out.println("Bark!"); }
}
```

- Inheritance:
  - Types (Single, Multilevel, Hierarchical)
  - Hybrid/Multiple via interfaces
  - `super` keyword
  - Method overriding
- Abstraction:
  - Abstract classes and methods
  - Interfaces vs abstract classes
- Polymorphism:
  - Compile-time (method overloading)
  - Runtime (method overriding)
  - `instanceof` keyword
- Encapsulation:
  - Data hiding
  - Getters and setters
  - Real-world examples

### Day 10: Exception Handling

```java
try {
    // Risky code
} catch (Exception e) {
    // Handle exception
} finally {
    // Cleanup code
}
```

- What are exceptions?
- Exception types:
  - Checked exceptions
  - Unchecked exceptions
- Common exceptions:
  - `NullPointerException`
  - `ArrayIndexOutOfBoundsException`
  - `ArithmeticException`
- Try-catch-finally blocks
- `throw` and `throws` keywords
- Custom exceptions
- Exception propagation

### Day 11: Review & Practice

- Consolidation of Days 1-10 concepts
- Practice problems and Q&A session

### Day 12: Collections Framework

- Introduction to Collections
- Interfaces:
  - List (`ArrayList`, `LinkedList`, `Vector`, `Stack`)
  - Set (`HashSet`, `LinkedHashSet`, `TreeSet`)
  - Map (`HashMap`, `LinkedHashMap`, `TreeMap`)
- Collection classes and operations
- Iterators and enhanced for loops
- Sorting with `Comparator` and `Comparable`
- Common methods (`add`, `remove`, `contains`, `size`)

### Day 13: DSA Introduction & Linked Lists

- What is DSA?
- Importance in problem solving
- Types of data structures:
  - Linear (Array, Linked List, Stack, Queue)
  - Non-linear (Tree, Graph)
- Complexity analysis:
  - Time complexity
  - Space complexity
- Linked Lists:
  - Singly, Doubly, Circular
  - Node creation
  - Insertion operations
  - Deletion operations
  - Traversal

### Day 14: Stack & Queue

- Stack:
  - Operations (`push`, `pop`, `peek`, `isEmpty`)
  - Implementation using nodes
- Queue:
  - Operations (`enqueue`, `dequeue`, `front`, `isEmpty`)
  - Implementation using nodes

### Day 15: Sorting Algorithms

- Sorting fundamentals
- Insertion Sort
- Selection Sort
- Bubble Sort
- Merge Sort
- Quick Sort

### Day 16: Searching Algorithms

- Searching fundamentals
- Linear Search
- Binary Search
- Fibonacci Search

### Day 17: Tree Data Structures

*Details to be added*

### Day 18: Graph Data Structures

*Details to be added*

---

## ⚙️ Getting Started

1. Install Java JDK
2. Set up your preferred IDE (IntelliJ, Eclipse, or VS Code)
3. Clone this repository:
   ```sh
   git clone https://github.com/yourusername/java-course.git
   ```
4. Follow along with daily topics

---

## 🤝 Contribution

Contributions are welcome! Please open an issue or submit a pull request for:

- Additional code examples
- Improved explanations
- Exercises and solutions
- Supplementary learning materials

Happy coding! 🚀
