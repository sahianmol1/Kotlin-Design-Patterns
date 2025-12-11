package com.anmolsahi.designpatterns.creationaldesignpatterns.factory.factorymethoddesignpattern.creator.concretecreator

import com.anmolsahi.designpatterns.creationaldesignpatterns.factory.factorymethoddesignpattern.creator.abstractcreator.PizzaShop
import com.anmolsahi.designpatterns.creationaldesignpatterns.factory.factorymethoddesignpattern.product.abstractproduct.Pizza
import com.anmolsahi.designpatterns.creationaldesignpatterns.factory.factorymethoddesignpattern.product.concreteproduct.ChicagoPepperoniPizza
import com.anmolsahi.designpatterns.creationaldesignpatterns.factory.factorymethoddesignpattern.product.concreteproduct.ChicagoStyleCheesePizza

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
