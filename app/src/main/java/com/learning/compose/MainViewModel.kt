package com.learning.compose

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

/**
 * Created by: VIJIL DHAS AS
 * @Date: 31-10-2023
 */
class MainViewModel : ViewModel() {
     val textFieldState = MutableLiveData<String>()

    fun onTextChanged(newText: String) {
        textFieldState.value = newText
    }
}