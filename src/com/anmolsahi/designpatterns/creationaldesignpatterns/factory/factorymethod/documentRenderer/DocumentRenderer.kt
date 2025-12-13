package com.anmolsahi.designpatterns.creationaldesignpatterns.factory.factorymethod.documentRenderer

// This is just another example of a Simple Factory
class Document(private val documentType: DocumentType) {

    private val elements = mutableListOf<String>()

    // Factory method
    fun addParagraph(text: String) {
        when(documentType) {
            DocumentType.HTML -> {
                elements.add("<p>$text</p>")
            }
            DocumentType.MARKDOWN -> {
                elements.add(text)
            }
        }
    }

    fun render() {
        println(elements.joinToString("\n"))
    }

}

fun main() {
    val document = Document(DocumentType.MARKDOWN)

    document.addParagraph("This is a paragraph text.")
    document.render()
}

enum class DocumentType { HTML, MARKDOWN }