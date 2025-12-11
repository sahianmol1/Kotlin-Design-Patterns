package com.anmolsahi.designpatterns.creationaldesignpatterns.factory.factorymethoddesignpattern.creator.concretecreator

import com.anmolsahi.designpatterns.creationaldesignpatterns.factory.factorymethoddesignpattern.creator.abstractcreator.PizzaShop
import com.anmolsahi.designpatterns.creationaldesignpatterns.factory.factorymethoddesignpattern.product.abstractproduct.Pizza
import com.anmolsahi.designpatterns.creationaldesignpatterns.factory.factorymethoddesignpattern.product.concreteproduct.CaliforniaStyleCheesePizza
import com.anmolsahi.designpatterns.creationaldesignpatterns.factory.factorymethoddesignpattern.product.concreteproduct.CaliforniaStylePepperoniPizza

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
