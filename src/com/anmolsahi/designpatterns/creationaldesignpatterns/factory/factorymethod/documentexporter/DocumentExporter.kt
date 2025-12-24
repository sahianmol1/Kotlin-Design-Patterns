package com.anmolsahi.designpatterns.creationaldesignpatterns.factory.factorymethod.documentexporter

class Document(private val exporterFactory: SimpleDocumentExporterFactory) {
    // Logic to add more functionality to the document goes here

    fun export(type: DocumentType) {
        val documentExporter = exporterFactory.getDocumentExporter(type)
        documentExporter.export()
    }
}

interface DocumentExporter {
    fun export()
}

class PdfExporter : DocumentExporter {
    override fun export() {
        println("Exporting document as PDF")
    }
}

class DocXExporter : DocumentExporter {
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

object SimpleDocumentExporterFactory {
    fun getDocumentExporter(type: DocumentType): DocumentExporter {
        return when (type) {
            DocumentType.PDF -> PdfExporter()
            DocumentType.DOCX -> DocXExporter()
            DocumentType.HTML -> HtmlExporter()
            DocumentType.CSV -> CsvExporter()
        }
    }
}

fun main() {
    val document = Document(SimpleDocumentExporterFactory)
    document.export(type = DocumentType.DOCX)
}

enum class DocumentType { PDF, DOCX, HTML, CSV }