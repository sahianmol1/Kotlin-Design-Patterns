package com.anmolsahi.designpatterns.creationaldesignpatterns.factory.factorymethoddesignpattern.creator.abstractcreator

import com.anmolsahi.designpatterns.creationaldesignpatterns.factory.factorymethoddesignpattern.product.abstractproduct.Pizza

/**
 * This is the Creator abstract class.
 *
 * In the Factory Method pattern, the Creator declares the factory method that returns an object of a Product class.
 * The Creator can also provide a default implementation of the factory method.
 *
 * This class contains a method `orderPizza` that uses the factory method `createPizza` to get a pizza object.
 * The actual creation of the pizza, which belongs to a family of related products, is deferred to the subclasses.
 */
abstract class PizzaShop {
    fun orderPizza(type: String) {
        val pizza = createPizza(type)
        pizza.prepare()
        pizza.bake()
        pizza.cut()
        pizza.box()
    }

    /**
     * This is the factory method.
     *
     * Subclasses of PizzaShop will override this method to create specific types of pizzas from the same family.
     * This allows the `orderPizza` method to be independent of the concrete classes of pizzas it needs to instantiate.
     */
    protected abstract fun createPizza(type: String): Pizza

}