package org.tmx.strategy;

public interface DecodeStrategy {

  byte[] decode(String input);

  String encode(byte[] byteArray);

  int getRadix();

}
