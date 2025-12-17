package com.anmolsahi.designpatterns.creationaldesignpatterns.factory.factorymethod.documentexporter

class Document(private val documentExporterFactory: SimpleDocumentExporterFactory) {
    // Logic to add more functionality to the document goes here

    fun exportDocument(type: DocumentType) {
        val documentExporter: DocumentExporter = documentExporterFactory.createDocumentExporter(type)
        documentExporter.export()
    }
}

interface DocumentExporter {
    fun export()
}

class PdfDocumentExporter : DocumentExporter {
    override fun export() {
        println("Exporting document as PDF")
    }
}

class DocxDocumentExporter : DocumentExporter {
    override fun export() {
        println("Exporting document as DOCX")
    }
}

class HtmlDocumentExporter : DocumentExporter {
    override fun export() {
        println("Exporting document as HTML")
    }
}

class CsvDocumentExporter : DocumentExporter {
    override fun export() {
        println("Exporting document as CSV")
    }
}

object SimpleDocumentExporterFactory {
    fun createDocumentExporter(type: DocumentType): DocumentExporter {
        return when (type) {
            DocumentType.PDF -> PdfDocumentExporter()
            DocumentType.DOCX -> DocxDocumentExporter()
            DocumentType.HTML -> HtmlDocumentExporter()
            DocumentType.CSV -> CsvDocumentExporter()
        }
    }
}

fun main() {
    val document = Document(SimpleDocumentExporterFactory)
    document.exportDocument(type = DocumentType.DOCX)
}

enum class DocumentType { PDF, DOCX, HTML, CSV }