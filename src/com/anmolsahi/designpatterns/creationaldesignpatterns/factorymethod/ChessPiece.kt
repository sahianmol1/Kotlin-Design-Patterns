package com.anmolsahi.designpatterns.creationaldesignpatterns.factorymethod

sealed interface ChessPiece {
    val file: Char
    val rank: Char

    data class Pawn(override val file: Char, override val rank: Char) : ChessPiece
    data class Rook(override val file: Char, override val rank: Char) : ChessPiece
    data class Knight(override val file: Char, override val rank: Char) : ChessPiece
    data class Bishop(override val file: Char, override val rank: Char) : ChessPiece
    data class Queen(override val file: Char, override val rank: Char) : ChessPiece
    data class King(override val file: Char, override val rank: Char) : ChessPiece
}
