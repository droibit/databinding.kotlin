package com.droibit.databinding.kotlin;

import android.databinding.BindingAdapter;
import android.text.TextWatcher;
import android.widget.EditText;

/**
 * Created by kumagai on 2015/09/28.
 */
public class BindingAdapters {

    @BindingAdapter("app:watcher")
    public static void bindTextWatcher(EditText view, final TextWatcher watcher) {
        view.addTextChangedListener(watcher);
    }
}
