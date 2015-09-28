package com.droibit.databinding.kotlin;

import android.databinding.DataBindingUtil;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.droibit.databinding.kotlin.databinding.FragmentMainBinding;

/**
 * Created by kumagai on 2015/09/28.
 */
public class MainFragmentBindingAdapter {

    private final FragmentMainBinding mBinding;

    public MainFragmentBindingAdapter(LayoutInflater inflater, ViewGroup container) {
        mBinding = DataBindingUtil.inflate(inflater, R.layout.fragment_main, container, false);
    }

    public KotlinUserViewModel getViewModel() {
        return mBinding.getViewModel();
    }

    public void setViewModel(@NonNull KotlinUserViewModel viewModel) {
        mBinding.setViewModel(viewModel);
    }

    public View getRoot() {
        return mBinding.getRoot();
    }
}
