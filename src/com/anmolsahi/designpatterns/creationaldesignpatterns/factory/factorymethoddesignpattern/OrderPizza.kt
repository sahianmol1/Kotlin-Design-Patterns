package com.anmolsahi.designpatterns.creationaldesignpatterns.factory.factorymethoddesignpattern

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
}