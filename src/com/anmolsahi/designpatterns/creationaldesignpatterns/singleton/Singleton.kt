package com.anmolsahi.designpatterns.creationaldesignpatterns.singleton

import kotlin.IndexOutOfBoundsException
import kotlin.NoSuchElementException

/**
 * [EmptyStringList] is a singleton object.
 *
 * In Kotlin, use "object" keyword to create a singleton.
 * Singletons created in this way comes with the following benefits:
 *
 * Single instance - No need for private constructors. "object" ensures no new instance of this object can be created.
 * Lazy initialization - Compiler will create the object only when it is needed, not when the program starts.
 *
 * Note: We need to handle shared mutable states/properties in the Kotlin objects by ourselves using @Volatile annotation and synchronized code block by ourselves.
 *
 */
object EmptyStringList : List<String> {
    override val size: Int
        get() = 0

    override fun isEmpty(): Boolean = true

    override fun contains(element: String): Boolean = false

    override fun iterator(): Iterator<String> = SingletonEmptyIterator

    override fun containsAll(elements: Collection<String>): Boolean = elements.isEmpty()

    override fun get(index: Int): String =
        throw IndexOutOfBoundsException("Empty list doesn't contain element at index $index.")

    override fun indexOf(element: String): Int = -1

    override fun lastIndexOf(element: String): Int = -1

    override fun listIterator(): ListIterator<String> = SingletonEmptyIterator

    override fun listIterator(index: Int): ListIterator<String> = SingletonEmptyIterator

    override fun subList(fromIndex: Int, toIndex: Int): List<String> {
        if (fromIndex == 0 && toIndex == 0) return this
        throw IndexOutOfBoundsException("fromIndex: $fromIndex, toIndex: $toIndex")
    }
}

object SingletonEmptyIterator : ListIterator<String> {
    override fun next(): String = throw NoSuchElementException()
    override fun hasNext(): Boolean = false
    override fun hasPrevious(): Boolean = false
    override fun previous(): String = throw NoSuchElementException()
    override fun nextIndex(): Int = 0
    override fun previousIndex(): Int = -1
}

fun main() {
    val myMoviesList1 = EmptyStringList
    val myMoviesList2 = EmptyStringList

    println("Are they the same? - ${myMoviesList1 === myMoviesList2}")
}