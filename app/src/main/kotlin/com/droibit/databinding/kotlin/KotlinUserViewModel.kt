package com.droibit.databinding.kotlin

import android.databinding.ObservableField
import android.text.TextWatcher

/**
 * Created by kumagai on 2015/09/28.
 */
public class KotlinUserViewModel {

    public val firstName: ObservableField<String>
    public val lastName: ObservableField<String>

    public val firstNameWatcher: TextWatcher
    public val lastNameWatcher: TextWatcher

    public constructor(firstName: String = "花子", lastName: String = "山田") {
        this.firstName = ObservableField<String>(firstName)
        this.lastName = ObservableField<String>(lastName)

        this.firstNameWatcher = NameTextWatcher(name = this.firstName)
        this.lastNameWatcher = NameTextWatcher(name = this.lastName)
    }
}