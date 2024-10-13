package com.cesar.arquitecturamvvm.viewmodel



import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.cesar.arquitecturamvvm.model.QuoteModel
import com.cesar.arquitecturamvvm.model.QuoteProvider

class QuoteViewModel: ViewModel() {
    val quoteModel= MutableLiveData<QuoteModel>()

    fun randomQuote(){
        val currentQuote = QuoteProvider.random()
        quoteModel.postValue(currentQuote)
    }

}