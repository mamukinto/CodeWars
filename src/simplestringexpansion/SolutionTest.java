package simplestringexpansion;

import org.junit.Test;
import static org.junit.Assert.assertEquals;


public class SolutionTest{
    @Test
    public void basicTests(){
        assertEquals("ababab",Solution.solve("3(ab)"));
    }
    @Test
    public void test2() {
        assertEquals("abbbabbb",Solution.solve("2(a3(b))"));
    }
    @Test
    public void test3() {
        assertEquals("bccbccbcc",Solution.solve("3(b(2(c)))"));
    }
    @Test
    public void test4() {
        assertEquals("kabaccbaccbacc", Solution.solve("k(a3(b(a2(c))))"));
    }
    @Test
    public void test5() {
        assertEquals("akbabbabbakbabbabb", Solution.solve("2(akb2(a2(b))"));
    }
}