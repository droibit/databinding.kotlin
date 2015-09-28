package com.droibit.databinding.kotlin;

import android.databinding.BindingAdapter;
import android.databinding.BindingConversion;
import android.databinding.ObservableField;
import android.widget.EditText;

/**
 * Created by kumagai on 2015/09/28.
 */
public class BindingAdapters {

    @BindingAdapter("app:binding")
    public static void bindEditText(EditText view, final ObservableField<String> string) {
        view.addTextChangedListener(new NameTextWatcher(string));

        final String newValue = string.get();
        if (!view.getText().toString().equals(newValue)) {
            view.setText(newValue);
        }
    }

    @BindingConversion
    public static String convertToString(ObservableField<String> string) {
        return string.get();
    }
}
