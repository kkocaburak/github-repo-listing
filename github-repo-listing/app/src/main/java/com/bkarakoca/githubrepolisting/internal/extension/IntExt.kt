package com.bkarakoca.githubrepolisting.internal.extension

fun Int?.toSafeInt(): Int {
    return this ?: 0
}