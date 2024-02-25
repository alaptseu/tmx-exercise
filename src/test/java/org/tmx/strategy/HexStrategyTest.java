package org.tmx.strategy;

import org.junit.jupiter.api.Test;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class HexStrategyTest {

    private final HexStrategy hexStrategy = new HexStrategy();

    @Test
    public void testDecode() {
        final byte[] result = hexStrategy.decode("1A3");
        assertEquals("[1, -93]", Arrays.toString(result));
    }

    @Test
    public void testEncode() {
        String result = hexStrategy.encode(new byte[]{1, -93});
        assertEquals("1A3", result.toUpperCase());
    }

}