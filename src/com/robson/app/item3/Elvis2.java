package com.robson.app.item3;

// Padrao Singleton | Fabricaçao estatica
public class Elvis2 {
  private static final Elvis2 INSTANCE = new Elvis2();

  private Elvis2() {}

  public static Elvis2 getInstance() {
    return INSTANCE;
  }

  @Override
  public int hashCode() {
    return super.hashCode();
  }

  @Override
  public boolean equals(Object o) {
    return super.equals(o);
  }

}
