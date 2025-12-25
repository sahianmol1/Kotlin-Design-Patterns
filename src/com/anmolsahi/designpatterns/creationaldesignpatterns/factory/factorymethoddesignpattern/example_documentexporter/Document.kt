package com.anmolsahi.designpatterns.creationaldesignpatterns.factory.factorymethoddesignpattern.example_documentexporter

// Product
interface DocumentExporter {
    fun export()
}

// Concrete Products
class PdfExporter : DocumentExporter {
    override fun export() {
        println("Exporting document as PDF")
    }
}

class DocxExporter : DocumentExporter {
    override fun export() {
        println("Exporting document as DOCX")
    }
}

class HtmlExporter : DocumentExporter {
    override fun export() {
        println("Exporting document as HTML")
    }
}

class CsvExporter : DocumentExporter {
    override fun export() {
        println("Exporting document as CSV")
    }
}

// Creator
abstract class Document() {
    // Factory method
    abstract fun getDocumentExporter(): DocumentExporter

    fun export() {
        getDocumentExporter().export()
    }
}

// Concrete creators
class PdfDocument : Document() {
    override fun getDocumentExporter(): DocumentExporter {
        return PdfExporter()
    }
}

class CsvDocument : Document() {
    override fun getDocumentExporter(): DocumentExporter {
        return CsvExporter()
    }
}

class DocxDocument : Document() {
    override fun getDocumentExporter(): DocumentExporter {
        return DocxExporter()
    }
}

class HtmlDocument : Document() {
    override fun getDocumentExporter(): DocumentExporter {
        return HtmlExporter()
    }
}

fun main() {
    val document = PdfDocument()
    document.export()
}
