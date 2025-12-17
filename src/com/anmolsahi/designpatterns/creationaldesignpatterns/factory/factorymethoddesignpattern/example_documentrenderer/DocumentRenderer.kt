package com.anmolsahi.designpatterns.creationaldesignpatterns.factory.factorymethoddesignpattern.example_documentrenderer

interface Element {
    fun render(): String
}

// Abstract Product
abstract class Paragraph(): Element

// Concrete Product
class HtmlParagraph(private val text: String) : Paragraph() {
    override fun render(): String = "<p>$text</p>"
}

// Concrete Product
class MarkdownParagraph(private val text: String) : Paragraph() {
    override fun render(): String = text
}

// Abstract Creator
abstract class Document() {

    private val elements = mutableListOf<Element>()

    // Factory method
    abstract fun createParagraph(text: String): Element

    fun addParagraph(text: String) = elements.add(createParagraph(text))

    fun render() {
        println(elements.joinToString { it.render() })
    }
}

// Concrete Creator
class HtmlDocument() : Document() {
    override fun createParagraph(text: String): Element = HtmlParagraph(text)
}

// Concrete Creator
class MarkdownDocument() : Document() {
    override fun createParagraph(text: String): Element = MarkdownParagraph(text)
}

fun main() {
    val document = HtmlDocument()

    document.addParagraph("This is a paragraph text.")
    document.render()
}
