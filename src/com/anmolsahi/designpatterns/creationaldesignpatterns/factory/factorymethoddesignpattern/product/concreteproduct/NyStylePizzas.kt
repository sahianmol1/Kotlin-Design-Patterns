package com.anmolsahi.designpatterns.creationaldesignpatterns.factory.factorymethoddesignpattern.product.concreteproduct

import com.anmolsahi.designpatterns.creationaldesignpatterns.factory.factorymethoddesignpattern.product.abstractproduct.Pizza

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
