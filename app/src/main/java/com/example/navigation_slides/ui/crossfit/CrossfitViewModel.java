package com.example.navigation_slides.ui.crossfit;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class CrossfitViewModel extends ViewModel {
    private MutableLiveData<String> mText;

    public CrossfitViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("");
    }

    public LiveData<String> getText() {
        return mText;
    }
}