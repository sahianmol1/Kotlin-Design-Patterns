package com.anmolsahi.designpatterns.creationaldesignpatterns.factory.factorymethoddesignpattern

/**
 * This is a Concrete Creator.
 *
 * Concrete Creators override the factory method to change the resulting product's type.
 * This class is responsible for creating a family of New York style pizzas.
 */
class NyPizzaShop: PizzaShop() {
    /**
     * This is the implementation of the factory method for New York style pizzas.
     *
     * It creates a specific type of pizza from the New York style family based on the `type` parameter.
     */
    override fun createPizza(type: String): Pizza {
        return when (type) {
            "cheese" -> NyStyleCheesePizza()
            "pepperoni" -> NyStylePepperoniPizza()
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
class NyStyleCheesePizza() : Pizza {
    init {
        println("Creating New york style thin crust cheese pizza")
    }
}

/**
 * This is another Concrete Product from the same family.
 */
class NyStylePepperoniPizza() : Pizza {
    init {
        println("Creating New york style thin crust pepperoni pizza")
    }
}
