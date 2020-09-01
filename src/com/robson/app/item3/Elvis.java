package com.robson.app.item3;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

// Padrao Singleton | Com o campo Final publico
public class Elvis {
  public static final Elvis INSTANCE = new Elvis();
  private Elvis() {}

  @Override
  public int hashCode() {
    return super.hashCode();
  }

  @Override
  public boolean equals(Object o) {
    return super.equals(o);
  }

}

// Ataque via Reflection
class Main {
  public static void main(String[] args) throws IllegalAccessException, InvocationTargetException, InstantiationException {
    Constructor[] constructor = Elvis.class.getDeclaredConstructors();
    constructor[0].setAccessible(true);
    final Elvis elvis = (Elvis) constructor[0].newInstance();
    System.out.println(elvis.hashCode());
    System.out.println(Elvis.INSTANCE.hashCode());
  }
}
