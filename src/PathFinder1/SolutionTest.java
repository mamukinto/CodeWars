package PathFinder1;

import org.junit.Test;

import org.junit.runners.JUnit4;

import static org.junit.Assert.*;

// TODO: Replace examples and use TDD development by writing your own tests

public class SolutionTest {

    @Test public void sampleTests() {

        String a = ".W.\n"+
                ".W.\n"+
                "...",

                b = ".W.\n"+
                        ".W.\n"+
                        "W..",

                c = "......\n"+
                        "......\n"+
                        "......\n"+
                        "......\n"+
                        "......\n"+
                        "......",

                d = "......\n"+
                        "......\n"+
                        "......\n"+
                        "......\n"+
                        ".....W\n"+
                        "....W.";

//        assertTrue(Solution.pathFinder(a));
        assertFalse(Solution.pathFinder(b));
        assertTrue(Solution.pathFinder(c));
        assertFalse(Solution.pathFinder(d));
    }
}

