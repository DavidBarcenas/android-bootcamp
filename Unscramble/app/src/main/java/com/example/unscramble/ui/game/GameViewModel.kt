package com.example.unscramble.ui.game

import android.util.Log
import androidx.lifecycle.ViewModel

class GameViewModel : ViewModel() {
    private var wordList: MutableList<String> = mutableListOf()
    private lateinit var currentWord: String;

    private lateinit var _currentScrambledWord: String;
    val currentScrambledWord: String
        get() = _currentScrambledWord

    private var _currentWordCount = 0
    val currentWordCount: Int
        get() = _currentWordCount

    private var _score = 0
    val score: Int
        get() = _score

    override fun onCleared() {
        super.onCleared()
        Log.d("GameFragment", "GameViewModel destroyed!")
    }

    /*
    * Updates currentWord and currentScrambledWord with the next word.
    */
    private fun getNextWord() {
        currentWord = allWordsList.random()
        val tempWord = currentWord.toCharArray()
        tempWord.shuffle()

        while (String(tempWord).equals(currentWord, false)) {
            tempWord.shuffle()
        }

        if (wordList.contains(currentWord)) {
            getNextWord()
        } else {
            _currentScrambledWord = String(tempWord)
            ++_currentWordCount
            wordList.add(currentWord)
        }
    }

    /*
    * Returns true if the current word count is less than MAX_NO_OF_WORDS.
    * Updates the next word.
    */
    fun nextWord(): Boolean {
        return if (currentWordCount < MAX_NO_OF_WORDS) {
            getNextWord()
            true
        } else false
    }

    fun isUserWordCorrect(playerWord: String): Boolean {
        if (playerWord.equals(currentWord, true)) {
            increaseScore()
            return true
        }
        return false
    }

    private fun increaseScore() {
        _score += SCORE_INCREASE
    }

    init {
        Log.d("GameFragment", "GameViewModel created!")
        getNextWord()
    }
}