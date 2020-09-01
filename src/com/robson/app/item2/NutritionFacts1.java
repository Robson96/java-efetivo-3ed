package com.robson.app.item2;

// Padrao telescoping construtor - nao é escalavel
public class NutritionFacts1 {
  public final int servingSize;
  public final int serving;
  public final int calories;
  public final int fat;
  public final int sodium;
  public final int carbohydrate;

  public NutritionFacts1(int servingSize, int serving) {
    this(servingSize, serving, 0);
  }

  public NutritionFacts1(int servingSize, int serving, int calories) {
    this(servingSize, serving, calories, 0);
  }

  public NutritionFacts1(int servingSize, int serving, int calories, int fat) {
    this(servingSize, serving, calories, fat, 0);
  }

  public NutritionFacts1(int servingSize, int serving, int calories, int fat, int sodium) {
    this(servingSize, serving, calories, fat, sodium, 0);
  }

  public NutritionFacts1(int servingSize, int serving, int calories, int fat, int sodium, int carbohydrate) {
    this.servingSize = servingSize;
    this.serving = serving;
    this.calories = calories;
    this.fat = fat;
    this.sodium = sodium;
    this.carbohydrate = carbohydrate;
  }

  public static void main(String[] args) {
    NutritionFacts1 nutritionFacts1 =
        new NutritionFacts1(240, 8, 100, 0, 35, 27);
    System.out.println(nutritionFacts1.calories);
  }

}
