package com.example.navigation_slides.ui.bodybuilding;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class BodybuildingViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public BodybuildingViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("");
    }

    public LiveData<String> getText() {
        return mText;
    }
}