package com.droibit.databinding.kotlin;

import android.databinding.BaseObservable;
import android.databinding.Bindable;
import com.droibit.databinding.kotlin.BR;

/**
 * Created by kumagai on 2015/09/24.
 */
public class UserViewModel extends BaseObservable {

    private String firstName;
    private String lastName;

    public UserViewModel() {
        this("花子", "山田");
    }

    public UserViewModel(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    @Bindable
    public String getFirstName() {
        return this.firstName;
    }
    @Bindable
    public String getLastName() {
        return this.lastName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
        notifyPropertyChanged(BR.firstName);
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
        notifyPropertyChanged(BR.lastName);
    }
}
