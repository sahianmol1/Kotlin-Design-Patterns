package com.anmolsahi.designpatterns.creationaldesignpatterns.factory.factorymethoddesignpattern.product.concreteproduct

import com.anmolsahi.designpatterns.creationaldesignpatterns.factory.factorymethoddesignpattern.product.abstractproduct.Pizza

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