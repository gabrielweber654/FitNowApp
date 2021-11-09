package com.example.navigation_slides.ui.cardio;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class CardioViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public CardioViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("");
    }

    public LiveData<String> getText() {
        return mText;
    }
}