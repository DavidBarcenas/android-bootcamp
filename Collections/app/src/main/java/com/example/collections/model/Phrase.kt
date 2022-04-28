package com.example.collections.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class Phrase(
    @StringRes val stringResourceId: Int,
    @DrawableRes val imageResourceId: Int
)