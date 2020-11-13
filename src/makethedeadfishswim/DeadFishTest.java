package makethedeadfishswim;

import org.junit.Test;

import static org.junit.Assert.*;

public class DeadFishTest {
    @Test
    public void exampleTests() {
        assertArrayEquals(new int[] {8, 64}, DeadFish.parse("iiisdoso"));
        assertArrayEquals(new int[] {8, 64, 3600}, DeadFish.parse("iiisdosodddddiso"));
    }
}