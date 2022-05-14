package com.example.unscramble.ui.game

import androidx.lifecycle.ViewModel

class GameViewModel : ViewModel() {
    private var score = 0
    private var currentWordCount = 0
    private var _currentScrambledWord = "Test"

    val currentScrambledWord: String
        get() = _currentScrambledWord
}