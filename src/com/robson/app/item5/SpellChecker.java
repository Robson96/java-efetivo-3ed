package com.robson.app.item5;

import java.util.List;
import java.util.Objects;

// A injeçao de dependecia proporciona flexibilidade e testabilidade
public class SpellChecker {
  private final Lexico dicionary;

  public SpellChecker(Lexico dicionary) {
    this.dicionary = Objects.requireNonNull(dicionary);
  }

  public boolean isValid(String word) { return true; }
  public List<String> suggestions(String typo) { return List.of(); }
}

class Lexico {
}
