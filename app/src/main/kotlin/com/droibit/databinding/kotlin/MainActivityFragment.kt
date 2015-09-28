package com.droibit.databinding.kotlin

import android.support.v4.app.Fragment
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlin.properties.Delegates

/**
 * A placeholder fragment containing a simple view.
 */
public class MainActivityFragment : Fragment() {

    private var mBinding: MainFragmentBindingAdapter by Delegates.notNull()
    private val mViewModel = KotlinUserViewModel()

    /** {@inheritDoc} */
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        mBinding = MainFragmentBindingAdapter(inflater, container)
        mBinding.viewModel = mViewModel
        return mBinding.root
    }
}
