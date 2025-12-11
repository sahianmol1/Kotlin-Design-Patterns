package com.anmolsahi.designpatterns.creationaldesignpatterns.factory.factorymethoddesignpattern

/**
 * This is another Concrete Creator.
 *
 * This class is responsible for creating a family of California style pizzas.
 */
class CaliforniaPizzaShop: PizzaShop() {
    /**
     * This is the implementation of the factory method for California style pizzas.
     *
     * It creates a specific type of pizza from the California style family based on the `type` parameter.
     */
    override fun createPizza(type: String): Pizza {
        return when (type) {
            "cheese" -> CaliforniaStyleCheesePizza()
            "pepperoni" -> CaliforniaStylePepperoniPizza()
            else -> throw IllegalArgumentException("Unknown pizza type: $type")
        }
    }
}

/**
 * This is a Concrete Product.
 *
 * Concrete Products are various implementations of the Product interface.
 * These are the objects that belong to a specific family and are created by the factory method.
 */
class CaliforniaStyleCheesePizza() : Pizza {
    init {
        println("Creating California style cheese pizza")
    }
}

/**
 * This is another Concrete Product from the same family.
 */
class CaliforniaStylePepperoniPizza() : Pizza {
    init {
        println("Creating California style pepperoni pizza")
    }
}