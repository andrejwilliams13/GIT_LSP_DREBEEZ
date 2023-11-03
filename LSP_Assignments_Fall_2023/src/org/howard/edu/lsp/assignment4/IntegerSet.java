// Andre Williams Assignment 4

package org.howard.edu.lsp.assignment4;

import java.util.ArrayList;
import java.util.List;

public class IntegerSet {
    private List<Integer> set = new ArrayList<Integer>();

    public IntegerSet() {
    }

    public IntegerSet(ArrayList<Integer> set) {
        this.set = set;
    }

    public void clear() {
        set.clear();
    }

    public int length() {
        return set.size();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        IntegerSet otherSet = (IntegerSet) o;
        return set.containsAll(otherSet.set) && otherSet.set.containsAll(set);
    }

    public boolean contains(int value) {
        return set.contains(value);
    }

    public int largest() {
        if (set.isEmpty()) {
            throw new RuntimeException("Set is empty");
        }
        int largest = set.get(0);
        for (int value : set) {
            if (value > largest) {
                largest = value;
            }
        }
        return largest;
    }

    public int smallest() {
        if (set.isEmpty()) {
            throw new RuntimeException("Set is empty");
        }
        int smallest = set.get(0);
        for (int value : set) {
            if (value < smallest) {
                smallest = value;
            }
        }
        return smallest;
    }

    public void add(int item) {
        if (!set.contains(item)) {
            set.add(item);
        }
    }

    public void remove(int item) {
        set.remove((Integer) item);
    }

    public void union(IntegerSet intSetb) {
        for (int value : intSetb.set) {
            if (!set.contains(value)) {
                set.add(value);
            }
        }
    }

    public void intersect(IntegerSet intSetb) {
        set.retainAll(intSetb.set);
    }

    public void diff(IntegerSet intSetb) {
        set.removeAll(intSetb.set);
    }

    public void complement(IntegerSet intSetb) {
        List<Integer> complement = new ArrayList<>();
        for (int value : intSetb.set) {
            if (!set.contains(value)) {
                complement.add(value);
            }
        }
        set = complement;
    }

    public boolean isEmpty() {
        return set.isEmpty();
    }

    @Override
    public String toString() {
        return set.toString();
    }
}
