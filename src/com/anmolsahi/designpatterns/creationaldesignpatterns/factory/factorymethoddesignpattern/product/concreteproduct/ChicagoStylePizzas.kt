package com.anmolsahi.designpatterns.creationaldesignpatterns.factory.factorymethoddesignpattern.product.concreteproduct

import com.anmolsahi.designpatterns.creationaldesignpatterns.factory.factorymethoddesignpattern.product.abstractproduct.Pizza

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