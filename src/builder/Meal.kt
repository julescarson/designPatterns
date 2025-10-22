package designPatterns.builder

class Meal {
    val items = mutableListOf<Item>()
    fun addItem(item : Item) {
        items.add(item)
    }

    fun getCost() : Float{
        var cost : Float = 0f
        items.forEach { item -> cost += item.price() }
        return cost
    }

    fun showItems() {
        items.forEach { item -> println("Item: ${item.name()}, Price: ${item.price()}, Packing: ${item.packing().pack()}") }
    }
}