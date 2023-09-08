package com.sajal.university.app.architecturecomponent

import androidx.lifecycle.ViewModel

class MainViewModel(val initialValue : Int) : ViewModel(){
    var counter: Int = initialValue
    fun increment(){
        counter++
    }

}