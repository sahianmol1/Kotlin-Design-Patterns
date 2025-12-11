package com.anmolsahi.designpatterns.creationaldesignpatterns.factory.factorymethoddesignpattern

import com.anmolsahi.designpatterns.creationaldesignpatterns.factory.factorymethoddesignpattern.creator.abstractcreator.PizzaShop
import com.anmolsahi.designpatterns.creationaldesignpatterns.factory.factorymethoddesignpattern.creator.concretecreator.CaliforniaPizzaShop
import com.anmolsahi.designpatterns.creationaldesignpatterns.factory.factorymethoddesignpattern.creator.concretecreator.ChicagoPizzaShop
import com.anmolsahi.designpatterns.creationaldesignpatterns.factory.factorymethoddesignpattern.creator.concretecreator.NyPizzaShop

/**
 * This is the client code.
 *
 * The client code works with an instance of a concrete creator, albeit through its base interface.
 * As long as the client keeps working with the creator via the base interface, you can pass it any creator's subclass.
 */
fun main() {
    // Create a New York pizza shop and order a cheese pizza.
    var shop: PizzaShop = NyPizzaShop()
    shop.orderPizza("cheese")

    println("------------")

    // Create a Chicago pizza shop and order a pepperoni pizza.
    shop = ChicagoPizzaShop()
    shop.orderPizza("pepperoni")

    println("------------")

    // Create a California pizza shop and order a pepperoni pizza.
    shop = CaliforniaPizzaShop()
    shop.orderPizza("pepperoni")
}

/**
 * Note: Concrete product should not depend on the concrete creators. That will make the code tightly coupled.
 *
 * With the current implementation, if we want to add a new concrete creator (let's say ItalianPizzaShop) we can do so easily without changing
 * any part of the existing concrete products. #open-close principle
 *
 * If there's any common product, we can create such a product using simple factory in the abstract creator's factory method.
 * To do that we will convert the factory method to "open" and give it a default implementation.
 *
 * Always remember, we should code to interfaces not to implementation.
 */