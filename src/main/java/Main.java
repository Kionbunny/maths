
    // src/main/java/org/example/Main.java
package org.example;

    public class Main {
        public static void main(String[] args) {
            Addition addition = new Addition();
            Subtraction subtraction = new Subtraction();

            int sum = addition.add(10, 5);
            int diff = subtraction.subtract(10, 5);

            System.out.println("Sum: " + sum);
            System.out.println("Difference: " + diff);
        }
    }
    
