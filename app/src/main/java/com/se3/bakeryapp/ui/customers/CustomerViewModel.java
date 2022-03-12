package com.se3.bakeryapp.ui.customers;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class CustomerViewModel extends ViewModel{

    private final MutableLiveData<String> mText;

    public CustomerViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is customers fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}
