//Andre Williams Assignment 4
package org.howard.edu.lsp.assignment4;

public class Driver {
    public static void main(String[] args) {
        IntegerSet set1 = new IntegerSet();
        set1.add(1);
        set1.add(2);
        set1.add(3);

        System.out.println("Value of Set 1 is: " + set1.toString());
        System.out.println("Smallest value in Set 1 is: " + set1.smallest());
        System.out.println("Largest value in Set 1 is: " + set1.largest());

        IntegerSet set2 = new IntegerSet();
        set2.add(4);
        set2.add(5);

        System.out.println("Union of Set 1 and Set2");
        System.out.println("Value of Set 1 is: " + set1.toString());
        System.out.println("Value of Set 2 is: " + set2.toString());
        set1.union(set2);
        System.out.println("Result of union of Set 1 and Set 2: " + set1.toString());
    }
}

