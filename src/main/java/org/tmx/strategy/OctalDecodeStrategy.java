package org.tmx.strategy;


import java.math.BigInteger;

public class OctalDecodeStrategy implements DecodeStrategy {

  @Override
  public byte[] decode(String input) {
    BigInteger decimalValue = new BigInteger(input, getRadix());
    return convertDecimalToByteArray(decimalValue);
  }

  public byte[] convertDecimalToByteArray(BigInteger decimalValue) {
    byte[] byteArray = decimalValue.toByteArray();
    if (byteArray[0] == 0) {
      byte[] trimmedArray = new byte[byteArray.length - 1];
      System.arraycopy(byteArray, 1, trimmedArray, 0, trimmedArray.length);
      byteArray = trimmedArray;
    }
    return byteArray;
  }

  @Override
  public String encode(byte[] byteArray) {
    BigInteger bigInteger = new BigInteger(byteArray);
    return bigInteger.toString(getRadix());
  }

  @Override
  public int getRadix() {
    return 8;
  }

}
