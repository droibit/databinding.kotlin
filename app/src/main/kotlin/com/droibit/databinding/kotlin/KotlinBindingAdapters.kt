package com.droibit.databinding.kotlin

import android.databinding.BindingAdapter
import android.databinding.BindingConversion
import android.databinding.ObservableField
import android.graphics.drawable.ColorDrawable
import android.support.annotation.ColorInt
import android.text.TextWatcher
import android.widget.EditText

/**
 * Created by kumagai on 2015/09/28.
 */
public object KotlinBindingAdapters {

    @BindingAdapter("app:onChange")
    public fun onTextChange(view: EditText, watcher: TextWatcher) {
        view.addTextChangedListener(watcher)
    }

    @BindingConversion
    public fun convertColorToDrawable(@ColorInt color: Int): ColorDrawable {
        return ColorDrawable(color)
    }
}
//
///**
// * Created by kumagai on 2015/09/28.
// */
//public object KotlinConversions {
//
//    @BindingConversion
//    public fun convertToString(string: ObservableField<String>): String {
//        return string.get()
//    }
//}