package com.kodingmu.myviewmodel

import androidx.lifecycle.ViewModel

class MainViewModel: ViewModel() {

    var result = 0

    fun calculate(width: String, height: String, length: String) {
        result = Integer.parseInt(width) * Integer.parseInt(height) * Integer.parseInt(length)
    }
}