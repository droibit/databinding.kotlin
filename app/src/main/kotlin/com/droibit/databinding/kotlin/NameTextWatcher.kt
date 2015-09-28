package com.droibit.databinding.kotlin

import android.databinding.ObservableField
import android.text.Editable
import android.text.TextWatcher

/**
 * Created by kumagai on 2015/09/28.
 */
/**
 * Created by kumagai on 2015/09/28.
 */
public class NameTextWatcher(val name: ObservableField<String>) : TextWatcher {

    override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
        if (s != null && name.get() != s.toString()) {
            name.set(s.toString())
        }
    }

    override fun afterTextChanged(s: Editable?) {
    }

    override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {
    }
}