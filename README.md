

---

# Java Lambda Expressions — Simple Example

## Description

This project demonstrates the usage of **lambda expressions** in Java, focusing on the `BiConsumer` functional interface. It provides a simple example of how to use lambda syntax for concise and readable code.

## Features

* Uses Java 8 lambda expression syntax `(parameters) -> { body }`.
* Implements a `BiConsumer<Integer, Integer>` to add two integers and print the result.
* Demonstrates functional programming style with built-in functional interfaces.

## Code Structure

* `lambda` class: Contains the `main` method where a lambda expression is assigned to a `BiConsumer` and executed.

## How to Run

1. Compile the class:

   ```bash
   javac Concepts/LambdaExpressions/lambda.java
   ```

2. Run the program:

   ```bash
   java Concepts.LambdaExpressions.lambda
   ```

3. Expected output:

   ```
   30
   ```

## Requirements

* Java JDK 8 or above (supports lambda expressions)
* Basic understanding of functional interfaces and lambda syntax

## Notes

* Lambda expressions enable more concise and readable code, especially for simple operations.
* `BiConsumer` is a functional interface that takes two input arguments and returns no result.

---
