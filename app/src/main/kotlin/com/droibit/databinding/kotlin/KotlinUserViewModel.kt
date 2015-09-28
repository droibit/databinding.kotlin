package com.droibit.databinding.kotlin

import android.databinding.ObservableField

/**
 * Created by kumagai on 2015/09/28.
 */
public class KotlinUserViewModel(firstName: String = "花子", lastName: String = "山田") {

    public val firstName = ObservableField<String>(firstName)
    public val lastName = ObservableField<String>(lastName)
}