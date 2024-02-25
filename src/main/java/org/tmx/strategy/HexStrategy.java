package org.tmx.strategy;

import java.math.BigInteger;

public class HexStrategy implements DecodeStrategy{

    @Override
    public byte[] decode(String input) {
        BigInteger decimalValue = new BigInteger(input, getRadix());
        return decimalValue.toByteArray();
    }

    @Override
    public String encode(byte[] byteArray) {
        BigInteger bigInteger = new BigInteger(byteArray);
        return bigInteger.toString(getRadix());
    }

    @Override
    public int getRadix() {
        return 16;
    }

}
