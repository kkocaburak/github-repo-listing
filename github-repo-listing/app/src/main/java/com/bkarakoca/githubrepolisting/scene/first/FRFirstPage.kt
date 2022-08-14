package com.bkarakoca.githubrepolisting.scene.first

import androidx.fragment.app.viewModels
import com.bkarakoca.githubrepolisting.R
import com.bkarakoca.githubrepolisting.base.BaseFragment
import com.bkarakoca.githubrepolisting.databinding.FragmentFirstPageBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class FRFirstPage : BaseFragment<FRFirstPageVM, FragmentFirstPageBinding>() {
    override val layoutId: Int get() = R.layout.fragment_first_page

    override val viewModel: FRFirstPageVM by viewModels()

    override fun initialize() {}

    override fun setListeners() {}

    override fun setReceivers() {}
}