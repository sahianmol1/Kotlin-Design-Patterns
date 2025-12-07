package com.anmolsahi.designpatterns.creationaldesignpatterns.factory.factorymethod

fun main() {
    val notations = listOf("pa8", "qc3", "nf3", "pe4", "pd4", "pc4", "pg3", "pb3", "nf6", "pc5", "pe5", "pd5")

    val pieces = mutableListOf<ChessPiece>()

    for (notation in notations) {
        pieces.add(createPiece(notation))
    }

    pieces.forEach {
        println(it)
    }
}

/**
 * Factory Method aka Simple Factory method is used for creating objects.
 * When the creation of objects is delegated to a method, we call it the Factory method design pattern.
 *
 * This method provides a flexible and extensible approach to creating objects based on the configurations.
 *
 * Tip: Whenever you see an enum and you need objects, think of using Factory Method.
 */
private fun createPiece(notation: String): ChessPiece {
    val (type, file, rank) = notation.toCharArray()
    return when (type) {
        'q' -> ChessPiece.Queen(file = file, rank = rank)
        'p' -> ChessPiece.Pawn(file = file, rank = rank)
        'n' -> ChessPiece.Knight(file = file, rank = rank)
        'k' -> ChessPiece.King(file = file, rank = rank)
        'b' -> ChessPiece.Bishop(file = file, rank = rank)
        'r' -> ChessPiece.Rook(file = file, rank = rank)
        else -> throw IllegalArgumentException("Unknown piece: $type")
    }
}
