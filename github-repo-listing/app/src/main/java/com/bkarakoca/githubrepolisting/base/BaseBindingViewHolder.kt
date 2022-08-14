package com.bkarakoca.githubrepolisting.base

import androidx.databinding.ViewDataBinding
import androidx.recyclerview.widget.RecyclerView
import com.bkarakoca.githubrepolisting.BR

class BaseBindingViewHolder<T>(
    val binding: ViewDataBinding
) : RecyclerView.ViewHolder(binding.root) {

    fun bind(item: T) {
        binding.setVariable(BR.item, item)
        binding.executePendingBindings()
    }
}