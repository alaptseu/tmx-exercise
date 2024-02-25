package org.tmx.strategy;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

class OctalDecodeStrategyTest {
    private final OctalDecodeStrategy octalDecodeStrategy = new OctalDecodeStrategy();

    @ParameterizedTest
    @CsvFileSource(resources = "/octal.csv", numLinesToSkip = 1)
    public void testDecode(String input, String expected) {
        final byte[] result = octalDecodeStrategy.decode(input);
        assertEquals(expected, Arrays.toString(result));
    }

    @Test
    public void testEncode() {
        String result = octalDecodeStrategy.encode(new byte[]{103, 77, 97});
        assertEquals("31646541", result);
    }

}