package com.bkarakoca.githubrepolisting.scene.main

import android.os.Bundle
import androidx.activity.viewModels
import com.bkarakoca.githubrepolisting.R
import com.bkarakoca.githubrepolisting.base.BaseActivity
import com.bkarakoca.githubrepolisting.databinding.ActivityMainBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class ACMain : BaseActivity<ActivityMainBinding, ACMainVM>() {

    override val layoutId get() = R.layout.activity_main

    override val viewModel: ACMainVM by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binder.lifecycleOwner = this
    }
}
