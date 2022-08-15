package com.bkarakoca.core.base

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter

abstract class BaseBindingAdapter<T : ListAdapterItem>(
    diffCallback: DiffUtil.ItemCallback<T> = ListAdapterItemDiffCallback()
) : ListAdapter<T, BaseBindingViewHolder<T>>(diffCallback) {

    abstract fun getItemLayoutId(): Int

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BaseBindingViewHolder<T> {
        return BaseBindingViewHolder(
            DataBindingUtil.inflate(
                LayoutInflater.from(parent.context),
                getItemLayoutId(),
                parent,
                false
            )
        )
    }

    override fun onBindViewHolder(holder: BaseBindingViewHolder<T>, position: Int) {
        val item = getItem(position)
        holder.bind(item)
    }

}