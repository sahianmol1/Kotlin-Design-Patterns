package com.anmolsahi.designpatterns.creationaldesignpatterns.factory.factorymethoddesignpattern.example_pizzafactory.creator.concretecreator

import com.anmolsahi.designpatterns.creationaldesignpatterns.factory.factorymethoddesignpattern.example_pizzafactory.creator.abstractcreator.PizzaShop
import com.anmolsahi.designpatterns.creationaldesignpatterns.factory.factorymethoddesignpattern.example_pizzafactory.product.abstractproduct.Pizza
import com.anmolsahi.designpatterns.creationaldesignpatterns.factory.factorymethoddesignpattern.example_pizzafactory.product.concreteproduct.NyStyleCheesePizza
import com.anmolsahi.designpatterns.creationaldesignpatterns.factory.factorymethoddesignpattern.example_pizzafactory.product.concreteproduct.NyStylePepperoniPizza

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
