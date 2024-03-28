package Feb26;
import java.util.Scanner;
        class MyClass {
            private int value;

            // Constructor
            public MyClass(int value) {
                this.value = value;
            }

            // Getter and Setter
            public int getValue() {
                return value;
            }

            public void setValue(int value) {
                this.value = value;
            }

            // Shallow comparison
            public boolean shallowCompare(MyClass other) {
                // Check if references are equal
                if (this == other) {
                    return true;
                }

                // Check if other object is null
                if (other == null) {
                    return false;
                }

                // Check if objects are of the same class
                if (getClass() != other.getClass()) {
                    return false;
                }

                // Perform shallow comparison based on object fields
                return this.value == other.value;
            }

            // Deep comparison
            public boolean deepCompare(MyClass other) {
                // Perform deep comparison based on object fields
                // Here we just compare the 'value' field for demonstration
                return this.value == other.value;
            }

            // Main method for testing
            public static void main(String[] args) {
                MyClass obj1 = new MyClass(10);
                MyClass obj2 = new MyClass(10);
                MyClass obj3 = new MyClass(20);

                // Shallow comparison
                System.out.println("Shallow comparison:");
                System.out.println("obj1 vs obj2: " + obj1.shallowCompare(obj2)); // true
                System.out.println("obj1 vs obj3: " + obj1.shallowCompare(obj3)); // false

                // Deep comparison
                System.out.println("Deep comparison:");
                System.out.println("obj1 vs obj2: " + obj1.deepCompare(obj2)); // true
                System.out.println("obj1 vs obj3: " + obj1.deepCompare(obj3)); // false
            }
        }
