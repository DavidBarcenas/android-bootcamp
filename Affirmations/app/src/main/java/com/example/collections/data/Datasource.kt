package com.example.collections.data

import com.example.collections.R
import com.example.collections.model.Phrase

class Datasource {
    fun loadPhrases(): List<Phrase> {
        return listOf<Phrase>(
            Phrase(R.string.phrase1, R.drawable.image1),
            Phrase(R.string.phrase2, R.drawable.image12),
            Phrase(R.string.phrase3, R.drawable.image2),
            Phrase(R.string.phrase4, R.drawable.image3),
            Phrase(R.string.phrase5, R.drawable.image3),
            Phrase(R.string.phrase6, R.drawable.image4),
            Phrase(R.string.phrase7, R.drawable.image5),
            Phrase(R.string.phrase8, R.drawable.image6),
            Phrase(R.string.phrase9, R.drawable.image7),
            Phrase(R.string.phrase10, R.drawable.image8),
            Phrase(R.string.phrase11, R.drawable.image9),
            Phrase(R.string.phrase12, R.drawable.image10),
            Phrase(R.string.phrase13, R.drawable.image11),
        )
    }
}