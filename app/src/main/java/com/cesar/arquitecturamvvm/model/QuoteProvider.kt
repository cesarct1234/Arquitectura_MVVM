package com.cesar.arquitecturamvvm.model

class QuoteProvider {
    companion object {
        fun random(): QuoteModel {
            val position = (0..10).random()
            return quote[position]
        }

        private val quote = listOf<QuoteModel>(
            QuoteModel(
                quote = "Cuando la batalla se recrudece, se prueba la lealtad del soldado.",
                author = "Martin Lutero"
            ),
            QuoteModel(
                quote = "La lealtad y la devoción conducen a la valentía. La valentía conduce al espíritu de sacrificio. El espíritu de sacrificio crea confianza en el poder del amor.",
                author = "Morihei Ueshiba"
            ),
            QuoteModel(
                quote = "Los caminos de la lealtad son siempre rectos",
                author = "Charles Dickens"
            ),
            QuoteModel(
                quote = " La fidelidad que ha sido comprada con dinero puede ser vencida por el dinero.",
                author = "Seneca"
            ),
            QuoteModel(
                quote = "La lealtad no depende de las circunstancias porque es la permanencia de los principios",
                author = "Francisco Garzón Céspedes"
            ),
            QuoteModel(
                quote = "El erudito no considera el oro como un preciado tesoro, sino la lealtad y la buena fe.",
                author = "Confucio"
            ),
            QuoteModel(
                quote = "No hay amigo tan leal como un libro.",
                author = "Ernest Hemingway"
            ),
            QuoteModel(quote = "Things arent always #000000 and #FFFFFF", author = "Anonymous"),
            QuoteModel(quote = "Talk is cheap.show me the code", author = "Linus Torvalds"),
            QuoteModel(
                quote = "Software and cathedrals are much the same — first we build them, then we pray.",
                author = "Anonymous"
            ),
            QuoteModel(
                quote = "El valor de la dignidad no tiene precio .",
                author = "Cesar Caycedo"
            )
        )

    }
}