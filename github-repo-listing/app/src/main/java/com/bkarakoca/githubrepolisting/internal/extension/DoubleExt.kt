package com.bkarakoca.githubrepolisting.internal.extension

fun Double?.toSafeDouble(): Double {
    return this ?: 0.0
}