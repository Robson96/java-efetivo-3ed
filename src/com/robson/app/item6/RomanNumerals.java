package com.robson.app.item6;

import java.util.regex.Pattern;

// Reuso do objeto trabalhoso para melhorar o desempenho
public class RomanNumerals {
  private static final Pattern ROMA = Pattern.compile(
    "^(?=.)M*(C[MD]|D?C{0,3})"
    + "(X[CL]|L?X{0,3})(I[XV]|V?I{0,3})$");

  static boolean isRomanNumeral(String s) {
    return ROMA.matcher(s).matches();
  }

  public static void main(String[] args) {
    System.out.println(RomanNumerals.isRomanNumeral("III"));
    System.out.println(RomanNumerals.isRomanNumeral("III.."));
  }
}
