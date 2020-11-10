package triangulartreasure;

import org.junit.Test;

import static org.junit.Assert.*;

public class TriangularTest {
    @Test
    public void test_Two_Should_Be_Three() throws Exception {
        assertEquals(21, Triangular.triangular(6));
    }

    @Test
    public void test_Four_Should_Be_Ten() throws Exception {
        assertEquals(10, Triangular.triangular(4));
    }

}