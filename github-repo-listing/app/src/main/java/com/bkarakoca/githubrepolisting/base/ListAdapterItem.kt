package com.bkarakoca.githubrepolisting.base

interface ListAdapterItem {
    val id: Long?
    val layoutId: Int

    override fun equals(other: Any?): Boolean
}
