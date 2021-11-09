package com.example.navigation_slides.ui.at_home;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class At_homeViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public At_homeViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("");
    }

    public LiveData<String> getText() {
        return mText;
    }
}