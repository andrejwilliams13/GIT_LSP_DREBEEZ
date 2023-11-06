// Andre Williams Assignment 5

package org.howard.edu.lsp.assignment5;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.howard.edu.lsp.assignment5.IntegerSetException; 


public class IntegerSetTest {
    private IntegerSet integerSet;

    @BeforeEach
    public void setUp() {
        integerSet = new IntegerSet();
    }

    @Test
    @DisplayName("Test case for clear")
    public void testClear() {
        integerSet.add(5);
        integerSet.clear();
        assertEquals(0, integerSet.length());
    }

    @Test
    @DisplayName("Test case for length")
    public void testLength() {
        integerSet.add(5);
        integerSet.add(10);
        assertEquals(2, integerSet.length());
    }

    @Test
    @DisplayName("Test case for equals")
    public void testEquals() {
        IntegerSet otherSet = new IntegerSet();
        integerSet.add(5);
        otherSet.add(5);
        assertTrue(integerSet.equals(otherSet));
    }

    @Test
    @DisplayName("Test case for contains")
    public void testContains() {
        integerSet.add(5);
        assertTrue(integerSet.contains(5));
        assertFalse(integerSet.contains(10));
    }

    @Test
    @DisplayName("Test case for largest")
    public void testLargest() {
        integerSet.add(5);
        integerSet.add(10);
        assertEquals(10, integerSet.largest());
    }

    @Test
    @DisplayName("Test case for smallest")
    public void testSmallest() {
        integerSet.add(5);
        integerSet.add(10);
        assertEquals(5, integerSet.smallest());
    }

    @Test
    @DisplayName("Test case for add")
    public void testAdd() {
        integerSet.add(5);
        integerSet.add(5); // Adding the same value again should have no effect
        assertEquals(1, integerSet.length());
    }

    @Test
    @DisplayName("Test case for remove")
    public void testRemove() {
        integerSet.add(5);
        integerSet.remove(5);
        assertEquals(0, integerSet.length());
    }

    @Test
    @DisplayName("Test case for union")
    public void testUnion() {
        IntegerSet otherSet = new IntegerSet();
        integerSet.add(5);
        otherSet.add(10);
        integerSet.union(otherSet);
        assertTrue(integerSet.contains(5) && integerSet.contains(10));
    }

    @Test
    @DisplayName("Test case for intersect")
    public void testIntersect() {
        IntegerSet otherSet = new IntegerSet();
        integerSet.add(5);
        integerSet.add(10);
        otherSet.add(10);
        integerSet.intersect(otherSet);
        assertTrue(integerSet.contains(10) && !integerSet.contains(5));
    }

    @Test
    @DisplayName("Test case for diff")
    public void testDiff() {
        IntegerSet otherSet = new IntegerSet();
        integerSet.add(5);
        integerSet.add(10);
        otherSet.add(10);
        integerSet.diff(otherSet);
        assertTrue(integerSet.contains(5) && !integerSet.contains(10));
    }

    @Test
    @DisplayName("Test case for complement")
    public void testComplement() {
        IntegerSet otherSet = new IntegerSet();
        integerSet.add(5);
        otherSet.add(5);
        integerSet.complement(otherSet);
        assertTrue(integerSet.isEmpty());
    }

    @Test
    @DisplayName("Test case for isEmpty")
    public void testIsEmpty() {
        assertTrue(integerSet.isEmpty());
        integerSet.add(5);
        assertFalse(integerSet.isEmpty());
    }
    
    @Test
    @DisplayName("Test case for toString")
    public void testToString() {
        integerSet.add(5);
        integerSet.add(10);
        assertEquals("[5, 10]", integerSet.toString());
    }

    @Test
    @DisplayName("Test case for largest exception")
    public void testLargestException() {
        assertThrows(IntegerSetException.class, () -> integerSet.largest());
    }

    @Test
    @DisplayName("Test case for smallest exception")
    public void testSmallestException() {
        assertThrows(IntegerSetException.class, () -> integerSet.smallest());
    }
}
