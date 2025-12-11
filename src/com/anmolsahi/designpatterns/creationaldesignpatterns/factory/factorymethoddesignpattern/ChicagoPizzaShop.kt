package com.anmolsahi.designpatterns.creationaldesignpatterns.factory.factorymethoddesignpattern

/**
 * This is another Concrete Creator.
 *
 * This class is responsible for creating a family of Chicago style pizzas.
 */
class ChicagoPizzaShop: PizzaShop() {
    /**
     * This is the implementation of the factory method for Chicago style pizzas.
     *
     * It creates a specific type of pizza from the Chicago style family based on the `type` parameter.
     */
    override fun createPizza(type: String): Pizza {
        return when (type) {
            "cheese" -> ChicagoStyleCheesePizza()
            "pepperoni" -> ChicagoPepperoniPizza()
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
class ChicagoStyleCheesePizza() : Pizza {
    init {
        println("Creating Chicago style deep dish cheese pizza")
    }
}

/**
 * This is another Concrete Product from the same family.
 */
class ChicagoPepperoniPizza() : Pizza {
    init {
        println("Creating Chicago style deep dish pepperoni pizza")
    }
}