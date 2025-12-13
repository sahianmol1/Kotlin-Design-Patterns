package com.anmolsahi.designpatterns.creationaldesignpatterns.factory.factorymethoddesignpattern.example_pizzafactory.product.abstractproduct

/**
 * This is the Product interface.
 *
 * In the Factory Method pattern, the Product is the interface for a family of objects that the factory method creates.
 * All concrete products, which are part of this family, must implement this interface.
 */
interface Pizza {
    fun prepare() {
        println("Preparing pizza")
    }

    fun bake() {
        println("Baking pizza")
    }

    fun cut() {
        println("Cutting pizza")
    }

    fun box() {
        println("Boxing pizza")
    }
}