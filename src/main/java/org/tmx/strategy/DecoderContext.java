package org.tmx.strategy;

public class DecoderContext {

  private final DecodeStrategy strategy;

  public DecoderContext(DecodeStrategy strategy) {
    this.strategy = strategy;
  }

  public byte[] decodeString(String input) {
    return strategy.decode(input);
  }

}
