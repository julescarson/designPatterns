package designPatterns.builder

fun builderMain() {
    println("Builder Main:")
    val mealBuilder = MealBuilder()
    val vegMeal = mealBuilder.prepareVegMeal()
    println("Veg Meal:")
    vegMeal.showItems()
    println("Total Cost: ${vegMeal.getCost()}")


    val chickenMeal = mealBuilder.prepareChickenMeal()
    println("\nChicken Meal:")
    chickenMeal.showItems()
    println("Total Cost: ${chickenMeal.getCost()}")

    println("-")

}