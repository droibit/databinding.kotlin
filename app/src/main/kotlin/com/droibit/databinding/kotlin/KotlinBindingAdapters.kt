package com.droibit.databinding.kotlin

import android.databinding.BindingAdapter
import android.databinding.BindingConversion
import android.databinding.ObservableField
import android.widget.EditText

/**
 * Created by kumagai on 2015/09/28.
 */
public object KotlinBindingAdapters {

    /**
     * https://medium.com/@fabioCollini/android-data-binding-f9f9d3afc761
     */
    @BindingAdapter("app:binding")
    public fun onTextChange(view: EditText, text: ObservableField<String>) {
        view.addTextChangedListener(NameTextWatcher(text))

        if (view.text.toString() != text.get()) {
            view.setText(text.get())
        }
    }
}

/**
 * Created by kumagai on 2015/09/28.
 */
public object KotlinConversions {

    @BindingConversion
    public fun convertToString(string: ObservableField<String>): String {
        return string.get()
    }
}