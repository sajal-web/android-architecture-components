package com.sajal.university.app.architecturecomponent

import androidx.lifecycle.ViewModel

class MainViewModel : ViewModel(){
    var counter: Int = 0
    fun increment(){
        counter++
    }

}