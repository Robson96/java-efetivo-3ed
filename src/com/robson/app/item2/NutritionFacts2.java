package com.robson.app.item2;

// Padrao Builder | deve ser usado com 4p ou +
public class NutritionFacts2 {
  private final int servingSize;
  private final int serving;
  private final int calories;
  private final int fat;
  private final int sodium;
  private final int carbohydrate;

  public static class Builder {
    // Exige parametros
    private final int servingsSize;
    private final int servings;

    // Parametros opcionais
    private int calories     = 0;
    private int fat          = 0;
    private int sodium       = 0;
    private int carbohydrate = 0;

    public Builder(int servingsSize, int servings) {
      this.servingsSize = servingsSize;
      this.servings = servings;
    }

    public Builder calories(int val) {
      calories = val;
      return this;
    }
    public Builder fat(int val) {
      fat = val;
      return this;
    }
    public Builder sodium(int val) {
      sodium = val;
      return this;
    }
    public Builder caborhydrate(int val) {
      carbohydrate = val;
      return this;
    }

    public NutritionFacts2 build() { return new NutritionFacts2(this);}
  }

  private NutritionFacts2(Builder builder) {
    this.servingSize = builder.servingsSize;
    this.serving = builder.servings;
    this.calories = builder.calories;
    this.fat = builder.fat;
    this.sodium = builder.sodium;
    this.carbohydrate = builder.carbohydrate;
  }

  @Override
  public String toString() {
    return "NutritionFacts2{" +
        "servingSize=" + servingSize +
        ", serving=" + serving +
        ", calories=" + calories +
        ", fat=" + fat +
        ", sodium=" + sodium +
        ", carbohydrate=" + carbohydrate +
        '}';
  }

  public static void main(String[] args) {
    NutritionFacts2 nutritionFacts2 = new Builder(240, 80)
        .calories(10)
        .build();
    System.out.println(nutritionFacts2);
  }
}
