package romannumeralsencoder;

import org.junit.Test;

import static org.junit.Assert.*;

public class ConversionTest {
    @Test
    public void shouldConvertToRoman() {
        assertEquals("solution(1) should equal to I", "I", Conversion.solution(1));
        assertEquals("solution(4) should equal to IV", "IV", Conversion.solution(4));
        assertEquals("solution(6) should equal to VI", "VI", Conversion.solution(6));
    }
}