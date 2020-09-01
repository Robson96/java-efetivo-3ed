package com.robson.app.item4;

// Classe utilitaria nao instanciavel
public class UtilityClass {
  // Suprima o construtor padrao para nao instanciacao
  private UtilityClass() {
    // Para nao ser usado dentro da classe
    throw new AssertionError();
  }
}
