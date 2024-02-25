package org.tmx;

import java.util.Arrays;
import java.util.Scanner;
import org.tmx.strategy.DecoderContext;
import org.tmx.strategy.OctalDecodeStrategy;

public class Main {

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.print("Enter Octal String : ");
    String input = scan.nextLine();
    System.out.println(
        Arrays.toString(new DecoderContext(new OctalDecodeStrategy()).decodeString(input)));
  }

}