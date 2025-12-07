package com.anmolsahi.designpatterns.creationaldesignpatterns.factorymethod

sealed class ChessPiece(val mFile: Char, val mRank: Char) {
    data class Pawn(val file: Char, val rank: Char) : ChessPiece(file, rank)
    data class Rook(val file: Char, val rank: Char) : ChessPiece(file, rank)
    data class Knight(val file: Char, val rank: Char) : ChessPiece(file, rank)
    data class Bishop(val file: Char, val rank: Char) : ChessPiece(file, rank)
    data class Queen(val file: Char, val rank: Char) : ChessPiece(file, rank)
    data class King(val file: Char, val rank: Char) : ChessPiece(file, rank)
}
