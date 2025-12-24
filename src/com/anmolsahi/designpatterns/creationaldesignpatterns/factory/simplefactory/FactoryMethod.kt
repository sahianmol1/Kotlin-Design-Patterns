package com.anmolsahi.designpatterns.creationaldesignpatterns.factory.simplefactory

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
 * This is an example of a Simple Factory pattern. It is not a GoF (Gang of Four) design pattern
 * but more of a programming idiom.
 *
 * It provides a simple way to centralize object creation logic, decoupling the client from concrete implementations.
 *
 * Tip: Whenever you see an enum and you need objects of a similar family, think of using simple Factory Method.
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
