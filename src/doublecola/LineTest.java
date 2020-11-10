package doublecola;

import org.junit.Test;

import static org.junit.Assert.*;

public class LineTest {
    @Test
    public void test1() {
        String[] names = new String[] { "Sheldon", "Leonard", "Penny", "Rajesh", "Howard" };
        int n = 1;
        new Line();
        assertEquals("Sheldon", Line.whoIsNext(names, n));
    }
    @Test
    public void test2() {
        String[] names = new String[] { "Sheldon", "Leonard", "Penny", "Rajesh", "Howard" };
        int n = 6;
        new Line();
        assertEquals("Sheldon", Line.whoIsNext(names, n));
    }
}